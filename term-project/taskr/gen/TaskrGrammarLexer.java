// Generated from /home/ryan/Documents/LanguageStructures/term-project/taskr/TaskrGrammar.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LINE_COMMENT=17, 
		NEWLINE=18, DIGIT=19, WORD=20, PUNCTUATION=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LINE_COMMENT", 
			"NEWLINE", "DIGIT", "WORD", "PUNCTUATION", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22c\n\22\f\22\16\22f\13\22\3\22\5\22i\n\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\6\25t\n\25\r\25\16\25u\3\26\3\26\3\27\6\27{\n\27"+
		"\r\27\16\27|\3\27\3\27\3d\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7"+
		"\4\2\f\f\17\17\3\2\62;\4\2C\\c|\7\2#$))..\60\60AA\3\2\"\"\2\u0083\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5"+
		"\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17<\3\2"+
		"\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27H\3\2\2\2\31Q\3\2\2\2\33V\3"+
		"\2\2\2\35X\3\2\2\2\37Z\3\2\2\2!\\\3\2\2\2#^\3\2\2\2%n\3\2\2\2\'p\3\2\2"+
		"\2)s\3\2\2\2+w\3\2\2\2-z\3\2\2\2/\60\7=\2\2\60\4\3\2\2\2\61\62\7v\2\2"+
		"\62\6\3\2\2\2\63\64\7<\2\2\64\b\3\2\2\2\65\66\7g\2\2\66\n\3\2\2\2\678"+
		"\7p\2\289\7<\2\29\f\3\2\2\2:;\7]\2\2;\16\3\2\2\2<=\7_\2\2=\20\3\2\2\2"+
		">?\7*\2\2?\22\3\2\2\2@A\7+\2\2A\24\3\2\2\2BC\7n\2\2CD\7c\2\2DE\7v\2\2"+
		"EF\7g\2\2FG\7t\2\2G\26\3\2\2\2HI\7v\2\2IJ\7q\2\2JK\7o\2\2KL\7q\2\2LM\7"+
		"t\2\2MN\7t\2\2NO\7q\2\2OP\7y\2\2P\30\3\2\2\2QR\7f\2\2RS\7q\2\2ST\7p\2"+
		"\2TU\7g\2\2U\32\3\2\2\2VW\7f\2\2W\34\3\2\2\2XY\7y\2\2Y\36\3\2\2\2Z[\7"+
		"o\2\2[ \3\2\2\2\\]\7{\2\2]\"\3\2\2\2^_\7\61\2\2_`\7\61\2\2`d\3\2\2\2a"+
		"c\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2\2lm\b\22\2"+
		"\2m$\3\2\2\2no\t\2\2\2o&\3\2\2\2pq\t\3\2\2q(\3\2\2\2rt\t\4\2\2sr\3\2\2"+
		"\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v*\3\2\2\2wx\t\5\2\2x,\3\2\2\2y{\t\6\2"+
		"\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\27\2\2\177"+
		".\3\2\2\2\7\2dhu|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}