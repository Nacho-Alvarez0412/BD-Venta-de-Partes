/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nacho
 */
public class ClientMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public ClientMenu() {
        initComponents();
        this.setSize(995, 650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SuspendButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackgroundLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        SuspendButton.setBackground(new java.awt.Color(213, 213, 213));
        SuspendButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        SuspendButton.setForeground(new java.awt.Color(4, 83, 125));
        SuspendButton.setText("Suspender");
        SuspendButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SuspendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuspendButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SuspendButton);
        SuspendButton.setBounds(580, 320, 170, 50);
        SuspendButton.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AppTitle_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 0, 290, 240);

        BackgroundLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Background1.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel1);
        BackgroundLabel1.setBounds(-20, -290, 1020, 450);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 160, 180);

        ModifyButton.setBackground(new java.awt.Color(213, 213, 213));
        ModifyButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ModifyButton.setForeground(new java.awt.Color(4, 83, 125));
        ModifyButton.setText("Modificar");
        ModifyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyButton);
        ModifyButton.setBounds(320, 420, 170, 50);

        InsertButton.setBackground(new java.awt.Color(213, 213, 213));
        InsertButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        InsertButton.setForeground(new java.awt.Color(4, 83, 125));
        InsertButton.setText("Insertar");
        InsertButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(InsertButton);
        InsertButton.setBounds(320, 320, 170, 50);

        ListButton.setBackground(new java.awt.Color(213, 213, 213));

        ListButton.setForeground(new java.awt.Color(4, 83, 125));
        ListButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ListButton.setForeground(new java.awt.Color(4, 83, 125));
        ListButton.setText("Listar");
        ListButton.setToolTipText("");
        ListButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListButton);
        ListButton.setBounds(580, 420, 170, 50);

        ExitButton.setBackground(new java.awt.Color(213, 213, 213));
        ExitButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(4, 83, 125));
        ExitButton.setText("Atrás");
        ExitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(450, 510, 170, 50);

        BackgroundLabel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundLabel.setOpaque(true);
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 160, 1020, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuspendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuspendButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuspendButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel BackgroundLabel1;
    public javax.swing.JButton ExitButton;
    public javax.swing.JButton InsertButton;
    public javax.swing.JButton ListButton;
    public javax.swing.JButton ModifyButton;
    public javax.swing.JButton SuspendButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
