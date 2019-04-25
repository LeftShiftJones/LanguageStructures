import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Event implements TaskrElement {
    private String description;
    private String modifier;
    private String repeatModifier;
    private Date date;
    private Note note;
    private Date repeatEndDate;

    private Vector<TaskrElement> children;

    public String SYMBOL = "&#9702;";
    public final String TYPE = "event";

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
        if(this.repeatModifier == null) return null;
        switch(this.repeatModifier) {
            case "d":
                return "(repeats daily)";
            case "w":
                return "(repeats weekly)";
            case "m":
                return "(repeats monthly)";
            case "y":
                return "(repeats yearly)";
            default:
                return null;
        }
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

    public Note getNote() {
        return note;
    }

    @Override
    public String translate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='container'>\n");
        sb.append(this.SYMBOL);
        sb.append(" ");
        sb.append(this.getDescription());
        if(this.repeatModifier != null) sb.append(this.getRepeatModifier());
        sb.append("\n");
        if(this.note != null) sb.append(this.note.translate());
        sb.append("</div>");
        return sb.toString();
    }

    @Override
    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public void setModifier(String mod) {
        if(mod == null) return;
        this.modifier = mod;

        switch(mod) {
            case "later":
                this.setSYMBOL("&lt;");
                break;
            case "tomorrow":
                this.setSYMBOL("&gt;");
                break;
            case "done":
                this.setSYMBOL("X");
                break;
            default:
                break;
        }
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

    public void setNote(Note note) {
        this.note = note;
    }

    public void setSYMBOL(String newSymbol) {
        this.SYMBOL = newSymbol;
    }

    @Override
    public void addTaskrChild(TaskrElement el) {
        this.children.add(el);
    }
}
