package com.example.traductorfinal.services;

import com.example.traductorfinal.grammar.lenguajeBaseListener;
import com.example.traductorfinal.grammar.lenguajeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.Queue;

public class traductorServices extends lenguajeBaseListener {

    public static String cadena = "";// contiene toda la traduccion que se muestra por consola ypor el archivo salida.txt
    public static int tabulaciones = 0;//espacios dependiendo de los metodos
    public static String tipovariable = "nulo";
    public static String tipovariablefuncion = "nulo";
    public static String parametros = "nulo";
    public static boolean impresion =false;
    public static String iterador = "nulo";
    public static boolean flagcase =true;
    public static boolean estructura =false;
    public static Queue<String> elementosestructura = new LinkedList<String>();//elementos de interfaz traduccion typescript
    public static Queue<String> idsestructura = new LinkedList<String>();//ids de interfaz traduccion typescript
    public static Queue<String> valores = new LinkedList<String>();//valores de interfaz traduccion typescript

    public String escribir(String token){//captura toda la traduccion en una cadena
        cadena = cadena+token;
        return  cadena;
    }

    public String calculartab(int tab){
        if (tab == 0){
            return "";
        }
        return "\t".repeat(Math.max(0, tab));
    }


    @Override public void enterF_principal(lenguajeParser.F_principalContext ctx) {
        if(ctx.FP()!=null){
            cadena += "function funcion_principal(){\n";
            tabulaciones+=1;
        }


    }


    @Override public void exitF_principal(lenguajeParser.F_principalContext ctx) {

        if(ctx.FFP()!=null){
            cadena += calculartab(tabulaciones) +"return null;\n" +"}\n";
            cadena+="funcion_principal();\n";
            tabulaciones-=1;
        }

    }



    @Override public void enterRaiz(lenguajeParser.RaizContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRaiz(lenguajeParser.RaizContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterContenido(lenguajeParser.ContenidoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitContenido(lenguajeParser.ContenidoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeclaracion(lenguajeParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaracion(lenguajeParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarBooleano(lenguajeParser.VarBooleanoContext ctx) {


        if(ctx.BOOLEANO() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "boolean";
                }
            }else{
                elementosestructura.add("boolean");
            }
        }
        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }

    }

    @Override public void exitVarBooleano(lenguajeParser.VarBooleanoContext ctx) {

    }

    @Override public void enterExtvarB(lenguajeParser.ExtvarBContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_BOOLEANO()!=null){
            if(!estructura) {
                if (ctx.TK_BOOLEANO().getText().equals("verdadero")) {
                    cadena += "true";
                } else if (ctx.TK_BOOLEANO().getText().equals("falso")) {
                    cadena += "false";
                }
            }else{
                if (ctx.TK_BOOLEANO().getText().equals("verdadero")) {
                    valores.add("true");
                } else if (ctx.TK_BOOLEANO().getText().equals("falso")) {
                    valores.add("false");
                }
            }
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarB(lenguajeParser.ExtvarBContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarEntero(lenguajeParser.VarEnteroContext ctx) {

        if(ctx.ENTERO() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "number";
                }
            }else{
                elementosestructura.add("number");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }
    }

    @Override public void exitVarEntero(lenguajeParser.VarEnteroContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarE(lenguajeParser.ExtvarEContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_ENTERO() != null) {
            if(!estructura) {
                cadena += ctx.TK_ENTERO().getText();
            }else {
                valores.add(ctx.TK_ENTERO().getText());
            }
        }
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }


    }

    @Override public void exitExtvarE(lenguajeParser.ExtvarEContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarReal(lenguajeParser.VarRealContext ctx) {

        if(ctx.REAL() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "number";
                }
            }else{
                elementosestructura.add("number");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }

    }

    @Override public void exitVarReal(lenguajeParser.VarRealContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarR(lenguajeParser.ExtvarRContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_REAL()!=null){
            if(!estructura) {
                cadena += ctx.TK_REAL().getText();
            }else{
                valores.add(ctx.TK_REAL().getText());
            }
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarR(lenguajeParser.ExtvarRContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }

    }

    @Override public void enterVarCaracter(lenguajeParser.VarCaracterContext ctx) {

        if(ctx.CARACTER() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "string";
                }
            }else{
                elementosestructura.add("string");
            }
        }

        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }

    }

    @Override public void exitVarCaracter(lenguajeParser.VarCaracterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarC(lenguajeParser.ExtvarCContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_CARACTER()!=null){
            if(!estructura) {
                cadena += ctx.TK_CARACTER().getText();
            }else{
                valores.add(ctx.TK_CARACTER().getText());
            }
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarC(lenguajeParser.ExtvarCContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarCadena(lenguajeParser.VarCadenaContext ctx) {

        if(ctx.CADENA() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones) + "let ";
                    tipovariable = "string";
                }
            }else{
                elementosestructura.add("string");
            }
        }
        if(ctx.ID() != null){
            if(!estructura) {
                cadena += ctx.ID().getText() + " : " + tipovariable;
            }else{
                idsestructura.add(ctx.ID().getText());
            }
        }
    }

    @Override public void exitVarCadena(lenguajeParser.VarCadenaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarS(lenguajeParser.ExtvarSContext ctx) {

        if (ctx.TK_ASIG()!=null){
            if(!estructura) {
                cadena += " " + ctx.TK_ASIG().getText() + " ";
            }
        }
        if (ctx.TK_CADENA()!=null){
            if(!estructura) {
                cadena += ctx.TK_CADENA().getText();
            }else{
                valores.add(ctx.TK_CADENA().getText());
            }
        }

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID() != null){
            cadena+=ctx.ID().getText()+":"+tipovariable;
        }
    }

    @Override public void exitExtvarS(lenguajeParser.ExtvarSContext ctx) {
        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }
    }

