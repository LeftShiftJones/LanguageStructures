import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Date;
import java.util.List;

public class TaskrGrammarBaseVisitorImpl extends TaskrGrammarBaseVisitor {
    @Override
    public Object visitProg(TaskrGrammarParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Object visitEntries(TaskrGrammarParser.EntriesContext ctx) {
        return super.visitEntries(ctx);
    }

    @Override
    public Object visitEntry(TaskrGrammarParser.EntryContext ctx) {
        char type = getElementType(ctx.children);
        TaskrElement el;
        switch(type) {
            case 't':
                el = new Task();
                el.setModifier(getElementModifier(ctx.task().modifier()));
                break;
            case 'e':
                el = new Event();
                el.setModifier(getElementModifier(ctx.event().modifier()));
                break;
            case 'n':
                el = new Note();
                break;
            default:
                el = null;
                break;
        }
        if(el != null) {
            String desc = getElementDescription(ctx.description().children);
            el.setDescription(desc);
        }
        if(ctx.date().children != null) {
            System.out.println(ctx.date());
            Date date = getElementDate(ctx.date());
            el.setDate(date);
        }

        return super.visitEntry(ctx);
    }

    @Override
    public Object visitTask(TaskrGrammarParser.TaskContext ctx) {
        return super.visitTask(ctx);
    }

    @Override
    public Object visitSubtask(TaskrGrammarParser.SubtaskContext ctx) {
        return super.visitSubtask(ctx);
    }

    @Override
    public Object visitEvent(TaskrGrammarParser.EventContext ctx) {
        return super.visitEvent(ctx);
    }

    @Override
    public Object visitNote(TaskrGrammarParser.NoteContext ctx) {
        return super.visitNote(ctx);
    }

    @Override
    public Object visitDate(TaskrGrammarParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public Object visitRepeat(TaskrGrammarParser.RepeatContext ctx) {
        return super.visitRepeat(ctx);
    }

    @Override
    public Object visitModifier(TaskrGrammarParser.ModifierContext ctx) {
        return super.visitModifier(ctx);
    }

    @Override
    public Object visitStatus(TaskrGrammarParser.StatusContext ctx) {
        return super.visitStatus(ctx);
    }

    @Override
    public Object visitInterval(TaskrGrammarParser.IntervalContext ctx) {
        return super.visitInterval(ctx);
    }

    @Override
    public Object visitDay(TaskrGrammarParser.DayContext ctx) {
        return super.visitDay(ctx);
    }

    @Override
    public Object visitMonth(TaskrGrammarParser.MonthContext ctx) {
        return super.visitMonth(ctx);
    }

    @Override
    public Object visitYear(TaskrGrammarParser.YearContext ctx) {
        return super.visitYear(ctx);
    }

    @Override
    public Object visitDescription(TaskrGrammarParser.DescriptionContext ctx) {
        return super.visitDescription(ctx);
    }

    private char getElementType(List<ParseTree> children) {
        return children.get(0).getChild(0).toString().charAt(0);
    }

    private String getElementModifier(TaskrGrammarParser.ModifierContext ctx) {
        if(ctx.children == null) {
            return null;
        }

        return ctx.status().getChild(0).toString();
    }

    private String getElementDescription(List<ParseTree> children) {
        StringBuilder sb = new StringBuilder();

        for (ParseTree item : children) {
            sb.append(item.toString());
            sb.append(" ");

        }

        return sb.toString();
    }

    private String getElementDescription(List<ParseTree> children, String appendOn) {
        StringBuilder sb = new StringBuilder();

        for (ParseTree item : children) {
            sb.append(item.toString());
            sb.append(appendOn);

        }

        return sb.toString();
    }

    private Date getElementDate(TaskrGrammarParser.DateContext ctx) {
        String day = getElementDescription(ctx.day().children, "");
        String month = getElementDescription(ctx.month().children, "");
        String year = getElementDescription(ctx.year().children, "");

        return null;
    }
}
