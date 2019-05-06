// Generated from /home/ryan/Documents/LanguageStructures/term-project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskrGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LINE_COMMENT=17, 
		NEWLINE=18, DIGIT=19, WORD=20, PUNCTUATION=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_entries = 1, RULE_entry = 2, RULE_task = 3, RULE_event = 4, 
		RULE_note = 5, RULE_date = 6, RULE_rep_date = 7, RULE_repeat = 8, RULE_modifier = 9, 
		RULE_status = 10, RULE_interval = 11, RULE_day = 12, RULE_month = 13, 
		RULE_year = 14, RULE_description = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "entries", "entry", "task", "event", "note", "date", "rep_date", 
			"repeat", "modifier", "status", "interval", "day", "month", "year", "description"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'t'", "':'", "'e'", "'n:'", "'['", "']'", "'('", "')'", 
			"'later'", "'tomorrow'", "'done'", "'d'", "'w'", "'m'", "'y'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LINE_COMMENT", "NEWLINE", "DIGIT", "WORD", 
			"PUNCTUATION", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TaskrGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaskrGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TaskrGrammarParser.EOF, 0); }
		public List<EntriesContext> entries() {
			return getRuleContexts(EntriesContext.class);
		}
		public EntriesContext entries(int i) {
			return getRuleContext(EntriesContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(32);
				entries();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntriesContext extends ParserRuleContext {
		public EntryContext entry() {
			return getRuleContext(EntryContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TaskrGrammarParser.NEWLINE, 0); }
		public EntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntriesContext entries() throws RecognitionException {
		EntriesContext _localctx = new EntriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			entry();
			setState(41);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(43);
				task();
				setState(44);
				description();
				setState(45);
				match(T__0);
				setState(46);
				date();
				}
				break;
			case T__3:
				{
				setState(48);
				event();
				setState(49);
				description();
				setState(50);
				match(T__0);
				setState(51);
				date();
				}
				break;
			case T__4:
				{
				setState(53);
				note();
				setState(54);
				description();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaskContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_task);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__1);
			setState(59);
			modifier();
			setState(60);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
			setState(63);
			modifier();
			setState(64);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			day();
			setState(69);
			month();
			setState(70);
			year();
			setState(71);
			repeat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rep_dateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public Rep_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterRep_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitRep_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitRep_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rep_dateContext rep_date() throws RecognitionException {
		Rep_dateContext _localctx = new Rep_dateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rep_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			day();
			setState(74);
			month();
			setState(75);
			year();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatContext extends ParserRuleContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Rep_dateContext rep_date() {
			return getRuleContext(Rep_dateContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeat);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__5);
				setState(78);
				interval();
				setState(79);
				rep_date();
				setState(80);
				match(T__6);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__7);
				setState(86);
				status();
				setState(87);
				match(T__8);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatusContext extends ParserRuleContext {
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TaskrGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TaskrGrammarParser.DIGIT, i);
		}
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DIGIT);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(97);
				match(DIGIT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TaskrGrammarParser.WORD, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TaskrGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TaskrGrammarParser.DIGIT, i);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(DIGIT);
			setState(103);
			match(DIGIT);
			setState(104);
			match(DIGIT);
			setState(105);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(TaskrGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TaskrGrammarParser.WORD, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(TaskrGrammarParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(TaskrGrammarParser.PUNCTUATION, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TaskrGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TaskrGrammarParser.DIGIT, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskrGrammarListener ) ((TaskrGrammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskrGrammarVisitor ) return ((TaskrGrammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << WORD) | (1L << PUNCTUATION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << WORD) | (1L << PUNCTUATION))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n\2\f"+
		"\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nV\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16e\n\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\6\21o\n\21\r\21\16\21p\3\21\2\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\f\16\3\2\17\22\3\2"+
		"\25\27\2i\2%\3\2\2\2\4*\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n@\3\2\2\2\fD\3"+
		"\2\2\2\16F\3\2\2\2\20K\3\2\2\2\22U\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30"+
		"`\3\2\2\2\32b\3\2\2\2\34f\3\2\2\2\36h\3\2\2\2 n\3\2\2\2\"$\5\4\3\2#\""+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3"+
		")\3\3\2\2\2*+\5\6\4\2+,\7\24\2\2,\5\3\2\2\2-.\5\b\5\2./\5 \21\2/\60\7"+
		"\3\2\2\60\61\5\16\b\2\61;\3\2\2\2\62\63\5\n\6\2\63\64\5 \21\2\64\65\7"+
		"\3\2\2\65\66\5\16\b\2\66;\3\2\2\2\678\5\f\7\289\5 \21\29;\3\2\2\2:-\3"+
		"\2\2\2:\62\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\7\4\2\2=>\5\24\13\2>?\7\5"+
		"\2\2?\t\3\2\2\2@A\7\6\2\2AB\5\24\13\2BC\7\5\2\2C\13\3\2\2\2DE\7\7\2\2"+
		"E\r\3\2\2\2FG\5\32\16\2GH\5\34\17\2HI\5\36\20\2IJ\5\22\n\2J\17\3\2\2\2"+
		"KL\5\32\16\2LM\5\34\17\2MN\5\36\20\2N\21\3\2\2\2OP\7\b\2\2PQ\5\30\r\2"+
		"QR\5\20\t\2RS\7\t\2\2SV\3\2\2\2TV\3\2\2\2UO\3\2\2\2UT\3\2\2\2V\23\3\2"+
		"\2\2WX\7\n\2\2XY\5\26\f\2YZ\7\13\2\2Z]\3\2\2\2[]\3\2\2\2\\W\3\2\2\2\\"+
		"[\3\2\2\2]\25\3\2\2\2^_\t\2\2\2_\27\3\2\2\2`a\t\3\2\2a\31\3\2\2\2bd\7"+
		"\25\2\2ce\7\25\2\2dc\3\2\2\2de\3\2\2\2e\33\3\2\2\2fg\7\26\2\2g\35\3\2"+
		"\2\2hi\7\25\2\2ij\7\25\2\2jk\7\25\2\2kl\7\25\2\2l\37\3\2\2\2mo\t\4\2\2"+
		"nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q!\3\2\2\2\b%:U\\dp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}