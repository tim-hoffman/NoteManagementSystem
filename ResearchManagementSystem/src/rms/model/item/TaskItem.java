package rms.model.item;

import java.io.Serializable;
import java.util.Date;
import rms.util.DateHelpers;

/**
 *
 * @author Timothy
 */
public class TaskItem extends TextItem implements Serializable {

    private static final long serialVersionUID = 01L;

    public static enum StatusIndicator {
        PENDING, COMPLETE, OVERDUE
    };

    private Date deadline;
    private boolean completed;

    protected TaskItem(ItemThread parentThread) {
        this(parentThread, null);
    }

    protected TaskItem(ItemThread parentThread, String text) {
        super(parentThread, text);
        this.completed = false;
    }

    public void setDeadline(Date newDeadline) {
        this.deadline = newDeadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public boolean isComplete() {
        return completed;
    }

    public boolean isOverdue() {
        return !completed && deadline != null && deadline.before(DateHelpers.Today());
    }

    public void markCompleted() {
        touch();
        completed = true;
    }

    public void markActive() {
        touch();
        completed = false;
    }

    @Override
    public String getItemTypeName() {
        return "Task";
    }
}
