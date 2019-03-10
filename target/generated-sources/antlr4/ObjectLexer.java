// Generated from Object.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TEXT=9, 
		STRING=10, NUMBER=11, WHITESPACE=12, COMMA_SEPARATOR=13, NEWLINE=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "DIGIT", 
		"TEXT", "STRING", "NUMBER", "WHITESPACE", "COMMA_SEPARATOR", "NEWLINE", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TypeId'", "'='", "'Name'", "'Description'", "'Attributes'", "'Flags'", 
		"'{'", "'}'", null, null, null, "' '", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TEXT", "STRING", 
		"NUMBER", "WHITESPACE", "COMMA_SEPARATOR", "NEWLINE", "COMMENT"
	};
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


	public ObjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Object.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\nT\n\n\3\n\3\n\3\13\3"+
		"\13\7\13Z\n\13\f\13\16\13]\13\13\3\13\3\13\3\f\6\fb\n\f\r\f\16\fc\3\r"+
		"\6\rg\n\r\r\r\16\rh\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20v\n\20\3\20\3\20\3\21\3\21\7\21|\n\21\f\21\16\21\177\13\21\3"+
		"\21\3\21\3[\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31"+
		"\r\33\16\35\17\37\20!\21\3\2\4\4\2C\\c|\4\2\f\f\17\17\2\u0086\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2\2\2\7,\3\2"+
		"\2\2\t\61\3\2\2\2\13=\3\2\2\2\rH\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23S\3"+
		"\2\2\2\25W\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2\33j\3\2\2\2\35n\3\2\2\2\37"+
		"u\3\2\2\2!y\3\2\2\2#$\7V\2\2$%\7{\2\2%&\7r\2\2&\'\7g\2\2\'(\7K\2\2()\7"+
		"f\2\2)\4\3\2\2\2*+\7?\2\2+\6\3\2\2\2,-\7P\2\2-.\7c\2\2./\7o\2\2/\60\7"+
		"g\2\2\60\b\3\2\2\2\61\62\7F\2\2\62\63\7g\2\2\63\64\7u\2\2\64\65\7e\2\2"+
		"\65\66\7t\2\2\66\67\7k\2\2\678\7r\2\289\7v\2\29:\7k\2\2:;\7q\2\2;<\7p"+
		"\2\2<\n\3\2\2\2=>\7C\2\2>?\7v\2\2?@\7v\2\2@A\7t\2\2AB\7k\2\2BC\7d\2\2"+
		"CD\7w\2\2DE\7v\2\2EF\7g\2\2FG\7u\2\2G\f\3\2\2\2HI\7H\2\2IJ\7n\2\2JK\7"+
		"c\2\2KL\7i\2\2LM\7u\2\2M\16\3\2\2\2NO\7}\2\2O\20\3\2\2\2PQ\7\177\2\2Q"+
		"\22\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\4\62;\2V\24\3\2\2"+
		"\2W[\7$\2\2XZ\13\2\2\2YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3\2"+
		"\2\2][\3\2\2\2^_\7$\2\2_\26\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2d\30\3\2\2\2eg\5\23\n\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\32\3\2\2\2jk\7\"\2\2kl\3\2\2\2lm\b\16\2\2m\34\3\2\2\2no\7"+
		".\2\2op\3\2\2\2pq\b\17\2\2q\36\3\2\2\2rv\t\3\2\2st\7\17\2\2tv\7\f\2\2"+
		"ur\3\2\2\2us\3\2\2\2vw\3\2\2\2wx\b\20\2\2x \3\2\2\2y}\7%\2\2z|\n\3\2\2"+
		"{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\b\21\2\2\u0081\"\3\2\2\2\t\2S[chu}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}