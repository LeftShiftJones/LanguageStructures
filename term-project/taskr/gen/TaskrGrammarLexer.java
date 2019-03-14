// Generated from /home/CS/users/dfletche/.linux/language-structures/LanguageStructures/Term Project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskrGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TASKTOKEN=8, EVENTTOKEN=9, 
		NOTETOKEN=10, NEWLINE=11, DIGIT=12, LETTER=13, PUNCTUATION=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TASKTOKEN", 
			"EVENTTOKEN", "NOTETOKEN", "NEWLINE", "DIGIT", "LETTER", "PUNCTUATION", 
			"WS"
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


	public TaskrGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TaskrGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\6\20M\n\20\r\20\16\20N\3\20\3\20\2\2\21\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2"+
		"\7\3\2\f\f\3\2\62;\4\2C\\c|\7\2#$))..\60\60AA\4\2\13\13\"\"\2R\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3"+
		"\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r/\3\2\2\2\178\3\2\2\2\21=\3\2\2\2\23?"+
		"\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35I\3\2\2\2\37"+
		"L\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7<\2\2$\6\3\2\2\2%&\7*\2\2&\b\3\2\2"+
		"\2\'(\7+\2\2(\n\3\2\2\2)*\7n\2\2*+\7c\2\2+,\7v\2\2,-\7g\2\2-.\7t\2\2."+
		"\f\3\2\2\2/\60\7v\2\2\60\61\7q\2\2\61\62\7o\2\2\62\63\7q\2\2\63\64\7t"+
		"\2\2\64\65\7t\2\2\65\66\7q\2\2\66\67\7y\2\2\67\16\3\2\2\289\7f\2\29:\7"+
		"q\2\2:;\7p\2\2;<\7g\2\2<\20\3\2\2\2=>\7v\2\2>\22\3\2\2\2?@\7g\2\2@\24"+
		"\3\2\2\2AB\7p\2\2B\26\3\2\2\2CD\t\2\2\2D\30\3\2\2\2EF\t\3\2\2F\32\3\2"+
		"\2\2GH\t\4\2\2H\34\3\2\2\2IJ\t\5\2\2J\36\3\2\2\2KM\t\6\2\2LK\3\2\2\2M"+
		"N\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\20\2\2Q \3\2\2\2\4\2N\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}