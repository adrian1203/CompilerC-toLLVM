// Generated from C:/Users/Adrian/Desktop/Kompilatory/Projekt/CompilerCSharpLLVM/src/main/antlr4\CSharp.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

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
	private Stack<Long> stackForAssigmentStart = new Stack<>();
	//private Stack<Long> stackForAssigmentEnd

	Queue<String> valueQueue = new LinkedList<String>();
	Queue<String> labelValueQueue =new LinkedList<String>();
	Map<String, String> mathOperators= new HashMap<>();


	public String getNextLabel(boolean isTrueStack){
		labelCounter++;
		(isTrueStack? stackTrue:stackFalse).push(labelCounter);
		return String.valueOf(labelCounter);
	}
	public String getNextLabel(){
		labelCounter++;
		return String.valueOf(labelCounter);
	}

	public String getTranslate() {
		return translate;
	}

	public CSharpBaseListener( ) {
		this.translate = "";
		this.mathOperators.put("+", "add");
		this.mathOperators.put("-", "sub");
		this.mathOperators.put("*","mul");
		this.mathOperators.put("/","sdiv");
	}

	public boolean isFalseInCondition(List<ParseTree> parseTree){
		for(ParseTree x:  parseTree){
			if(x.getClass() == (CSharpParser.StatementBlockFalseContext.class)) return true;
		}
		return false;
	}
	public boolean isForLogicalStatement(List<ParseTree> parseTree){
		for(ParseTree x:  parseTree){
			if(x.getClass() == (CSharpParser.ForAssigmentContext.class)) return true;
		}
		return false;
	}
	public boolean isWhileLogicalStatemnt(ParserRuleContext parserRuleContext){
		if(parserRuleContext.getClass() == (CSharpParser.WhileStatementContext.class)) return true;
		return false;
	}
	public boolean isDoWhileLogicalStatemnt(ParserRuleContext parserRuleContext){
		if(parserRuleContext.getClass() == (CSharpParser.DoWhileStatementContext.class)) return true;
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
		if(ctx.Boolean()!=null)
		{
			if(isDoWhileLogicalStatemnt(ctx.getParent())){
				translate +=  "br i1 "+ctx.Boolean().toString()+", label %"+stackForAssigmentStart.pop().toString();

			}else{
				translate +=  "br i1 "+ctx.Boolean().toString()+", label %"+getNextLabel(true);

			}
			if(isFalseInCondition(ctx.getParent().children)){
				translate+= ", label %"+getNextLabel(false);
			}else if(isForLogicalStatement(ctx.getParent().children)){
				translate+= ", label %"+getNextLabel(false);
			}else if(isWhileLogicalStatemnt(ctx.getParent())){
				translate+= ", label %"+getNextLabel(false)+"\n";
				translate+=stackTrue.pop().toString()+":";
			}else if(isDoWhileLogicalStatemnt(ctx.getParent())){
			translate+= ", label %"+getNextLabel(false);
		}
			translate+= "\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogicalStatement(CSharpParser.LogicalStatementContext ctx) {
		if(ctx.Boolean()==null)
		{
			while(!labelValueQueue.isEmpty()){
				translate+= labelValueQueue.poll()+"\n";
			}
			if(ctx.BooleanOperator().toString().equals("<")){
				translate+="%0 = icmp slt i32 %" ;
			}
			if(ctx.BooleanOperator().toString().equals("<=")){
				translate+="%0 = icmp sle i32 %" ;
			}
			if(ctx.BooleanOperator().toString().equals(">")){
				translate+="%0 = icmp sgt i32 %" ;
			}
			if(ctx.BooleanOperator().toString().equals(">=")){
				translate+="%0 = icmp sge i32 %" ;
			}
			if(ctx.BooleanOperator().toString().equals("==")){
				translate+="%0 = icmp eq i32 %" ;
			}
			if(ctx.BooleanOperator().toString().equals("!=")){
				translate+="%0 = icmp ne i32 %" ;
			}

			//kończenie ifa

			translate+=valueQueue.poll()+", %"+valueQueue.poll()+"\n";
			if(isDoWhileLogicalStatemnt(ctx.getParent())){
				translate+="br il %0, label %"+stackForAssigmentStart.pop().toString();

			}else{
				translate+="br il %0, label %"+getNextLabel(true);

			}
			//translate+="br il %0, label %"+getNextLabel(true);
			if(isFalseInCondition(ctx.getParent().children)){
				translate+= ", label %"+getNextLabel(false);
			}else if(isForLogicalStatement(ctx.getParent().children)){
				translate+= ", label %"+getNextLabel(false);
			}else if(isWhileLogicalStatemnt(ctx.getParent())){
				translate+= ", label %"+getNextLabel(false)+"\n";
				translate+=stackTrue.pop().toString()+":";
			}else if(isDoWhileLogicalStatemnt(ctx.getParent())){
				translate+= ", label %"+getNextLabel(false);
//			translate+=stackTrue.pop().toString()+":";
			}
			translate+= "\n";

		}
	}
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

	@Override
	public void enterForStatement(CSharpParser.ForStatementContext ctx) {

	}

	@Override
	public void exitForStatement(CSharpParser.ForStatementContext ctx) {
		translate+="br label %"+stackForAssigmentStart.pop().toString()+"\n";
		translate+=stackFalse.pop().toString()+": \n";

	}

	@Override
	public void enterWhileStatement(CSharpParser.WhileStatementContext ctx) {
		String label = getNextLabel();
		translate+=label+": \n";
		stackForAssigmentStart.push(Long.valueOf(label));
	}

	@Override
	public void exitWhileStatement(CSharpParser.WhileStatementContext ctx) {
		translate+="br label %"+stackForAssigmentStart.pop().toString()+"\n";
		translate+=stackFalse.pop().toString()+": \n";

	}

	@Override
	public void enterDoWhileStatement(CSharpParser.DoWhileStatementContext ctx) {
		String label = getNextLabel();
		translate+=label+": \n";
		stackForAssigmentStart.push(Long.valueOf(label));
	}

	@Override
	public void exitDoWhileStatement(CSharpParser.DoWhileStatementContext ctx) {
		translate+=stackFalse.pop().toString()+": \n";
	}

	@Override
	public void enterIncrementationStatment(CSharpParser.IncrementationStatmentContext ctx) {
		String label = getNextLabel();
		stackForAssigmentStart.push(Long.valueOf(label));
		translate+= label+":"+"\n";

		if(ctx.Decrementation()!=null){
			translate+="%"+ctx.VarName().toString()+" = sub i32 %"+ctx.VarName().toString()+", 1 \n";
		}
		if(ctx.Incrementation()!=null){
			translate+="%"+ctx.VarName().toString()+" = add i32 %"+ctx.VarName().toString()+", 1 \n";
		}

	}

	@Override
	public void exitIncrementationStatment(CSharpParser.IncrementationStatmentContext ctx) {

		String label = stackTrue.pop().toString();
		Long lastlabel = stackForAssigmentStart.pop();
		translate+="br label %"+stackForAssigmentStart.pop().toString()+"\n";
		stackForAssigmentStart.push(lastlabel);
		translate+=label+": \n";
	}

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
	@Override public void enterValue(CSharpParser.ValueContext ctx) {
		if(ctx.VarName(0)!=null && ctx.MathOperator(0)==null){
			valueQueue.add(ctx.VarName(0).toString());
		}
		else if(ctx.MathOperator().size()==1){
			String tmp="%";
			String labelName=getNextLabel();
			if(ctx.Float(0)!=null){
				if(ctx.Float(1)!=null){
					tmp+=labelName+" = f"+mathOperators.get(ctx.MathOperator(0).toString())+" float "+ctx.Float(0).toString()+", "+ctx.Float(1);
				}
				else if(ctx.VarName(0)!=null){
					tmp+=labelName+" = f"+mathOperators.get(ctx.MathOperator(0).toString())+" float %"+ctx.VarName(0).toString()+", "+ctx.Float(0);
				}else{
					tmp+=labelName+" = f"+mathOperators.get(ctx.MathOperator(0).toString())+" float "+ctx.Integer(0).toString()+", "+ctx.Float(0);
				}
			}else if(ctx.Integer(0)!=null){
				if(ctx.Integer(1)!=null){
					tmp+=labelName+" = "+mathOperators.get(ctx.MathOperator(0).toString())+" i32 "+ctx.Integer(0).toString()+", "+ctx.Integer(1);
				}else {
					tmp+=labelName+" = "+mathOperators.get(ctx.MathOperator(0).toString())+" i32 "+ctx.Integer(0).toString()+", %"+ctx.VarName(0);
				}
			}else {
				tmp+=labelName+" = "+mathOperators.get(ctx.MathOperator(0).toString())+" i32 %"+ctx.VarName(0).toString()+", %"+ctx.VarName(1);

			}
			valueQueue.add(labelName);
			labelValueQueue.add(tmp);
		}else{
			int floatCounter=0;
			int integerCounter=0;
			int varCounter=0;
			int forCounter=0;
			if(ctx.Float(0)!=null){
				for(TerminalNode terminalNode : ctx.MathOperator()){
					String tmp="%";
					String labelName=getNextLabel();
					if(forCounter==0){
						if(ctx.Float(1)!=null){
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float "+ctx.Float(0).toString()+", "+ctx.Float(1);
							floatCounter=2;
						}else if(ctx.Integer(0)!=null){
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float "+ctx.Integer(0).toString()+", "+ctx.Float(0);
							floatCounter=1;
							integerCounter=1;
						}else{
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float %"+ctx.VarName(0).toString()+", "+ctx.Float(0);
							floatCounter=1;
							varCounter=1;
						}
					}
					else {
						if(ctx.Float(floatCounter)!=null){
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float "+ctx.Float(floatCounter).toString()+", %"+valueQueue.poll();
							floatCounter++;
						}else if(ctx.Integer(integerCounter)!=null){
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float "+ctx.Integer(integerCounter).toString()+", %"+valueQueue.poll();
							integerCounter++;
						}else{
							tmp+=labelName+" = f"+mathOperators.get(terminalNode.toString())+" float "+ctx.VarName(varCounter).toString()+", %"+valueQueue.poll();
							varCounter++;
						}
					}
					valueQueue.add(labelName);
					labelValueQueue.add(tmp);
					forCounter++;
				}
			}else{
				for(TerminalNode terminalNode : ctx.MathOperator()){
					String tmp="%";
					String labelName=getNextLabel();
					if(forCounter==0){
						if(ctx.Integer(0)!=null){
							if(ctx.Integer(1)!=null){
								tmp+=labelName+" = "+mathOperators.get(terminalNode.toString())+" i32 "+ctx.Integer(0).toString()+", "+ctx.Integer(1);
								integerCounter=2;
							}else {
								tmp+=labelName+" = "+mathOperators.get(terminalNode.toString())+" i32 "+ctx.Integer(0).toString()+", %"+ctx.VarName(0);
								varCounter=1;
								integerCounter=1;
							}
						}else {
							tmp+=labelName+" = "+mathOperators.get(terminalNode.toString())+" i32 %"+ctx.VarName(0).toString()+", %"+ctx.VarName(1);
							varCounter=2;
						}
					}
					else {
						if(ctx.Integer(integerCounter)!=null){
							tmp+=labelName+" = "+mathOperators.get(ctx.MathOperator(0).toString())+" i32 "+ctx.Integer(integerCounter).toString()+", %"+valueQueue.poll();
							integerCounter++;
						}else{
							tmp+=labelName+" = "+mathOperators.get(ctx.MathOperator(0).toString())+" i32 "+ctx.VarName(varCounter).toString()+", %"+valueQueue.poll();
							varCounter++;
						}
					}
					valueQueue.add(labelName);
					labelValueQueue.add(tmp);
					forCounter++;
				}
			}
		}
		//ToDo zrobione przykłady dla float nteger i zmiennych chyba wystarczy
	}
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

	@Override
	public void enterForAssigment(CSharpParser.ForAssigmentContext ctx) {
		if(ctx.IntegerType()!=null){
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global i32 "+ ctx.Integer().toString();
		}else if (ctx.EqualMark()!=null){
			translate+="@"+ctx.VarName().toString() + ctx.EqualMark().toString() + "global i32 "+ ctx.Integer().toString();
		}
		String label = getNextLabel();
		stackForAssigmentStart.push(Long.valueOf(label));
		translate+= label+":"+"\n";
	}

	@Override
	public void exitForAssigment(CSharpParser.ForAssigmentContext ctx) {
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