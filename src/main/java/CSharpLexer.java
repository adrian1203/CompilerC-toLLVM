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
		Elsif=12, Else=13, Then=14, For=15, While=16, Do=17, IntegerType=18, FloatType=19, 
		StringType=20, BooleanType=21, CharType=22, DoubleType=23, VarName=24, 
		EqualMark=25, Dot=26, QuoteMark=27, Semicolon=28, OpenBracket=29, CloseBracket=30, 
		SquareOpenBracket=31, SquareCloseBracket=32, Apostrophe=33, CurlyOpenBracket=34, 
		CurlyCloseBracket=35, Incrementation=36, Decrementation=37, Text=38, Whitespace=39, 
		Newline=40, BlockComment=41, LineComment=42;
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
			"Boolean", "If", "Elsif", "Else", "Then", "For", "While", "Do", "IntegerType", 
			"FloatType", "StringType", "BooleanType", "CharType", "DoubleType", "VarName", 
			"EqualMark", "Dot", "QuoteMark", "Semicolon", "OpenBracket", "CloseBracket", 
			"SquareOpenBracket", "SquareCloseBracket", "Apostrophe", "CurlyOpenBracket", 
			"CurlyCloseBracket", "Incrementation", "Decrementation", "Text", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'if'", 
			"'elsif'", "'else'", "'then'", "'for'", "'while'", "'do'", "'int'", "'float'", 
			"'string'", null, "'char'", "'double'", null, "'='", "'.'", "'\"'", "';'", 
			"'('", "')'", "'['", "']'", "'''", "'{'", "'}'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Integer", "Float", "String", "CharAss", "WhiteSpace", "SpecialChars", 
			"MathOperator", "BooleanOperator", "LogicalOperator", "Boolean", "If", 
			"Elsif", "Else", "Then", "For", "While", "Do", "IntegerType", "FloatType", 
			"StringType", "BooleanType", "CharType", "DoubleType", "VarName", "EqualMark", 
			"Dot", "QuoteMark", "Semicolon", "OpenBracket", "CloseBracket", "SquareOpenBracket", 
			"SquareCloseBracket", "Apostrophe", "CurlyOpenBracket", "CurlyCloseBracket", 
			"Incrementation", "Decrementation", "Text", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2_\n\2\r\2\16\2`\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\6\6\6s\n\6\r\6\16\6t\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\6\n\u0080\n\n\r\n\16\n\u0081\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0097"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00e0\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00f1\n\34\f\34\16\34\u00f4\13"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\7*\u0113\n*\f*\16*\u0116\13*\3+\6"+
		"+\u0119\n+\r+\16+\u011a\3+\3+\3,\3,\5,\u0121\n,\3,\5,\u0124\n,\3,\3,\3"+
		"-\3-\3-\3-\7-\u012c\n-\f-\16-\u012f\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7."+
		"\u013a\n.\f.\16.\u013d\13.\3.\3.\3\u012d\2/\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\2\21\2\23\2\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24"+
		"-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'"+
		"S(U)W*Y+[,\3\2\t\5\2\13\f\17\17\"\"\b\2##%(..\61\61AB`a\3\2\62;\3\2c|"+
		"\5\2,-//\61\61\4\2\13\13\"\"\4\2\f\f\17\17\2\u0150\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3^\3\2\2\2\5b\3\2"+
		"\2\2\7f\3\2\2\2\tj\3\2\2\2\13r\3\2\2\2\rx\3\2\2\2\17z\3\2\2\2\21|\3\2"+
		"\2\2\23\177\3\2\2\2\25\u0083\3\2\2\2\27\u008f\3\2\2\2\31\u0096\3\2\2\2"+
		"\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a6\3\2\2\2!\u00ac\3\2\2\2#\u00b1"+
		"\3\2\2\2%\u00b6\3\2\2\2\'\u00ba\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2"+
		"-\u00c7\3\2\2\2/\u00cd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e6"+
		"\3\2\2\2\67\u00ed\3\2\2\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2"+
		"?\u00fb\3\2\2\2A\u00fd\3\2\2\2C\u00ff\3\2\2\2E\u0101\3\2\2\2G\u0103\3"+
		"\2\2\2I\u0105\3\2\2\2K\u0107\3\2\2\2M\u0109\3\2\2\2O\u010b\3\2\2\2Q\u010e"+
		"\3\2\2\2S\u0114\3\2\2\2U\u0118\3\2\2\2W\u0123\3\2\2\2Y\u0127\3\2\2\2["+
		"\u0135\3\2\2\2]_\5\17\b\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\4\3"+
		"\2\2\2bc\5\3\2\2cd\5;\36\2de\5\3\2\2e\6\3\2\2\2fg\5=\37\2gh\5\23\n\2h"+
		"i\5=\37\2i\b\3\2\2\2jm\5I%\2kn\5\21\t\2ln\5\17\b\2mk\3\2\2\2ml\3\2\2\2"+
		"no\3\2\2\2op\5I%\2p\n\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2uv\3\2\2\2vw\b\6\2\2w\f\3\2\2\2xy\t\3\2\2y\16\3\2\2\2z{\t\4"+
		"\2\2{\20\3\2\2\2|}\t\5\2\2}\22\3\2\2\2~\u0080\5\21\t\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\24\3\2\2\2"+
		"\u0083\u0084\t\6\2\2\u0084\26\3\2\2\2\u0085\u0090\7>\2\2\u0086\u0087\7"+
		">\2\2\u0087\u0090\7?\2\2\u0088\u0090\7@\2\2\u0089\u008a\7@\2\2\u008a\u0090"+
		"\7?\2\2\u008b\u008c\7?\2\2\u008c\u0090\7?\2\2\u008d\u008e\7#\2\2\u008e"+
		"\u0090\7?\2\2\u008f\u0085\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0088\3\2"+
		"\2\2\u008f\u0089\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7c\2\2\u0092\u0093\7p\2\2\u0093\u0097\7f\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0097\7t\2\2\u0096\u0091\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\32\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u00a2\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a2\7g\2\2\u00a1\u0098\3\2\2"+
		"\2\u00a1\u009c\3\2\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\"\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf(\3\2\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1\u00c2\7q\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7n\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2"+
		"\u00cc.\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2"+
		"\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\60\3"+
		"\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00e0\7n\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7q\2\2"+
		"\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00e0"+
		"\7p\2\2\u00df\u00d4\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0\62\3\2\2\2\u00e1"+
		"\u00e2\7e\2\2\u00e2\u00e3\7j\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7t\2\2"+
		"\u00e5\64\3\2\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7"+
		"w\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\66"+
		"\3\2\2\2\u00ed\u00f2\5\21\t\2\u00ee\u00f1\5\21\t\2\u00ef\u00f1\5\17\b"+
		"\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f38\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\7?\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7\60\2\2\u00f8<\3\2\2\2\u00f9"+
		"\u00fa\7$\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc@\3\2\2\2\u00fd\u00fe"+
		"\7*\2\2\u00feB\3\2\2\2\u00ff\u0100\7+\2\2\u0100D\3\2\2\2\u0101\u0102\7"+
		"]\2\2\u0102F\3\2\2\2\u0103\u0104\7_\2\2\u0104H\3\2\2\2\u0105\u0106\7)"+
		"\2\2\u0106J\3\2\2\2\u0107\u0108\7}\2\2\u0108L\3\2\2\2\u0109\u010a\7\177"+
		"\2\2\u010aN\3\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7-\2\2\u010dP\3\2\2"+
		"\2\u010e\u010f\7/\2\2\u010f\u0110\7/\2\2\u0110R\3\2\2\2\u0111\u0113\5"+
		"\21\t\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115T\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\t\7\2\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b+\2\2\u011dV\3\2\2\2\u011e\u0120"+
		"\7\17\2\2\u011f\u0121\7\f\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u0124\3\2\2\2\u0122\u0124\7\f\2\2\u0123\u011e\3\2\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b,\2\2\u0126X\3\2\2\2\u0127\u0128"+
		"\7\61\2\2\u0128\u0129\7,\2\2\u0129\u012d\3\2\2\2\u012a\u012c\13\2\2\2"+
		"\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012e\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,\2\2\u0131"+
		"\u0132\7\61\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b-\2\2\u0134Z\3\2\2\2"+
		"\u0135\u0136\7\61\2\2\u0136\u0137\7\61\2\2\u0137\u013b\3\2\2\2\u0138\u013a"+
		"\n\b\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b."+
		"\2\2\u013f\\\3\2\2\2\23\2`mt\u0081\u008f\u0096\u00a1\u00df\u00f0\u00f2"+
		"\u0114\u011a\u0120\u0123\u012d\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}