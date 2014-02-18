// $ANTLR 3.4 /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g 2012-09-19 18:21:46

	package sidl.grammar;
	import sidl.grammar.ast.*;
	import sidl.grammar.ast.expressions.numeric.*;
	import sidl.grammar.ast.expressions.logic.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SiDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEGIN", "BLOCK", "BWD", "BY", "CALL", "CHAR", "COMMENT", "DIGIT", "DO", "DROP", "ELSE", "ELSEIF", "END", "ENDIF", "FROM", "FUNC", "FWD", "ID", "IF", "INT", "LEFT", "LOOP", "MOVE", "NL", "NOT", "NUMBER", "NZ_DIGIT", "OR", "PEN", "PROC", "PROGR", "PULL", "RETURN", "RIGHT", "THEN", "TO", "TURN", "UNTIL", "WHILE", "WITH", "WS", "XOR", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int AND=4;
    public static final int BEGIN=5;
    public static final int BLOCK=6;
    public static final int BWD=7;
    public static final int BY=8;
    public static final int CALL=9;
    public static final int CHAR=10;
    public static final int COMMENT=11;
    public static final int DIGIT=12;
    public static final int DO=13;
    public static final int DROP=14;
    public static final int ELSE=15;
    public static final int ELSEIF=16;
    public static final int END=17;
    public static final int ENDIF=18;
    public static final int FROM=19;
    public static final int FUNC=20;
    public static final int FWD=21;
    public static final int ID=22;
    public static final int IF=23;
    public static final int INT=24;
    public static final int LEFT=25;
    public static final int LOOP=26;
    public static final int MOVE=27;
    public static final int NL=28;
    public static final int NOT=29;
    public static final int NUMBER=30;
    public static final int NZ_DIGIT=31;
    public static final int OR=32;
    public static final int PEN=33;
    public static final int PROC=34;
    public static final int PROGR=35;
    public static final int PULL=36;
    public static final int RETURN=37;
    public static final int RIGHT=38;
    public static final int THEN=39;
    public static final int TO=40;
    public static final int TURN=41;
    public static final int UNTIL=42;
    public static final int WHILE=43;
    public static final int WITH=44;
    public static final int WS=45;
    public static final int XOR=46;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SiDLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SiDLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SiDLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:64:1: program : ( procedure | function | NL )* mainproc -> ^( PROGR ( procedure )* ( function )* mainproc ) ;
    public final SiDLParser.program_return program() throws RecognitionException {
        SiDLParser.program_return retval = new SiDLParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL3=null;
        SiDLParser.procedure_return procedure1 =null;

        SiDLParser.function_return function2 =null;

        SiDLParser.mainproc_return mainproc4 =null;


        Object NL3_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_mainproc=new RewriteRuleSubtreeStream(adaptor,"rule mainproc");
        RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:2: ( ( procedure | function | NL )* mainproc -> ^( PROGR ( procedure )* ( function )* mainproc ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:4: ( procedure | function | NL )* mainproc
            {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:4: ( procedure | function | NL )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case PROC:
                    {
                    alt1=1;
                    }
                    break;
                case FUNC:
                    {
                    alt1=2;
                    }
                    break;
                case NL:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:5: procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_program272);
            	    procedure1=procedure();

            	    state._fsp--;

            	    stream_procedure.add(procedure1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:17: function
            	    {
            	    pushFollow(FOLLOW_function_in_program276);
            	    function2=function();

            	    state._fsp--;

            	    stream_function.add(function2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:65:28: NL
            	    {
            	    NL3=(Token)match(input,NL,FOLLOW_NL_in_program280);  
            	    stream_NL.add(NL3);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_mainproc_in_program284);
            mainproc4=mainproc();

            state._fsp--;

            stream_mainproc.add(mainproc4.getTree());

            // AST REWRITE
            // elements: function, procedure, mainproc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:3: -> ^( PROGR ( procedure )* ( function )* mainproc )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:66:6: ^( PROGR ( procedure )* ( function )* mainproc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ProgramNode(PROGR)
                , root_1);

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:66:27: ( procedure )*
                while ( stream_procedure.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedure.nextTree());

                }
                stream_procedure.reset();

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:66:38: ( function )*
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_1, stream_mainproc.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:72:1: procedure : PROC ID ( '(' ( idlist )? ')' )? NL block END NL -> ^( ID ( idlist )? block ) ;
    public final SiDLParser.procedure_return procedure() throws RecognitionException {
        SiDLParser.procedure_return retval = new SiDLParser.procedure_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROC5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token NL10=null;
        Token END12=null;
        Token NL13=null;
        SiDLParser.idlist_return idlist8 =null;

        SiDLParser.block_return block11 =null;


        Object PROC5_tree=null;
        Object ID6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object NL10_tree=null;
        Object END12_tree=null;
        Object NL13_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_PROC=new RewriteRuleTokenStream(adaptor,"token PROC");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_idlist=new RewriteRuleSubtreeStream(adaptor,"rule idlist");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:2: ( PROC ID ( '(' ( idlist )? ')' )? NL block END NL -> ^( ID ( idlist )? block ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:4: PROC ID ( '(' ( idlist )? ')' )? NL block END NL
            {
            PROC5=(Token)match(input,PROC,FOLLOW_PROC_in_procedure318);  
            stream_PROC.add(PROC5);


            ID6=(Token)match(input,ID,FOLLOW_ID_in_procedure320);  
            stream_ID.add(ID6);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:12: ( '(' ( idlist )? ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==48) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:13: '(' ( idlist )? ')'
                    {
                    char_literal7=(Token)match(input,48,FOLLOW_48_in_procedure323);  
                    stream_48.add(char_literal7);


                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:17: ( idlist )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:17: idlist
                            {
                            pushFollow(FOLLOW_idlist_in_procedure325);
                            idlist8=idlist();

                            state._fsp--;

                            stream_idlist.add(idlist8.getTree());

                            }
                            break;

                    }


                    char_literal9=(Token)match(input,49,FOLLOW_49_in_procedure328);  
                    stream_49.add(char_literal9);


                    }
                    break;

            }


            NL10=(Token)match(input,NL,FOLLOW_NL_in_procedure332);  
            stream_NL.add(NL10);


            pushFollow(FOLLOW_block_in_procedure334);
            block11=block();

            state._fsp--;

            stream_block.add(block11.getTree());

            END12=(Token)match(input,END,FOLLOW_END_in_procedure336);  
            stream_END.add(END12);


            NL13=(Token)match(input,NL,FOLLOW_NL_in_procedure338);  
            stream_NL.add(NL13);


            // AST REWRITE
            // elements: ID, block, idlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:48: -> ^( ID ( idlist )? block )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:51: ^( ID ( idlist )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ProcedureNode(stream_ID.nextToken())
                , root_1);

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:73:71: ( idlist )?
                if ( stream_idlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_idlist.nextTree());

                }
                stream_idlist.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedure"


    public static class mainproc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainproc"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:76:1: mainproc : BEGIN NL block END -> ^( BEGIN block ) ;
    public final SiDLParser.mainproc_return mainproc() throws RecognitionException {
        SiDLParser.mainproc_return retval = new SiDLParser.mainproc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BEGIN14=null;
        Token NL15=null;
        Token END17=null;
        SiDLParser.block_return block16 =null;


        Object BEGIN14_tree=null;
        Object NL15_tree=null;
        Object END17_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:77:2: ( BEGIN NL block END -> ^( BEGIN block ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:77:4: BEGIN NL block END
            {
            BEGIN14=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_mainproc364);  
            stream_BEGIN.add(BEGIN14);


            NL15=(Token)match(input,NL,FOLLOW_NL_in_mainproc366);  
            stream_NL.add(NL15);


            pushFollow(FOLLOW_block_in_mainproc368);
            block16=block();

            state._fsp--;

            stream_block.add(block16.getTree());

            END17=(Token)match(input,END,FOLLOW_END_in_mainproc370);  
            stream_END.add(END17);


            // AST REWRITE
            // elements: block, BEGIN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:24: -> ^( BEGIN block )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:77:27: ^( BEGIN block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ProcedureNode(stream_BEGIN.nextToken())
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mainproc"


    public static class idlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "idlist"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:80:1: idlist : ID ( ',' ! ID )* ;
    public final SiDLParser.idlist_return idlist() throws RecognitionException {
        SiDLParser.idlist_return retval = new SiDLParser.idlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID18=null;
        Token char_literal19=null;
        Token ID20=null;

        Object ID18_tree=null;
        Object char_literal19_tree=null;
        Object ID20_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:81:2: ( ID ( ',' ! ID )* )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:81:4: ID ( ',' ! ID )*
            {
            root_0 = (Object)adaptor.nil();


            ID18=(Token)match(input,ID,FOLLOW_ID_in_idlist393); 
            ID18_tree = 
            new IdNode(ID18) 
            ;
            adaptor.addChild(root_0, ID18_tree);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:81:15: ( ',' ! ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:81:16: ',' ! ID
            	    {
            	    char_literal19=(Token)match(input,52,FOLLOW_52_in_idlist399); 

            	    ID20=(Token)match(input,ID,FOLLOW_ID_in_idlist402); 
            	    ID20_tree = 
            	    new IdNode(ID20) 
            	    ;
            	    adaptor.addChild(root_0, ID20_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idlist"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:84:1: block : ( statement | NL )+ -> ^( BLOCK ( statement )+ ) ;
    public final SiDLParser.block_return block() throws RecognitionException {
        SiDLParser.block_return retval = new SiDLParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL22=null;
        SiDLParser.statement_return statement21 =null;


        Object NL22_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:2: ( ( statement | NL )+ -> ^( BLOCK ( statement )+ ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:4: ( statement | NL )+
            {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:4: ( statement | NL )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CALL||(LA5_0 >= DO && LA5_0 <= DROP)||LA5_0==FROM||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==MOVE||LA5_0==PULL||LA5_0==TURN||LA5_0==WITH) ) {
                    alt5=1;
                }
                else if ( (LA5_0==NL) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block419);
            	    statement21=statement();

            	    state._fsp--;

            	    stream_statement.add(statement21.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:17: NL
            	    {
            	    NL22=(Token)match(input,NL,FOLLOW_NL_in_block423);  
            	    stream_NL.add(NL22);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:23: -> ^( BLOCK ( statement )+ )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:85:26: ^( BLOCK ( statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockNode(BLOCK)
                , root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:87:1: statement : ( assignment | action | procedure_call | control ) NL !;
    public final SiDLParser.statement_return statement() throws RecognitionException {
        SiDLParser.statement_return retval = new SiDLParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL27=null;
        SiDLParser.assignment_return assignment23 =null;

        SiDLParser.action_return action24 =null;

        SiDLParser.procedure_call_return procedure_call25 =null;

        SiDLParser.control_return control26 =null;


        Object NL27_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:2: ( ( assignment | action | procedure_call | control ) NL !)
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:4: ( assignment | action | procedure_call | control ) NL !
            {
            root_0 = (Object)adaptor.nil();


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:4: ( assignment | action | procedure_call | control )
            int alt6=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case DROP:
            case MOVE:
            case PULL:
            case TURN:
                {
                alt6=2;
                }
                break;
            case CALL:
                {
                alt6=3;
                }
                break;
            case DO:
            case FROM:
            case IF:
            case WITH:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement450);
                    assignment23=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment23.getTree());

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:18: action
                    {
                    pushFollow(FOLLOW_action_in_statement454);
                    action24=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action24.getTree());

                    }
                    break;
                case 3 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:27: procedure_call
                    {
                    pushFollow(FOLLOW_procedure_call_in_statement458);
                    procedure_call25=procedure_call();

                    state._fsp--;

                    adaptor.addChild(root_0, procedure_call25.getTree());

                    }
                    break;
                case 4 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:88:44: control
                    {
                    pushFollow(FOLLOW_control_in_statement462);
                    control26=control();

                    state._fsp--;

                    adaptor.addChild(root_0, control26.getTree());

                    }
                    break;

            }


            NL27=(Token)match(input,NL,FOLLOW_NL_in_statement465); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:91:1: assignment : ID '=' ^ assignment_target ;
    public final SiDLParser.assignment_return assignment() throws RecognitionException {
        SiDLParser.assignment_return retval = new SiDLParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID28=null;
        Token char_literal29=null;
        SiDLParser.assignment_target_return assignment_target30 =null;


        Object ID28_tree=null;
        Object char_literal29_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:92:2: ( ID '=' ^ assignment_target )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:92:4: ID '=' ^ assignment_target
            {
            root_0 = (Object)adaptor.nil();


            ID28=(Token)match(input,ID,FOLLOW_ID_in_assignment478); 
            ID28_tree = 
            new IdNode(ID28) 
            ;
            adaptor.addChild(root_0, ID28_tree);


            char_literal29=(Token)match(input,57,FOLLOW_57_in_assignment483); 
            char_literal29_tree = 
            new AssignmentNode(char_literal29) 
            ;
            root_0 = (Object)adaptor.becomeRoot(char_literal29_tree, root_0);


            pushFollow(FOLLOW_assignment_target_in_assignment489);
            assignment_target30=assignment_target();

            state._fsp--;

            adaptor.addChild(root_0, assignment_target30.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class assignment_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_target"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:94:1: assignment_target options {k=2; } : ( num_expr | ID '=' ! assignment_target );
    public final SiDLParser.assignment_target_return assignment_target() throws RecognitionException {
        SiDLParser.assignment_target_return retval = new SiDLParser.assignment_target_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID32=null;
        Token char_literal33=null;
        SiDLParser.num_expr_return num_expr31 =null;

        SiDLParser.assignment_target_return assignment_target34 =null;


        Object ID32_tree=null;
        Object char_literal33_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:96:2: ( num_expr | ID '=' ! assignment_target )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NUMBER||LA7_0==48||LA7_0==53) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==NL||LA7_4==48||(LA7_4 >= 50 && LA7_4 <= 51)||(LA7_4 >= 53 && LA7_4 <= 54)) ) {
                    alt7=1;
                }
                else if ( (LA7_4==57) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:96:4: num_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_num_expr_in_assignment_target508);
                    num_expr31=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr31.getTree());

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:96:15: ID '=' ! assignment_target
                    {
                    root_0 = (Object)adaptor.nil();


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_assignment_target512); 
                    ID32_tree = 
                    new IdNode(ID32) 
                    ;
                    adaptor.addChild(root_0, ID32_tree);


                    char_literal33=(Token)match(input,57,FOLLOW_57_in_assignment_target517); 

                    pushFollow(FOLLOW_assignment_target_in_assignment_target520);
                    assignment_target34=assignment_target();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_target34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_target"


    public static class procedure_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure_call"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:99:1: procedure_call : CALL ID ( '(' ( num_expr_list )? ')' )? -> ^( ID ( num_expr_list )? ) ;
    public final SiDLParser.procedure_call_return procedure_call() throws RecognitionException {
        SiDLParser.procedure_call_return retval = new SiDLParser.procedure_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CALL35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        SiDLParser.num_expr_list_return num_expr_list38 =null;


        Object CALL35_tree=null;
        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_CALL=new RewriteRuleTokenStream(adaptor,"token CALL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_num_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule num_expr_list");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:2: ( CALL ID ( '(' ( num_expr_list )? ')' )? -> ^( ID ( num_expr_list )? ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:4: CALL ID ( '(' ( num_expr_list )? ')' )?
            {
            CALL35=(Token)match(input,CALL,FOLLOW_CALL_in_procedure_call532);  
            stream_CALL.add(CALL35);


            ID36=(Token)match(input,ID,FOLLOW_ID_in_procedure_call534);  
            stream_ID.add(ID36);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:12: ( '(' ( num_expr_list )? ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:13: '(' ( num_expr_list )? ')'
                    {
                    char_literal37=(Token)match(input,48,FOLLOW_48_in_procedure_call537);  
                    stream_48.add(char_literal37);


                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:17: ( num_expr_list )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID||LA8_0==NUMBER||LA8_0==48||LA8_0==53) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:17: num_expr_list
                            {
                            pushFollow(FOLLOW_num_expr_list_in_procedure_call539);
                            num_expr_list38=num_expr_list();

                            state._fsp--;

                            stream_num_expr_list.add(num_expr_list38.getTree());

                            }
                            break;

                    }


                    char_literal39=(Token)match(input,49,FOLLOW_49_in_procedure_call542);  
                    stream_49.add(char_literal39);


                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, num_expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:39: -> ^( ID ( num_expr_list )? )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:42: ^( ID ( num_expr_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ProcedureCallNode(stream_ID.nextToken())
                , root_1);

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:100:66: ( num_expr_list )?
                if ( stream_num_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_num_expr_list.nextTree());

                }
                stream_num_expr_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedure_call"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:107:1: function : FUNC ID '(' ( idlist )? ')' ( block )? RETURN num_expr NL -> ^( ID ( idlist )? ( block )? num_expr ) ;
    public final SiDLParser.function_return function() throws RecognitionException {
        SiDLParser.function_return retval = new SiDLParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FUNC40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token RETURN46=null;
        Token NL48=null;
        SiDLParser.idlist_return idlist43 =null;

        SiDLParser.block_return block45 =null;

        SiDLParser.num_expr_return num_expr47 =null;


        Object FUNC40_tree=null;
        Object ID41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object RETURN46_tree=null;
        Object NL48_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FUNC=new RewriteRuleTokenStream(adaptor,"token FUNC");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        RewriteRuleSubtreeStream stream_idlist=new RewriteRuleSubtreeStream(adaptor,"rule idlist");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:2: ( FUNC ID '(' ( idlist )? ')' ( block )? RETURN num_expr NL -> ^( ID ( idlist )? ( block )? num_expr ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:4: FUNC ID '(' ( idlist )? ')' ( block )? RETURN num_expr NL
            {
            FUNC40=(Token)match(input,FUNC,FOLLOW_FUNC_in_function572);  
            stream_FUNC.add(FUNC40);


            ID41=(Token)match(input,ID,FOLLOW_ID_in_function574);  
            stream_ID.add(ID41);


            char_literal42=(Token)match(input,48,FOLLOW_48_in_function576);  
            stream_48.add(char_literal42);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:16: ( idlist )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:16: idlist
                    {
                    pushFollow(FOLLOW_idlist_in_function578);
                    idlist43=idlist();

                    state._fsp--;

                    stream_idlist.add(idlist43.getTree());

                    }
                    break;

            }


            char_literal44=(Token)match(input,49,FOLLOW_49_in_function581);  
            stream_49.add(char_literal44);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:28: ( block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CALL||(LA11_0 >= DO && LA11_0 <= DROP)||LA11_0==FROM||(LA11_0 >= ID && LA11_0 <= IF)||(LA11_0 >= MOVE && LA11_0 <= NL)||LA11_0==PULL||LA11_0==TURN||LA11_0==WITH) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:108:28: block
                    {
                    pushFollow(FOLLOW_block_in_function583);
                    block45=block();

                    state._fsp--;

                    stream_block.add(block45.getTree());

                    }
                    break;

            }


            RETURN46=(Token)match(input,RETURN,FOLLOW_RETURN_in_function586);  
            stream_RETURN.add(RETURN46);


            pushFollow(FOLLOW_num_expr_in_function588);
            num_expr47=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr47.getTree());

            NL48=(Token)match(input,NL,FOLLOW_NL_in_function590);  
            stream_NL.add(NL48);


            // AST REWRITE
            // elements: num_expr, block, idlist, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:3: -> ^( ID ( idlist )? ( block )? num_expr )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:109:6: ^( ID ( idlist )? ( block )? num_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionNode(stream_ID.nextToken())
                , root_1);

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:109:25: ( idlist )?
                if ( stream_idlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_idlist.nextTree());

                }
                stream_idlist.reset();

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:109:33: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_1, stream_num_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:115:1: action : ( action_pen | action_move | action_turn );
    public final SiDLParser.action_return action() throws RecognitionException {
        SiDLParser.action_return retval = new SiDLParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SiDLParser.action_pen_return action_pen49 =null;

        SiDLParser.action_move_return action_move50 =null;

        SiDLParser.action_turn_return action_turn51 =null;



        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:116:2: ( action_pen | action_move | action_turn )
            int alt12=3;
            switch ( input.LA(1) ) {
            case DROP:
            case PULL:
                {
                alt12=1;
                }
                break;
            case MOVE:
                {
                alt12=2;
                }
                break;
            case TURN:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:116:4: action_pen
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_action_pen_in_action623);
                    action_pen49=action_pen();

                    state._fsp--;

                    adaptor.addChild(root_0, action_pen49.getTree());

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:116:17: action_move
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_action_move_in_action627);
                    action_move50=action_move();

                    state._fsp--;

                    adaptor.addChild(root_0, action_move50.getTree());

                    }
                    break;
                case 3 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:116:31: action_turn
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_action_turn_in_action631);
                    action_turn51=action_turn();

                    state._fsp--;

                    adaptor.addChild(root_0, action_turn51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action"


    public static class action_pen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_pen"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:118:1: action_pen : (a= DROP |a= PULL ) PEN -> ^( PEN[$a] ) ;
    public final SiDLParser.action_pen_return action_pen() throws RecognitionException {
        SiDLParser.action_pen_return retval = new SiDLParser.action_pen_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token PEN52=null;

        Object a_tree=null;
        Object PEN52_tree=null;
        RewriteRuleTokenStream stream_PULL=new RewriteRuleTokenStream(adaptor,"token PULL");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_PEN=new RewriteRuleTokenStream(adaptor,"token PEN");

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:2: ( (a= DROP |a= PULL ) PEN -> ^( PEN[$a] ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:4: (a= DROP |a= PULL ) PEN
            {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:4: (a= DROP |a= PULL )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DROP) ) {
                alt13=1;
            }
            else if ( (LA13_0==PULL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:5: a= DROP
                    {
                    a=(Token)match(input,DROP,FOLLOW_DROP_in_action_pen647);  
                    stream_DROP.add(a);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:14: a= PULL
                    {
                    a=(Token)match(input,PULL,FOLLOW_PULL_in_action_pen653);  
                    stream_PULL.add(a);


                    }
                    break;

            }


            PEN52=(Token)match(input,PEN,FOLLOW_PEN_in_action_pen656);  
            stream_PEN.add(PEN52);


            // AST REWRITE
            // elements: PEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:27: -> ^( PEN[$a] )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:119:30: ^( PEN[$a] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new PenActionNode(PEN, a)
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action_pen"


    public static class action_move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_move"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:121:1: action_move : MOVE (dir= FWD |dir= BWD |dir= LEFT |dir= RIGHT )? BY num_expr -> ^( MOVE[$dir] num_expr ) ;
    public final SiDLParser.action_move_return action_move() throws RecognitionException {
        SiDLParser.action_move_return retval = new SiDLParser.action_move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token dir=null;
        Token MOVE53=null;
        Token BY54=null;
        SiDLParser.num_expr_return num_expr55 =null;


        Object dir_tree=null;
        Object MOVE53_tree=null;
        Object BY54_tree=null;
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_BWD=new RewriteRuleTokenStream(adaptor,"token BWD");
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
        RewriteRuleTokenStream stream_FWD=new RewriteRuleTokenStream(adaptor,"token FWD");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:2: ( MOVE (dir= FWD |dir= BWD |dir= LEFT |dir= RIGHT )? BY num_expr -> ^( MOVE[$dir] num_expr ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:4: MOVE (dir= FWD |dir= BWD |dir= LEFT |dir= RIGHT )? BY num_expr
            {
            MOVE53=(Token)match(input,MOVE,FOLLOW_MOVE_in_action_move679);  
            stream_MOVE.add(MOVE53);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:9: (dir= FWD |dir= BWD |dir= LEFT |dir= RIGHT )?
            int alt14=5;
            switch ( input.LA(1) ) {
                case FWD:
                    {
                    alt14=1;
                    }
                    break;
                case BWD:
                    {
                    alt14=2;
                    }
                    break;
                case LEFT:
                    {
                    alt14=3;
                    }
                    break;
                case RIGHT:
                    {
                    alt14=4;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:10: dir= FWD
                    {
                    dir=(Token)match(input,FWD,FOLLOW_FWD_in_action_move684);  
                    stream_FWD.add(dir);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:20: dir= BWD
                    {
                    dir=(Token)match(input,BWD,FOLLOW_BWD_in_action_move690);  
                    stream_BWD.add(dir);


                    }
                    break;
                case 3 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:30: dir= LEFT
                    {
                    dir=(Token)match(input,LEFT,FOLLOW_LEFT_in_action_move696);  
                    stream_LEFT.add(dir);


                    }
                    break;
                case 4 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:41: dir= RIGHT
                    {
                    dir=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_action_move702);  
                    stream_RIGHT.add(dir);


                    }
                    break;

            }


            BY54=(Token)match(input,BY,FOLLOW_BY_in_action_move706);  
            stream_BY.add(BY54);


            pushFollow(FOLLOW_num_expr_in_action_move708);
            num_expr55=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr55.getTree());

            // AST REWRITE
            // elements: MOVE, num_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:66: -> ^( MOVE[$dir] num_expr )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:122:69: ^( MOVE[$dir] num_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new MoveActionNode(MOVE, dir)
                , root_1);

                adaptor.addChild(root_1, stream_num_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action_move"


    public static class action_turn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_turn"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:124:1: action_turn : TURN (dir= LEFT |dir= RIGHT )? BY num_expr -> ^( TURN[$dir] num_expr ) ;
    public final SiDLParser.action_turn_return action_turn() throws RecognitionException {
        SiDLParser.action_turn_return retval = new SiDLParser.action_turn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token dir=null;
        Token TURN56=null;
        Token BY57=null;
        SiDLParser.num_expr_return num_expr58 =null;


        Object dir_tree=null;
        Object TURN56_tree=null;
        Object BY57_tree=null;
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");
        RewriteRuleTokenStream stream_TURN=new RewriteRuleTokenStream(adaptor,"token TURN");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:2: ( TURN (dir= LEFT |dir= RIGHT )? BY num_expr -> ^( TURN[$dir] num_expr ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:4: TURN (dir= LEFT |dir= RIGHT )? BY num_expr
            {
            TURN56=(Token)match(input,TURN,FOLLOW_TURN_in_action_turn732);  
            stream_TURN.add(TURN56);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:9: (dir= LEFT |dir= RIGHT )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LEFT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RIGHT) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:10: dir= LEFT
                    {
                    dir=(Token)match(input,LEFT,FOLLOW_LEFT_in_action_turn737);  
                    stream_LEFT.add(dir);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:21: dir= RIGHT
                    {
                    dir=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_action_turn743);  
                    stream_RIGHT.add(dir);


                    }
                    break;

            }


            BY57=(Token)match(input,BY,FOLLOW_BY_in_action_turn747);  
            stream_BY.add(BY57);


            pushFollow(FOLLOW_num_expr_in_action_turn749);
            num_expr58=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr58.getTree());

            // AST REWRITE
            // elements: num_expr, TURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:46: -> ^( TURN[$dir] num_expr )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:125:49: ^( TURN[$dir] num_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new TurnActionNode(TURN, dir)
                , root_1);

                adaptor.addChild(root_1, stream_num_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action_turn"


    public static class control_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:131:1: control : ( control_if | control_loop | control_fromto );
    public final SiDLParser.control_return control() throws RecognitionException {
        SiDLParser.control_return retval = new SiDLParser.control_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SiDLParser.control_if_return control_if59 =null;

        SiDLParser.control_loop_return control_loop60 =null;

        SiDLParser.control_fromto_return control_fromto61 =null;



        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:132:2: ( control_if | control_loop | control_fromto )
            int alt16=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt16=1;
                }
                break;
            case DO:
                {
                alt16=2;
                }
                break;
            case FROM:
            case WITH:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:132:4: control_if
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_control_if_in_control776);
                    control_if59=control_if();

                    state._fsp--;

                    adaptor.addChild(root_0, control_if59.getTree());

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:132:17: control_loop
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_control_loop_in_control780);
                    control_loop60=control_loop();

                    state._fsp--;

                    adaptor.addChild(root_0, control_loop60.getTree());

                    }
                    break;
                case 3 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:132:32: control_fromto
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_control_fromto_in_control784);
                    control_fromto61=control_fromto();

                    state._fsp--;

                    adaptor.addChild(root_0, control_fromto61.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control"


    public static class control_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_if"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:134:1: control_if : IF c+= logic_expr THEN b+= block ( ELSEIF c+= logic_expr THEN b+= block )* ( ELSE be= block )? ENDIF -> ^( IF ( $c)+ ( $b)+ ( $be)? ) ;
    public final SiDLParser.control_if_return control_if() throws RecognitionException {
        SiDLParser.control_if_return retval = new SiDLParser.control_if_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF62=null;
        Token THEN63=null;
        Token ELSEIF64=null;
        Token THEN65=null;
        Token ELSE66=null;
        Token ENDIF67=null;
        List list_c=null;
        List list_b=null;
        SiDLParser.block_return be =null;

        RuleReturnScope c = null;
        RuleReturnScope b = null;
        Object IF62_tree=null;
        Object THEN63_tree=null;
        Object ELSEIF64_tree=null;
        Object THEN65_tree=null;
        Object ELSE66_tree=null;
        Object ENDIF67_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_ELSEIF=new RewriteRuleTokenStream(adaptor,"token ELSEIF");
        RewriteRuleSubtreeStream stream_logic_expr=new RewriteRuleSubtreeStream(adaptor,"rule logic_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:2: ( IF c+= logic_expr THEN b+= block ( ELSEIF c+= logic_expr THEN b+= block )* ( ELSE be= block )? ENDIF -> ^( IF ( $c)+ ( $b)+ ( $be)? ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:4: IF c+= logic_expr THEN b+= block ( ELSEIF c+= logic_expr THEN b+= block )* ( ELSE be= block )? ENDIF
            {
            IF62=(Token)match(input,IF,FOLLOW_IF_in_control_if795);  
            stream_IF.add(IF62);


            pushFollow(FOLLOW_logic_expr_in_control_if799);
            c=logic_expr();

            state._fsp--;

            stream_logic_expr.add(c.getTree());
            if (list_c==null) list_c=new ArrayList();
            list_c.add(c.getTree());


            THEN63=(Token)match(input,THEN,FOLLOW_THEN_in_control_if801);  
            stream_THEN.add(THEN63);


            pushFollow(FOLLOW_block_in_control_if805);
            b=block();

            state._fsp--;

            stream_block.add(b.getTree());
            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTree());


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:35: ( ELSEIF c+= logic_expr THEN b+= block )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ELSEIF) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:36: ELSEIF c+= logic_expr THEN b+= block
            	    {
            	    ELSEIF64=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_control_if808);  
            	    stream_ELSEIF.add(ELSEIF64);


            	    pushFollow(FOLLOW_logic_expr_in_control_if812);
            	    c=logic_expr();

            	    state._fsp--;

            	    stream_logic_expr.add(c.getTree());
            	    if (list_c==null) list_c=new ArrayList();
            	    list_c.add(c.getTree());


            	    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_control_if814);  
            	    stream_THEN.add(THEN65);


            	    pushFollow(FOLLOW_block_in_control_if818);
            	    b=block();

            	    state._fsp--;

            	    stream_block.add(b.getTree());
            	    if (list_b==null) list_b=new ArrayList();
            	    list_b.add(b.getTree());


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:73: ( ELSE be= block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:135:74: ELSE be= block
                    {
                    ELSE66=(Token)match(input,ELSE,FOLLOW_ELSE_in_control_if823);  
                    stream_ELSE.add(ELSE66);


                    pushFollow(FOLLOW_block_in_control_if827);
                    be=block();

                    state._fsp--;

                    stream_block.add(be.getTree());

                    }
                    break;

            }


            ENDIF67=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_control_if831);  
            stream_ENDIF.add(ENDIF67);


            // AST REWRITE
            // elements: b, c, IF, be
            // token labels: 
            // rule labels: retval, be
            // token list labels: 
            // rule list labels: b, c
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",list_b);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",list_c);
            root_0 = (Object)adaptor.nil();
            // 136:5: -> ^( IF ( $c)+ ( $b)+ ( $be)? )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:136:8: ^( IF ( $c)+ ( $b)+ ( $be)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new IfControlNode(stream_IF.nextToken())
                , root_1);

                if ( !(stream_c.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_c.hasNext() ) {
                    adaptor.addChild(root_1, stream_c.nextTree());

                }
                stream_c.reset();

                if ( !(stream_b.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:136:37: ( $be)?
                if ( stream_be.hasNext() ) {
                    adaptor.addChild(root_1, stream_be.nextTree());

                }
                stream_be.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control_if"


    public static class control_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_loop"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:138:1: control_loop : DO ( condition block LOOP -> ^( LOOP condition block ) | block LOOP condition -> ^( LOOP condition block ) ) ;
    public final SiDLParser.control_loop_return control_loop() throws RecognitionException {
        SiDLParser.control_loop_return retval = new SiDLParser.control_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DO68=null;
        Token LOOP71=null;
        Token LOOP73=null;
        SiDLParser.condition_return condition69 =null;

        SiDLParser.block_return block70 =null;

        SiDLParser.block_return block72 =null;

        SiDLParser.condition_return condition74 =null;


        Object DO68_tree=null;
        Object LOOP71_tree=null;
        Object LOOP73_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:139:2: ( DO ( condition block LOOP -> ^( LOOP condition block ) | block LOOP condition -> ^( LOOP condition block ) ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:139:4: DO ( condition block LOOP -> ^( LOOP condition block ) | block LOOP condition -> ^( LOOP condition block ) )
            {
            DO68=(Token)match(input,DO,FOLLOW_DO_in_control_loop867);  
            stream_DO.add(DO68);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:140:2: ( condition block LOOP -> ^( LOOP condition block ) | block LOOP condition -> ^( LOOP condition block ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= UNTIL && LA19_0 <= WHILE)) ) {
                alt19=1;
            }
            else if ( (LA19_0==CALL||(LA19_0 >= DO && LA19_0 <= DROP)||LA19_0==FROM||(LA19_0 >= ID && LA19_0 <= IF)||(LA19_0 >= MOVE && LA19_0 <= NL)||LA19_0==PULL||LA19_0==TURN||LA19_0==WITH) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:140:4: condition block LOOP
                    {
                    pushFollow(FOLLOW_condition_in_control_loop873);
                    condition69=condition();

                    state._fsp--;

                    stream_condition.add(condition69.getTree());

                    pushFollow(FOLLOW_block_in_control_loop875);
                    block70=block();

                    state._fsp--;

                    stream_block.add(block70.getTree());

                    LOOP71=(Token)match(input,LOOP,FOLLOW_LOOP_in_control_loop877);  
                    stream_LOOP.add(LOOP71);


                    // AST REWRITE
                    // elements: LOOP, block, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:26: -> ^( LOOP condition block )
                    {
                        // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:140:29: ^( LOOP condition block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new TestDoLoopControlNode(stream_LOOP.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, stream_condition.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:141:4: block LOOP condition
                    {
                    pushFollow(FOLLOW_block_in_control_loop896);
                    block72=block();

                    state._fsp--;

                    stream_block.add(block72.getTree());

                    LOOP73=(Token)match(input,LOOP,FOLLOW_LOOP_in_control_loop898);  
                    stream_LOOP.add(LOOP73);


                    pushFollow(FOLLOW_condition_in_control_loop900);
                    condition74=condition();

                    state._fsp--;

                    stream_condition.add(condition74.getTree());

                    // AST REWRITE
                    // elements: LOOP, block, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:26: -> ^( LOOP condition block )
                    {
                        // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:141:29: ^( LOOP condition block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new DoTestLoopControlNode(stream_LOOP.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, stream_condition.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control_loop"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:143:1: condition : ( WHILE !| UNTIL ^) logic_expr ;
    public final SiDLParser.condition_return condition() throws RecognitionException {
        SiDLParser.condition_return retval = new SiDLParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE75=null;
        Token UNTIL76=null;
        SiDLParser.logic_expr_return logic_expr77 =null;


        Object WHILE75_tree=null;
        Object UNTIL76_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:144:2: ( ( WHILE !| UNTIL ^) logic_expr )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:144:4: ( WHILE !| UNTIL ^) logic_expr
            {
            root_0 = (Object)adaptor.nil();


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:144:4: ( WHILE !| UNTIL ^)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WHILE) ) {
                alt20=1;
            }
            else if ( (LA20_0==UNTIL) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:144:5: WHILE !
                    {
                    WHILE75=(Token)match(input,WHILE,FOLLOW_WHILE_in_condition928); 

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:144:14: UNTIL ^
                    {
                    UNTIL76=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_condition933); 
                    UNTIL76_tree = 
                    new NotExp(UNTIL76) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTIL76_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_logic_expr_in_condition940);
            logic_expr77=logic_expr();

            state._fsp--;

            adaptor.addChild(root_0, logic_expr77.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class control_fromto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_fromto"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:146:1: control_fromto : ( WITH ID )? FROM start= num_expr TO end= num_expr block LOOP -> ^( FROM $start $end ( ID )? block ) ;
    public final SiDLParser.control_fromto_return control_fromto() throws RecognitionException {
        SiDLParser.control_fromto_return retval = new SiDLParser.control_fromto_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH78=null;
        Token ID79=null;
        Token FROM80=null;
        Token TO81=null;
        Token LOOP83=null;
        SiDLParser.num_expr_return start =null;

        SiDLParser.num_expr_return end =null;

        SiDLParser.block_return block82 =null;


        Object WITH78_tree=null;
        Object ID79_tree=null;
        Object FROM80_tree=null;
        Object TO81_tree=null;
        Object LOOP83_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:147:2: ( ( WITH ID )? FROM start= num_expr TO end= num_expr block LOOP -> ^( FROM $start $end ( ID )? block ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:147:4: ( WITH ID )? FROM start= num_expr TO end= num_expr block LOOP
            {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:147:4: ( WITH ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==WITH) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:147:5: WITH ID
                    {
                    WITH78=(Token)match(input,WITH,FOLLOW_WITH_in_control_fromto952);  
                    stream_WITH.add(WITH78);


                    ID79=(Token)match(input,ID,FOLLOW_ID_in_control_fromto954);  
                    stream_ID.add(ID79);


                    }
                    break;

            }


            FROM80=(Token)match(input,FROM,FOLLOW_FROM_in_control_fromto958);  
            stream_FROM.add(FROM80);


            pushFollow(FOLLOW_num_expr_in_control_fromto962);
            start=num_expr();

            state._fsp--;

            stream_num_expr.add(start.getTree());

            TO81=(Token)match(input,TO,FOLLOW_TO_in_control_fromto964);  
            stream_TO.add(TO81);


            pushFollow(FOLLOW_num_expr_in_control_fromto968);
            end=num_expr();

            state._fsp--;

            stream_num_expr.add(end.getTree());

            pushFollow(FOLLOW_block_in_control_fromto970);
            block82=block();

            state._fsp--;

            stream_block.add(block82.getTree());

            LOOP83=(Token)match(input,LOOP,FOLLOW_LOOP_in_control_fromto972);  
            stream_LOOP.add(LOOP83);


            // AST REWRITE
            // elements: block, start, ID, FROM, end
            // token labels: 
            // rule labels: retval, start, end
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_start=new RewriteRuleSubtreeStream(adaptor,"rule start",start!=null?start.tree:null);
            RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:3: -> ^( FROM $start $end ( ID )? block )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:148:6: ^( FROM $start $end ( ID )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FromToControlNode(stream_FROM.nextToken())
                , root_1);

                adaptor.addChild(root_1, stream_start.nextTree());

                adaptor.addChild(root_1, stream_end.nextTree());

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:148:44: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    new IdNode(stream_ID.nextToken())
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control_fromto"


    public static class num_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:153:1: num_expr : term ( ( '+' ^| '-' ^) term )* ;
    public final SiDLParser.num_expr_return num_expr() throws RecognitionException {
        SiDLParser.num_expr_return retval = new SiDLParser.num_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal86=null;
        SiDLParser.term_return term84 =null;

        SiDLParser.term_return term87 =null;


        Object char_literal85_tree=null;
        Object char_literal86_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:2: ( term ( ( '+' ^| '-' ^) term )* )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:4: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1010);
            term84=term();

            state._fsp--;

            adaptor.addChild(root_0, term84.getTree());

            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:9: ( ( '+' ^| '-' ^) term )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==51||LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:10: ( '+' ^| '-' ^) term
            	    {
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:10: ( '+' ^| '-' ^)
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==51) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==53) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:11: '+' ^
            	            {
            	            char_literal85=(Token)match(input,51,FOLLOW_51_in_num_expr1014); 
            	            char_literal85_tree = 
            	            new PlusExp(char_literal85) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal85_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:154:27: '-' ^
            	            {
            	            char_literal86=(Token)match(input,53,FOLLOW_53_in_num_expr1022); 
            	            char_literal86_tree = 
            	            new MinusExp(char_literal86) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal86_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1029);
            	    term87=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term87.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:155:1: term : factor ( ( '*' ^| '/' ^) factor )* ;
    public final SiDLParser.term_return term() throws RecognitionException {
        SiDLParser.term_return retval = new SiDLParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal89=null;
        Token char_literal90=null;
        SiDLParser.factor_return factor88 =null;

        SiDLParser.factor_return factor91 =null;


        Object char_literal89_tree=null;
        Object char_literal90_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:2: ( factor ( ( '*' ^| '/' ^) factor )* )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:5: factor ( ( '*' ^| '/' ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1042);
            factor88=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor88.getTree());

            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:12: ( ( '*' ^| '/' ^) factor )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50||LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:13: ( '*' ^| '/' ^) factor
            	    {
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:13: ( '*' ^| '/' ^)
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==50) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==54) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:14: '*' ^
            	            {
            	            char_literal89=(Token)match(input,50,FOLLOW_50_in_term1046); 
            	            char_literal89_tree = 
            	            new MultExp(char_literal89) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal89_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:156:30: '/' ^
            	            {
            	            char_literal90=(Token)match(input,54,FOLLOW_54_in_term1054); 
            	            char_literal90_tree = 
            	            new DivExp(char_literal90) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal90_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1061);
            	    factor91=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor91.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:157:1: factor : ( NUMBER | '(' ! num_expr ')' !| ( '-' ^)? reference );
    public final SiDLParser.factor_return factor() throws RecognitionException {
        SiDLParser.factor_return retval = new SiDLParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        SiDLParser.num_expr_return num_expr94 =null;

        SiDLParser.reference_return reference97 =null;


        Object NUMBER92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:2: ( NUMBER | '(' ! num_expr ')' !| ( '-' ^)? reference )
            int alt27=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt27=1;
                }
                break;
            case 48:
                {
                alt27=2;
                }
                break;
            case ID:
            case 53:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:5: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER92=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1073); 
                    NUMBER92_tree = 
                    new ValueExp(NUMBER92) 
                    ;
                    adaptor.addChild(root_0, NUMBER92_tree);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:24: '(' ! num_expr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal93=(Token)match(input,48,FOLLOW_48_in_factor1080); 

                    pushFollow(FOLLOW_num_expr_in_factor1083);
                    num_expr94=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr94.getTree());

                    char_literal95=(Token)match(input,49,FOLLOW_49_in_factor1085); 

                    }
                    break;
                case 3 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:45: ( '-' ^)? reference
                    {
                    root_0 = (Object)adaptor.nil();


                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:45: ( '-' ^)?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==53) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:158:46: '-' ^
                            {
                            char_literal96=(Token)match(input,53,FOLLOW_53_in_factor1091); 
                            char_literal96_tree = 
                            new NegExp(char_literal96) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal96_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_factor1099);
                    reference97=reference();

                    state._fsp--;

                    adaptor.addChild(root_0, reference97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class reference_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reference"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:160:1: reference options {k=2; } : ( ID | function_call );
    public final SiDLParser.reference_return reference() throws RecognitionException {
        SiDLParser.reference_return retval = new SiDLParser.reference_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID98=null;
        SiDLParser.function_call_return function_call99 =null;


        Object ID98_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:162:2: ( ID | function_call )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==48) ) {
                    alt28=2;
                }
                else if ( (LA28_1==AND||LA28_1==CALL||(LA28_1 >= DO && LA28_1 <= DROP)||LA28_1==FROM||(LA28_1 >= ID && LA28_1 <= IF)||(LA28_1 >= MOVE && LA28_1 <= NL)||LA28_1==OR||LA28_1==PULL||(LA28_1 >= THEN && LA28_1 <= TURN)||LA28_1==WITH||(LA28_1 >= XOR && LA28_1 <= 47)||(LA28_1 >= 49 && LA28_1 <= 59)||LA28_1==61) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:162:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID98=(Token)match(input,ID,FOLLOW_ID_in_reference1117); 
                    ID98_tree = 
                    new VarExp(ID98) 
                    ;
                    adaptor.addChild(root_0, ID98_tree);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:162:17: function_call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_reference1124);
                    function_call99=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reference"


    public static class function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:164:1: function_call : ID '(' ( num_expr_list )? ')' -> ^( ID ( num_expr_list )? ) ;
    public final SiDLParser.function_call_return function_call() throws RecognitionException {
        SiDLParser.function_call_return retval = new SiDLParser.function_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        SiDLParser.num_expr_list_return num_expr_list102 =null;


        Object ID100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_num_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule num_expr_list");
        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:2: ( ID '(' ( num_expr_list )? ')' -> ^( ID ( num_expr_list )? ) )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:4: ID '(' ( num_expr_list )? ')'
            {
            ID100=(Token)match(input,ID,FOLLOW_ID_in_function_call1135);  
            stream_ID.add(ID100);


            char_literal101=(Token)match(input,48,FOLLOW_48_in_function_call1137);  
            stream_48.add(char_literal101);


            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:11: ( num_expr_list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID||LA29_0==NUMBER||LA29_0==48||LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:11: num_expr_list
                    {
                    pushFollow(FOLLOW_num_expr_list_in_function_call1139);
                    num_expr_list102=num_expr_list();

                    state._fsp--;

                    stream_num_expr_list.add(num_expr_list102.getTree());

                    }
                    break;

            }


            char_literal103=(Token)match(input,49,FOLLOW_49_in_function_call1142);  
            stream_49.add(char_literal103);


            // AST REWRITE
            // elements: ID, num_expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 165:30: -> ^( ID ( num_expr_list )? )
            {
                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:33: ^( ID ( num_expr_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new FunctionExp(stream_ID.nextToken())
                , root_1);

                // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:165:51: ( num_expr_list )?
                if ( stream_num_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_num_expr_list.nextTree());

                }
                stream_num_expr_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class num_expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr_list"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:167:1: num_expr_list : num_expr ( ',' ! num_expr )* ;
    public final SiDLParser.num_expr_list_return num_expr_list() throws RecognitionException {
        SiDLParser.num_expr_list_return retval = new SiDLParser.num_expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal105=null;
        SiDLParser.num_expr_return num_expr104 =null;

        SiDLParser.num_expr_return num_expr106 =null;


        Object char_literal105_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:168:2: ( num_expr ( ',' ! num_expr )* )
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:168:4: num_expr ( ',' ! num_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_num_expr_list1167);
            num_expr104=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr104.getTree());

            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:168:13: ( ',' ! num_expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:168:14: ',' ! num_expr
            	    {
            	    char_literal105=(Token)match(input,52,FOLLOW_52_in_num_expr_list1170); 

            	    pushFollow(FOLLOW_num_expr_in_num_expr_list1173);
            	    num_expr106=num_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, num_expr106.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr_list"


    public static class logic_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic_expr"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:173:1: logic_expr : ( relation ( ( AND ^| OR ^| XOR ^) relation )* | NOT ^ relation );
    public final SiDLParser.logic_expr_return logic_expr() throws RecognitionException {
        SiDLParser.logic_expr_return retval = new SiDLParser.logic_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND108=null;
        Token OR109=null;
        Token XOR110=null;
        Token NOT112=null;
        SiDLParser.relation_return relation107 =null;

        SiDLParser.relation_return relation111 =null;

        SiDLParser.relation_return relation113 =null;


        Object AND108_tree=null;
        Object OR109_tree=null;
        Object XOR110_tree=null;
        Object NOT112_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:2: ( relation ( ( AND ^| OR ^| XOR ^) relation )* | NOT ^ relation )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID||LA33_0==NUMBER||LA33_0==48||LA33_0==53||LA33_0==60) ) {
                alt33=1;
            }
            else if ( (LA33_0==NOT) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:4: relation ( ( AND ^| OR ^| XOR ^) relation )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_relation_in_logic_expr1187);
                    relation107=relation();

                    state._fsp--;

                    adaptor.addChild(root_0, relation107.getTree());

                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:13: ( ( AND ^| OR ^| XOR ^) relation )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==AND||LA32_0==OR||LA32_0==XOR) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:15: ( AND ^| OR ^| XOR ^) relation
                    	    {
                    	    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:15: ( AND ^| OR ^| XOR ^)
                    	    int alt31=3;
                    	    switch ( input.LA(1) ) {
                    	    case AND:
                    	        {
                    	        alt31=1;
                    	        }
                    	        break;
                    	    case OR:
                    	        {
                    	        alt31=2;
                    	        }
                    	        break;
                    	    case XOR:
                    	        {
                    	        alt31=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 31, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt31) {
                    	        case 1 :
                    	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:16: AND ^
                    	            {
                    	            AND108=(Token)match(input,AND,FOLLOW_AND_in_logic_expr1192); 
                    	            AND108_tree = 
                    	            new AndExp(AND108) 
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(AND108_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:31: OR ^
                    	            {
                    	            OR109=(Token)match(input,OR,FOLLOW_OR_in_logic_expr1200); 
                    	            OR109_tree = 
                    	            new OrExp(OR109) 
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(OR109_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:174:44: XOR ^
                    	            {
                    	            XOR110=(Token)match(input,XOR,FOLLOW_XOR_in_logic_expr1208); 
                    	            XOR110_tree = 
                    	            new XorExp(XOR110) 
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(XOR110_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_relation_in_logic_expr1216);
                    	    relation111=relation();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, relation111.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:175:4: NOT ^ relation
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT112=(Token)match(input,NOT,FOLLOW_NOT_in_logic_expr1224); 
                    NOT112_tree = 
                    new NotExp(NOT112) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT112_tree, root_0);


                    pushFollow(FOLLOW_relation_in_logic_expr1230);
                    relation113=relation();

                    state._fsp--;

                    adaptor.addChild(root_0, relation113.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic_expr"


    public static class relation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:177:1: relation : ( num_expr ( '<' ^| '<=' ^| '=' ^| '!=' ^| '>=' ^| '>' ^) num_expr | '[' ! logic_expr ']' !);
    public final SiDLParser.relation_return relation() throws RecognitionException {
        SiDLParser.relation_return retval = new SiDLParser.relation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal115=null;
        Token string_literal116=null;
        Token char_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        SiDLParser.num_expr_return num_expr114 =null;

        SiDLParser.num_expr_return num_expr121 =null;

        SiDLParser.logic_expr_return logic_expr123 =null;


        Object char_literal115_tree=null;
        Object string_literal116_tree=null;
        Object char_literal117_tree=null;
        Object string_literal118_tree=null;
        Object string_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:2: ( num_expr ( '<' ^| '<=' ^| '=' ^| '!=' ^| '>=' ^| '>' ^) num_expr | '[' ! logic_expr ']' !)
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID||LA35_0==NUMBER||LA35_0==48||LA35_0==53) ) {
                alt35=1;
            }
            else if ( (LA35_0==60) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:4: num_expr ( '<' ^| '<=' ^| '=' ^| '!=' ^| '>=' ^| '>' ^) num_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_num_expr_in_relation1241);
                    num_expr114=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr114.getTree());

                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:13: ( '<' ^| '<=' ^| '=' ^| '!=' ^| '>=' ^| '>' ^)
                    int alt34=6;
                    switch ( input.LA(1) ) {
                    case 55:
                        {
                        alt34=1;
                        }
                        break;
                    case 56:
                        {
                        alt34=2;
                        }
                        break;
                    case 57:
                        {
                        alt34=3;
                        }
                        break;
                    case 47:
                        {
                        alt34=4;
                        }
                        break;
                    case 59:
                        {
                        alt34=5;
                        }
                        break;
                    case 58:
                        {
                        alt34=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }

                    switch (alt34) {
                        case 1 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:14: '<' ^
                            {
                            char_literal115=(Token)match(input,55,FOLLOW_55_in_relation1244); 
                            char_literal115_tree = 
                            new LTExp(char_literal115) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal115_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:26: '<=' ^
                            {
                            string_literal116=(Token)match(input,56,FOLLOW_56_in_relation1250); 
                            string_literal116_tree = 
                            new LEExp(string_literal116) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal116_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:39: '=' ^
                            {
                            char_literal117=(Token)match(input,57,FOLLOW_57_in_relation1256); 
                            char_literal117_tree = 
                            new ETExp(char_literal117) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal117_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:51: '!=' ^
                            {
                            string_literal118=(Token)match(input,47,FOLLOW_47_in_relation1262); 
                            string_literal118_tree = 
                            new DFExp(string_literal118) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal118_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:64: '>=' ^
                            {
                            string_literal119=(Token)match(input,59,FOLLOW_59_in_relation1268); 
                            string_literal119_tree = 
                            new GEExp(string_literal119) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal119_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:178:77: '>' ^
                            {
                            char_literal120=(Token)match(input,58,FOLLOW_58_in_relation1274); 
                            char_literal120_tree = 
                            new GTExp(char_literal120) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_relation1281);
                    num_expr121=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr121.getTree());

                    }
                    break;
                case 2 :
                    // /Users/enrico/Documents/Workspace/SiDL/src/sidl/grammar/SiDL.g:179:4: '[' ! logic_expr ']' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal122=(Token)match(input,60,FOLLOW_60_in_relation1287); 

                    pushFollow(FOLLOW_logic_expr_in_relation1290);
                    logic_expr123=logic_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, logic_expr123.getTree());

                    char_literal124=(Token)match(input,61,FOLLOW_61_in_relation1292); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"

    // Delegated rules


 

    public static final BitSet FOLLOW_procedure_in_program272 = new BitSet(new long[]{0x0000000410100020L});
    public static final BitSet FOLLOW_function_in_program276 = new BitSet(new long[]{0x0000000410100020L});
    public static final BitSet FOLLOW_NL_in_program280 = new BitSet(new long[]{0x0000000410100020L});
    public static final BitSet FOLLOW_mainproc_in_program284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROC_in_procedure318 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_procedure320 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_procedure323 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_idlist_in_procedure325 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedure328 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NL_in_procedure332 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_procedure334 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_procedure336 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NL_in_procedure338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_mainproc364 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NL_in_mainproc366 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_mainproc368 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_mainproc370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idlist393 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_idlist399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_idlist402 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_statement_in_block419 = new BitSet(new long[]{0x0000121018C86202L});
    public static final BitSet FOLLOW_NL_in_block423 = new BitSet(new long[]{0x0000121018C86202L});
    public static final BitSet FOLLOW_assignment_in_statement450 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_action_in_statement454 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_procedure_call_in_statement458 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_control_in_statement462 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NL_in_statement465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment478 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_assignment483 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_assignment_target_in_assignment489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_assignment_target508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_target512 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_assignment_target517 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_assignment_target_in_assignment_target520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_procedure_call532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_procedure_call534 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_procedure_call537 = new BitSet(new long[]{0x0023000040400000L});
    public static final BitSet FOLLOW_num_expr_list_in_procedure_call539 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedure_call542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function572 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_function574 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_function576 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_idlist_in_function578 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function581 = new BitSet(new long[]{0x0000123018C86200L});
    public static final BitSet FOLLOW_block_in_function583 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RETURN_in_function586 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_function588 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NL_in_function590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_pen_in_action623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_move_in_action627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_turn_in_action631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_action_pen647 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PULL_in_action_pen653 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PEN_in_action_pen656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_action_move679 = new BitSet(new long[]{0x0000004002200180L});
    public static final BitSet FOLLOW_FWD_in_action_move684 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BWD_in_action_move690 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFT_in_action_move696 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_in_action_move702 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_action_move706 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_action_move708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_action_turn732 = new BitSet(new long[]{0x0000004002000100L});
    public static final BitSet FOLLOW_LEFT_in_action_turn737 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_in_action_turn743 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_action_turn747 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_action_turn749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_if_in_control776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_loop_in_control780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_fromto_in_control784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_control_if795 = new BitSet(new long[]{0x1021000060400000L});
    public static final BitSet FOLLOW_logic_expr_in_control_if799 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_THEN_in_control_if801 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_control_if805 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_ELSEIF_in_control_if808 = new BitSet(new long[]{0x1021000060400000L});
    public static final BitSet FOLLOW_logic_expr_in_control_if812 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_THEN_in_control_if814 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_control_if818 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_ELSE_in_control_if823 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_control_if827 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDIF_in_control_if831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_control_loop867 = new BitSet(new long[]{0x00001E1018C86200L});
    public static final BitSet FOLLOW_condition_in_control_loop873 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_control_loop875 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LOOP_in_control_loop877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_control_loop896 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LOOP_in_control_loop898 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_condition_in_control_loop900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_condition928 = new BitSet(new long[]{0x1021000060400000L});
    public static final BitSet FOLLOW_UNTIL_in_condition933 = new BitSet(new long[]{0x1021000060400000L});
    public static final BitSet FOLLOW_logic_expr_in_condition940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_control_fromto952 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_control_fromto954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FROM_in_control_fromto958 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_control_fromto962 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_TO_in_control_fromto964 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_control_fromto968 = new BitSet(new long[]{0x0000121018C86200L});
    public static final BitSet FOLLOW_block_in_control_fromto970 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LOOP_in_control_fromto972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1010 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_51_in_num_expr1014 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_53_in_num_expr1022 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_term_in_num_expr1029 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_factor_in_term1042 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_50_in_term1046 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_54_in_term1054 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_factor_in_term1061 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor1080 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_factor1083 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_factor1091 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_reference_in_factor1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reference1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_reference1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call1135 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_function_call1137 = new BitSet(new long[]{0x0023000040400000L});
    public static final BitSet FOLLOW_num_expr_list_in_function_call1139 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_call1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_num_expr_list1167 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_num_expr_list1170 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_num_expr_list1173 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relation_in_logic_expr1187 = new BitSet(new long[]{0x0000400100000012L});
    public static final BitSet FOLLOW_AND_in_logic_expr1192 = new BitSet(new long[]{0x1021000040400000L});
    public static final BitSet FOLLOW_OR_in_logic_expr1200 = new BitSet(new long[]{0x1021000040400000L});
    public static final BitSet FOLLOW_XOR_in_logic_expr1208 = new BitSet(new long[]{0x1021000040400000L});
    public static final BitSet FOLLOW_relation_in_logic_expr1216 = new BitSet(new long[]{0x0000400100000012L});
    public static final BitSet FOLLOW_NOT_in_logic_expr1224 = new BitSet(new long[]{0x1021000040400000L});
    public static final BitSet FOLLOW_relation_in_logic_expr1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_relation1241 = new BitSet(new long[]{0x0F80800000000000L});
    public static final BitSet FOLLOW_55_in_relation1244 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_56_in_relation1250 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_57_in_relation1256 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_47_in_relation1262 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_59_in_relation1268 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_58_in_relation1274 = new BitSet(new long[]{0x0021000040400000L});
    public static final BitSet FOLLOW_num_expr_in_relation1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_relation1287 = new BitSet(new long[]{0x1021000060400000L});
    public static final BitSet FOLLOW_logic_expr_in_relation1290 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_relation1292 = new BitSet(new long[]{0x0000000000000002L});

}