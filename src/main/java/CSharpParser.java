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
		SquareCloseBracket=29, Apostrophe=30, CurlyOpenBracket=31, CurlyCloseBracket=32, 
		Text=33, Whitespace=34, Newline=35, BlockComment=36, LineComment=37;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationList = 2, RULE_logicalStatement = 3, 
		RULE_ifStatement = 4, RULE_instructionsBlock = 5, RULE_declaration = 6, 
		RULE_variableDec = 7, RULE_arrayDec = 8, RULE_arrayVal = 9, RULE_varType = 10, 
		RULE_value = 11, RULE_assignment = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationList", "logicalStatement", "ifStatement", 
			"instructionsBlock", "declaration", "variableDec", "arrayDec", "arrayVal", 
			"varType", "value", "assignment"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << IntegerType) | (1L << FloatType) | (1L << StringType) | (1L << BooleanType) | (1L << CharType) | (1L << DoubleType))) != 0) );
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
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				declarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				instructionsBlock();
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
			setState(37);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
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
					setState(39);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(40);
					declaration();
					}
					} 
				}
				setState(45);
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

	public static class LogicalStatementContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode BooleanOperator() { return getToken(CSharpParser.BooleanOperator, 0); }
		public TerminalNode Boolean() { return getToken(CSharpParser.Boolean, 0); }
		public LogicalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterLogicalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitLogicalStatement(this);
		}
	}

	public final LogicalStatementContext logicalStatement() throws RecognitionException {
		LogicalStatementContext _localctx = new LogicalStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logicalStatement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case CharAss:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				value();
				setState(47);
				match(BooleanOperator);
				setState(48);
				value();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(Boolean);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> If() { return getTokens(CSharpParser.If); }
		public TerminalNode If(int i) {
			return getToken(CSharpParser.If, i);
		}
		public List<TerminalNode> OpenBracket() { return getTokens(CSharpParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(CSharpParser.OpenBracket, i);
		}
		public List<LogicalStatementContext> logicalStatement() {
			return getRuleContexts(LogicalStatementContext.class);
		}
		public LogicalStatementContext logicalStatement(int i) {
			return getRuleContext(LogicalStatementContext.class,i);
		}
		public List<TerminalNode> CloseBracket() { return getTokens(CSharpParser.CloseBracket); }
		public TerminalNode CloseBracket(int i) {
			return getToken(CSharpParser.CloseBracket, i);
		}
		public List<TerminalNode> CurlyOpenBracket() { return getTokens(CSharpParser.CurlyOpenBracket); }
		public TerminalNode CurlyOpenBracket(int i) {
			return getToken(CSharpParser.CurlyOpenBracket, i);
		}
		public List<InstructionsBlockContext> instructionsBlock() {
			return getRuleContexts(InstructionsBlockContext.class);
		}
		public InstructionsBlockContext instructionsBlock(int i) {
			return getRuleContext(InstructionsBlockContext.class,i);
		}
		public List<TerminalNode> CurlyCloseBracket() { return getTokens(CSharpParser.CurlyCloseBracket); }
		public TerminalNode CurlyCloseBracket(int i) {
			return getToken(CSharpParser.CurlyCloseBracket, i);
		}
		public List<TerminalNode> Else() { return getTokens(CSharpParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(CSharpParser.Else, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(If);
			setState(54);
			match(OpenBracket);
			setState(55);
			logicalStatement();
			setState(56);
			match(CloseBracket);
			setState(57);
			match(CurlyOpenBracket);
			setState(58);
			instructionsBlock();
			setState(59);
			match(CurlyCloseBracket);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						match(Else);
						setState(61);
						match(If);
						setState(62);
						match(OpenBracket);
						setState(63);
						logicalStatement();
						setState(64);
						match(CloseBracket);
						setState(65);
						match(CurlyOpenBracket);
						setState(66);
						instructionsBlock();
						setState(67);
						match(CurlyCloseBracket);
						}
						} 
					}
					setState(73);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(74);
				match(Else);
				setState(75);
				match(CurlyOpenBracket);
				setState(76);
				instructionsBlock();
				setState(77);
				match(CurlyCloseBracket);
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

	public static class InstructionsBlockContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public InstructionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterInstructionsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitInstructionsBlock(this);
		}
	}

	public final InstructionsBlockContext instructionsBlock() throws RecognitionException {
		InstructionsBlockContext _localctx = new InstructionsBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructionsBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(81);
						declaration();
						}
						break;
					case 2:
						{
						setState(82);
						ifStatement();
						}
						break;
					case 3:
						{
						setState(83);
						assignment();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(88);
				variableDec();
				}
				break;
			case 2:
				{
				setState(89);
				arrayDec();
				}
				break;
			}
			setState(92);
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
		enterRule(_localctx, 14, RULE_variableDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			varType();
			setState(95);
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
		enterRule(_localctx, 16, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			varType();
			setState(98);
			match(VarName);
			setState(99);
			match(SquareOpenBracket);
			setState(100);
			match(SquareCloseBracket);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(101);
				match(SquareOpenBracket);
				setState(102);
				match(SquareCloseBracket);
				}
				}
				setState(107);
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
		enterRule(_localctx, 18, RULE_arrayVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(VarName);
			setState(109);
			match(SquareOpenBracket);
			setState(110);
			match(Integer);
			setState(111);
			match(SquareCloseBracket);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(112);
				match(SquareOpenBracket);
				setState(113);
				match(Integer);
				setState(114);
				match(SquareCloseBracket);
				}
				}
				setState(119);
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
		enterRule(_localctx, 20, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122);
				match(VarName);
				}
				break;
			case 2:
				{
				setState(123);
				arrayVal();
				}
				break;
			case 3:
				{
				setState(124);
				match(Integer);
				}
				break;
			case 4:
				{
				setState(125);
				match(Float);
				}
				break;
			case 5:
				{
				setState(126);
				match(String);
				}
				break;
			case 6:
				{
				setState(127);
				match(CharAss);
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MathOperator) {
				{
				{
				setState(130);
				match(MathOperator);
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(131);
					match(VarName);
					}
					break;
				case 2:
					{
					setState(132);
					arrayVal();
					}
					break;
				case 3:
					{
					setState(133);
					match(Integer);
					}
					break;
				case 4:
					{
					setState(134);
					match(Float);
					}
					break;
				case 5:
					{
					setState(135);
					match(String);
					}
					break;
				case 6:
					{
					setState(136);
					match(CharAss);
					}
					break;
				}
				}
				}
				setState(143);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(IntegerType);
				setState(145);
				match(VarName);
				setState(146);
				match(EqualMark);
				setState(147);
				match(Integer);
				setState(148);
				match(Semicolon);
				}
				break;
			case FloatType:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(FloatType);
				setState(150);
				match(VarName);
				setState(151);
				match(EqualMark);
				setState(152);
				match(Float);
				setState(153);
				match(Semicolon);
				}
				break;
			case CharType:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(CharType);
				setState(155);
				match(VarName);
				setState(156);
				match(EqualMark);
				setState(157);
				match(CharAss);
				setState(158);
				match(Semicolon);
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(BooleanType);
				setState(160);
				match(VarName);
				setState(161);
				match(EqualMark);
				setState(162);
				match(Boolean);
				setState(163);
				match(Semicolon);
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(StringType);
				setState(165);
				match(VarName);
				setState(166);
				match(EqualMark);
				setState(167);
				match(String);
				setState(168);
				match(Semicolon);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(DoubleType);
				setState(170);
				match(VarName);
				setState(171);
				match(EqualMark);
				setState(172);
				match(Float);
				setState(173);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\5"+
		"\3%\n\3\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\66\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7"+
		"\3\7\6\7W\n\7\r\7\16\7X\3\b\3\b\5\b]\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\7\r\u008e\n\r\f\r\16\r"+
		"\u0091\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\2\3\6\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\3\3\2\21\26\2\u00c2\2\35\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2"+
		"\b\65\3\2\2\2\n\67\3\2\2\2\fV\3\2\2\2\16\\\3\2\2\2\20`\3\2\2\2\22c\3\2"+
		"\2\2\24n\3\2\2\2\26z\3\2\2\2\30\u0082\3\2\2\2\32\u00b0\3\2\2\2\34\36\5"+
		"\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2"+
		"\2!%\5\6\4\2\"%\5\32\16\2#%\5\f\7\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5"+
		"\3\2\2\2&\'\b\4\1\2\'(\5\16\b\2(-\3\2\2\2)*\f\3\2\2*,\5\16\b\2+)\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2\2\60\61\5\30\r\2\61"+
		"\62\7\n\2\2\62\63\5\30\r\2\63\66\3\2\2\2\64\66\7\f\2\2\65\60\3\2\2\2\65"+
		"\64\3\2\2\2\66\t\3\2\2\2\678\7\r\2\289\7\34\2\29:\5\b\5\2:;\7\35\2\2;"+
		"<\7!\2\2<=\5\f\7\2=Q\7\"\2\2>?\7\17\2\2?@\7\r\2\2@A\7\34\2\2AB\5\b\5\2"+
		"BC\7\35\2\2CD\7!\2\2DE\5\f\7\2EF\7\"\2\2FH\3\2\2\2G>\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\17\2\2MN\7!\2\2NO\5\f\7\2"+
		"OP\7\"\2\2PR\3\2\2\2QI\3\2\2\2QR\3\2\2\2R\13\3\2\2\2SW\5\16\b\2TW\5\n"+
		"\6\2UW\5\32\16\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\r\3\2\2\2Z]\5\20\t\2[]\5\22\n\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2"+
		"\2^_\7\33\2\2_\17\3\2\2\2`a\5\26\f\2ab\7\27\2\2b\21\3\2\2\2cd\5\26\f\2"+
		"de\7\27\2\2ef\7\36\2\2fk\7\37\2\2gh\7\36\2\2hj\7\37\2\2ig\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mk\3\2\2\2no\7\27\2\2op\7\36\2\2"+
		"pq\7\3\2\2qw\7\37\2\2rs\7\36\2\2st\7\3\2\2tv\7\37\2\2ur\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2\2\2yw\3\2\2\2z{\t\2\2\2{\27\3\2\2\2|"+
		"\u0083\7\27\2\2}\u0083\5\24\13\2~\u0083\7\3\2\2\177\u0083\7\4\2\2\u0080"+
		"\u0083\7\5\2\2\u0081\u0083\7\6\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u008f\3\2\2\2\u0084\u008b\7\t\2\2\u0085\u008c\7\27\2\2\u0086\u008c\5"+
		"\24\13\2\u0087\u008c\7\3\2\2\u0088\u008c\7\4\2\2\u0089\u008c\7\5\2\2\u008a"+
		"\u008c\7\6\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2"+
		"\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\31\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7\21\2\2\u0093\u0094\7\27\2\2\u0094\u0095\7\30\2\2\u0095\u0096\7\3\2"+
		"\2\u0096\u00b1\7\33\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\27\2\2\u0099"+
		"\u009a\7\30\2\2\u009a\u009b\7\4\2\2\u009b\u00b1\7\33\2\2\u009c\u009d\7"+
		"\25\2\2\u009d\u009e\7\27\2\2\u009e\u009f\7\30\2\2\u009f\u00a0\7\6\2\2"+
		"\u00a0\u00b1\7\33\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\7\27\2\2\u00a3"+
		"\u00a4\7\30\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00b1\7\33\2\2\u00a6\u00a7\7"+
		"\23\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7\5\2\2"+
		"\u00aa\u00b1\7\33\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\7\27\2\2\u00ad"+
		"\u00ae\7\30\2\2\u00ae\u00af\7\4\2\2\u00af\u00b1\7\33\2\2\u00b0\u0092\3"+
		"\2\2\2\u00b0\u0097\3\2\2\2\u00b0\u009c\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0"+
		"\u00a6\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\33\3\2\2\2\21\37$-\65IQVX\\k"+
		"w\u0082\u008b\u008f\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}