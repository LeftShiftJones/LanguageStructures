import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Task implements TaskrElement {
    private String description;
    private String modifier;
    private String repeatModifier;
    private Date date;
    private Date repeatEndDate;

    private Vector<TaskrElement> children;

    public final String SYMBOL = "&bull;";
    public final String TYPE = "task";

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
    public void addTaskrChild(TaskrElement el) {
        this.children.add(el);
    }
}
