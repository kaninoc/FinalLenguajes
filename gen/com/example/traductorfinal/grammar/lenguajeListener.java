// Generated from C:/Users/Albert/Documents/lenguajes/Final/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\lenguaje.g4 by ANTLR 4.9.1
package com.example.traductorfinal.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lenguajeParser}.
 */
public interface lenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#raiz}.
	 * @param ctx the parse tree
	 */
	void enterRaiz(lenguajeParser.RaizContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#raiz}.
	 * @param ctx the parse tree
	 */
	void exitRaiz(lenguajeParser.RaizContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#f_principal}.
	 * @param ctx the parse tree
	 */
	void enterF_principal(lenguajeParser.F_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#f_principal}.
	 * @param ctx the parse tree
	 */
	void exitF_principal(lenguajeParser.F_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(lenguajeParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(lenguajeParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(lenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(lenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varBooleano}.
	 * @param ctx the parse tree
	 */
	void enterVarBooleano(lenguajeParser.VarBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varBooleano}.
	 * @param ctx the parse tree
	 */
	void exitVarBooleano(lenguajeParser.VarBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarB}.
	 * @param ctx the parse tree
	 */
	void enterExtvarB(lenguajeParser.ExtvarBContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarB}.
	 * @param ctx the parse tree
	 */
	void exitExtvarB(lenguajeParser.ExtvarBContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varEntero}.
	 * @param ctx the parse tree
	 */
	void enterVarEntero(lenguajeParser.VarEnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varEntero}.
	 * @param ctx the parse tree
	 */
	void exitVarEntero(lenguajeParser.VarEnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarE}.
	 * @param ctx the parse tree
	 */
	void enterExtvarE(lenguajeParser.ExtvarEContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarE}.
	 * @param ctx the parse tree
	 */
	void exitExtvarE(lenguajeParser.ExtvarEContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varReal}.
	 * @param ctx the parse tree
	 */
	void enterVarReal(lenguajeParser.VarRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varReal}.
	 * @param ctx the parse tree
	 */
	void exitVarReal(lenguajeParser.VarRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarR}.
	 * @param ctx the parse tree
	 */
	void enterExtvarR(lenguajeParser.ExtvarRContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarR}.
	 * @param ctx the parse tree
	 */
	void exitExtvarR(lenguajeParser.ExtvarRContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varCaracter}.
	 * @param ctx the parse tree
	 */
	void enterVarCaracter(lenguajeParser.VarCaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varCaracter}.
	 * @param ctx the parse tree
	 */
	void exitVarCaracter(lenguajeParser.VarCaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarC}.
	 * @param ctx the parse tree
	 */
	void enterExtvarC(lenguajeParser.ExtvarCContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarC}.
	 * @param ctx the parse tree
	 */
	void exitExtvarC(lenguajeParser.ExtvarCContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varCadena}.
	 * @param ctx the parse tree
	 */
	void enterVarCadena(lenguajeParser.VarCadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varCadena}.
	 * @param ctx the parse tree
	 */
	void exitVarCadena(lenguajeParser.VarCadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarS}.
	 * @param ctx the parse tree
	 */
	void enterExtvarS(lenguajeParser.ExtvarSContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarS}.
	 * @param ctx the parse tree
	 */
	void exitExtvarS(lenguajeParser.ExtvarSContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varEstructura}.
	 * @param ctx the parse tree
	 */
	void enterVarEstructura(lenguajeParser.VarEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varEstructura}.
	 * @param ctx the parse tree
	 */
	void exitVarEstructura(lenguajeParser.VarEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#extvarEstructura}.
	 * @param ctx the parse tree
	 */
	void enterExtvarEstructura(lenguajeParser.ExtvarEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#extvarEstructura}.
	 * @param ctx the parse tree
	 */
	void exitExtvarEstructura(lenguajeParser.ExtvarEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varAsigEstructura}.
	 * @param ctx the parse tree
	 */
	void enterVarAsigEstructura(lenguajeParser.VarAsigEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varAsigEstructura}.
	 * @param ctx the parse tree
	 */
	void exitVarAsigEstructura(lenguajeParser.VarAsigEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varDeclarada}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarada(lenguajeParser.VarDeclaradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varDeclarada}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarada(lenguajeParser.VarDeclaradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#asigfuncion}.
	 * @param ctx the parse tree
	 */
	void enterAsigfuncion(lenguajeParser.AsigfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#asigfuncion}.
	 * @param ctx the parse tree
	 */
	void exitAsigfuncion(lenguajeParser.AsigfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(lenguajeParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(lenguajeParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(lenguajeParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(lenguajeParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(lenguajeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(lenguajeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(lenguajeParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(lenguajeParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void enterTipovar(lenguajeParser.TipovarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void exitTipovar(lenguajeParser.TipovarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(lenguajeParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(lenguajeParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(lenguajeParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(lenguajeParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(lenguajeParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(lenguajeParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#repeticionimpresion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticionimpresion(lenguajeParser.RepeticionimpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#repeticionimpresion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticionimpresion(lenguajeParser.RepeticionimpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void enterVarimpresion(lenguajeParser.VarimpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varimpresion}.
	 * @param ctx the parse tree
	 */
	void exitVarimpresion(lenguajeParser.VarimpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(lenguajeParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(lenguajeParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#cuerpoif}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoif(lenguajeParser.CuerpoifContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#cuerpoif}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoif(lenguajeParser.CuerpoifContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(lenguajeParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(lenguajeParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#operacionlogica}.
	 * @param ctx the parse tree
	 */
	void enterOperacionlogica(lenguajeParser.OperacionlogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#operacionlogica}.
	 * @param ctx the parse tree
	 */
	void exitOperacionlogica(lenguajeParser.OperacionlogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorlogico(lenguajeParser.OperadorlogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorlogico(lenguajeParser.OperadorlogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(lenguajeParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(lenguajeParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#ciclomientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclomientras(lenguajeParser.CiclomientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#ciclomientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclomientras(lenguajeParser.CiclomientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#cuerpociclomientras}.
	 * @param ctx the parse tree
	 */
	void enterCuerpociclomientras(lenguajeParser.CuerpociclomientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#cuerpociclomientras}.
	 * @param ctx the parse tree
	 */
	void exitCuerpociclomientras(lenguajeParser.CuerpociclomientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#ciclohacer}.
	 * @param ctx the parse tree
	 */
	void enterCiclohacer(lenguajeParser.CiclohacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#ciclohacer}.
	 * @param ctx the parse tree
	 */
	void exitCiclohacer(lenguajeParser.CiclohacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#cuerpociclohacer}.
	 * @param ctx the parse tree
	 */
	void enterCuerpociclohacer(lenguajeParser.CuerpociclohacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#cuerpociclohacer}.
	 * @param ctx the parse tree
	 */
	void exitCuerpociclohacer(lenguajeParser.CuerpociclohacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#ciclopara}.
	 * @param ctx the parse tree
	 */
	void enterCiclopara(lenguajeParser.CicloparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#ciclopara}.
	 * @param ctx the parse tree
	 */
	void exitCiclopara(lenguajeParser.CicloparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#contenidopara}.
	 * @param ctx the parse tree
	 */
	void enterContenidopara(lenguajeParser.ContenidoparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#contenidopara}.
	 * @param ctx the parse tree
	 */
	void exitContenidopara(lenguajeParser.ContenidoparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#contparaopt}.
	 * @param ctx the parse tree
	 */
	void enterContparaopt(lenguajeParser.ContparaoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#contparaopt}.
	 * @param ctx the parse tree
	 */
	void exitContparaopt(lenguajeParser.ContparaoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#contparaoptfinal}.
	 * @param ctx the parse tree
	 */
	void enterContparaoptfinal(lenguajeParser.ContparaoptfinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#contparaoptfinal}.
	 * @param ctx the parse tree
	 */
	void exitContparaoptfinal(lenguajeParser.ContparaoptfinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#elementospara}.
	 * @param ctx the parse tree
	 */
	void enterElementospara(lenguajeParser.ElementosparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#elementospara}.
	 * @param ctx the parse tree
	 */
	void exitElementospara(lenguajeParser.ElementosparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#complementopara}.
	 * @param ctx the parse tree
	 */
	void enterComplementopara(lenguajeParser.ComplementoparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#complementopara}.
	 * @param ctx the parse tree
	 */
	void exitComplementopara(lenguajeParser.ComplementoparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#elementosparados}.
	 * @param ctx the parse tree
	 */
	void enterElementosparados(lenguajeParser.ElementosparadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#elementosparados}.
	 * @param ctx the parse tree
	 */
	void exitElementosparados(lenguajeParser.ElementosparadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#comparadorpara}.
	 * @param ctx the parse tree
	 */
	void enterComparadorpara(lenguajeParser.ComparadorparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#comparadorpara}.
	 * @param ctx the parse tree
	 */
	void exitComparadorpara(lenguajeParser.ComparadorparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#segundocomparador}.
	 * @param ctx the parse tree
	 */
	void enterSegundocomparador(lenguajeParser.SegundocomparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#segundocomparador}.
	 * @param ctx the parse tree
	 */
	void exitSegundocomparador(lenguajeParser.SegundocomparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#segcomfinal}.
	 * @param ctx the parse tree
	 */
	void enterSegcomfinal(lenguajeParser.SegcomfinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#segcomfinal}.
	 * @param ctx the parse tree
	 */
	void exitSegcomfinal(lenguajeParser.SegcomfinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#varcomparable}.
	 * @param ctx the parse tree
	 */
	void enterVarcomparable(lenguajeParser.VarcomparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#varcomparable}.
	 * @param ctx the parse tree
	 */
	void exitVarcomparable(lenguajeParser.VarcomparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#credec}.
	 * @param ctx the parse tree
	 */
	void enterCredec(lenguajeParser.CredecContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#credec}.
	 * @param ctx the parse tree
	 */
	void exitCredec(lenguajeParser.CredecContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(lenguajeParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(lenguajeParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(lenguajeParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(lenguajeParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#multiplescasos}.
	 * @param ctx the parse tree
	 */
	void enterMultiplescasos(lenguajeParser.MultiplescasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#multiplescasos}.
	 * @param ctx the parse tree
	 */
	void exitMultiplescasos(lenguajeParser.MultiplescasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#defecto}.
	 * @param ctx the parse tree
	 */
	void enterDefecto(lenguajeParser.DefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#defecto}.
	 * @param ctx the parse tree
	 */
	void exitDefecto(lenguajeParser.DefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuras(lenguajeParser.EstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuras(lenguajeParser.EstructurasContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDecfuncion(lenguajeParser.DecfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDecfuncion(lenguajeParser.DecfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#cierredecfuncion}.
	 * @param ctx the parse tree
	 */
	void enterCierredecfuncion(lenguajeParser.CierredecfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#cierredecfuncion}.
	 * @param ctx the parse tree
	 */
	void exitCierredecfuncion(lenguajeParser.CierredecfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#cuerpodecfuncion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpodecfuncion(lenguajeParser.CuerpodecfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#cuerpodecfuncion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpodecfuncion(lenguajeParser.CuerpodecfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(lenguajeParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(lenguajeParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(lenguajeParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(lenguajeParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#complementoparametros}.
	 * @param ctx the parse tree
	 */
	void enterComplementoparametros(lenguajeParser.ComplementoparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#complementoparametros}.
	 * @param ctx the parse tree
	 */
	void exitComplementoparametros(lenguajeParser.ComplementoparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#masparametros}.
	 * @param ctx the parse tree
	 */
	void enterMasparametros(lenguajeParser.MasparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#masparametros}.
	 * @param ctx the parse tree
	 */
	void exitMasparametros(lenguajeParser.MasparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#nextid}.
	 * @param ctx the parse tree
	 */
	void enterNextid(lenguajeParser.NextidContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#nextid}.
	 * @param ctx the parse tree
	 */
	void exitNextid(lenguajeParser.NextidContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipofuncion(lenguajeParser.TipofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipofuncion(lenguajeParser.TipofuncionContext ctx);
}