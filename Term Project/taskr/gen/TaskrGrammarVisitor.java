// Generated from /home/CS/users/dfletche/.linux/language-structures/LanguageStructures/Term Project/tasker/TaskrGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskrGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskrGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TaskrGrammarParser.ProgContext ctx);
}