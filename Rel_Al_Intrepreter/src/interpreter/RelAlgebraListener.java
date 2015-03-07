// Generated from RelAlgebra.g4 by ANTLR 4.5
package interpreter;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelAlgebraParser}.
 */
public interface RelAlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RelAlgebraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RelAlgebraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelAlgebraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RelAlgebraParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelAlgebraParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(RelAlgebraParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelAlgebraParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(RelAlgebraParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelAlgebraParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(RelAlgebraParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelAlgebraParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(RelAlgebraParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelAlgebraParser#natural}.
	 * @param ctx the parse tree
	 */
	void enterNatural(RelAlgebraParser.NaturalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelAlgebraParser#natural}.
	 * @param ctx the parse tree
	 */
	void exitNatural(RelAlgebraParser.NaturalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelAlgebraParser#cartesian}.
	 * @param ctx the parse tree
	 */
	void enterCartesian(RelAlgebraParser.CartesianContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelAlgebraParser#cartesian}.
	 * @param ctx the parse tree
	 */
	void exitCartesian(RelAlgebraParser.CartesianContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterSimple(RelAlgebraParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitSimple(RelAlgebraParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterNested(RelAlgebraParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitNested(RelAlgebraParser.NestedContext ctx);
}