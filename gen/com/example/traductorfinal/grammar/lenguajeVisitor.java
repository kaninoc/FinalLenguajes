// Generated from C:/Users/Albert/Documents/lenguajes/Final/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\lenguaje.g4 by ANTLR 4.9.1
package com.example.traductorfinal.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#raiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(lenguajeParser.RaizContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#f_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_principal(lenguajeParser.F_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(lenguajeParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(lenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varBooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBooleano(lenguajeParser.VarBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarB(lenguajeParser.ExtvarBContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varEntero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEntero(lenguajeParser.VarEnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarE(lenguajeParser.ExtvarEContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReal(lenguajeParser.VarRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarR(lenguajeParser.ExtvarRContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varCaracter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCaracter(lenguajeParser.VarCaracterContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarC(lenguajeParser.ExtvarCContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varCadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCadena(lenguajeParser.VarCadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarS(lenguajeParser.ExtvarSContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEstructura(lenguajeParser.VarEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#extvarEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtvarEstructura(lenguajeParser.ExtvarEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varAsigEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAsigEstructura(lenguajeParser.VarAsigEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varDeclarada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarada(lenguajeParser.VarDeclaradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#asigfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigfuncion(lenguajeParser.AsigfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#repeticion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticion(lenguajeParser.RepeticionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(lenguajeParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(lenguajeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(lenguajeParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#tipovar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipovar(lenguajeParser.TipovarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(lenguajeParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(lenguajeParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(lenguajeParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#repeticionimpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticionimpresion(lenguajeParser.RepeticionimpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varimpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarimpresion(lenguajeParser.VarimpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(lenguajeParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#cuerpoif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoif(lenguajeParser.CuerpoifContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(lenguajeParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#operacionlogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionlogica(lenguajeParser.OperacionlogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#operadorlogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorlogico(lenguajeParser.OperadorlogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador(lenguajeParser.ComparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#ciclomientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclomientras(lenguajeParser.CiclomientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#cuerpociclomientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpociclomientras(lenguajeParser.CuerpociclomientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#ciclohacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclohacer(lenguajeParser.CiclohacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#cuerpociclohacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpociclohacer(lenguajeParser.CuerpociclohacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#ciclopara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclopara(lenguajeParser.CicloparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#contenidopara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidopara(lenguajeParser.ContenidoparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#contparaopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContparaopt(lenguajeParser.ContparaoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#contparaoptfinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContparaoptfinal(lenguajeParser.ContparaoptfinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#elementospara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementospara(lenguajeParser.ElementosparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#complementopara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementopara(lenguajeParser.ComplementoparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#elementosparados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementosparados(lenguajeParser.ElementosparadosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#comparadorpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadorpara(lenguajeParser.ComparadorparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#segundocomparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegundocomparador(lenguajeParser.SegundocomparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#segcomfinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegcomfinal(lenguajeParser.SegcomfinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#varcomparable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcomparable(lenguajeParser.VarcomparableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#credec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCredec(lenguajeParser.CredecContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(lenguajeParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(lenguajeParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#multiplescasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplescasos(lenguajeParser.MultiplescasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefecto(lenguajeParser.DefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#estructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuras(lenguajeParser.EstructurasContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#decfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfuncion(lenguajeParser.DecfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#cierredecfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCierredecfuncion(lenguajeParser.CierredecfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#cuerpodecfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpodecfuncion(lenguajeParser.CuerpodecfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(lenguajeParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(lenguajeParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#complementoparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementoparametros(lenguajeParser.ComplementoparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#masparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasparametros(lenguajeParser.MasparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#nextid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextid(lenguajeParser.NextidContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenguajeParser#tipofuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipofuncion(lenguajeParser.TipofuncionContext ctx);
}