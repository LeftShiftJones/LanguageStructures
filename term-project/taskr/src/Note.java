import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Note implements TaskrElement {
    private String description;
    private String modifier;
    private String repeatModifier;
    private Date date;
    private Date repeatEndDate;
    private Note note;

    private Vector<TaskrElement> children;

    public final String SYMBOL = "&mdash;";
    public final String TYPE = "note";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getModifier() {
        return modifier;
    }

    @Override
    public String getRepeatModifier() {
        return repeatModifier;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public Date getRepeatEndDate() {
        return repeatEndDate;
    }

    @Override
    public List<TaskrElement> getChildren() {
        return children;
    }

    @Override
    public Note getNote() {
        return this;
    }

    @Override
    public String translate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='container'>\n");
        sb.append(this.SYMBOL);
        sb.append(" ");
        sb.append(this.getDescription());
        sb.append("\n");
        sb.append("</div>");
        return sb.toString();
    }

    @Override
    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public void setModifier(String mod) {
        this.modifier = mod;
    }

    @Override
    public void setRepeatModifier(String mod) {
        this.repeatModifier = mod;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void setRepeatEndDate(Date date) {
        this.repeatEndDate = date;
    }

    @Override
    public void setNote(Note note) {
    }

    @Override
    public void addTaskrChild(TaskrElement el) {
        this.children.add(el);
    }
}