    @Override public void enterVarEstructura(lenguajeParser.VarEstructuraContext ctx) {

        if(ctx.ID() != null){
            if(!estructura) {
                if (tipovariable.equals("nulo")) {
                    cadena += calculartab(tabulaciones)+"let "+ctx.ID(1).getText()+" = "+ctx.ID(0).getText();
                }
            }else{
                elementosestructura.add(ctx.ID(0).getText());
                idsestructura.add(ctx.ID(1).getText());
            }
        }

    }

    @Override public void exitVarEstructura(lenguajeParser.VarEstructuraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExtvarEstructura(lenguajeParser.ExtvarEstructuraContext ctx) {

        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
        if(ctx.ID()!=null){
            cadena +=ctx.ID().getText()+" ";
        }

    }

    @Override public void exitExtvarEstructura(lenguajeParser.ExtvarEstructuraContext ctx) {

        if (ctx.TK_PYC()!=null){
            if(!estructura) {
                cadena += ctx.TK_PYC().getText() + "\n";
                tipovariable = "nulo";
            }
        }

    }

    @Override public void enterVarAsigEstructura(lenguajeParser.VarAsigEstructuraContext ctx) {

        for (int i =0; i< ctx.children.size();i++) {

            if( i==0){
                cadena+=calculartab(tabulaciones)+ctx.children.get(i);
            }
            else if(ctx.children.get(i).getText().equals("=")){
                cadena+=" "+ctx.children.get(i)+" ";
                break;
            }else{
                cadena+=ctx.children.get(i);
            }

        }


    }

    @Override public void exitVarAsigEstructura(lenguajeParser.VarAsigEstructuraContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterVarDeclarada(lenguajeParser.VarDeclaradaContext ctx) {

        if (ctx.ID()!=null){
            cadena+=calculartab(tabulaciones)+ ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena+=" "+ctx.TK_ASIG().getText()+" ";
        }

    }

    @Override public void exitVarDeclarada(lenguajeParser.VarDeclaradaContext ctx) {

        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterAsigfuncion(lenguajeParser.AsigfuncionContext ctx) {

        if (ctx.ID()!=null){
            if (impresion==false){
                cadena+=calculartab(tabulaciones)+ ctx.ID().getText();
            }else{
                cadena+=ctx.ID().getText();
            }

        }
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText();
        }

    }

    @Override public void exitAsigfuncion(lenguajeParser.AsigfuncionContext ctx) {
        //System.out.println(ctx.TK_COMA().size());

        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }

    }
    @Override public void enterRepeticion(lenguajeParser.RepeticionContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText();
        }
    }

