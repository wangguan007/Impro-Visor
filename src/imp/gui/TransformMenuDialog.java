/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp.gui;
import imp.trading.ActiveTradingDialog;

/**
 *
 * @author cssummer17
 */
public class TransformMenuDialog extends javax.swing.JDialog {

     Notate notate;
     ActiveTradingDialog activeTradingDialog;
     javax.swing.DefaultListModel transformListModel = new javax.swing.DefaultListModel();
    
    /**
     * Creates new form TransformMenuDialog
     */
    public TransformMenuDialog(ActiveTradingDialog activeTradingDialog, boolean modal) {
        super(activeTradingDialog, modal);
        initComponents();
        this.setTitle("Transform Menu");
        this.activeTradingDialog = activeTradingDialog;
    }

    public javax.swing.JList getTransformList()
    {
        return transformJlist;
    }
    
    public javax.swing.DefaultListModel getTransformListModel()
    {
        return transformListModel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        transformListScrollPane = new javax.swing.JScrollPane();
        transformJlist = new javax.swing.JList<>();
        transformButtonPanel = new javax.swing.JPanel();
        chosenTransformButton = new javax.swing.JRadioButton();
        cycleTransformButton = new javax.swing.JRadioButton();
        shuffleTransformButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 623));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        transformListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        transformListScrollPane.setAutoscrolls(true);
        transformListScrollPane.setDoubleBuffered(true);
        transformListScrollPane.setHorizontalScrollBar(null);
        transformListScrollPane.setMinimumSize(new java.awt.Dimension(300, 100));
        transformListScrollPane.setName("Transform Menu"); // NOI18N
        transformListScrollPane.setPreferredSize(new java.awt.Dimension(300, 600));

        transformJlist.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        transformJlist.setModel(transformListModel);
        transformJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transformJlist.setBounds(new java.awt.Rectangle(0, 0, 300, 600));
        transformJlist.setName(""); // NOI18N
        transformJlist.setVisibleRowCount(200);
        transformJlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transformJlistMouseClicked(evt);
            }
        });
        transformListScrollPane.setViewportView(transformJlist);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(transformListScrollPane, gridBagConstraints);

        transformButtonPanel.setName("Transform Menu"); // NOI18N
        transformButtonPanel.setLayout(new java.awt.GridBagLayout());

        chosenTransformButton.setSelected(true);
        chosenTransformButton.setText("Chosen");
        chosenTransformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosenTransformButtonActionPerformed(evt);
            }
        });
        transformButtonPanel.add(chosenTransformButton, new java.awt.GridBagConstraints());

        cycleTransformButton.setLabel("Cycle");
        cycleTransformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleTransformButtonActionPerformed(evt);
            }
        });
        transformButtonPanel.add(cycleTransformButton, new java.awt.GridBagConstraints());

        shuffleTransformButton.setLabel("Shuffle");
        shuffleTransformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shuffleTransformButtonActionPerformed(evt);
            }
        });
        transformButtonPanel.add(shuffleTransformButton, new java.awt.GridBagConstraints());

        getContentPane().add(transformButtonPanel, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transformJlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transformJlistMouseClicked
        //transformAction();
       int index = transformJlist.getSelectedIndex();
       String musician = (String) transformListModel.getElementAt(index);
       System.out.println("selected musician: " + musician);
       //activeTradingDialog.updateMusician(musician);
       //activeTradingDialog.getActiveTrading().setMusician(musician);
      // activeTradingDialog.getTransformStatusButton().setText("" + musician);
    }//GEN-LAST:event_transformJlistMouseClicked

    private void chosenTransformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosenTransformButtonActionPerformed
        //mode = CHOSEN;
        //grammarAction();
    }//GEN-LAST:event_chosenTransformButtonActionPerformed

    private void cycleTransformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cycleTransformButtonActionPerformed
        //mode = CYCLE;
        //grammarAction();
    }//GEN-LAST:event_cycleTransformButtonActionPerformed

    private void shuffleTransformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shuffleTransformButtonActionPerformed
        //mode = SHUFFLE;
        //grammarAction();
    }//GEN-LAST:event_shuffleTransformButtonActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TransformMenuDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TransformMenuDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TransformMenuDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TransformMenuDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TransformMenuDialog dialog = new TransformMenuDialog(this.notate, true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton chosenTransformButton;
    private javax.swing.JRadioButton cycleTransformButton;
    private javax.swing.JRadioButton shuffleTransformButton;
    private javax.swing.JPanel transformButtonPanel;
    private javax.swing.JList<String> transformJlist;
    private javax.swing.JScrollPane transformListScrollPane;
    // End of variables declaration//GEN-END:variables
}
