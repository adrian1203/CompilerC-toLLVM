// Generated from C:/Users/Adrian/Desktop/Kompilatory/Projekt/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Integer=1, Float=2, String=3, CharAss=4, WhiteSpace=5, SpecialChars=6, 
		MathOperator=7, BooleanOperator=8, LogicalOperator=9, Boolean=10, If=11, 
		Elsif=12, Else=13, Then=14, IntegerType=15, FloatType=16, StringType=17, 
		BooleanType=18, CharType=19, DoubleType=20, VarName=21, EqualMark=22, 
		Dot=23, QuoteMark=24, Semicolon=25, OpenBracket=26, CloseBracket=27, SquareOpenBracket=28, 
		SquareCloseBracket=29, Apostrophe=30, CurlyOpenBracket=31, CurlyCloseBracket=32, 
		Text=33, Whitespace=34, Newline=35, BlockComment=36, LineComment=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Integer", "Float", "String", "CharAss", "WhiteSpace", "SpecialChars", 
			"Digit", "Char", "CharSequence", "MathOperator", "BooleanOperator", "LogicalOperator", 
			"Boolean", "If", "Elsif", "Else", "Then", "IntegerType", "FloatType", 
			"StringType", "BooleanType", "CharType", "DoubleType", "VarName", "EqualMark", 
			"Dot", "QuoteMark", "Semicolon", "OpenBracket", "CloseBracket", "SquareOpenBracket", 
			"SquareCloseBracket", "Apostrophe", "CurlyOpenBracket", "CurlyCloseBracket", 
			"Text", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'if'", 
			"'elsif'", "'else'", "'then'", "'int'", "'float'", "'string'", null, 
			"'char'", "'double'", null, "'='", "'.'", "'\"'", "';'", "'('", "')'", 
			"'['", "']'", "'''", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Integer", "Float", "String", "CharAss", "WhiteSpace", "SpecialChars", 
			"MathOperator", "BooleanOperator", "LogicalOperator", "Boolean", "If", 
			"Elsif", "Else", "Then", "IntegerType", "FloatType", "StringType", "BooleanType", 
			"CharType", "DoubleType", "VarName", "EqualMark", "Dot", "QuoteMark", 
			"Semicolon", "OpenBracket", "CloseBracket", "SquareOpenBracket", "SquareCloseBracket", 
			"Apostrophe", "CurlyOpenBracket", "CurlyCloseBracket", "Text", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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


	public CSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSharp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2U\n\2\r"+
		"\2\16\2V\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5d\n\5\3\5\3\5"+
		"\3\6\6\6i\n\6\r\6\16\6j\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nv\n\n\r"+
		"\n\16\nw\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0086\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c9\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\7%\u00f6"+
		"\n%\f%\16%\u00f9\13%\3&\6&\u00fc\n&\r&\16&\u00fd\3&\3&\3\'\3\'\5\'\u0104"+
		"\n\'\3\'\5\'\u0107\n\'\3\'\3\'\3(\3(\3(\3(\7(\u010f\n(\f(\16(\u0112\13"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u011d\n)\f)\16)\u0120\13)\3)\3)\3\u0110"+
		"\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\t\27\n\31\13\33\f\35\r"+
		"\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34"+
		"=\35?\36A\37C E!G\"I#K$M%O&Q\'\3\2\t\5\2\13\f\17\17\"\"\b\2##%(..\61\61"+
		"AB`a\3\2\62;\3\2c|\5\2,-//\61\61\4\2\13\13\"\"\4\2\f\f\17\17\2\u0133\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\3T\3\2\2\2\5X\3\2\2\2\7\\\3\2\2\2\t`\3\2\2\2\13h\3\2"+
		"\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23u\3\2\2\2\25y\3\2\2\2\27\u0085"+
		"\3\2\2\2\31\u008c\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009c\3"+
		"\2\2\2!\u00a2\3\2\2\2#\u00a7\3\2\2\2%\u00ac\3\2\2\2\'\u00b0\3\2\2\2)\u00b6"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cf\3\2\2\2\61\u00d6\3\2\2\2"+
		"\63\u00de\3\2\2\2\65\u00e0\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00e8\3\2\2\2?\u00ea\3\2\2\2A\u00ec\3\2\2\2C\u00ee\3\2\2\2E"+
		"\u00f0\3\2\2\2G\u00f2\3\2\2\2I\u00f7\3\2\2\2K\u00fb\3\2\2\2M\u0106\3\2"+
		"\2\2O\u010a\3\2\2\2Q\u0118\3\2\2\2SU\5\17\b\2TS\3\2\2\2UV\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\4\3\2\2\2XY\5\3\2\2YZ\5\65\33\2Z[\5\3\2\2[\6\3\2\2\2"+
		"\\]\5\67\34\2]^\5\23\n\2^_\5\67\34\2_\b\3\2\2\2`c\5C\"\2ad\5\21\t\2bd"+
		"\5\17\b\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ef\5C\"\2f\n\3\2\2\2gi\t\2\2\2"+
		"hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\6\2\2m\f\3\2\2"+
		"\2no\t\3\2\2o\16\3\2\2\2pq\t\4\2\2q\20\3\2\2\2rs\t\5\2\2s\22\3\2\2\2t"+
		"v\5\21\t\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\24\3\2\2\2yz\t\6\2"+
		"\2z\26\3\2\2\2{\u0086\7>\2\2|}\7>\2\2}\u0086\7?\2\2~\u0086\7@\2\2\177"+
		"\u0080\7@\2\2\u0080\u0086\7?\2\2\u0081\u0082\7?\2\2\u0082\u0086\7?\2\2"+
		"\u0083\u0084\7#\2\2\u0084\u0086\7?\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085"+
		"~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\30\3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008d\7f\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008d\7t\2\2\u008c\u0087\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\32\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7w\2\2\u0091\u0098\7g\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0098\7g\2\2\u0097\u008e\3\2\2"+
		"\2\u0097\u0092\3\2\2\2\u0098\34\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b"+
		"\7h\2\2\u009b\36\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7u\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1 \3\2\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\"\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af&\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5(\3\2\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2\u00bc*\3\2\2\2\u00bd\u00be\7d\2"+
		"\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c9\7n\2\2\u00c1\u00c2"+
		"\7d\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c9\7p\2\2\u00c8\u00bd\3\2\2"+
		"\2\u00c8\u00c1\3\2\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7"+
		"j\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce.\3\2\2\2\u00cf\u00d0"+
		"\7f\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7d\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\60\3\2\2\2\u00d6\u00db\5\21\t\2"+
		"\u00d7\u00da\5\21\t\2\u00d8\u00da\5\17\b\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7?\2\2\u00df\64\3\2\2\2\u00e0"+
		"\u00e1\7\60\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7$\2\2\u00e38\3\2\2\2\u00e4"+
		"\u00e5\7=\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7<\3\2\2\2\u00e8\u00e9"+
		"\7+\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7"+
		"_\2\2\u00edB\3\2\2\2\u00ee\u00ef\7)\2\2\u00efD\3\2\2\2\u00f0\u00f1\7}"+
		"\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3H\3\2\2\2\u00f4\u00f6\5"+
		"\21\t\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8J\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\t\7\2\2"+
		"\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b&\2\2\u0100L\3\2\2\2\u0101\u0103"+
		"\7\17\2\2\u0102\u0104\7\f\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0107\7\f\2\2\u0106\u0101\3\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\'\2\2\u0109N\3\2\2\2\u010a"+
		"\u010b\7\61\2\2\u010b\u010c\7,\2\2\u010c\u0110\3\2\2\2\u010d\u010f\13"+
		"\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7,"+
		"\2\2\u0114\u0115\7\61\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b(\2\2\u0117"+
		"P\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a\7\61\2\2\u011a\u011e\3\2\2"+
		"\2\u011b\u011d\n\b\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\b)\2\2\u0122R\3\2\2\2\23\2Vcjw\u0085\u008c\u0097\u00c8\u00d9\u00db"+
		"\u00f7\u00fd\u0103\u0106\u0110\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}