package com.example.traductorfinal.services;

import com.example.traductorfinal.grammar.b2bBaseListener;
import com.example.traductorfinal.grammar.b2bParser;

public class Listener extends b2bBaseListener {

    public static String cadena = "";// contiene toda la traduccion que se muestra por consola ypor el archivo salida.txt
    public static int tabulaciones = 0;//espacios dependiendo de los metodos

    public String escribir(String token){//captura toda la traduccion en una cadena
        cadena = cadena+token;
        return  cadena;
    }

    public void limpiar(){
        cadena = "";
    }

    public String calculartab(int tab){
        if (tab == 0){
            return "";
        }
        return "\t".repeat(Math.max(0, tab));
    }

    @Override
    public void enterComments(b2bParser.CommentsContext ctx) {
        if(ctx.COMMENT() != null){
            cadena += ctx.COMMENT().getText() + "\n";
        }
    }

    @Override
    public void enterComment_lines(b2bParser.Comment_linesContext ctx) {
        if(ctx.COMMENT_MUL() != null){
            cadena += "<#";
            String toPrint = ctx.COMMENT_MUL().getText();
            cadena += toPrint.substring(5, toPrint.length() - 3);
        }
    }

    @Override
    public void exitComment_lines(b2bParser.Comment_linesContext ctx) {
        if(ctx.COMMENT_MUL() != null){
            cadena += "#>\n";
        }
    }

    @Override
    public void enterDash(b2bParser.DashContext ctx) {
        if(ctx.dash1() != null){
            cadena += "powershell ";
        }
    }

    @Override
    public void exitDash(b2bParser.DashContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterDash2(b2bParser.Dash2Context ctx) {
        if(ctx.FILENAME() != null){
            cadena += ctx.FILENAME().getText();
        }
        if(ctx.command() != null){
            cadena += "'" + ctx.command().getText();
        }
    }

    @Override
    public void exitDash2(b2bParser.Dash2Context ctx) {
        if(ctx.command() != null){
            cadena += "'";
        }
    }

    @Override
    public void enterDashargs(b2bParser.DashargsContext ctx) {
        cadena += "-";
        if(ctx.arg != null){
            cadena += ctx.arg.getText() + " ";
        }
    }

    @Override
    public void enterVar(b2bParser.VarContext ctx) {
        if(ctx.ID() != null){
            cadena += "$" + ctx.ID().getText() + ctx.EQ().getText() + ctx.value().getText();
        }
    }

    @Override
    public void exitVar(b2bParser.VarContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterEcho(b2bParser.EchoContext ctx) {
        if(ctx.PR_echo() != null) {
            String echo = ctx.PR_echo().getText();
            cadena += echo.substring(0, echo.length() - 1);
        }
    }

    @Override
    public void exitEcho(b2bParser.EchoContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterRead(b2bParser.ReadContext ctx) {
        if(ctx.ID() != null){
            cadena += "$" + ctx.ID().getText() + "=read-host";
        }
    }

    @Override
    public void enterIf1(b2bParser.If1Context ctx) {
        if(ctx.PR_if() != null && ctx.L_SQUAREBR() != null){
            cadena += "if (";
        }
    }

    /*
    @Override
    public void exitIf1(b2bParser.If1Context ctx) {
        if(ctx.R_SQUAREBR() != null && ctx.SEMIC() != null){
            cadena += ") ";
        }
    }
    */

    @Override
    public void enterIf2(b2bParser.If2Context ctx) {
        if(ctx.PR_then() != null){
            cadena += ") {\n";
        }
    }

    @Override
    public void exitIf2(b2bParser.If2Context ctx) {
        if(ctx.PR_then() != null){
            cadena += "}";
        }
    }

    @Override
    public void enterIf3a(b2bParser.If3aContext ctx) {
        if(ctx.PR_elif() != null && ctx.L_SQUAREBR() != null){
            cadena += " elseif (";
        }
    }

    /*
    @Override
    public void exitIf3a(b2bParser.If3aContext ctx) {
        if(ctx.R_SQUAREBR() != null && ctx.PR_elif() != null){
            cadena += ") ";
        }
    }
     */

    @Override
    public void enterIf3b(b2bParser.If3bContext ctx) {
        if(ctx.PR_then() != null){
            cadena += ") {\n";
        }
    }

    @Override
    public void exitIf3b(b2bParser.If3bContext ctx) {
        if(ctx.PR_then() != null){
            cadena += "}";
        }
    }

    @Override
    public void enterIf4(b2bParser.If4Context ctx) {
        if(ctx.PR_else() != null){
            cadena += " else {\n";
        }
    }

    @Override
    public void exitIf4(b2bParser.If4Context ctx) {
        if(ctx.PR_else() != null){
            cadena += "}";
        }
        if(ctx.END_OF_LINE(1) != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterWhile1(b2bParser.While1Context ctx) {
        if(ctx.PR_while() != null){
            cadena += "while (";
        }
    }

    @Override
    public void exitWhile1(b2bParser.While1Context ctx) {
        if(ctx.PR_while() != null){
            cadena += ") ";
        }
    }

    @Override
    public void enterWhile2(b2bParser.While2Context ctx) {
        if(ctx.PR_do() != null){
            cadena += "{\n";
        }
    }

    @Override
    public void exitWhile2(b2bParser.While2Context ctx) {
        if(ctx.PR_do() != null){
            cadena += "}\n";
        }
    }
}