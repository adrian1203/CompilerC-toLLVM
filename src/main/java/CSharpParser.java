// Generated from C:/Users/Adrian/Desktop/Kompilatory/Projekt/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
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
		SquareCloseBracket=29, Apostrophe=30, Text=31, Whitespace=32, Newline=33, 
		BlockComment=34, LineComment=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationList = 2, RULE_declaration = 3, 
		RULE_variableDec = 4, RULE_arrayDec = 5, RULE_arrayVal = 6, RULE_varType = 7, 
		RULE_value = 8, RULE_assignment = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationList", "declaration", "variableDec", 
			"arrayDec", "arrayVal", "varType", "value", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'if'", 
			"'elsif'", "'else'", "'then'", "'int'", "'float'", "'string'", null, 
			"'char'", "'double'", null, "'='", "'.'", "'\"'", "';'", "'('", "')'", 
			"'['", "']'", "'''"
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
			"Apostrophe", "Text", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "CSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << FloatType) | (1L << StringType) | (1L << BooleanType) | (1L << CharType) | (1L << DoubleType))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				declarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				assignment();
				}
				break;
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(32);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(33);
					declaration();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(CSharpParser.Semicolon, 0); }
		public VariableDecContext variableDec() {
			return getRuleContext(VariableDecContext.class,0);
		}
		public ArrayDecContext arrayDec() {
			return getRuleContext(ArrayDecContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(39);
				variableDec();
				}
				break;
			case 2:
				{
				setState(40);
				arrayDec();
				}
				break;
			}
			setState(43);
			match(Semicolon);
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

	public static class VariableDecContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public VariableDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitVariableDec(this);
		}
	}

	public final VariableDecContext variableDec() throws RecognitionException {
		VariableDecContext _localctx = new VariableDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			varType();
			setState(46);
			match(VarName);
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

	public static class ArrayDecContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public List<TerminalNode> SquareOpenBracket() { return getTokens(CSharpParser.SquareOpenBracket); }
		public TerminalNode SquareOpenBracket(int i) {
			return getToken(CSharpParser.SquareOpenBracket, i);
		}
		public List<TerminalNode> SquareCloseBracket() { return getTokens(CSharpParser.SquareCloseBracket); }
		public TerminalNode SquareCloseBracket(int i) {
			return getToken(CSharpParser.SquareCloseBracket, i);
		}
		public ArrayDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArrayDec(this);
		}
	}

	public final ArrayDecContext arrayDec() throws RecognitionException {
		ArrayDecContext _localctx = new ArrayDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			varType();
			setState(49);
			match(VarName);
			setState(50);
			match(SquareOpenBracket);
			setState(51);
			match(SquareCloseBracket);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(52);
				match(SquareOpenBracket);
				setState(53);
				match(SquareCloseBracket);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayValContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public List<TerminalNode> SquareOpenBracket() { return getTokens(CSharpParser.SquareOpenBracket); }
		public TerminalNode SquareOpenBracket(int i) {
			return getToken(CSharpParser.SquareOpenBracket, i);
		}
		public List<TerminalNode> Integer() { return getTokens(CSharpParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(CSharpParser.Integer, i);
		}
		public List<TerminalNode> SquareCloseBracket() { return getTokens(CSharpParser.SquareCloseBracket); }
		public TerminalNode SquareCloseBracket(int i) {
			return getToken(CSharpParser.SquareCloseBracket, i);
		}
		public ArrayValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterArrayVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitArrayVal(this);
		}
	}

	public final ArrayValContext arrayVal() throws RecognitionException {
		ArrayValContext _localctx = new ArrayValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VarName);
			setState(60);
			match(SquareOpenBracket);
			setState(61);
			match(Integer);
			setState(62);
			match(SquareCloseBracket);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(63);
				match(SquareOpenBracket);
				setState(64);
				match(Integer);
				setState(65);
				match(SquareCloseBracket);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode IntegerType() { return getToken(CSharpParser.IntegerType, 0); }
		public TerminalNode FloatType() { return getToken(CSharpParser.FloatType, 0); }
		public TerminalNode StringType() { return getToken(CSharpParser.StringType, 0); }
		public TerminalNode BooleanType() { return getToken(CSharpParser.BooleanType, 0); }
		public TerminalNode CharType() { return getToken(CSharpParser.CharType, 0); }
		public TerminalNode DoubleType() { return getToken(CSharpParser.DoubleType, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << FloatType) | (1L << StringType) | (1L << BooleanType) | (1L << CharType) | (1L << DoubleType))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> VarName() { return getTokens(CSharpParser.VarName); }
		public TerminalNode VarName(int i) {
			return getToken(CSharpParser.VarName, i);
		}
		public List<ArrayValContext> arrayVal() {
			return getRuleContexts(ArrayValContext.class);
		}
		public ArrayValContext arrayVal(int i) {
			return getRuleContext(ArrayValContext.class,i);
		}
		public List<TerminalNode> Integer() { return getTokens(CSharpParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(CSharpParser.Integer, i);
		}
		public List<TerminalNode> Float() { return getTokens(CSharpParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(CSharpParser.Float, i);
		}
		public List<TerminalNode> String() { return getTokens(CSharpParser.String); }
		public TerminalNode String(int i) {
			return getToken(CSharpParser.String, i);
		}
		public List<TerminalNode> CharAss() { return getTokens(CSharpParser.CharAss); }
		public TerminalNode CharAss(int i) {
			return getToken(CSharpParser.CharAss, i);
		}
		public List<TerminalNode> MathOperator() { return getTokens(CSharpParser.MathOperator); }
		public TerminalNode MathOperator(int i) {
			return getToken(CSharpParser.MathOperator, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(73);
				match(VarName);
				}
				break;
			case 2:
				{
				setState(74);
				arrayVal();
				}
				break;
			case 3:
				{
				setState(75);
				match(Integer);
				}
				break;
			case 4:
				{
				setState(76);
				match(Float);
				}
				break;
			case 5:
				{
				setState(77);
				match(String);
				}
				break;
			case 6:
				{
				setState(78);
				match(CharAss);
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MathOperator) {
				{
				{
				setState(81);
				match(MathOperator);
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(82);
					match(VarName);
					}
					break;
				case 2:
					{
					setState(83);
					arrayVal();
					}
					break;
				case 3:
					{
					setState(84);
					match(Integer);
					}
					break;
				case 4:
					{
					setState(85);
					match(Float);
					}
					break;
				case 5:
					{
					setState(86);
					match(String);
					}
					break;
				case 6:
					{
					setState(87);
					match(CharAss);
					}
					break;
				}
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IntegerType() { return getToken(CSharpParser.IntegerType, 0); }
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public TerminalNode EqualMark() { return getToken(CSharpParser.EqualMark, 0); }
		public TerminalNode Integer() { return getToken(CSharpParser.Integer, 0); }
		public TerminalNode Semicolon() { return getToken(CSharpParser.Semicolon, 0); }
		public TerminalNode FloatType() { return getToken(CSharpParser.FloatType, 0); }
		public TerminalNode Float() { return getToken(CSharpParser.Float, 0); }
		public TerminalNode CharType() { return getToken(CSharpParser.CharType, 0); }
		public TerminalNode CharAss() { return getToken(CSharpParser.CharAss, 0); }
		public TerminalNode BooleanType() { return getToken(CSharpParser.BooleanType, 0); }
		public TerminalNode Boolean() { return getToken(CSharpParser.Boolean, 0); }
		public TerminalNode StringType() { return getToken(CSharpParser.StringType, 0); }
		public TerminalNode String() { return getToken(CSharpParser.String, 0); }
		public TerminalNode DoubleType() { return getToken(CSharpParser.DoubleType, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(IntegerType);
				setState(96);
				match(VarName);
				setState(97);
				match(EqualMark);
				setState(98);
				match(Integer);
				setState(99);
				match(Semicolon);
				}
				break;
			case FloatType:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(FloatType);
				setState(101);
				match(VarName);
				setState(102);
				match(EqualMark);
				setState(103);
				match(Float);
				setState(104);
				match(Semicolon);
				}
				break;
			case CharType:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(CharType);
				setState(106);
				match(VarName);
				setState(107);
				match(EqualMark);
				setState(108);
				match(CharAss);
				setState(109);
				match(Semicolon);
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(BooleanType);
				setState(111);
				match(VarName);
				setState(112);
				match(EqualMark);
				setState(113);
				match(Boolean);
				setState(114);
				match(Semicolon);
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(StringType);
				setState(116);
				match(VarName);
				setState(117);
				match(EqualMark);
				setState(118);
				match(String);
				setState(119);
				match(Semicolon);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(DoubleType);
				setState(121);
				match(VarName);
				setState(122);
				match(EqualMark);
				setState(123);
				match(Float);
				setState(124);
				match(Semicolon);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\7\4%\n\4\f\4\16\4(\13\4\3\5\3\5\5\5,\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bE\n\b\f\b\16\bH\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0080\n\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\21\26\2\u008d"+
		"\2\27\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b+\3\2\2\2\n/\3\2\2\2\f\62\3\2"+
		"\2\2\16=\3\2\2\2\20I\3\2\2\2\22Q\3\2\2\2\24\177\3\2\2\2\26\30\5\4\3\2"+
		"\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2"+
		"\33\36\5\6\4\2\34\36\5\24\13\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2"+
		"\2\37 \b\4\1\2 !\5\b\5\2!&\3\2\2\2\"#\f\3\2\2#%\5\b\5\2$\"\3\2\2\2%(\3"+
		"\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2),\5\n\6\2*,\5\f\7\2"+
		"+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-.\7\33\2\2.\t\3\2\2\2/\60\5\20\t\2\60\61"+
		"\7\27\2\2\61\13\3\2\2\2\62\63\5\20\t\2\63\64\7\27\2\2\64\65\7\36\2\2\65"+
		":\7\37\2\2\66\67\7\36\2\2\679\7\37\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2=>\7\27\2\2>?\7\36\2\2?@\7\3\2\2@F\7\37"+
		"\2\2AB\7\36\2\2BC\7\3\2\2CE\7\37\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2G\17\3\2\2\2HF\3\2\2\2IJ\t\2\2\2J\21\3\2\2\2KR\7\27\2\2LR\5\16\b"+
		"\2MR\7\3\2\2NR\7\4\2\2OR\7\5\2\2PR\7\6\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2"+
		"\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R^\3\2\2\2SZ\7\t\2\2T[\7\27\2\2U[\5\16"+
		"\b\2V[\7\3\2\2W[\7\4\2\2X[\7\5\2\2Y[\7\6\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2"+
		"\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[]\3\2\2\2\\S\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\23\3\2\2\2`^\3\2\2\2ab\7\21\2\2bc\7\27\2\2cd\7\30\2"+
		"\2de\7\3\2\2e\u0080\7\33\2\2fg\7\22\2\2gh\7\27\2\2hi\7\30\2\2ij\7\4\2"+
		"\2j\u0080\7\33\2\2kl\7\25\2\2lm\7\27\2\2mn\7\30\2\2no\7\6\2\2o\u0080\7"+
		"\33\2\2pq\7\24\2\2qr\7\27\2\2rs\7\30\2\2st\7\f\2\2t\u0080\7\33\2\2uv\7"+
		"\23\2\2vw\7\27\2\2wx\7\30\2\2xy\7\5\2\2y\u0080\7\33\2\2z{\7\26\2\2{|\7"+
		"\27\2\2|}\7\30\2\2}~\7\4\2\2~\u0080\7\33\2\2\177a\3\2\2\2\177f\3\2\2\2"+
		"\177k\3\2\2\2\177p\3\2\2\2\177u\3\2\2\2\177z\3\2\2\2\u0080\25\3\2\2\2"+
		"\f\31\35&+:FQZ^\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}