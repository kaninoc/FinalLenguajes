// Generated from C:/Users/moise/Desktop/X/Lenguajes/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\b2b.g4 by ANTLR 4.9.1
package com.example.traductorfinal.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link b2bParser}.
 */
public interface b2bListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link b2bParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(b2bParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(b2bParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(b2bParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(b2bParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#gramar_excecution}.
	 * @param ctx the parse tree
	 */
	void enterGramar_excecution(b2bParser.Gramar_excecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#gramar_excecution}.
	 * @param ctx the parse tree
	 */
	void exitGramar_excecution(b2bParser.Gramar_excecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#bash}.
	 * @param ctx the parse tree
	 */
	void enterBash(b2bParser.BashContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#bash}.
	 * @param ctx the parse tree
	 */
	void exitBash(b2bParser.BashContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#echo}.
	 * @param ctx the parse tree
	 */
	void enterEcho(b2bParser.EchoContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#echo}.
	 * @param ctx the parse tree
	 */
	void exitEcho(b2bParser.EchoContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(b2bParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(b2bParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#sleep}.
	 * @param ctx the parse tree
	 */
	void enterSleep(b2bParser.SleepContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#sleep}.
	 * @param ctx the parse tree
	 */
	void exitSleep(b2bParser.SleepContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#cat}.
	 * @param ctx the parse tree
	 */
	void enterCat(b2bParser.CatContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#cat}.
	 * @param ctx the parse tree
	 */
	void exitCat(b2bParser.CatContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#cd}.
	 * @param ctx the parse tree
	 */
	void enterCd(b2bParser.CdContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#cd}.
	 * @param ctx the parse tree
	 */
	void exitCd(b2bParser.CdContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(b2bParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(b2bParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#comment_lines}.
	 * @param ctx the parse tree
	 */
	void enterComment_lines(b2bParser.Comment_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#comment_lines}.
	 * @param ctx the parse tree
	 */
	void exitComment_lines(b2bParser.Comment_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#variables_expressions}.
	 * @param ctx the parse tree
	 */
	void enterVariables_expressions(b2bParser.Variables_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#variables_expressions}.
	 * @param ctx the parse tree
	 */
	void exitVariables_expressions(b2bParser.Variables_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(b2bParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(b2bParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(b2bParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(b2bParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#nill}.
	 * @param ctx the parse tree
	 */
	void enterNill(b2bParser.NillContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#nill}.
	 * @param ctx the parse tree
	 */
	void exitNill(b2bParser.NillContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#arithmetic_logic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_logic(b2bParser.Arithmetic_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#arithmetic_logic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_logic(b2bParser.Arithmetic_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_val(b2bParser.Boolean_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_val(b2bParser.Boolean_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operators(b2bParser.Logical_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operators(b2bParser.Logical_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(b2bParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(b2bParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(b2bParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(b2bParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(b2bParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(b2bParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenosExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterMenosExpr(b2bParser.MenosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenosExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitMenosExpr(b2bParser.MenosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(b2bParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(b2bParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(b2bParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(b2bParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(b2bParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(b2bParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(b2bParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(b2bParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumResExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSumResExpr(b2bParser.SumResExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumResExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSumResExpr(b2bParser.SumResExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(b2bParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link b2bParser#arit_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(b2bParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#execution_control}.
	 * @param ctx the parse tree
	 */
	void enterExecution_control(b2bParser.Execution_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#execution_control}.
	 * @param ctx the parse tree
	 */
	void exitExecution_control(b2bParser.Execution_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_if}.
	 * @param ctx the parse tree
	 */
	void enterB_if(b2bParser.B_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_if}.
	 * @param ctx the parse tree
	 */
	void exitB_if(b2bParser.B_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if1}.
	 * @param ctx the parse tree
	 */
	void enterIf1(b2bParser.If1Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if1}.
	 * @param ctx the parse tree
	 */
	void exitIf1(b2bParser.If1Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if2}.
	 * @param ctx the parse tree
	 */
	void enterIf2(b2bParser.If2Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if2}.
	 * @param ctx the parse tree
	 */
	void exitIf2(b2bParser.If2Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if3}.
	 * @param ctx the parse tree
	 */
	void enterIf3(b2bParser.If3Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if3}.
	 * @param ctx the parse tree
	 */
	void exitIf3(b2bParser.If3Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if3a}.
	 * @param ctx the parse tree
	 */
	void enterIf3a(b2bParser.If3aContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if3a}.
	 * @param ctx the parse tree
	 */
	void exitIf3a(b2bParser.If3aContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if3b}.
	 * @param ctx the parse tree
	 */
	void enterIf3b(b2bParser.If3bContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if3b}.
	 * @param ctx the parse tree
	 */
	void exitIf3b(b2bParser.If3bContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#if4}.
	 * @param ctx the parse tree
	 */
	void enterIf4(b2bParser.If4Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#if4}.
	 * @param ctx the parse tree
	 */
	void exitIf4(b2bParser.If4Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_while}.
	 * @param ctx the parse tree
	 */
	void enterB_while(b2bParser.B_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_while}.
	 * @param ctx the parse tree
	 */
	void exitB_while(b2bParser.B_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#while1}.
	 * @param ctx the parse tree
	 */
	void enterWhile1(b2bParser.While1Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#while1}.
	 * @param ctx the parse tree
	 */
	void exitWhile1(b2bParser.While1Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#while2}.
	 * @param ctx the parse tree
	 */
	void enterWhile2(b2bParser.While2Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#while2}.
	 * @param ctx the parse tree
	 */
	void exitWhile2(b2bParser.While2Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#b_for}.
	 * @param ctx the parse tree
	 */
	void enterB_for(b2bParser.B_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#b_for}.
	 * @param ctx the parse tree
	 */
	void exitB_for(b2bParser.B_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#for1}.
	 * @param ctx the parse tree
	 */
	void enterFor1(b2bParser.For1Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#for1}.
	 * @param ctx the parse tree
	 */
	void exitFor1(b2bParser.For1Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#for2}.
	 * @param ctx the parse tree
	 */
	void enterFor2(b2bParser.For2Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#for2}.
	 * @param ctx the parse tree
	 */
	void exitFor2(b2bParser.For2Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#for3}.
	 * @param ctx the parse tree
	 */
	void enterFor3(b2bParser.For3Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#for3}.
	 * @param ctx the parse tree
	 */
	void exitFor3(b2bParser.For3Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#for4}.
	 * @param ctx the parse tree
	 */
	void enterFor4(b2bParser.For4Context ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#for4}.
	 * @param ctx the parse tree
	 */
	void exitFor4(b2bParser.For4Context ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#files}.
	 * @param ctx the parse tree
	 */
	void enterFiles(b2bParser.FilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#files}.
	 * @param ctx the parse tree
	 */
	void exitFiles(b2bParser.FilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#touch}.
	 * @param ctx the parse tree
	 */
	void enterTouch(b2bParser.TouchContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#touch}.
	 * @param ctx the parse tree
	 */
	void exitTouch(b2bParser.TouchContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(b2bParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(b2bParser.File_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#copy_rename}.
	 * @param ctx the parse tree
	 */
	void enterCopy_rename(b2bParser.Copy_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#copy_rename}.
	 * @param ctx the parse tree
	 */
	void exitCopy_rename(b2bParser.Copy_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(b2bParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(b2bParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#directories}.
	 * @param ctx the parse tree
	 */
	void enterDirectories(b2bParser.DirectoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#directories}.
	 * @param ctx the parse tree
	 */
	void exitDirectories(b2bParser.DirectoriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#mkdir}.
	 * @param ctx the parse tree
	 */
	void enterMkdir(b2bParser.MkdirContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#mkdir}.
	 * @param ctx the parse tree
	 */
	void exitMkdir(b2bParser.MkdirContext ctx);
	/**
	 * Enter a parse tree produced by {@link b2bParser#paths}.
	 * @param ctx the parse tree
	 */
	void enterPaths(b2bParser.PathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link b2bParser#paths}.
	 * @param ctx the parse tree
	 */
	void exitPaths(b2bParser.PathsContext ctx);
}