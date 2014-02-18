grammar SiDL;

options {
    output=AST;
    k=1;
}

tokens {
	PROGR;
	BLOCK;
	
	PROC='procedure';
	FUNC='function';
	RETURN='return';
	CALL='call';
	BEGIN='begin';
	END='end';
	
	IF='if';
	THEN='then';
	ELSE='else';
	ELSEIF='elseif';
	ENDIF='endif';
	
	WHILE='while';
	UNTIL='until';
	DO='do';
	LOOP='loop';
	
	WITH='with';
	FROM='from';
	TO='to';
	
	DROP='drop';
	PULL='pull';
	PEN='pen';
	MOVE='move';
	TURN='turn';
	LEFT='left';
	RIGHT='right';
	FWD='forward';
	BWD='backward';
	BY='by';
	
	AND='and';
	OR='or';
	XOR='xor';
	NOT='not';
}

@parser::header {
	package sidl.grammar;
	import sidl.grammar.ast.*;
	import sidl.grammar.ast.expressions.numeric.*;
	import sidl.grammar.ast.expressions.logic.*;
}

@lexer::header {
	package sidl.grammar;
}


// compile unit main structure
program
	:	(procedure | function | NL)* mainproc 
		-> ^(PROGR<ProgramNode> procedure* function* mainproc) ;

/*
 *	PROCEDURES
 */	
// procedure definition
procedure
	:	PROC ID ('(' idlist? ')')? NL block END NL  -> ^(ID<ProcedureNode> idlist? block) ;

// main procedure definition
mainproc
	:	BEGIN NL block END  -> ^(BEGIN<ProcedureNode> block) ;

// identifiers list
idlist
	:	ID<IdNode> (','! ID<IdNode>)* ;

// code block
block
	:	(statement | NL)+  -> ^(BLOCK<BlockNode> statement+) ;
	
statement
	:	(assignment | action | procedure_call | control) NL! ;

// assignment
assignment 
	: ID<IdNode> '='<AssignmentNode>^ assignment_target ;
	
assignment_target
	options{k=2;}
	:	num_expr | ID<IdNode> '='! assignment_target;
	
// procedure call
procedure_call 
	: CALL ID ('(' num_expr_list? ')')?  -> ^(ID<ProcedureCallNode> num_expr_list?) ;


/*
 *	FUNCTIONS
 */	
// function definition
function
	:	FUNC ID '(' idlist? ')' block? RETURN num_expr NL 
		-> ^(ID<FunctionNode> idlist? block? num_expr) ;


/*
 * ACTIONS 
 */
action
	:	action_pen | action_move | action_turn ;
		
action_pen 
	:	(a=DROP | a=PULL) PEN  -> ^(PEN<PenActionNode>[$a]);
		
action_move 
	:	MOVE (dir=FWD | dir=BWD | dir=LEFT | dir=RIGHT)? BY num_expr  -> ^(MOVE<MoveActionNode>[$dir] num_expr) ;
	
action_turn
	:	TURN (dir=LEFT | dir=RIGHT)? BY num_expr  -> ^(TURN<TurnActionNode>[$dir] num_expr) ;


/*
 * CONTROL INSTRUCTIONS
 */
control 
	:	control_if | control_loop | control_fromto ;
	
control_if
	:	IF c+=logic_expr THEN b+=block (ELSEIF c+=logic_expr THEN b+=block)* (ELSE be=block)? ENDIF 
				-> ^(IF<IfControlNode> $c+ $b+ $be?);	

control_loop
	:	DO 
	( condition block LOOP  -> ^(LOOP<TestDoLoopControlNode> condition block)
	| block LOOP condition  -> ^(LOOP<DoTestLoopControlNode> condition block) ) ;
	
condition
	:	(WHILE! | UNTIL<NotExp>^) logic_expr ;
	
control_fromto
	:	(WITH ID)? FROM start=num_expr TO end=num_expr block LOOP 
		-> ^(FROM<FromToControlNode> $start $end ID<IdNode>? block) ;

/*
 * NUMERIC EXPRESSIONS
 */
num_expr
	:	term (('+'<PlusExp>^ | '-'<MinusExp>^) term)* ;
term 
	: 	factor (('*'<MultExp>^ | '/'<DivExp>^) factor)* ;
factor
	: 	NUMBER<ValueExp> | '('! num_expr ')'! | ('-'<NegExp>^)? reference ;

reference
	options{k=2;}
	: ID<VarExp> | function_call ;
	
function_call
	: ID '(' num_expr_list? ')' -> ^(ID<FunctionExp> num_expr_list?) ;
			
num_expr_list
	:	num_expr (','! num_expr)* ;

/*
 * LOGIC EXPRESSIONS
 */
logic_expr
	:	relation ( (AND<AndExp>^ | OR<OrExp>^ | XOR<XorExp>^ ) relation)* 
	|	NOT<NotExp>^ relation ;
 
relation
	:	num_expr ('<'<LTExp>^|'<='<LEExp>^|'='<ETExp>^|'!='<DFExp>^|'>='<GEExp>^|'>'<GTExp>^) num_expr 
	|	'['! logic_expr ']'! ;
	
/*
 *	TOKENS
 */
ID :	(CHAR|'_') (CHAR | DIGIT |'_')* ;
fragment CHAR		: 'a'..'z' | 'A'..'Z';
    
NUMBER  :	'-'? INT ('.' DIGIT+)?;
fragment INT		: '0' | NZ_DIGIT DIGIT*;
fragment DIGIT		: '0' | NZ_DIGIT;
fragment NZ_DIGIT	: '1'..'9';

// newline
NL	:	'\r'? '\n' ;

// whitespaces
WS	:	(' ' | '\t') {$channel=HIDDEN;} ;

// comments
COMMENT :	'//' (~'\n')* {$channel=HIDDEN;} ;
