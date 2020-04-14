package rms.model.item;

import java.io.Serializable;

/**
 *
 * @author Timothy
 */
public class NoteItem extends TextItem implements Serializable {

    private static final long serialVersionUID = 01L;

    protected NoteItem(ItemThread parentThread, String text) {
        super(parentThread, text);
    }

    @Override
    public String getItemTypeName() {
        return "Note";
    }

    public static NoteItem createAndAddNoteItem(ItemThread parentThread, String text) {
        NoteItem i = new NoteItem(parentThread, text);
        i.appendToParentThread();
        return i;
    }

    public static NoteItem createAndAddNoteItem(ItemThread parentThread) {
        return createAndAddNoteItem(parentThread, null);
    }
}
