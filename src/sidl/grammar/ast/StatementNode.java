package sidl.grammar.ast;

import org.antlr.runtime.Token;

/**
 *
 * @author Enrico Zamagni
 */
public abstract class StatementNode extends SiDLNode {
    
    public StatementNode(Token t) {
        super(t);
    }
    
    public StatementNode(int ttype) {
		super(ttype);
	}
}
