package rms.view.util;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 * Panel showing a loading gif and blocking all input to the underlying
 * components
 *
 * @author Timothy
 */
public class LoadingPanel extends JPanel implements FocusListener, MouseListener {

    public LoadingPanel() {
        initComponents();
        initComponentsMore();
    }

    private void initComponentsMore() {
        this.addFocusListener(this);
        this.addMouseListener(this);
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

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rms/view/util/loading.gif"))); // NOI18N
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
            // Grab the focus to capture all key events
            requestFocus();
        }
        super.setVisible(aFlag);
    }

    @Override
    public void focusGained(FocusEvent e) {
        // Do nothing
    }

    @Override
    public void focusLost(FocusEvent e) {
        // Make sure focus is not lost while visible
        if (isVisible()) {
            requestFocus();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Capture but ignore all mouse events
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Capture but ignore all mouse events
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Capture but ignore all mouse events
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Capture but ignore all mouse events
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Capture but ignore all mouse events
    }
}
