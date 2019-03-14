// Generated from /home/CS/users/dfletche/.linux/language-structures/LanguageStructures/Term Project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TASKTOKEN=8, EVENTTOKEN=9, 
		NOTETOKEN=10, NEWLINE=11, DIGIT=12, LETTER=13, PUNCTUATION=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_entries = 1, RULE_entry = 2, RULE_task = 3, RULE_event = 4, 
		RULE_note = 5, RULE_date = 6, RULE_modifier = 7, RULE_status = 8, RULE_description = 9, 
		RULE_day = 10, RULE_month = 11, RULE_year = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "entries", "entry", "task", "event", "note", "date", "modifier", 
			"status", "description", "day", "month", "year"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'('", "')'", "'later'", "'tomorrow'", "'done'", 
			"'t'", "'e'", "'n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TASKTOKEN", "EVENTTOKEN", 
			"NOTETOKEN", "NEWLINE", "DIGIT", "LETTER", "PUNCTUATION", "WS"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOTETOKEN))) != 0)) {
				{
				{
				setState(26);
				entries();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
			setState(34);
			entry();
			setState(35);
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
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(37);
					task();
					}
					break;
				case 2:
					{
					setState(38);
					event();
					}
					break;
				}
				setState(41);
				description();
				setState(42);
				match(T__0);
				setState(43);
				date();
				}
				break;
			case NOTETOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				note();
				setState(46);
				description();
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
			setState(50);
			modifier();
			setState(51);
			match(T__1);
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
			setState(53);
			modifier();
			setState(54);
			match(T__1);
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
		public TerminalNode NOTETOKEN() { return getToken(TaskrGrammarParser.NOTETOKEN, 0); }
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
			setState(56);
			match(NOTETOKEN);
			setState(57);
			match(T__1);
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
			setState(59);
			day();
			setState(60);
			month();
			setState(61);
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
		enterRule(_localctx, 14, RULE_modifier);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__2);
				setState(64);
				status();
				setState(65);
				match(T__3);
				}
				break;
			case T__1:
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
		enterRule(_localctx, 16, RULE_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(TaskrGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(TaskrGrammarParser.LETTER, i);
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
		enterRule(_localctx, 18, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << PUNCTUATION))) != 0) );
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
		public TerminalNode DIGIT() { return getToken(TaskrGrammarParser.DIGIT, 0); }
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
		enterRule(_localctx, 20, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DIGIT);
			1,2
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
		public List<TerminalNode> LETTER() { return getTokens(TaskrGrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(TaskrGrammarParser.LETTER, i);
		}
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
		enterRule(_localctx, 22, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(LETTER);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
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
		public TerminalNode DIGIT() { return getToken(TaskrGrammarParser.DIGIT, 0); }
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
		enterRule(_localctx, 24, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DIGIT);
			4
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tG\n"+
		"\t\3\n\3\n\3\13\6\13L\n\13\r\13\16\13M\3\f\3\f\3\f\3\r\6\rT\n\r\r\r\16"+
		"\rU\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3"+
		"\2\7\t\3\2\16\20\2S\2\37\3\2\2\2\4$\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2"+
		"\n\67\3\2\2\2\f:\3\2\2\2\16=\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24K\3\2\2"+
		"\2\26O\3\2\2\2\30S\3\2\2\2\32W\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3"+
		"#\3\3\2\2\2$%\5\6\4\2%&\7\r\2\2&\5\3\2\2\2\'*\5\b\5\2(*\5\n\6\2)\'\3\2"+
		"\2\2)(\3\2\2\2*+\3\2\2\2+,\5\24\13\2,-\7\3\2\2-.\5\16\b\2.\63\3\2\2\2"+
		"/\60\5\f\7\2\60\61\5\24\13\2\61\63\3\2\2\2\62)\3\2\2\2\62/\3\2\2\2\63"+
		"\7\3\2\2\2\64\65\5\20\t\2\65\66\7\4\2\2\66\t\3\2\2\2\678\5\20\t\289\7"+
		"\4\2\29\13\3\2\2\2:;\7\f\2\2;<\7\4\2\2<\r\3\2\2\2=>\5\26\f\2>?\5\30\r"+
		"\2?@\5\32\16\2@\17\3\2\2\2AB\7\5\2\2BC\5\22\n\2CD\7\6\2\2DG\3\2\2\2EG"+
		"\3\2\2\2FA\3\2\2\2FE\3\2\2\2G\21\3\2\2\2HI\t\2\2\2I\23\3\2\2\2JL\t\3\2"+
		"\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\25\3\2\2\2OP\7\16\2\2PQ\b"+
		"\f\1\2Q\27\3\2\2\2RT\7\17\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\31\3\2\2\2WX\7\16\2\2XY\b\16\1\2Y\33\3\2\2\2\b\37)\62FMU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}