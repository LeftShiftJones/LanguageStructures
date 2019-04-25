import java.util.Date;
import java.util.List;

public interface TaskrElement {
    String getDescription();
    String getModifier();
    String getRepeatModifier();
    Date getDate();
    Date getRepeatEndDate();
    Note getNote();

    String translate();

    List<TaskrElement> getChildren();

    void setDescription(String desc);
    void setModifier(String mod);
    void setRepeatModifier(String mod);
    void setDate(Date date);
    void setRepeatEndDate(Date date);
    void setNote(Note note);
    void addTaskrChild(TaskrElement el);
}
