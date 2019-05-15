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
		Elsif=12, Else=13, Then=14, For=15, While=16, Do=17, Case=18, Break=19, 
		Switch=20, IntegerType=21, FloatType=22, StringType=23, BooleanType=24, 
		CharType=25, DoubleType=26, VarName=27, EqualMark=28, Dot=29, QuoteMark=30, 
		Semicolon=31, OpenBracket=32, CloseBracket=33, SquareOpenBracket=34, SquareCloseBracket=35, 
		Apostrophe=36, CurlyOpenBracket=37, CurlyCloseBracket=38, Incrementation=39, 
		Decrementation=40, Colon=41, Text=42, Whitespace=43, Newline=44, BlockComment=45, 
		LineComment=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationList = 2, RULE_logicalStatement = 3, 
		RULE_ifStatement = 4, RULE_forStatement = 5, RULE_whileStatement = 6, 
		RULE_doWhileStatement = 7, RULE_expression = 8, RULE_incrementationStatment = 9, 
		RULE_instructionsBlock = 10, RULE_statementBlockTrue = 11, RULE_statementBlockFalse = 12, 
		RULE_declaration = 13, RULE_variableDec = 14, RULE_arrayDec = 15, RULE_arrayVal = 16, 
		RULE_varType = 17, RULE_value = 18, RULE_assignment = 19, RULE_forAssigment = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationList", "logicalStatement", "ifStatement", 
			"forStatement", "whileStatement", "doWhileStatement", "expression", "incrementationStatment", 
			"instructionsBlock", "statementBlockTrue", "statementBlockFalse", "declaration", 
			"variableDec", "arrayDec", "arrayVal", "varType", "value", "assignment", 
			"forAssigment"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << For) | (1L << While) | (1L << Do) | (1L << IntegerType) | (1L << FloatType) | (1L << StringType) | (1L << BooleanType) | (1L << CharType) | (1L << DoubleType) | (1L << VarName))) != 0) );
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				declarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
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
			setState(53);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
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
					setState(55);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(56);
					declaration();
					}
					} 
				}
				setState(61);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case CharAss:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				value();
				setState(63);
				match(BooleanOperator);
				setState(64);
				value();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
		public TerminalNode If() { return getToken(CSharpParser.If, 0); }
		public TerminalNode OpenBracket() { return getToken(CSharpParser.OpenBracket, 0); }
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(CSharpParser.CloseBracket, 0); }
		public List<TerminalNode> CurlyOpenBracket() { return getTokens(CSharpParser.CurlyOpenBracket); }
		public TerminalNode CurlyOpenBracket(int i) {
			return getToken(CSharpParser.CurlyOpenBracket, i);
		}
		public StatementBlockTrueContext statementBlockTrue() {
			return getRuleContext(StatementBlockTrueContext.class,0);
		}
		public List<TerminalNode> CurlyCloseBracket() { return getTokens(CSharpParser.CurlyCloseBracket); }
		public TerminalNode CurlyCloseBracket(int i) {
			return getToken(CSharpParser.CurlyCloseBracket, i);
		}
		public List<TerminalNode> Else() { return getTokens(CSharpParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(CSharpParser.Else, i);
		}
		public StatementBlockFalseContext statementBlockFalse() {
			return getRuleContext(StatementBlockFalseContext.class,0);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(If);
			setState(70);
			match(OpenBracket);
			setState(71);
			logicalStatement();
			setState(72);
			match(CloseBracket);
			setState(73);
			match(CurlyOpenBracket);
			setState(74);
			statementBlockTrue();
			setState(75);
			match(CurlyCloseBracket);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						match(Else);
						setState(77);
						ifStatement();
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(83);
				match(Else);
				setState(84);
				match(CurlyOpenBracket);
				setState(85);
				statementBlockFalse();
				setState(86);
				match(CurlyCloseBracket);
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(CSharpParser.For, 0); }
		public TerminalNode OpenBracket() { return getToken(CSharpParser.OpenBracket, 0); }
		public ForAssigmentContext forAssigment() {
			return getRuleContext(ForAssigmentContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(CSharpParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(CSharpParser.Semicolon, i);
		}
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public IncrementationStatmentContext incrementationStatment() {
			return getRuleContext(IncrementationStatmentContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(CSharpParser.CloseBracket, 0); }
		public TerminalNode CurlyOpenBracket() { return getToken(CSharpParser.CurlyOpenBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CurlyCloseBracket() { return getToken(CSharpParser.CurlyCloseBracket, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(For);
			setState(91);
			match(OpenBracket);
			setState(92);
			forAssigment();
			setState(93);
			match(Semicolon);
			setState(94);
			logicalStatement();
			setState(95);
			match(Semicolon);
			setState(96);
			incrementationStatment();
			setState(97);
			match(CloseBracket);
			setState(98);
			match(CurlyOpenBracket);
			setState(99);
			statement();
			setState(100);
			match(CurlyCloseBracket);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CSharpParser.While, 0); }
		public TerminalNode OpenBracket() { return getToken(CSharpParser.OpenBracket, 0); }
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(CSharpParser.CloseBracket, 0); }
		public TerminalNode CurlyOpenBracket() { return getToken(CSharpParser.CurlyOpenBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CurlyCloseBracket() { return getToken(CSharpParser.CurlyCloseBracket, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(While);
			setState(103);
			match(OpenBracket);
			setState(104);
			logicalStatement();
			setState(105);
			match(CloseBracket);
			setState(106);
			match(CurlyOpenBracket);
			setState(107);
			statement();
			setState(108);
			match(CurlyCloseBracket);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(CSharpParser.Do, 0); }
		public TerminalNode CurlyOpenBracket() { return getToken(CSharpParser.CurlyOpenBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CurlyCloseBracket() { return getToken(CSharpParser.CurlyCloseBracket, 0); }
		public TerminalNode While() { return getToken(CSharpParser.While, 0); }
		public TerminalNode OpenBracket() { return getToken(CSharpParser.OpenBracket, 0); }
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(CSharpParser.CloseBracket, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(Do);
			setState(111);
			match(CurlyOpenBracket);
			setState(112);
			statement();
			setState(113);
			match(CurlyCloseBracket);
			setState(114);
			match(While);
			setState(115);
			match(OpenBracket);
			setState(116);
			logicalStatement();
			setState(117);
			match(CloseBracket);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public TerminalNode EqualMark() { return getToken(CSharpParser.EqualMark, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(CSharpParser.Semicolon, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VarName);
			setState(120);
			match(EqualMark);
			setState(121);
			value();
			setState(122);
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

	public static class IncrementationStatmentContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public TerminalNode Decrementation() { return getToken(CSharpParser.Decrementation, 0); }
		public TerminalNode Incrementation() { return getToken(CSharpParser.Incrementation, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IncrementationStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementationStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterIncrementationStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitIncrementationStatment(this);
		}
	}

	public final IncrementationStatmentContext incrementationStatment() throws RecognitionException {
		IncrementationStatmentContext _localctx = new IncrementationStatmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_incrementationStatment);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(124);
				match(VarName);
				setState(125);
				match(Decrementation);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(126);
				match(VarName);
				setState(127);
				match(Incrementation);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				value();
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
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public List<DoWhileStatementContext> doWhileStatement() {
			return getRuleContexts(DoWhileStatementContext.class);
		}
		public DoWhileStatementContext doWhileStatement(int i) {
			return getRuleContext(DoWhileStatementContext.class,i);
		}
		public List<ForStatementContext> forStatement() {
			return getRuleContexts(ForStatementContext.class);
		}
		public ForStatementContext forStatement(int i) {
			return getRuleContext(ForStatementContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 20, RULE_instructionsBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(131);
						declaration();
						}
						break;
					case 2:
						{
						setState(132);
						ifStatement();
						}
						break;
					case 3:
						{
						setState(133);
						whileStatement();
						}
						break;
					case 4:
						{
						setState(134);
						doWhileStatement();
						}
						break;
					case 5:
						{
						setState(135);
						forStatement();
						}
						break;
					case 6:
						{
						setState(136);
						assignment();
						}
						break;
					case 7:
						{
						setState(137);
						expression();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StatementBlockTrueContext extends ParserRuleContext {
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public StatementBlockTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlockTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatementBlockTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatementBlockTrue(this);
		}
	}

	public final StatementBlockTrueContext statementBlockTrue() throws RecognitionException {
		StatementBlockTrueContext _localctx = new StatementBlockTrueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlockTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			instructionsBlock();
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

	public static class StatementBlockFalseContext extends ParserRuleContext {
		public InstructionsBlockContext instructionsBlock() {
			return getRuleContext(InstructionsBlockContext.class,0);
		}
		public StatementBlockFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlockFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterStatementBlockFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitStatementBlockFalse(this);
		}
	}

	public final StatementBlockFalseContext statementBlockFalse() throws RecognitionException {
		StatementBlockFalseContext _localctx = new StatementBlockFalseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementBlockFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			instructionsBlock();
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(146);
				variableDec();
				}
				break;
			case 2:
				{
				setState(147);
				arrayDec();
				}
				break;
			}
			setState(150);
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
		enterRule(_localctx, 28, RULE_variableDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			varType();
			setState(153);
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
		enterRule(_localctx, 30, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			varType();
			setState(156);
			match(VarName);
			setState(157);
			match(SquareOpenBracket);
			setState(158);
			match(SquareCloseBracket);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(159);
				match(SquareOpenBracket);
				setState(160);
				match(SquareCloseBracket);
				}
				}
				setState(165);
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
		enterRule(_localctx, 32, RULE_arrayVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(VarName);
			setState(167);
			match(SquareOpenBracket);
			setState(168);
			match(Integer);
			setState(169);
			match(SquareCloseBracket);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(170);
				match(SquareOpenBracket);
				setState(171);
				match(Integer);
				setState(172);
				match(SquareCloseBracket);
				}
				}
				setState(177);
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
		enterRule(_localctx, 34, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(180);
				match(VarName);
				}
				break;
			case 2:
				{
				setState(181);
				arrayVal();
				}
				break;
			case 3:
				{
				setState(182);
				match(Integer);
				}
				break;
			case 4:
				{
				setState(183);
				match(Float);
				}
				break;
			case 5:
				{
				setState(184);
				match(String);
				}
				break;
			case 6:
				{
				setState(185);
				match(CharAss);
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MathOperator) {
				{
				{
				setState(188);
				match(MathOperator);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(189);
					match(VarName);
					}
					break;
				case 2:
					{
					setState(190);
					arrayVal();
					}
					break;
				case 3:
					{
					setState(191);
					match(Integer);
					}
					break;
				case 4:
					{
					setState(192);
					match(Float);
					}
					break;
				case 5:
					{
					setState(193);
					match(String);
					}
					break;
				case 6:
					{
					setState(194);
					match(CharAss);
					}
					break;
				}
				}
				}
				setState(201);
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(IntegerType);
				setState(203);
				match(VarName);
				setState(204);
				match(EqualMark);
				setState(205);
				match(Integer);
				setState(206);
				match(Semicolon);
				}
				break;
			case FloatType:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FloatType);
				setState(208);
				match(VarName);
				setState(209);
				match(EqualMark);
				setState(210);
				match(Float);
				setState(211);
				match(Semicolon);
				}
				break;
			case CharType:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(CharType);
				setState(213);
				match(VarName);
				setState(214);
				match(EqualMark);
				setState(215);
				match(CharAss);
				setState(216);
				match(Semicolon);
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(BooleanType);
				setState(218);
				match(VarName);
				setState(219);
				match(EqualMark);
				setState(220);
				match(Boolean);
				setState(221);
				match(Semicolon);
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(StringType);
				setState(223);
				match(VarName);
				setState(224);
				match(EqualMark);
				setState(225);
				match(String);
				setState(226);
				match(Semicolon);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				match(DoubleType);
				setState(228);
				match(VarName);
				setState(229);
				match(EqualMark);
				setState(230);
				match(Float);
				setState(231);
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

	public static class ForAssigmentContext extends ParserRuleContext {
		public TerminalNode IntegerType() { return getToken(CSharpParser.IntegerType, 0); }
		public TerminalNode VarName() { return getToken(CSharpParser.VarName, 0); }
		public TerminalNode EqualMark() { return getToken(CSharpParser.EqualMark, 0); }
		public TerminalNode Integer() { return getToken(CSharpParser.Integer, 0); }
		public ForAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).enterForAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpListener ) ((CSharpListener)listener).exitForAssigment(this);
		}
	}

	public final ForAssigmentContext forAssigment() throws RecognitionException {
		ForAssigmentContext _localctx = new ForAssigmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forAssigment);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(IntegerType);
				setState(235);
				match(VarName);
				setState(236);
				match(EqualMark);
				setState(237);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(VarName);
				setState(239);
				match(EqualMark);
				setState(240);
				match(IntegerType);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(VarName);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6"+
		"\16\6T\13\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u008d\n\f\r\f\16\f\u008e\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\5\17\u0097\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00a4\n\21\f\21\16\21\u00a7\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bd\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00c6\n\24\7\24\u00c8\n\24\f\24\16\24\u00cb\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00eb\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00f5\n\26\3\26\2\3\6\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*\2\3\3\2\27\34\2\u0106\2-\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bE\3\2\2"+
		"\2\nG\3\2\2\2\f\\\3\2\2\2\16h\3\2\2\2\20p\3\2\2\2\22y\3\2\2\2\24\u0083"+
		"\3\2\2\2\26\u008c\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2\34\u0096\3"+
		"\2\2\2\36\u009a\3\2\2\2 \u009d\3\2\2\2\"\u00a8\3\2\2\2$\u00b4\3\2\2\2"+
		"&\u00bc\3\2\2\2(\u00ea\3\2\2\2*\u00f4\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\65\5\6\4\2\62\65\5(\25\2"+
		"\63\65\5\26\f\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2"+
		"\66\67\b\4\1\2\678\5\34\17\28=\3\2\2\29:\f\3\2\2:<\5\34\17\2;9\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2\2\2@A\5&\24\2AB\7\n\2"+
		"\2BC\5&\24\2CF\3\2\2\2DF\7\f\2\2E@\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7\r"+
		"\2\2HI\7\"\2\2IJ\5\b\5\2JK\7#\2\2KL\7\'\2\2LM\5\30\r\2MZ\7(\2\2NO\7\17"+
		"\2\2OQ\5\n\6\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2"+
		"\2\2UV\7\17\2\2VW\7\'\2\2WX\5\32\16\2XY\7(\2\2Y[\3\2\2\2ZR\3\2\2\2Z[\3"+
		"\2\2\2[\13\3\2\2\2\\]\7\21\2\2]^\7\"\2\2^_\5*\26\2_`\7!\2\2`a\5\b\5\2"+
		"ab\7!\2\2bc\5\24\13\2cd\7#\2\2de\7\'\2\2ef\5\4\3\2fg\7(\2\2g\r\3\2\2\2"+
		"hi\7\22\2\2ij\7\"\2\2jk\5\b\5\2kl\7#\2\2lm\7\'\2\2mn\5\4\3\2no\7(\2\2"+
		"o\17\3\2\2\2pq\7\23\2\2qr\7\'\2\2rs\5\4\3\2st\7(\2\2tu\7\22\2\2uv\7\""+
		"\2\2vw\5\b\5\2wx\7#\2\2x\21\3\2\2\2yz\7\35\2\2z{\7\36\2\2{|\5&\24\2|}"+
		"\7!\2\2}\23\3\2\2\2~\177\7\35\2\2\177\u0084\7*\2\2\u0080\u0081\7\35\2"+
		"\2\u0081\u0084\7)\2\2\u0082\u0084\5&\24\2\u0083~\3\2\2\2\u0083\u0080\3"+
		"\2\2\2\u0083\u0082\3\2\2\2\u0084\25\3\2\2\2\u0085\u008d\5\34\17\2\u0086"+
		"\u008d\5\n\6\2\u0087\u008d\5\16\b\2\u0088\u008d\5\20\t\2\u0089\u008d\5"+
		"\f\7\2\u008a\u008d\5(\25\2\u008b\u008d\5\22\n\2\u008c\u0085\3\2\2\2\u008c"+
		"\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\5\26\f"+
		"\2\u0091\31\3\2\2\2\u0092\u0093\5\26\f\2\u0093\33\3\2\2\2\u0094\u0097"+
		"\5\36\20\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\7!\2\2\u0099\35\3\2\2\2\u009a\u009b\5"+
		"$\23\2\u009b\u009c\7\35\2\2\u009c\37\3\2\2\2\u009d\u009e\5$\23\2\u009e"+
		"\u009f\7\35\2\2\u009f\u00a0\7$\2\2\u00a0\u00a5\7%\2\2\u00a1\u00a2\7$\2"+
		"\2\u00a2\u00a4\7%\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\35\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00b1\7%"+
		"\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0\7%\2\2\u00af\u00ac"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"#\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5%\3\2\2\2\u00b6"+
		"\u00bd\7\35\2\2\u00b7\u00bd\5\"\22\2\u00b8\u00bd\7\3\2\2\u00b9\u00bd\7"+
		"\4\2\2\u00ba\u00bd\7\5\2\2\u00bb\u00bd\7\6\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c9\3\2\2\2\u00be\u00c5\7\t\2\2\u00bf"+
		"\u00c6\7\35\2\2\u00c0\u00c6\5\"\22\2\u00c1\u00c6\7\3\2\2\u00c2\u00c6\7"+
		"\4\2\2\u00c3\u00c6\7\5\2\2\u00c4\u00c6\7\6\2\2\u00c5\u00bf\3\2\2\2\u00c5"+
		"\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00be\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\'\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf"+
		"\7\36\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00eb\7!\2\2\u00d1\u00d2\7\30\2\2"+
		"\u00d2\u00d3\7\35\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00eb"+
		"\7!\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\7\36\2\2"+
		"\u00d9\u00da\7\6\2\2\u00da\u00eb\7!\2\2\u00db\u00dc\7\32\2\2\u00dc\u00dd"+
		"\7\35\2\2\u00dd\u00de\7\36\2\2\u00de\u00df\7\f\2\2\u00df\u00eb\7!\2\2"+
		"\u00e0\u00e1\7\31\2\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\7\36\2\2\u00e3"+
		"\u00e4\7\5\2\2\u00e4\u00eb\7!\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\7\35"+
		"\2\2\u00e7\u00e8\7\36\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00eb\7!\2\2\u00ea"+
		"\u00cc\3\2\2\2\u00ea\u00d1\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00db\3\2"+
		"\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ed"+
		"\7\27\2\2\u00ed\u00ee\7\35\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f5\7\3\2"+
		"\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\7\36\2\2\u00f2\u00f5\7\27\2\2\u00f3"+
		"\u00f5\7\35\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5+\3\2\2\2\23/\64=ERZ\u0083\u008c\u008e\u0096\u00a5\u00b1\u00bc"+
		"\u00c5\u00c9\u00ea\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}