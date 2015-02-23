package rms.view.search;

import rms.control.search.AbstractFinder;
import rms.control.search.UpcomingTaskFinder;
import rms.util.DateUnit;

/**
 * Dialog for selecting a date unit and increment (for searching)
 * 
 * @author Timothy
 */
public class DialogDeadline extends BaseDialog {

    /**
     * Creates new form DialogDeadline
     * @param parent
     */
    public DialogDeadline(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    @Override
    protected AbstractFinder createFinder() {
        int increment = Integer.valueOf((String)jComboBoxIncrement.getSelectedItem());
        DateUnit unit = (DateUnit)jComboBoxUnit.getSelectedItem();
        return new UpcomingTaskFinder(increment, unit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxIncrement = new javax.swing.JComboBox();
        jComboBoxUnit = new javax.swing.JComboBox<>(DateUnit.values());

        setMinimumSize(new java.awt.Dimension(374, 133));

        jLabel1.setText("Find pending items due in the next");

        jComboBoxIncrement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getInnerContentPanel());
        getInnerContentPanel().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxIncrement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxIncrement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxIncrement;
    private javax.swing.JComboBox<DateUnit> jComboBoxUnit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
