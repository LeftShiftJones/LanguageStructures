import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class Day {
    private LocalDate day;
    private Vector<TaskrElement> list;

    public Day() {
        this.day = null;
        this.list = new Vector<>();
    }

    public LocalDate getDay() {
        return day;
    }

    public Vector<TaskrElement> getList() {
        return list;
    }

    public String translate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy");

        StringBuilder sb = new StringBuilder();
        sb.append("<div class='container'>");
        sb.append("<h3>");
        sb.append(this.day.format(format));
        sb.append("</h3>");
        sb.append("<strong>TASK LIST:</strong>");
        if(this.list.isEmpty()) {
            sb.append("<p> Nothing for today. </p>");
        } else {
            for (TaskrElement el : list) {
                sb.append(el.translate());
            }
        }
        sb.append("</div>");
        return sb.toString();
    }

    public void addElement(TaskrElement t) {
        this.list.add(t);
    }

    public void addNoteToLast(Note n) {
        this.list.lastElement().setNote(n);
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public void setList(Vector<TaskrElement> list) {
        this.list = list;
    }
}
