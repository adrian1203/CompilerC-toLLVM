// Generated from E:/AGH/Projekty/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSharpParser}.
 */
public interface CSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSharpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CSharpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CSharpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSharpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSharpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CSharpParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CSharpParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStatement(CSharpParser.LogicalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStatement(CSharpParser.LogicalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CSharpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CSharpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#instructionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstructionsBlock(CSharpParser.InstructionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#instructionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstructionsBlock(CSharpParser.InstructionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statementBlockTrue}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlockTrue(CSharpParser.StatementBlockTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statementBlockTrue}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlockTrue(CSharpParser.StatementBlockTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#statementBlockFalse}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlockFalse(CSharpParser.StatementBlockFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#statementBlockFalse}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlockFalse(CSharpParser.StatementBlockFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSharpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSharpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(CSharpParser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(CSharpParser.VariableDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(CSharpParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(CSharpParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#arrayVal}.
	 * @param ctx the parse tree
	 */
	void enterArrayVal(CSharpParser.ArrayValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#arrayVal}.
	 * @param ctx the parse tree
	 */
	void exitArrayVal(CSharpParser.ArrayValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(CSharpParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(CSharpParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CSharpParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CSharpParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSharpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSharpParser.AssignmentContext ctx);
}