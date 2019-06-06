import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;


public class MainCSharp {
    public static void main(String[] args) {
        try {

            String toTranslate="";



            /// Wczytywane z consoli
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Podaj kod  C# do translacji:");
//            toTranslate = scanner.nextLine();

            ///Wczytywanie z pliku
            toTranslate = readFile();
            ANTLRInputStream input = new ANTLRInputStream(toTranslate);
            CSharpLexer lexer = new CSharpLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CSharpParser parser = new CSharpParser(commonTokenStream);
            parser.setBuildParseTree(true);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            CSharpBaseListener listener = new CSharpBaseListener();
            walker.walk(listener, tree);
            String translated = listener.getTranslate();
            System.out.println(translated);
            writeToFile(translated);




        } catch (Exception e) {
            System.err.println("exception: " + e);
        }
    }

    public static void writeToFile(String string) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("translated.txt");
        for (String s : string.split("\n")) {
            printWriter.println(s);

        }
        printWriter.close();
    }

    public static String readFile() throws IOException {
        String toTranslate="";

        BufferedReader reader = new BufferedReader(new FileReader("toTranslate.txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            toTranslate+=line+" ";
            line = reader.readLine();
        }
        String afterTrim = toTranslate.trim().replaceAll(" +", " ");
        System.out.println(afterTrim);
        return afterTrim;

    }
}
