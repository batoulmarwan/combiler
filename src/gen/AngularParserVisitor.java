// Generated from C:/Users/DELL/Desktop/compilernew/compiler/src/AngularParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngularParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_body(AngularParser.Component_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#template_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_body(AngularParser.Template_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#div_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_body(AngularParser.Div_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AngularParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles_body(AngularParser.Styles_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#appComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppComponent(AngularParser.AppComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#appComponent_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppComponent_body(AngularParser.AppComponent_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts(AngularParser.ProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#productElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductElement(AngularParser.ProductElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#element_Array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_Array(AngularParser.Element_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#element_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_body(AngularParser.Element_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick(AngularParser.ClickContext ctx);
}