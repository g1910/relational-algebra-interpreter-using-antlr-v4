// Generated from RelAlgebra.g4 by ANTLR 4.5
package interpreter;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RelAlgebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RelAlgebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RelAlgebraParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RelAlgebraParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelAlgebraParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(RelAlgebraParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelAlgebraParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(RelAlgebraParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelAlgebraParser#natural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatural(RelAlgebraParser.NaturalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelAlgebraParser#cartesian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesian(RelAlgebraParser.CartesianContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(RelAlgebraParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link RelAlgebraParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(RelAlgebraParser.NestedContext ctx);
}