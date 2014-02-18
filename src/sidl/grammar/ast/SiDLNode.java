package sidl.grammar.ast;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import sidl.interpreter.visitors.SiDLVisitor;

/**
 *
 * @author Enrico Zamagni
 */
public abstract class SiDLNode extends CommonTree {
    
    public SiDLNode(Token t) {
        super(t);
    }
    
    public SiDLNode(int ttype) {
        super(new CommonToken(ttype));
    }
    
    public int getTokenLine() {
	     return getToken().getLine();
    }
    
    public int getTokenCharPositionInLine() {
	    return getToken().getCharPositionInLine();
    }
    
    public abstract void accept(SiDLVisitor visitor);
}
