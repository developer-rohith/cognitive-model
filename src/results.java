
import java.util.prefs.Preferences;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rohit
 */
public class results extends javax.swing.JFrame {

    /**
     * Creates new form results
     */
    public results() {
        initComponents();
        Preferences userPrefs = Preferences.userRoot().node("sample");
         String retrievedValue = userPrefs.get("user", "default_value_if_not_found");
         int sc=userPrefs.getInt(retrievedValue, 0);
         int inteli=0;
         int spe=0;
         
         if(userPrefs.getInt("vow", 0)!=0)
         {
             inteli=userPrefs.getInt("vow", 0);
         } 
         else if(userPrefs.getInt("con", 0)!=0)
         {
             inteli=userPrefs.getInt("con", 0);
         }
         else if(userPrefs.getInt("mis", 0)!=0)
         {
             inteli=userPrefs.getInt("mis", 0);
         }
         
         
         
         if(userPrefs.getInt("vowti", 0)!=0)
         {
             spe=userPrefs.getInt("vowti", 0);
         } 
         else if(userPrefs.getInt("conti", 0)!=0)
         {
             spe=userPrefs.getInt("conti", 0);
         }
         else if(userPrefs.getInt("misti", 0)!=0)
         {
             spe=userPrefs.getInt("misti", 0);
         }
         
         if(spe==3)
        {
            speed.setText("HIGH");
        }
        else if(spe==2)
        {
            speed.setText("MODERATE");
        }
        else
        {
            
            speed.setText("LOW");
        }
   
         
          
          
       
        if(inteli==3)
        {
            intelligence.setText("HIGH");
        }
        else if(inteli==2)
        {
            intelligence.setText("MODERATE");
        }
        else
        {
            
            intelligence.setText("LOW");
        }
         retrievedValue=retrievedValue.toUpperCase();
        
         result.setText(retrievedValue+" SCORE IS  "+sc);
         String dis="";
         
         if(inteli==3 && spe==3)
         {
             dis="Software Maintenance Engineer";
         }
         else if(inteli==1 && spe==1)
         {
             dis="Marketing Person";
         }
         else if(inteli==3 || spe==3 || spe==2)
         {
             dis="Software Tester";
         }
         output.setText("Predicted Career for "+retrievedValue +" is "+ dis);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        intelligence = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        patience = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        learning = new javax.swing.JLabel();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Intelligence");

        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Speed of Solving");

        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Patience & Perseverance");

        intelligence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intelligence.setText("HIGH");

        speed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speed.setText("LOW");

        patience.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patience.setText("LOW");

        result.setBackground(new java.awt.Color(204, 255, 204));
        result.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(0, 153, 51));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("jLabel7");

        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Learning Ability");

        learning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        learning.setText("LOW");

        output.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(intelligence, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(patience, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(learning, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intelligence)
                    .addComponent(speed)
                    .addComponent(patience)
                    .addComponent(learning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(output)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new results().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel intelligence;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel learning;
    private javax.swing.JLabel output;
    private javax.swing.JLabel patience;
    private javax.swing.JLabel result;
    private javax.swing.JLabel speed;
    // End of variables declaration//GEN-END:variables
}
