// Generated from C:/Users/Adrian/Desktop/Kompilatory/Projekt/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link CSharpListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CSharpBaseListener implements CSharpListener {
	private String translate;
	private long labelCounter=0;
	private Stack<Long> stackFalse = new Stack<>();
	private Stack<Long> stackTrue = new Stack<>();


	public String getNextLabel(boolean isTrueStack){
		labelCounter++;
		(isTrueStack? stackTrue:stackFalse).push(labelCounter);
		return String.valueOf(labelCounter);
	}

	public String getTranslate() {
		return translate;
	}

	public CSharpBaseListener( ) {
		this.translate = "";
	}

	public boolean isFalseInCondition(List<ParseTree> parseTree){
		for(ParseTree x:  parseTree){
			if(x.getClass() == (CSharpParser.StatementBlockFalseContext.class)) return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(CSharpParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(CSharpParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(CSharpParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(CSharpParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarationList(CSharpParser.DeclarationListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationList(CSharpParser.DeclarationListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogicalStatement(CSharpParser.LogicalStatementContext ctx) {
		if(!ctx.Boolean().toString().isEmpty())
		{
			translate +=  "br i1"+ctx.Boolean().toString()+", label %"+getNextLabel(true);
			if(isFalseInCondition(ctx.getParent().children)){
				translate+= ", label %"+getNextLabel(false);
			}
			translate+= "\n";
		}
		else
		{
			///
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogicalStatement(CSharpParser.LogicalStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(CSharpParser.IfStatementContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(CSharpParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstructionsBlock(CSharpParser.InstructionsBlockContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstructionsBlock(CSharpParser.InstructionsBlockContext ctx) { }

	@Override
	public void enterStatementBlockTrue(CSharpParser.StatementBlockTrueContext ctx) {
		translate+= stackTrue.pop()+":\n";
	}

	@Override
	public void exitStatementBlockTrue(CSharpParser.StatementBlockTrueContext ctx) {

	}

	@Override
	public void enterStatementBlockFalse(CSharpParser.StatementBlockFalseContext ctx) {
		translate+= stackFalse.pop()+":\n";
	}

	@Override
	public void exitStatementBlockFalse(CSharpParser.StatementBlockFalseContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaration(CSharpParser.DeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaration(CSharpParser.DeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDec(CSharpParser.VariableDecContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDec(CSharpParser.VariableDecContext ctx) {
		if(ctx.varType().IntegerType()!=null){
			translate+="@"+ctx.VarName().toString() + "=global i32 0 ";
		}
		if(ctx.varType().FloatType()!=null){
			translate+="@"+ctx.VarName().toString() + "=global float 0 ";
		}
		if(ctx.varType().CharType()!=null){
			translate+="@"+ctx.VarName().toString() + "=global i8 0 ";
		}
		if(ctx.varType().DoubleType()!=null){
			translate+="@"+ctx.VarName().toString() + "=double i8 0 ";
		}
		translate+=", align 8 \n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayDec(CSharpParser.ArrayDecContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayDec(CSharpParser.ArrayDecContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayVal(CSharpParser.ArrayValContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayVal(CSharpParser.ArrayValContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarType(CSharpParser.VarTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarType(CSharpParser.VarTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValue(CSharpParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValue(CSharpParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(CSharpParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(CSharpParser.AssignmentContext ctx) {
		if(ctx.IntegerType()!=null){
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global i32 "+ ctx.Integer().toString();
		}
		if(ctx.FloatType()!=null){
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global float "+ ctx.Float().toString();
		}
		if(ctx.CharType()!=null){

			int asci = (int)ctx.CharAss().toString().substring(1,2).toCharArray()[0];
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global i8 "+ asci;
		}
		if(ctx.DoubleType()!=null){
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global double "+ ctx.Float().toString();
		}
		translate+=", align 8 \n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}