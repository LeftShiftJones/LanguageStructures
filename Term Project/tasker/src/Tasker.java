import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;

public class Tasker {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test_doc.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        TaskerGrammarLexer lexer = new TaskerGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TaskerGrammarParser parser = new TaskerGrammarParser(tokens);
        parser.prog(); // parse the input stream!
    }
}
