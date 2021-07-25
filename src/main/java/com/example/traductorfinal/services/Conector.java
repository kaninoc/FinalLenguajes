package com.example.traductorfinal.services;

import com.example.traductorfinal.grammar.lenguajeLexer;
import com.example.traductorfinal.grammar.lenguajeParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Conector {

    public String traducir(String entrada){
        lenguajeLexer lexer;
        lexer = new lenguajeLexer(CharStreams.fromString(entrada));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        lenguajeParser parser = new lenguajeParser(tokens);

        ParseTree tree = parser.raiz();

        //objeto Walker

        ParseTreeWalker walker = new ParseTreeWalker();

        traductorServices traductor = new traductorServices();

        walker.walk(traductor, tree);
        String  s = traductor.escribir("");
        return s;
    }

    }

