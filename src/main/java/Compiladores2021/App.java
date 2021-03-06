package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from file
        // CharStream input = CharStreams.fromFileName("src/entrada.txt");
        // CharStream input = CharStreams.fromFileName("src/llaves.txt");
        CharStream input = CharStreams.fromFileName("src/codigo.txt");

        // create a lexer that feeds off of input CharStream
        programaLexer lexer = new programaLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        programaParser parser = new programaParser(tokens);
                
        // create Listener
        // ExpRegBaseListener escucha = new Escucha();

        // Conecto el objeto con Listeners al parser
        // parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        // parser.s();


        // Debemos de remover el listener de errores que posee por defecto ANTRL y crear el nuestro
        Compiladores2021.TablaSimbolos.ErroresListener erroresListener = new Compiladores2021.TablaSimbolos.ErroresListener();
        parser.removeErrorListeners();
        parser.addErrorListener(erroresListener);

        // A su vez tenemos que crear nuestro listener
        programaBaseListener listener = new MiListener();
        parser.addParseListener(listener);

        ParseTree tree =  parser.programa();
        System.out.println(tree);

        // Por ultimo creamos un Visitor para la generacion del codigo 
        
    }
}
