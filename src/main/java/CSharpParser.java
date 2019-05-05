// Generated from E:/AGH/Projekty/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2
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
		RULE_ifStatement = 4, RULE_instructionsBlock = 5, RULE_statementBlockTrue = 6, 
		RULE_statementBlockFalse = 7, RULE_declaration = 8, RULE_variableDec = 9, 
		RULE_arrayDec = 10, RULE_arrayVal = 11, RULE_varType = 12, RULE_value = 13, 
		RULE_assignment = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationList", "logicalStatement", "ifStatement", 
			"instructionsBlock", "statementBlockTrue", "statementBlockFalse", "declaration", 
			"variableDec", "arrayDec", "arrayVal", "varType", "value", "assignment"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
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
			setState(41);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
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
					setState(43);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(44);
					declaration();
					}
					} 
				}
				setState(49);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case CharAss:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				value();
				setState(51);
				match(BooleanOperator);
				setState(52);
				value();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
			setState(57);
			match(If);
			setState(58);
			match(OpenBracket);
			setState(59);
			logicalStatement();
			setState(60);
			match(CloseBracket);
			setState(61);
			match(CurlyOpenBracket);
			setState(62);
			statementBlockTrue();
			setState(63);
			match(CurlyCloseBracket);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(64);
						match(Else);
						setState(65);
						ifStatement();
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(71);
				match(Else);
				setState(72);
				match(CurlyOpenBracket);
				setState(73);
				statementBlockFalse();
				setState(74);
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
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(78);
						declaration();
						}
						break;
					case 2:
						{
						setState(79);
						ifStatement();
						}
						break;
					case 3:
						{
						setState(80);
						assignment();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
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
		enterRule(_localctx, 12, RULE_statementBlockTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 14, RULE_statementBlockFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(89);
				variableDec();
				}
				break;
			case 2:
				{
				setState(90);
				arrayDec();
				}
				break;
			}
			setState(93);
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
		enterRule(_localctx, 18, RULE_variableDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			varType();
			setState(96);
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
		enterRule(_localctx, 20, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			varType();
			setState(99);
			match(VarName);
			setState(100);
			match(SquareOpenBracket);
			setState(101);
			match(SquareCloseBracket);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(102);
				match(SquareOpenBracket);
				setState(103);
				match(SquareCloseBracket);
				}
				}
				setState(108);
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
		enterRule(_localctx, 22, RULE_arrayVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(VarName);
			setState(110);
			match(SquareOpenBracket);
			setState(111);
			match(Integer);
			setState(112);
			match(SquareCloseBracket);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(113);
				match(SquareOpenBracket);
				setState(114);
				match(Integer);
				setState(115);
				match(SquareCloseBracket);
				}
				}
				setState(120);
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
		enterRule(_localctx, 24, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				match(VarName);
				}
				break;
			case 2:
				{
				setState(124);
				arrayVal();
				}
				break;
			case 3:
				{
				setState(125);
				match(Integer);
				}
				break;
			case 4:
				{
				setState(126);
				match(Float);
				}
				break;
			case 5:
				{
				setState(127);
				match(String);
				}
				break;
			case 6:
				{
				setState(128);
				match(CharAss);
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MathOperator) {
				{
				{
				setState(131);
				match(MathOperator);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(132);
					match(VarName);
					}
					break;
				case 2:
					{
					setState(133);
					arrayVal();
					}
					break;
				case 3:
					{
					setState(134);
					match(Integer);
					}
					break;
				case 4:
					{
					setState(135);
					match(Float);
					}
					break;
				case 5:
					{
					setState(136);
					match(String);
					}
					break;
				case 6:
					{
					setState(137);
					match(CharAss);
					}
					break;
				}
				}
				}
				setState(144);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IntegerType);
				setState(146);
				match(VarName);
				setState(147);
				match(EqualMark);
				setState(148);
				match(Integer);
				setState(149);
				match(Semicolon);
				}
				break;
			case FloatType:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FloatType);
				setState(151);
				match(VarName);
				setState(152);
				match(EqualMark);
				setState(153);
				match(Float);
				setState(154);
				match(Semicolon);
				}
				break;
			case CharType:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(CharType);
				setState(156);
				match(VarName);
				setState(157);
				match(EqualMark);
				setState(158);
				match(CharAss);
				setState(159);
				match(Semicolon);
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(BooleanType);
				setState(161);
				match(VarName);
				setState(162);
				match(EqualMark);
				setState(163);
				match(Boolean);
				setState(164);
				match(Semicolon);
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(StringType);
				setState(166);
				match(VarName);
				setState(167);
				match(EqualMark);
				setState(168);
				match(String);
				setState(169);
				match(Semicolon);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(DoubleType);
				setState(171);
				match(VarName);
				setState(172);
				match(EqualMark);
				setState(173);
				match(Float);
				setState(174);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\6\7T\n"+
		"\7\r\7\16\7U\3\b\3\b\3\t\3\t\3\n\3\n\5\n^\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0084\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008d\n\17\7\17"+
		"\u008f\n\17\f\17\16\17\u0092\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\2\3"+
		"\6\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\21\26\2\u00c1\2!"+
		"\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\fS\3\2\2\2\16W\3"+
		"\2\2\2\20Y\3\2\2\2\22]\3\2\2\2\24a\3\2\2\2\26d\3\2\2\2\30o\3\2\2\2\32"+
		"{\3\2\2\2\34\u0083\3\2\2\2\36\u00b1\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%)\5\6\4\2&)\5\36\20\2\')\5\f\7\2"+
		"(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\b\4\1\2+,\5\22\n\2,\61\3"+
		"\2\2\2-.\f\3\2\2.\60\5\22\n\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\7\3\2\2\2\63\61\3\2\2\2\64\65\5\34\17\2\65\66\7\n\2\2\66\67"+
		"\5\34\17\2\67:\3\2\2\28:\7\f\2\29\64\3\2\2\298\3\2\2\2:\t\3\2\2\2;<\7"+
		"\r\2\2<=\7\34\2\2=>\5\b\5\2>?\7\35\2\2?@\7!\2\2@A\5\16\b\2AN\7\"\2\2B"+
		"C\7\17\2\2CE\5\n\6\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2"+
		"HF\3\2\2\2IJ\7\17\2\2JK\7!\2\2KL\5\20\t\2LM\7\"\2\2MO\3\2\2\2NF\3\2\2"+
		"\2NO\3\2\2\2O\13\3\2\2\2PT\5\22\n\2QT\5\n\6\2RT\5\36\20\2SP\3\2\2\2SQ"+
		"\3\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WX\5\f\7\2"+
		"X\17\3\2\2\2YZ\5\f\7\2Z\21\3\2\2\2[^\5\24\13\2\\^\5\26\f\2][\3\2\2\2]"+
		"\\\3\2\2\2^_\3\2\2\2_`\7\33\2\2`\23\3\2\2\2ab\5\32\16\2bc\7\27\2\2c\25"+
		"\3\2\2\2de\5\32\16\2ef\7\27\2\2fg\7\36\2\2gl\7\37\2\2hi\7\36\2\2ik\7\37"+
		"\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\27\3\2\2\2nl\3\2\2\2op\7"+
		"\27\2\2pq\7\36\2\2qr\7\3\2\2rx\7\37\2\2st\7\36\2\2tu\7\3\2\2uw\7\37\2"+
		"\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\31\3\2\2\2zx\3\2\2\2{|\t\2"+
		"\2\2|\33\3\2\2\2}\u0084\7\27\2\2~\u0084\5\30\r\2\177\u0084\7\3\2\2\u0080"+
		"\u0084\7\4\2\2\u0081\u0084\7\5\2\2\u0082\u0084\7\6\2\2\u0083}\3\2\2\2"+
		"\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0082\3\2\2\2\u0084\u0090\3\2\2\2\u0085\u008c\7\t\2\2\u0086"+
		"\u008d\7\27\2\2\u0087\u008d\5\30\r\2\u0088\u008d\7\3\2\2\u0089\u008d\7"+
		"\4\2\2\u008a\u008d\7\5\2\2\u008b\u008d\7\6\2\2\u008c\u0086\3\2\2\2\u008c"+
		"\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0085\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\35\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0094\7\21\2\2\u0094\u0095\7\27\2\2\u0095"+
		"\u0096\7\30\2\2\u0096\u0097\7\3\2\2\u0097\u00b2\7\33\2\2\u0098\u0099\7"+
		"\22\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7\30\2\2\u009b\u009c\7\4\2\2"+
		"\u009c\u00b2\7\33\2\2\u009d\u009e\7\25\2\2\u009e\u009f\7\27\2\2\u009f"+
		"\u00a0\7\30\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00b2\7\33\2\2\u00a2\u00a3\7"+
		"\24\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\7\f\2\2"+
		"\u00a6\u00b2\7\33\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\7\27\2\2\u00a9"+
		"\u00aa\7\30\2\2\u00aa\u00ab\7\5\2\2\u00ab\u00b2\7\33\2\2\u00ac\u00ad\7"+
		"\26\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\7\4\2\2"+
		"\u00b0\u00b2\7\33\2\2\u00b1\u0093\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1\u009d"+
		"\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2"+
		"\37\3\2\2\2\21#(\619FNSU]lx\u0083\u008c\u0090\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}