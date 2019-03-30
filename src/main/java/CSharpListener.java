// Generated from C:/Users/Adrian/Desktop/Kompilatory/Projekt/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link CSharpParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CSharpParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CSharpParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(CSharpParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(CSharpParser.ProcedureContext ctx);
}