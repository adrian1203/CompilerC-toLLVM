
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;

public class Main {
    public static void main(String[] args) {
        try {
            String tmp= "john SHOUTS: hello @michael /pink/this will work/ :-) \n";
            ANTLRInputStream input = new ANTLRInputStream(tmp);
            ChatLexer lexer= new ChatLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            ChatParser parser = new ChatParser(commonTokenStream);
            parser.setBuildParseTree(true);

            ParseTree tree = parser.chat();
            ParseTreeWalker walker = new ParseTreeWalker();
            ChatBaseListener listener = new ChatBaseListener();
            walker.walk(listener,tree);

            System.out.println(listener.getTranslate());
        } catch(Exception e) {
            System.err.println("exception: "+e);
        }
    }
}
