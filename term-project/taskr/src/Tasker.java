import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Vector;

public class Tasker {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test_doc.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        TaskrGrammarLexer lexer = new TaskrGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TaskrGrammarParser parser = new TaskrGrammarParser(tokens);
        TaskrGrammarParser.ProgContext ctx = parser.prog();
        TaskrGrammarBaseVisitorImpl visitor = new TaskrGrammarBaseVisitorImpl();
        visitor.visitProg(ctx);


        translate(visitor.task_list);
    }

    private static String translate(Vector<TaskrElement> list) {
        Day[] days = new Day[7];

        LocalDate todayLocal = LocalDate.now();
        LocalDate cutoffLocal = todayLocal.plusDays(6);

        for(int i = 0; i < 7; i++) {
            days[i] = new Day();
            days[i].setDay(todayLocal.plusDays(i));
        }

        Date today = java.sql.Date.valueOf(todayLocal);
        Date cutoff = java.sql.Date.valueOf(cutoffLocal);

        TaskrElement prev = null;

        for(TaskrElement e : list) {
            if(prev != null && e.getClass() == Note.class) {
                if(prev.getRepeatModifier() != null && prev.getRepeatModifier().compareTo("(repeats daily)") == 0) {
                    LocalDate temp = repeatsInRange(todayLocal, cutoffLocal, prev);
                    LocalDate end = new java.sql.Date(prev.getRepeatEndDate().getTime()).toLocalDate();
                    while(temp.until(end).getDays() >= 0 && temp.until(cutoffLocal).getDays() >= 0 ) {
                        int index = todayLocal.until(temp).getDays();
                        days[index].addNoteToLast((Note) e);
                        temp = temp.plusDays(1);
                    }
                } else {
                    LocalDate date = new java.sql.Date(prev.getDate().getTime()).toLocalDate();
                    int index = todayLocal.until(date).getDays();
                    days[index].addNoteToLast((Note) e);
                }
            }
            if(e.getClass() != Note.class &&
               e.getDate() != null &&
               e.getDate().compareTo(cutoff) <= 0 &&
               e.getDate().compareTo(today) >= 0) {
                LocalDate date = new java.sql.Date(e.getDate().getTime()).toLocalDate();
                int index = todayLocal.until(date).getDays();
                days[index].addElement(e);
                prev = e;
            }
            if(e.getClass() != Note.class &&
               e.getRepeatModifier() != null &&
               repeatsInRange(todayLocal, cutoffLocal, e) != null) { // it repeats
                LocalDate temp = repeatsInRange(todayLocal, cutoffLocal, e);
                LocalDate end = new java.sql.Date(e.getRepeatEndDate().getTime()).toLocalDate();
                if(e.getRepeatModifier().compareTo("(repeats daily)") == 0) {
                    while(temp.until(end).getDays() >= 0 && temp.until(cutoffLocal).getDays() >= 0 ) {
                        int index = todayLocal.until(temp).getDays();
                        days[index].addElement(e);
                        temp = temp.plusDays(1);
                    }
                    prev = e;
                } else {
                    int index = todayLocal.until(temp).getDays();
                    days[index].addElement(e);
                    prev = e;
                }
            }
        }

        // write to a file
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("../templates/tasks.html", "utf-8");
            writer.println("{% extends 'index.html' %}");
            writer.println("{% block content %}");
            for(Day day : days) {
                writer.println(day.translate());
            }
            writer.println("{% endblock %}");
        } catch (Exception e) {
            System.out.println("issue writing file");
        } finally {
            writer.close();
        }
        return null;
    }

    public static LocalDate repeatsInRange(LocalDate start, LocalDate end, TaskrElement e) {

        if(e.getRepeatModifier() != null) {
            LocalDate elementStart = new java.sql.Date(e.getDate().getTime()).toLocalDate();
            LocalDate elementEnd = new java.sql.Date(e.getRepeatEndDate().getTime()).toLocalDate();
            LocalDate temp = elementStart;
            int increaseTemp = 0;

            while(temp.until(end).getDays() > 0 &&  temp.until(elementEnd).getDays() > 0) {

                if(temp.until(start).getDays() <= 0 && temp.until(end).getDays() >= 0) { // true case
                    return temp;
                }
//                System.out.println(e.getRepeatModifier());
                switch(e.getRepeatModifier()) {
                    case "(repeats daily)":
                        temp = temp.plusDays(1);
                        break;
                    case "(repeats weekly)":
                        temp = temp.plusWeeks(1);
                        break;
                    case "(repeats monthly)":
                        temp = temp.plusMonths(1);
                        break;
                    case "(repeats yearly)":
                        temp = temp.plusYears(1);
                        break;
                    default:
                        break;
                }
            }
        }
        return null;
    }
}
