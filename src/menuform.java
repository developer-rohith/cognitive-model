
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAI
 */
public class menuform extends javax.swing.JFrame {
    
   static String user;

    /**
     * Creates new form menuform
     * @param username
     */
    public menuform(String username) {
        
        initComponents();
        user=username;
       

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vowels = new javax.swing.JButton();
        consonants = new javax.swing.JButton();
        misspelt = new javax.swing.JButton();
        result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vowels.setText("vowels");
        vowels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vowelsActionPerformed(evt);
            }
        });

        consonants.setText("consonants");
        consonants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consonantsActionPerformed(evt);
            }
        });

        misspelt.setText("misspelt");
        misspelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misspeltActionPerformed(evt);
            }
        });

        result.setText("Results");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(consonants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(misspelt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vowels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(result)
                        .addGap(8, 8, 8)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(vowels)
                .addGap(38, 38, 38)
                .addComponent(consonants)
                .addGap(42, 42, 42)
                .addComponent(misspelt)
                .addGap(34, 34, 34)
                .addComponent(result)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vowelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vowelsActionPerformed
        // TODO add your handling code here:
         
         levels lf= new levels();
         lf.setVisible(true);
        //vf1.setVisible(true);
       
           // vf1.call();
           
           
        
        this.dispose();
    }//GEN-LAST:event_vowelsActionPerformed

    private void consonantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consonantsActionPerformed
        // TODO add your handling code here:
        
        levelscons lc=new levelscons();
        lc.setVisible(true);
        
        
    }//GEN-LAST:event_consonantsActionPerformed

    private void misspeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misspeltActionPerformed
        // TODO add your handling code here:
        
        levelsmis lm=new levelsmis();
        lm.setVisible(true);
       
    }//GEN-LAST:event_misspeltActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
        new results().setVisible(true);
    }//GEN-LAST:event_resultActionPerformed

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
            java.util.logging.Logger.getLogger(menuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menuform(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consonants;
    private javax.swing.JButton misspelt;
    private javax.swing.JButton result;
    private javax.swing.JButton vowels;
    // End of variables declaration//GEN-END:variables

    
}
