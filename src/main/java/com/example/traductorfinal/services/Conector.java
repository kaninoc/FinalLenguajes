package com.example.traductorfinal.services;

import com.example.traductorfinal.grammar.b2bLexer;
import com.example.traductorfinal.grammar.b2bParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Conector {

    public String traducir(String entrada) {

        /*
        System.out.println(entrada);
        for(int i = 0; i < entrada.length(); i++){
            char c = entrada.charAt(i);
            int ASCII =  (int)c;
            System.out.println(ASCII + " " + c);
        }
        return entrada;
        */
        // crear un analizador léxico que se alimenta a partir de la entrada
        b2bLexer lexer = new b2bLexer(CharStreams.fromString(entrada));

        // Identificar al analizador léxico como fuente de tokens para el sintactico
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
        b2bParser parser = new b2bParser(tokens);

        // Iniciar el analisis sintáctico en la regla inicial: root
        ParseTree tree = parser.root();

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        Listener traductor = new Listener();
        traductor.limpiar();
        walker.walk(traductor, tree); // Walk the tree created during the parse, trigger callbacks

        String s = traductor.escribir("");
        return s;
    }

}

