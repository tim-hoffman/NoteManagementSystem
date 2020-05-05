package rms.view.search;

import rms.control.search.AbstractFilter;
import rms.control.search.TextFilter;

/**
 * Dialog for entering a string of text (for searching)
 *
 * @author Timothy
 */
public class DialogSearchText extends BaseSearchDialog {

    /**
     * Creates new form DialogSearchText
     *
     * @param parent
     */
    public DialogSearchText(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    @Override
    protected AbstractFilter createFilter() {
        String searchText = jTextFieldSearchText.getText();
        if (searchText != null && !searchText.isEmpty()) {
            String action = buttonGroupMatch.getSelection().getActionCommand();
            TextFilter.MatchType mType = TextFilter.MatchType.valueOf(action);
            return TextFilter.get(searchText, mType);
        } else {
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMatch = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSearchText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        String stringMatchAny = TextFilter.MatchType.Any.toString();
        jRadioButtonMatchAny = new javax.swing.JRadioButton();
        String stringMatchAll = TextFilter.MatchType.All.toString();
        jRadioButtonMatchAll = new javax.swing.JRadioButton();
        String stringMatchExact = TextFilter.MatchType.Exact.toString();
        jRadioButtonMatchExact = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(332, 157));

        jLabel1.setText("Find items containing the text");

        jLabel2.setText("Match type:  ");

        buttonGroupMatch.add(jRadioButtonMatchAny);
        jRadioButtonMatchAny.setSelected(true);
        jRadioButtonMatchAny.setText(stringMatchAny);
        jRadioButtonMatchAny.setActionCommand(stringMatchAny);

        buttonGroupMatch.add(jRadioButtonMatchAll);
        jRadioButtonMatchAll.setText(stringMatchAll);
        jRadioButtonMatchAll.setActionCommand(stringMatchAll);

        buttonGroupMatch.add(jRadioButtonMatchExact);
        jRadioButtonMatchExact.setText(stringMatchExact);
        jRadioButtonMatchExact.setActionCommand(stringMatchExact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getInnerContentPanel());
        getInnerContentPanel().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldSearchText)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMatchAny)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMatchAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMatchExact)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMatchAny)
                    .addComponent(jRadioButtonMatchAll)
                    .addComponent(jRadioButtonMatchExact)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonMatchAll;
    private javax.swing.JRadioButton jRadioButtonMatchAny;
    private javax.swing.JRadioButton jRadioButtonMatchExact;
    private javax.swing.JTextField jTextFieldSearchText;
    // End of variables declaration//GEN-END:variables
}
