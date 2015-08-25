package rms.control.search;

import rms.model.item.Item;
import rms.model.item.ItemThread;
import rms.model.item.TaskItem;

/**
 * Finds {@link TaskItem}s which are overdue, i.e. their deadline is in the
 * past.
 *
 * @author Timothy
 */
public class LateTaskFilter extends AbstractFilter {

    @Override
    protected boolean accept(Item i) {
        return (i instanceof TaskItem) ? ((TaskItem) i).isOverdue() : false;
    }

    @Override
    protected boolean accept(ItemThread t) {
        //the entire thread is accepted if any item is accepted
        return isAnyItemAccepted(t);
    }
}