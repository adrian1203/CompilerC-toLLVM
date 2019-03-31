import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class MainCSharp {
    public static void main(String[] args) {
        try {
            String tmp = "float b = 10.36; int b; char b = 'h';";
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
