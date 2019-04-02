// Generated from /home/CS/users/dfletche/.linux/language-structures/LanguageStructures/term-project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
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
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntries(TaskrGrammarParser.EntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(TaskrGrammarParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(TaskrGrammarParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#subtask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtask(TaskrGrammarParser.SubtaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(TaskrGrammarParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(TaskrGrammarParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(TaskrGrammarParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(TaskrGrammarParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(TaskrGrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(TaskrGrammarParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(TaskrGrammarParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(TaskrGrammarParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(TaskrGrammarParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(TaskrGrammarParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskrGrammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(TaskrGrammarParser.DescriptionContext ctx);
}