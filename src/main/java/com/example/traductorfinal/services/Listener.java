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
    public void enterSleep(b2bParser.SleepContext ctx) {
        if(ctx.PR_sleep() != null){
            cadena += "timeout ";
            if(ctx.NUMERO() != null){
                cadena += ctx.NUMERO().getText();
            }
            if(ctx.ID() != null){
                cadena += "$" + ctx.ID();
            }
        }
    }

    @Override
    public void exitSleep(b2bParser.SleepContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
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
        if(ctx.paths() != null){
            String pathss = ctx.paths().getText();
            if(pathss.endsWith("sh")){
                pathss = pathss.substring(0, pathss.length() - 2) + "ps1";
            }
            pathss = pathss.replace('/','\\');
            System.out.println(pathss);
            cadena += "." + pathss;
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
    public void enterBoolean_val(b2bParser.Boolean_valContext ctx) {
        if(!ctx.children.isEmpty()){
            String value = ctx.children.toString();
            cadena += "$" + value.substring(1, value.length() - 1);
        }
    }

    @Override
    public void exitBoolean_val(b2bParser.Boolean_valContext ctx) {
        super.exitBoolean_val(ctx);
    }

    @Override
    public void enterRead(b2bParser.ReadContext ctx) {
        if(ctx.ID() != null){
            cadena += "$" + ctx.ID().getText() + "=read-host";
        }
    }

    @Override
    public void exitRead(b2bParser.ReadContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterCat(b2bParser.CatContext ctx) {
        if(ctx.PR_cat() != null){
            String aux = "type ";
            if(ctx.GT() != null){
                aux = "notepad ";
            }
            String pathss = ctx.paths().getText();
            String aux2 = "";
            if(pathss.contains("/")){
                aux2 = ".";
            }
            pathss = pathss.replace("/", "\\");
            cadena += aux + aux2 + pathss;
        }
    }

    @Override
    public void exitCat(b2bParser.CatContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
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
        if(ctx.PR_done() != null){
            cadena += "}\n";
        }
    }

    @Override
    public void enterFor1(b2bParser.For1Context ctx) {
        if(ctx.PR_for() != null){
            cadena += "for (";
        }
    }

    @Override
    public void exitFor1(b2bParser.For1Context ctx) {
        if(ctx.SEMIC() != null){
            cadena += ";";
        }
    }

    @Override
    public void exitFor2(b2bParser.For2Context ctx) {
        if(ctx.SEMIC() != null){
            cadena += ";";
        }
    }

    @Override
    public void exitFor3(b2bParser.For3Context ctx) {
        if(ctx.R_BR(0) != null && ctx.R_BR(1) != null){
            cadena += ") ";
        }
    }

    @Override
    public void enterFor4(b2bParser.For4Context ctx) {
        if(ctx.PR_do() != null){
            cadena += "{\n";
        }
    }

    @Override
    public void exitFor4(b2bParser.For4Context ctx) {
        if(ctx.PR_done() != null){
            cadena += "}";
        }
        if(ctx.END_OF_LINE(1) != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterTouch(b2bParser.TouchContext ctx) {
        if(ctx.PR_touch() != null){
            String pathss = ctx.paths().getText();
            String aux = "";
            if(pathss.contains("/")){
                aux = ".";
            }
            pathss = pathss.replace("/", "\\");
            cadena += "new-item -type file " + aux + pathss;
        }
    }

    @Override
    public void exitTouch(b2bParser.TouchContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterFile_size(b2bParser.File_sizeContext ctx) {
        if(ctx.PR_file_ls() != null){
            String pathss = ctx.paths().getText();
            String aux = "";
            if(pathss.contains("/")){
                aux = ".";
            }
            pathss = pathss.replace("/", "\\");
            cadena += "get-childitem " + aux + pathss;
        }
    }

    @Override
    public void exitFile_size(b2bParser.File_sizeContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterCopy_rename(b2bParser.Copy_renameContext ctx) {
        if(ctx.opt != null){
            String aux = ctx.opt.getText();
            String added = "";
            if(aux.equals("cp")){
                added = "copy-item";
            }
            if(aux.equals("mv")){
                added = "move-item";
            }
            String paths1 = ctx.paths(0).getText();
            String paths2 = ctx.paths(1).getText();
            String aux1 = "";
            if(paths1.contains("/")){
                aux1 = ".";
            }
            paths1 = paths1.replace("/", "\\");
            String aux2 = "";
            if(paths2.contains("/")){
                aux2 = ".";
            }
            paths2 = paths2.replace("/", "\\");
            cadena += added + " " + aux1 + paths1 + " " + aux2 + paths2;
        }
    }

    @Override
    public void exitCopy_rename(b2bParser.Copy_renameContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterRemove(b2bParser.RemoveContext ctx) {
        if(ctx.PR_remove() != null){
            String pathss = ctx.paths().getText();
            String aux = "";
            if(pathss.contains("/")){
                aux = ".";
            }
            pathss = pathss.replace("/", "\\");
            cadena += "remove-item " + aux + pathss;
        }
    }

    @Override
    public void exitRemove(b2bParser.RemoveContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }

    @Override
    public void enterMkdir(b2bParser.MkdirContext ctx) {
        if(ctx.PR_mkdir() != null){
            cadena += "new-item -type directory ";
        }
        if(ctx.OPMK() != null){
            cadena += "-path $pwd";
        }
        if(ctx.DIR() != null){
            String pathss = ctx.DIR().getText();
            pathss = pathss.replace("/", "\\");
            cadena += pathss;
        }
        if(ctx.ID() != null){
            cadena += ctx.ID().getText();
        }
    }

    @Override
    public void exitMkdir(b2bParser.MkdirContext ctx) {
        if(ctx.END_OF_LINE() != null){
            cadena += "\n";
        }
    }
}