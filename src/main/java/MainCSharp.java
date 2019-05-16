import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;


public class MainCSharp {
    public static void main(String[] args) {
        try {
            String tmp = "float b = 10.36; int b; char b = 'h'; double fff; double dddd = 120.456;";
            //TODO testowe przykłady do ifa
            // if(a+3+3+k+2>4*h+3.0*4.0) {if(d-6>y) {int a = 10;} else { int b = 10;}} else {int c = 7;}
            //for(int i = 0;a+b+5<b;i++) {int a = 10;}
            //for(int i = 0 ; true ; i++) {int a = 10;}
            //for(int i = 0 ; a-9<i+9 ; i++) {if(d-6>y) {int a = 10;} else { int b = 10;}}
            //while(true){for(int i = 0 ; a-9<i+9 ; i++) {if(d-6>y) {int a = 10;} else { for(int i = 0 ; a-9<i+9 ; i++) {if(d-6>y) {int a = 10;} else { int b = 10;}}}}}
//            while(a>9){ a = a+10+63;}
//            while(a+b+7>78+l){int a = 10;}
//            do{int a = 10+69; b=a+96+c;}while(b>6)
//            int a;
//            a = 75 + 96;
            // if(a+b+c > 6+9){int a = 10;}


            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj kod  C# do translacji:");

            tmp = scanner.nextLine();
            ANTLRInputStream input = new ANTLRInputStream(tmp);
            CSharpLexer lexer = new CSharpLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CSharpParser parser = new CSharpParser(commonTokenStream);
            parser.setBuildParseTree(true);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            CSharpBaseListener listener = new CSharpBaseListener();
            walker.walk(listener, tree);
            System.out.println(listener.getTranslate());

        } catch (Exception e) {
            System.err.println("exception: " + e);
        }
    }
}
