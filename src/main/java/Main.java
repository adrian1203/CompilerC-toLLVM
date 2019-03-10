
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;




public class Main {
    public static void main(String[] args) {
        try {
            String tmp= "Siemka";
            ANTLRInputStream input = new ANTLRInputStream(tmp);
            ObjectLexer lexer= new ObjectLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            ObjectParser parser = new ObjectParser(commonTokenStream);
            System.out.println(lexer.toString());
            System.out.println(parser.toString());
        } catch(Exception e) {
            System.err.println("exception: "+e);
        }
    }
}
