import Classes.App;
import Classes.AppComponent;
import Classes.Click;
import Classes.Component;
import gen.AngularLexer;
import gen.AngularParser;
import Ast.BaseVisitor;
import org.antlr.v4.codegen.model.BaseVisitorFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main  {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello world");
        String surce = "example/2.txt";
        CharStream crs = fromFileName(surce);
        AngularLexer lexer = new AngularLexer(crs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.app();
        System.out.println("Hello world");
        App doc=(App) new BaseVisitor().visit(tree);
        System.out.println(doc);
    }
}