    @Override public void exitRepeticion(lenguajeParser.RepeticionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterOperacion(lenguajeParser.OperacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperacion(lenguajeParser.OperacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion(lenguajeParser.ExpresionContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText()+" ";
        }

    }

    @Override public void exitExpresion(lenguajeParser.ExpresionContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena+=" "+ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterOperador(lenguajeParser.OperadorContext ctx) {

        if (ctx.TK_MAS()!=null){
            cadena+=" "+ctx.TK_MAS().getText()+" ";
        }
        if (ctx.TK_MENOS()!=null){
            cadena+=" "+ctx.TK_MENOS().getText()+" ";
        }
        if (ctx.TK_MULT()!=null){
            cadena+=" "+ctx.TK_MULT().getText()+" ";
        }
        if (ctx.TK_DIV()!=null){
            cadena+=" "+ctx.TK_DIV().getText()+" ";
        }
        if (ctx.TK_MOD()!=null){
            cadena+=" "+ctx.TK_MOD().getText()+" ";
        }
    }

    @Override public void exitOperador(lenguajeParser.OperadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipovar(lenguajeParser.TipovarContext ctx) {

        if (ctx.TK_MENOS()!=null){
            cadena+=ctx.TK_MENOS().getText();
        }

        if (ctx.TK_ENTERO()!=null){
            cadena+=ctx.TK_ENTERO().getText();
        }

        if (ctx.TK_REAL()!=null){
            cadena+=ctx.TK_REAL().getText();
        }

        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }


    }

    @Override public void exitTipovar(lenguajeParser.TipovarContext ctx) { }


    @Override public void enterLectura(lenguajeParser.LecturaContext ctx) {
        if(ctx.TK_PAR_IZQ()!=null&&ctx.TK_PAR_DER()!=null) {
            if (ctx.ID() != null) {
                cadena += calculartab(tabulaciones) + "let " + ctx.ID().getText() + " = prompt()";
            }
        }
    }

    @Override public void exitLectura(lenguajeParser.LecturaContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariable = "nulo";
        }
    }

    @Override public void enterImprimir(lenguajeParser.ImprimirContext ctx) {
        if(ctx.TK_PAR_IZQ()!=null&&ctx.TK_PAR_DER()!=null) {
            if (ctx.IMPRIMIR() != null) {
                impresion=true;
                cadena += calculartab(tabulaciones) + "console.log(";
            }
        }

    }

    @Override public void exitImprimir(lenguajeParser.ImprimirContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            impresion=false;
            tipovariable = "nulo";
        }

    }

    @Override public void enterImpresion(lenguajeParser.ImpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitImpresion(lenguajeParser.ImpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRepeticionimpresion(lenguajeParser.RepeticionimpresionContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }
    }

    @Override public void exitRepeticionimpresion(lenguajeParser.RepeticionimpresionContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarimpresion(lenguajeParser.VarimpresionContext ctx) {

        if (ctx.TK_BOOLEANO()!=null){
            if(ctx.TK_BOOLEANO().getText().equals("verdadero")){
                cadena+="true";
            }else  if(ctx.TK_BOOLEANO().getText().equals("falso")){
                cadena+="false";
            }

        }
        if (ctx.TK_ENTERO()!=null){
            cadena+=ctx.TK_ENTERO().getText();
        }

        if (ctx.TK_REAL()!=null){
            cadena+=ctx.TK_REAL().getText();
        }

        if (ctx.TK_CARACTER()!=null){
            cadena+=ctx.TK_CARACTER().getText();
        }

        if (ctx.TK_CADENA()!=null){
            cadena+=ctx.TK_CADENA().getText();
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }

    }

    @Override public void exitVarimpresion(lenguajeParser.VarimpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCondicional(lenguajeParser.CondicionalContext ctx) {
        if (ctx.SI()!=null){
            cadena += calculartab(tabulaciones) + "if";
            tabulaciones+=1;
        }

    }

    @Override public void exitCondicional(lenguajeParser.CondicionalContext ctx) {

    }
    @Override public void enterCuerpoif(lenguajeParser.CuerpoifContext ctx) {
        if (ctx.ENTONCES()!=null){
            cadena+="{\n";
        }
    }

    @Override public void exitCuerpoif(lenguajeParser.CuerpoifContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSino(lenguajeParser.SinoContext ctx) {
        if (ctx.SI_NO()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}else{"+"\n";
            tabulaciones+=1;
        }

    }

    @Override public void exitSino(lenguajeParser.SinoContext ctx) {
        if (ctx.FIN_SI()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";
        }
    }


    @Override public void enterOperacionlogica(lenguajeParser.OperacionlogicaContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }


    }

    @Override public void exitOperacionlogica(lenguajeParser.OperacionlogicaContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena += ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterOperadorlogico(lenguajeParser.OperadorlogicoContext ctx) {
        if (ctx.TK_O()!=null){
            cadena+=" "+ctx.TK_O().getText()+" ";
        }
        if (ctx.TK_Y()!=null){
            cadena+=" "+ctx.TK_Y().getText()+" ";
        }
    }

    @Override public void exitOperadorlogico(lenguajeParser.OperadorlogicoContext ctx) {

    }

    @Override public void enterComparador(lenguajeParser.ComparadorContext ctx) {
        if (ctx.TK_MENOR_IGUAL()!=null){
            cadena+=ctx.TK_MENOR_IGUAL().getText();
        }
        if (ctx.TK_MAYOR_IGUAL()!=null){
            cadena+=ctx.TK_MAYOR_IGUAL().getText();
        }
        if (ctx.TK_MENOR()!=null){
            cadena+=ctx.TK_MENOR().getText();
        }
        if (ctx.TK_MAYOR()!=null){
            cadena+=ctx.TK_MAYOR().getText();
        }
        if (ctx.TK_IGUAL()!=null){
            cadena+=ctx.TK_IGUAL().getText();
        }
        if (ctx.TK_DIF()!=null){
            cadena+=ctx.TK_DIF().getText();
        }
    }

    @Override public void exitComparador(lenguajeParser.ComparadorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclomientras(lenguajeParser.CiclomientrasContext ctx) {
        if (ctx.MIENTRAS()!=null){
            cadena+=calculartab(tabulaciones)+"while";
            tabulaciones+=1;
        }
    }

    @Override public void exitCiclomientras(lenguajeParser.CiclomientrasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCuerpociclomientras(lenguajeParser.CuerpociclomientrasContext ctx) {
        if (ctx.HACER()!=null){
            cadena+="{\n";
        }
    }

    @Override public void exitCuerpociclomientras(lenguajeParser.CuerpociclomientrasContext ctx) {
        if (ctx.FIN_MIENTRAS()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }

    @Override public void enterCiclohacer(lenguajeParser.CiclohacerContext ctx) {
        if (ctx.HACER()!=null){
            cadena+=calculartab(tabulaciones)+"do{\n";
            tabulaciones+=1;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclohacer(lenguajeParser.CiclohacerContext ctx) { }

    @Override public void enterCuerpociclohacer(lenguajeParser.CuerpociclohacerContext ctx) {
        if (ctx.MIENTRAS()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}while";
        }
    }

    @Override public void exitCuerpociclohacer(lenguajeParser.CuerpociclohacerContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclopara(lenguajeParser.CicloparaContext ctx) {
        if (ctx.PARA()!=null){
            cadena += calculartab(tabulaciones) + "for";
            tabulaciones+=1;
        }

    }

    @Override public void exitCiclopara(lenguajeParser.CicloparaContext ctx) {

    }
    @Override public void enterContenidopara(lenguajeParser.ContenidoparaContext ctx) {
        if (ctx.HACER()!=null){
            cadena+="{\n";
        }
    }
    @Override public void exitContenidopara(lenguajeParser.ContenidoparaContext ctx) {
        if (ctx.FIN_PARA()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }
    @Override public void enterContparaopt(lenguajeParser.ContparaoptContext ctx) {
        if (ctx.PARA()!=null){
            cadena += calculartab(tabulaciones) + "for";
            tabulaciones+=1;
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitContparaopt(lenguajeParser.ContparaoptContext ctx) {

    }
    @Override public void enterContparaoptfinal(lenguajeParser.ContparaoptfinalContext ctx) {
        if (ctx.HACER()!=null){
            cadena += "{\n";
        }
    }
    @Override public void exitContparaoptfinal(lenguajeParser.ContparaoptfinalContext ctx) {
        if (ctx.FIN_PARA()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";

        }
    }

    @Override public void enterElementospara(lenguajeParser.ElementosparaContext ctx) {

        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ENTERO()!=null){
            cadena += "let ";
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
            iterador =  ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena +=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_ENTERO()!=null){
            cadena += ctx.TK_ENTERO().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }

    }

    @Override public void exitElementospara(lenguajeParser.ElementosparaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComplementopara(lenguajeParser.ComplementoparaContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }
    }

    @Override public void exitComplementopara(lenguajeParser.ComplementoparaContext ctx) {
        if (ctx.TK_PAR_DER()!=null){
            cadena += ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void enterElementosparados(lenguajeParser.ElementosparadosContext ctx) {
        if (ctx.TK_PAR_IZQ()!=null){
            cadena += ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
            iterador =  ctx.ID().getText();
        }
        if (ctx.TK_ASIG()!=null){
            cadena +=" "+ctx.TK_ASIG().getText()+" ";
        }
        if (ctx.TK_ENTERO()!=null){
            cadena += ctx.TK_ENTERO().getText();
        }
        if (ctx.TK_PYC()!=null){
            cadena += ctx.TK_PYC().getText();
        }
    }

    @Override public void exitElementosparados(lenguajeParser.ElementosparadosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparadorpara(lenguajeParser.ComparadorparaContext ctx) {
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitComparadorpara(lenguajeParser.ComparadorparaContext ctx) { }

    @Override public void enterSegundocomparador(lenguajeParser.SegundocomparadorContext ctx) { }

    @Override public void exitSegundocomparador(lenguajeParser.SegundocomparadorContext ctx) {

    }


    @Override public void enterSegcomfinal(lenguajeParser.SegcomfinalContext ctx) {
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitSegcomfinal(lenguajeParser.SegcomfinalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVarcomparable(lenguajeParser.VarcomparableContext ctx) {
        if (ctx.TK_ENTERO()!=null){
            if (ctx.TK_ENTERO().getText().equals("1")) {
                cadena += iterador + "++";
            }else{
                cadena +=" += "+ctx.TK_ENTERO().getText();
            }
        }
        if (ctx.ID()!=null){
            cadena += ctx.ID().getText();
        }
    }

    @Override public void exitVarcomparable(lenguajeParser.VarcomparableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCredec(lenguajeParser.CredecContext ctx) {

        if (ctx.TK_MENOR_IGUAL()!=null){
            cadena+=" "+ctx.TK_MENOR_IGUAL().getText()+" ";
        }
        if (ctx.TK_MAYOR_IGUAL()!=null){
            cadena+=" "+ctx.TK_MAYOR_IGUAL().getText()+" ";
        }
        if (ctx.TK_MENOR()!=null){
            cadena+=" "+ctx.TK_MENOR().getText()+" ";
        }
        if (ctx.TK_MAYOR()!=null){
            cadena+=" "+ctx.TK_MAYOR().getText()+" ";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCredec(lenguajeParser.CredecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultiple(lenguajeParser.MultipleContext ctx) {
        if (ctx.SELECCIONAR()!=null){
            cadena+=calculartab(tabulaciones)+"switch";
            tabulaciones+=1;
        }
        if (ctx.TK_PAR_IZQ()!=null){
            cadena+=ctx.TK_PAR_IZQ().getText();
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }
        if (ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
        if (ctx.ENTRE()!=null){
            cadena+="{\n";
        }

    }

    @Override public void exitMultiple(lenguajeParser.MultipleContext ctx) {
        if (ctx.FIN_SELECCIONAR()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones)+"}\n";
        }
    }

    @Override public void enterCasos(lenguajeParser.CasosContext ctx) { }

    @Override public void exitCasos(lenguajeParser.CasosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultiplescasos(lenguajeParser.MultiplescasosContext ctx) {
        if (ctx.CASO()!=null){
            if (flagcase==true){
                cadena+=calculartab(tabulaciones)+"case";
                tabulaciones+=1;
                flagcase = false;
            }else{
                tabulaciones-=1;
                cadena+=calculartab(tabulaciones)+"case";
                tabulaciones+=1;
            }

        }
        if (ctx.TK_ENTERO()!=null){
            cadena+=" "+ctx.TK_ENTERO().getText()+" ";
        }
        if (ctx.TK_DOSP()!=null){
            cadena+=ctx.TK_DOSP().getText()+"\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMultiplescasos(lenguajeParser.MultiplescasosContext ctx) {
        if (ctx.ROMPER()!=null){
            tabulaciones-=1;
            cadena+=calculartab(tabulaciones) + "break";
            flagcase = true;
        }
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";

        }
    }

    @Override public void enterDefecto(lenguajeParser.DefectoContext ctx) {

        if (ctx.DEFECTO()!=null){
            cadena+=calculartab(tabulaciones)+"default";
        }
        if (ctx.TK_DOSP()!=null){
            cadena+=ctx.TK_DOSP().getText()+"\n";
            tabulaciones+=1;
        }
    }

    @Override public void exitDefecto(lenguajeParser.DefectoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEstructuras(lenguajeParser.EstructurasContext ctx) {
        if(ctx.ESTRUCTURA()!=null){
            cadena += "let ";
            tabulaciones+=1;
            estructura = true;
        }
        if(ctx.ID()!=null){
            cadena += ctx.ID().getText() + " :{\n";
        }

    }

    @Override public void exitEstructuras(lenguajeParser.EstructurasContext ctx) {
        if (ctx.FIN_ESTRUCTURA()!=null){
            Queue<String> aux = new LinkedList<String>();
            aux.addAll(idsestructura);

            while(!elementosestructura.isEmpty()){
                cadena+=calculartab(tabulaciones)+idsestructura.remove()+" : "+elementosestructura.remove()+"\n";
            }

            tabulaciones-=1;
            cadena+="} = {\n";
            tabulaciones+=1;

            while(!valores.isEmpty()){
                cadena+=calculartab(tabulaciones)+aux.remove()+" : "+valores.remove()+",\n";
            }
            tabulaciones-=1;
            cadena+="}\n";
            estructura = false;
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDecfuncion(lenguajeParser.DecfuncionContext ctx) {
        if (ctx.FUNCION()!=null){
            cadena+=calculartab(tabulaciones)+"function ";
            tabulaciones+=1;
        }
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText();
        }
        if (ctx.TK_PAR_IZQ() != null) {
            cadena+=ctx.TK_PAR_IZQ().getText();
        }

    }
    @Override public void enterCierredecfuncion(lenguajeParser.CierredecfuncionContext ctx) {
        if(ctx.TK_PAR_DER()!=null){
            cadena+=ctx.TK_PAR_DER().getText();
        }
    }

    @Override public void exitCierredecfuncion(lenguajeParser.CierredecfuncionContext ctx) { }


    @Override public void exitDecfuncion(lenguajeParser.DecfuncionContext ctx) {

    }
    @Override public void enterCuerpodecfuncion(lenguajeParser.CuerpodecfuncionContext ctx) {
        if (ctx.HACER()!=null){
            cadena+=" : "+tipovariablefuncion+" {\n";
        }

    }
    @Override public void exitCuerpodecfuncion(lenguajeParser.CuerpodecfuncionContext ctx) {

    }
    @Override public void enterRetornar(lenguajeParser.RetornarContext ctx) {
        if (ctx.RETORNAR()!=null){
            cadena+=calculartab(tabulaciones)+ "return ";
        }
    }

    @Override public void exitRetornar(lenguajeParser.RetornarContext ctx) {
        if (ctx.TK_PYC()!=null){
            cadena+=ctx.TK_PYC().getText()+"\n";
            tipovariablefuncion = "nulo";
        }
        if (ctx.FIN_FUNCION()!=null){
            cadena+="}\n";
            tabulaciones-=1;
            tipovariablefuncion = "nulo";
            parametros = "nulo";
        }

    }


    @Override public void enterParametros(lenguajeParser.ParametrosContext ctx) {

    }

    @Override public void exitParametros(lenguajeParser.ParametrosContext ctx) {

    }
    @Override public void enterComplementoparametros(lenguajeParser.ComplementoparametrosContext ctx) {
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText()+" : "+parametros;
        }
    }

    @Override public void exitComplementoparametros(lenguajeParser.ComplementoparametrosContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterMasparametros(lenguajeParser.MasparametrosContext ctx) {
        if (ctx.TK_COMA()!=null){
            cadena+=ctx.TK_COMA().getText()+" ";
        }

    }

    @Override public void exitMasparametros(lenguajeParser.MasparametrosContext ctx) { }

    @Override public void enterNextid(lenguajeParser.NextidContext ctx) {
        if (ctx.ID()!=null){
            cadena+=ctx.ID().getText()+" : "+parametros;
        }
    }

    @Override public void exitNextid(lenguajeParser.NextidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterTipofuncion(lenguajeParser.TipofuncionContext ctx) {

        if (tipovariablefuncion.equals("nulo")){

            if (ctx.BOOLEANO()!=null){
                tipovariablefuncion = "boolean";
            }
            if (ctx.ENTERO()!=null){
                tipovariablefuncion = "number";
            }
            if (ctx.REAL()!=null){
                tipovariablefuncion = "number";
            }
            if (ctx.CARACTER()!=null){
                tipovariablefuncion = "string";
            }
            if (ctx.CADENA()!=null){
                tipovariablefuncion = "string";
            }
        }else{

            if (ctx.BOOLEANO()!=null){
                parametros="boolean";
            }
            if (ctx.ENTERO()!=null){
                parametros = "number";
            }
            if (ctx.REAL()!=null){
                parametros = "number";
            }
            if (ctx.CARACTER()!=null){
                parametros = "string";
            }
            if (ctx.CADENA()!=null){
                parametros = "string";
            }
        }

    }

    @Override public void exitTipofuncion(lenguajeParser.TipofuncionContext ctx) { }

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