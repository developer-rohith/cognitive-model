
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rohit
 */
public class levels extends javax.swing.JFrame {

    /**
     * Creates new form levels
     */
    public levels() {
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

        level1 = new javax.swing.JButton();
        level2 = new javax.swing.JButton();
        level3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        level1.setText("Level 1");
        level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ActionPerformed(evt);
            }
        });

        level2.setText("Level 2");
        level2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2ActionPerformed(evt);
            }
        });

        level3.setText("Level 3");
        level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(level3)
                    .addComponent(level2)
                    .addComponent(level1))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(level1)
                .addGap(54, 54, 54)
                .addComponent(level2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(level3)
                .addGap(60, 60, 60))
        );

        level2.getAccessibleContext().setAccessibleName("Level2");
        level3.getAccessibleContext().setAccessibleName("Level3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ActionPerformed
        // TODO add your handling code here:
        
         vowelsform1 vf1 = new vowelsform1();
         int level =1;
         
        vf1.setVisible(true);
        try {
           // vf1.call();
           vf1.call(level);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menuform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_level1ActionPerformed

    private void level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ActionPerformed
        // TODO add your handling code here: vowelsform1 vf1 = new vowelsform1();
         vowelsform1 vf1 = new vowelsform1();
         int level =2;
         
        vf1.setVisible(true);
        try {
           // vf1.call();
           vf1.call(level);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menuform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_level2ActionPerformed

    private void level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ActionPerformed
        // TODO add your handling code here:
         vowelsform1 vf1 = new vowelsform1();
         int level =3;
         
        vf1.setVisible(true);
        try {
           // vf1.call();
           vf1.call(level);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menuform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        
    }//GEN-LAST:event_level3ActionPerformed

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
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new levels().setVisible(true);
            }
        });
        
         
    }
     public void call()
     {
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton level1;
    private javax.swing.JButton level2;
    private javax.swing.JButton level3;
    // End of variables declaration//GEN-END:variables
}
