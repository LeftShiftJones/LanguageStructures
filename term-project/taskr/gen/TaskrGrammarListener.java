// Generated from /home/CS/users/dfletche/.linux/language-structures/LanguageStructures/term-project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskrGrammarParser}.
 */
public interface TaskrGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TaskrGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TaskrGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(TaskrGrammarParser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(TaskrGrammarParser.EntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(TaskrGrammarParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(TaskrGrammarParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(TaskrGrammarParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(TaskrGrammarParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#subtask}.
	 * @param ctx the parse tree
	 */
	void enterSubtask(TaskrGrammarParser.SubtaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#subtask}.
	 * @param ctx the parse tree
	 */
	void exitSubtask(TaskrGrammarParser.SubtaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(TaskrGrammarParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(TaskrGrammarParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(TaskrGrammarParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(TaskrGrammarParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(TaskrGrammarParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(TaskrGrammarParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(TaskrGrammarParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(TaskrGrammarParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(TaskrGrammarParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(TaskrGrammarParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(TaskrGrammarParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(TaskrGrammarParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(TaskrGrammarParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(TaskrGrammarParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(TaskrGrammarParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(TaskrGrammarParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(TaskrGrammarParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(TaskrGrammarParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(TaskrGrammarParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(TaskrGrammarParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskrGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(TaskrGrammarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskrGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(TaskrGrammarParser.DescriptionContext ctx);
}