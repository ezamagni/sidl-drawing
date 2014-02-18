grammar SiDL_plain;

options {
    k=1;
}


// compile unit main structure
program
	:	(procedure | function | NL)* mainproc ;

/*
 *	PROCEDURES
 */	
// procedure definition
procedure
	:	'procedure' ID ('(' idlist? ')')? NL block 'end' NL ;

// main procedure definition
mainproc
	:	'begin' NL block 'end' ;

// identifiers list
idlist
	:	ID (',' ID)* ;

// code block
block
	:	(statement | NL)+ ;
	
statement
	:	(assignment | action | procedure_call | control) NL ;

// assignment
assignment
	: ID '=' assignment_target ;
	
assignment_target
	options{k=2;}
	:	num_expr | ID '=' assignment_target ;
	
// procedure call
procedure_call
	: 'call' ID ('(' num_expr_list? ')')? ;


/*
 *	FUNCTIONS
 */	
// function definition
function
	:	'function' ID '(' idlist? ')' block? 'return' num_expr NL ;


/*
 * ACTIONS 
 */
action
	:	action_pen | action_move | action_turn ;
		
action_pen 
	:	('drop' | 'pull') 'pen' ;
		
action_move
	:	'move' ('forward' | 'backward' | 'left' | 'right')? 'by' num_expr ;
	
action_turn
	:	'turn' ('left' | 'right')? 'by' num_expr ;


/*
 * CONTROL INSTRUCTIONS
 */
control 
	:	control_if | control_loop | control_fromto ;
	
control_if
	:	'if' logic_expr 'then' block ('elseif' logic_expr 'then' block)* ('else' block)? 'endif' ;	

control_loop
	:	'do' ( condition block 'loop' | block 'loop' condition ) ;
	
condition
	:	('while' | 'until') logic_expr ;
	
control_fromto
	:	('with' ID)? 'from' num_expr 'to' num_expr block 'loop' ;

/*
 * NUMERIC EXPRESSIONS
 */
num_expr
	:	term (('+' | '-') term)* ;
term
	: 	factor (('*' | '/') factor)* ;
factor
	: 	NUMBER | '(' num_expr ')' | '-'? reference ;

reference
	options{k=2;}
	: ID | function_call ;
	
function_call
	: ID '(' num_expr_list? ')' ;
			
num_expr_list
	:	num_expr (',' num_expr)* ;

/*
 * LOGIC EXPRESSIONS
 */
logic_expr
	:	relation ( ('and' | 'or' | 'xor' ) relation)* 
	|	'not' relation ;
 
relation
	:	num_expr ('<' | '<=' | '=' | '!=' | '>=' | '>') num_expr 
	|	'[' logic_expr ']' ;
	
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
