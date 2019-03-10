// Generated from Object.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjectParser}.
 */
public interface ObjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjectParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ObjectParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ObjectParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(ObjectParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(ObjectParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(ObjectParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(ObjectParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ObjectParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ObjectParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(ObjectParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(ObjectParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#flags}.
	 * @param ctx the parse tree
	 */
	void enterFlags(ObjectParser.FlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#flags}.
	 * @param ctx the parse tree
	 */
	void exitFlags(ObjectParser.FlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#flag}.
	 * @param ctx the parse tree
	 */
	void enterFlag(ObjectParser.FlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#flag}.
	 * @param ctx the parse tree
	 */
	void exitFlag(ObjectParser.FlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ObjectParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ObjectParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ObjectParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ObjectParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(ObjectParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(ObjectParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ObjectParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ObjectParser.AttributeValueContext ctx);
}