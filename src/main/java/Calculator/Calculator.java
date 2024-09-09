/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author darioperez
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResults = new javax.swing.JTextField();
        jbtmPM = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnCA = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit78 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResults.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtResults.setToolTipText("");
        getContentPane().add(jtxtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 50));

        jbtmPM.setText("+/-");
        jbtmPM.setToolTipText("");
        getContentPane().add(jbtmPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 60));

        jbtnBS.setText("<=");
        jbtnBS.setToolTipText("");
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 60));

        jbtnCA.setText("CE");
        jbtnCA.setToolTipText("");
        getContentPane().add(jbtnCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 60));

        jbtnC.setText("C");
        jbtnC.setToolTipText("");
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, 60));

        jbtnDigit7.setText("7");
        jbtnDigit7.setToolTipText("");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 60));

        jbtnDigit78.setText("8");
        jbtnDigit78.setToolTipText("");
        getContentPane().add(jbtnDigit78, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 60));

        jbtnDigit9.setText("9");
        jbtnDigit9.setToolTipText("");
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, 60));

        jbtnPlus.setText("+");
        jbtnPlus.setToolTipText("");
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 60));

        jbtnDigit5.setText("5");
        jbtnDigit5.setToolTipText("");
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 60));

        jbtnDigit6.setText("6");
        jbtnDigit6.setToolTipText("");
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 60, 60));

        jbtnPlusMinus.setText("-");
        jbtnPlusMinus.setToolTipText("");
        getContentPane().add(jbtnPlusMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, 60));

        jbtnDigit4.setText("4");
        jbtnDigit4.setToolTipText("");
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 60));

        jbtnDigit2.setText("2");
        jbtnDigit2.setToolTipText("");
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 60, 60));

        jbtnDigit3.setText("3");
        jbtnDigit3.setToolTipText("");
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 60, 60));

        jbtnMultiply.setText("*");
        jbtnMultiply.setToolTipText("");
        getContentPane().add(jbtnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 70, 60));

        jbtnDigit1.setText("1");
        jbtnDigit1.setToolTipText("");
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 60));

        jbtnDigit0.setText("0");
        jbtnDigit0.setToolTipText("");
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 60));

        jButton18.setText("=");
        jButton18.setToolTipText("");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, 60));

        jbtnDivide.setText("/");
        jbtnDivide.setToolTipText("");
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 70, 60));

        jButton20.setText(".");
        jButton20.setToolTipText("");
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jbtmPM;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCA;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit78;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JTextField jtxtResults;
    // End of variables declaration//GEN-END:variables
}