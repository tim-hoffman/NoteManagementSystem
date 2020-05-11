package rms.view;

import java.awt.Frame;
import java.util.Collections;
import java.util.Set;
import rms.control.Main;
import rms.model.Tag;
import rms.view.util.JPanelTagSelection;
import rms.view.util.JPanelTagSelection.DoubleClickSelectionListener;
import rms.view.util.Prompts;
import rms.view.util.Prompts.PromptType;

/**
 * Dialog for selecting a {@link Tag} from those available or creating a new
 * one.
 *
 * @author Timothy
 */
public final class TagSelectionDialog extends javax.swing.JDialog {

    private Set<Tag> selection;

    /**
     * Creates new TagSelectionDialog containing the set of {@link Tag}s
     * belonging to the current {@link rms.model.State State}.
     *
     * @param parent
     */
    public TagSelectionDialog(Frame parent) {
        super(parent, true);
        initComponents();
        initComponentsMore();
        setLocationRelativeTo(parent);
        getRootPane().setDefaultButton(jButtonOk);
        selection = null;
    }

    /**
     * Display the dialog.
     */
    public void showDialog() {
        setVisible(true);
    }

    /**
     * @return the {@link Tag} selected in the UI
     */
    public Set<Tag> getResult() {
        return selection;
    }

    private void close(Set<Tag> selectedTags) {
        selection = selectedTags;
        setVisible(false);
    }

    private void initComponentsMore() {
        tagSelectionPanel.addDoubleClickSelectionListener(new DoubleClickSelectionListener() {
            @Override
            public void itemsSelected(JPanelTagSelection.SelectedTags m) {
                close(m.getSelection());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancel = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();
        jButtonNewTag = new javax.swing.JButton();
        tagSelectionPanel = new rms.view.util.JPanelTagSelection(Main.getState().getTagsUnmodifiable());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 250));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonNewTag.setText("New Tag");
        jButtonNewTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNewTag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tagSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewTag)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonOk))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        close(tagSelectionPanel.getSelectedTags());
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        close(null);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonNewTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewTagActionPerformed
        String newName = Prompts.getUserInput("Enter new tag name", PromptType.PLAIN);
        if (newName != null && !newName.isEmpty()) {
            //create new tag, and close the window with the new tag selected
            close(Collections.singleton(Main.getState().createNewTag(newName)));
        }
    }//GEN-LAST:event_jButtonNewTagActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNewTag;
    private javax.swing.JButton jButtonOk;
    private rms.view.util.JPanelTagSelection tagSelectionPanel;
    // End of variables declaration//GEN-END:variables
}
