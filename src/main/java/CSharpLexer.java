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
		Elsif=12, Else=13, Then=14, For=15, While=16, Do=17, Case=18, Break=19, 
		Switch=20, IntegerType=21, FloatType=22, StringType=23, BooleanType=24, 
		CharType=25, DoubleType=26, VarName=27, EqualMark=28, Dot=29, QuoteMark=30, 
		Semicolon=31, OpenBracket=32, CloseBracket=33, SquareOpenBracket=34, SquareCloseBracket=35, 
		Apostrophe=36, CurlyOpenBracket=37, CurlyCloseBracket=38, Incrementation=39, 
		Decrementation=40, Colon=41, Text=42, Whitespace=43, Newline=44, BlockComment=45, 
		LineComment=46;
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
			"Boolean", "If", "Elsif", "Else", "Then", "For", "While", "Do", "Case", 
			"Break", "Switch", "IntegerType", "FloatType", "StringType", "BooleanType", 
			"CharType", "DoubleType", "VarName", "EqualMark", "Dot", "QuoteMark", 
			"Semicolon", "OpenBracket", "CloseBracket", "SquareOpenBracket", "SquareCloseBracket", 
			"Apostrophe", "CurlyOpenBracket", "CurlyCloseBracket", "Incrementation", 
			"Decrementation", "Colon", "Text", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'if'", 
			"'elsif'", "'else'", "'then'", "'for'", "'while'", "'do'", "'case'", 
			"'break'", "'switch'", "'int'", "'float'", "'string'", null, "'char'", 
			"'double'", null, "'='", "'.'", "'\"'", "';'", "'('", "')'", "'['", "']'", 
			"'''", "'{'", "'}'", "'++'", "'--'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Integer", "Float", "String", "CharAss", "WhiteSpace", "SpecialChars", 
			"MathOperator", "BooleanOperator", "LogicalOperator", "Boolean", "If", 
			"Elsif", "Else", "Then", "For", "While", "Do", "Case", "Break", "Switch", 
			"IntegerType", "FloatType", "StringType", "BooleanType", "CharType", 
			"DoubleType", "VarName", "EqualMark", "Dot", "QuoteMark", "Semicolon", 
			"OpenBracket", "CloseBracket", "SquareOpenBracket", "SquareCloseBracket", 
			"Apostrophe", "CurlyOpenBracket", "CurlyCloseBracket", "Incrementation", 
			"Decrementation", "Colon", "Text", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5v\n\5\3\5\3\5"+
		"\3\6\6\6{\n\6\r\6\16\6|\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\u0088"+
		"\n\n\r\n\16\n\u0089\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00fa\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u010b\n\37\f\37\16\37\u010e\13\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3.\7.\u012f\n.\f.\16.\u0132\13.\3/\6/\u0135"+
		"\n/\r/\16/\u0136\3/\3/\3\60\3\60\5\60\u013d\n\60\3\60\5\60\u0140\n\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0148\n\61\f\61\16\61\u014b\13\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0156\n\62\f\62\16"+
		"\62\u0159\13\62\3\62\3\62\3\u0149\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21"+
		"\2\23\2\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)"+
		"W*Y+[,]-_.a/c\60\3\2\t\5\2\13\f\17\17\"\"\b\2##%(..\61\61AB`a\3\2\62;"+
		"\3\2c|\5\2,-//\61\61\4\2\13\13\"\"\4\2\f\f\17\17\2\u016c\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3f\3\2\2\2\5j\3\2\2\2\7n\3\2\2\2\tr"+
		"\3\2\2\2\13z\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3\2\2\2\21\u0084\3\2\2\2"+
		"\23\u0087\3\2\2\2\25\u008b\3\2\2\2\27\u0097\3\2\2\2\31\u009e\3\2\2\2\33"+
		"\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ae\3\2\2\2!\u00b4\3\2\2\2#\u00b9"+
		"\3\2\2\2%\u00be\3\2\2\2\'\u00c2\3\2\2\2)\u00c8\3\2\2\2+\u00cb\3\2\2\2"+
		"-\u00d0\3\2\2\2/\u00d6\3\2\2\2\61\u00dd\3\2\2\2\63\u00e1\3\2\2\2\65\u00e7"+
		"\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u0100\3\2\2\2=\u0107\3\2\2\2"+
		"?\u010f\3\2\2\2A\u0111\3\2\2\2C\u0113\3\2\2\2E\u0115\3\2\2\2G\u0117\3"+
		"\2\2\2I\u0119\3\2\2\2K\u011b\3\2\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0121"+
		"\3\2\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0128\3\2\2\2Y\u012b\3\2\2\2["+
		"\u0130\3\2\2\2]\u0134\3\2\2\2_\u013f\3\2\2\2a\u0143\3\2\2\2c\u0151\3\2"+
		"\2\2eg\5\17\b\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\4\3\2\2\2jk\5"+
		"\3\2\2kl\5A!\2lm\5\3\2\2m\6\3\2\2\2no\5C\"\2op\5\23\n\2pq\5C\"\2q\b\3"+
		"\2\2\2ru\5O(\2sv\5\21\t\2tv\5\17\b\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\5"+
		"O(\2x\n\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\177\b\6\2\2\177\f\3\2\2\2\u0080\u0081\t\3\2\2\u0081\16\3\2\2\2"+
		"\u0082\u0083\t\4\2\2\u0083\20\3\2\2\2\u0084\u0085\t\5\2\2\u0085\22\3\2"+
		"\2\2\u0086\u0088\5\21\t\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\24\3\2\2\2\u008b\u008c\t\6\2"+
		"\2\u008c\26\3\2\2\2\u008d\u0098\7>\2\2\u008e\u008f\7>\2\2\u008f\u0098"+
		"\7?\2\2\u0090\u0098\7@\2\2\u0091\u0092\7@\2\2\u0092\u0098\7?\2\2\u0093"+
		"\u0094\7?\2\2\u0094\u0098\7?\2\2\u0095\u0096\7#\2\2\u0096\u0098\7?\2\2"+
		"\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091"+
		"\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0095\3\2\2\2\u0098\30\3\2\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b\u009f\7f\2\2\u009c\u009d\7q\2\2"+
		"\u009d\u009f\7t\2\2\u009e\u0099\3\2\2\2\u009e\u009c\3\2\2\2\u009f\32\3"+
		"\2\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7w\2\2\u00a3"+
		"\u00aa\7g\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7u\2\2\u00a8\u00aa\7g\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\36\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\"\3\2\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd$\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2"+
		"\2\u00c1&\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7"+
		"k\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7(\3\2\2\2\u00c8\u00c9"+
		"\7f\2\2\u00c9\u00ca\7q\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf,\3\2\2\2\u00d0\u00d1"+
		"\7d\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7m\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7y\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7j\2\2"+
		"\u00dc\60\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7"+
		"v\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4"+
		"\7q\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\64\3\2\2\2\u00e7\u00e8"+
		"\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7p\2\2\u00ec\u00ed\7i\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7q\2\2\u00f1\u00fa\7n\2\2\u00f2\u00f3\7d\2\2"+
		"\u00f3\u00f4\7q\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00fa\7p\2\2\u00f9\u00ee\3\2\2\2\u00f9"+
		"\u00f2\3\2\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7j\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7t\2\2\u00ff:\3\2\2\2\u0100\u0101\7f\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7w\2\2\u0103\u0104\7d\2\2\u0104\u0105\7n\2\2"+
		"\u0105\u0106\7g\2\2\u0106<\3\2\2\2\u0107\u010c\5\21\t\2\u0108\u010b\5"+
		"\21\t\2\u0109\u010b\5\17\b\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d>\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0110\7?\2\2\u0110@\3\2\2\2\u0111\u0112\7\60"+
		"\2\2\u0112B\3\2\2\2\u0113\u0114\7$\2\2\u0114D\3\2\2\2\u0115\u0116\7=\2"+
		"\2\u0116F\3\2\2\2\u0117\u0118\7*\2\2\u0118H\3\2\2\2\u0119\u011a\7+\2\2"+
		"\u011aJ\3\2\2\2\u011b\u011c\7]\2\2\u011cL\3\2\2\2\u011d\u011e\7_\2\2\u011e"+
		"N\3\2\2\2\u011f\u0120\7)\2\2\u0120P\3\2\2\2\u0121\u0122\7}\2\2\u0122R"+
		"\3\2\2\2\u0123\u0124\7\177\2\2\u0124T\3\2\2\2\u0125\u0126\7-\2\2\u0126"+
		"\u0127\7-\2\2\u0127V\3\2\2\2\u0128\u0129\7/\2\2\u0129\u012a\7/\2\2\u012a"+
		"X\3\2\2\2\u012b\u012c\7<\2\2\u012cZ\3\2\2\2\u012d\u012f\5\21\t\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\\\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\t\7\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b/\2\2\u0139^\3\2\2\2\u013a\u013c\7\17\2\2"+
		"\u013b\u013d\7\f\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u0140\7\f\2\2\u013f\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b\60\2\2\u0142`\3\2\2\2\u0143\u0144\7\61\2"+
		"\2\u0144\u0145\7,\2\2\u0145\u0149\3\2\2\2\u0146\u0148\13\2\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7,\2\2\u014d\u014e\7\61"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\61\2\2\u0150b\3\2\2\2\u0151\u0152"+
		"\7\61\2\2\u0152\u0153\7\61\2\2\u0153\u0157\3\2\2\2\u0154\u0156\n\b\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\b\62\2\2"+
		"\u015bd\3\2\2\2\23\2hu|\u0089\u0097\u009e\u00a9\u00f9\u010a\u010c\u0130"+
		"\u0136\u013c\u013f\u0149\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}