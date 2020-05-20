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
public class LinkPartsWithProvider extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public LinkPartsWithProvider() {
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

        jLabel1 = new javax.swing.JLabel();
        BackgroundLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LinkButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ParteComboBox = new javax.swing.JComboBox<>();
        ProveedorComboBox = new javax.swing.JComboBox<>();
        PrecioSpinner = new javax.swing.JSpinner();
        GananciaSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AppTitle_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 0, 290, 240);

        BackgroundLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Background1.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel1);
        BackgroundLabel1.setBounds(-20, -290, 1020, 450);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Tool.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 180, 160, 180);

        LinkButton.setBackground(new java.awt.Color(213, 213, 213));

        LinkButton.setForeground(new java.awt.Color(4, 83, 125));
        LinkButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        LinkButton.setForeground(new java.awt.Color(4, 83, 125));
        LinkButton.setText("Asociar");
        LinkButton.setToolTipText("");
        LinkButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LinkButton);
        LinkButton.setBounds(540, 550, 170, 50);

        ExitButton.setBackground(new java.awt.Color(213, 213, 213));
        ExitButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(4, 83, 125));
        ExitButton.setText("Atrás");
        ExitButton.setToolTipText("");
        ExitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(20, 540, 120, 50);

        jLabel2.setBackground(new java.awt.Color(4, 83, 125));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 83, 125));
        jLabel2.setText("Con Proveedor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 400, 310, 60);

        jLabel4.setBackground(new java.awt.Color(4, 83, 125));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 83, 125));
        jLabel4.setText("Asociar Partes");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 360, 320, 60);

        ParteComboBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        getContentPane().add(ParteComboBox);
        ParteComboBox.setBounds(390, 300, 170, 50);

        ProveedorComboBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        getContentPane().add(ProveedorComboBox);
        ProveedorComboBox.setBounds(700, 300, 170, 50);

        PrecioSpinner.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        PrecioSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(PrecioSpinner);
        PrecioSpinner.setBounds(470, 410, 100, 50);

        GananciaSpinner.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        GananciaSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(GananciaSpinner);
        GananciaSpinner.setBounds(660, 410, 100, 50);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 83, 125));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Parte");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 270, 60, 29);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 83, 125));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Proveedor");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(740, 260, 100, 29);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 83, 125));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio Compra");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 370, 160, 29);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 83, 125));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ganancia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 370, 100, 29);

        BackgroundLabel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundLabel.setOpaque(true);
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 160, 1020, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void LinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LinkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LinkPartsWithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkPartsWithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkPartsWithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkPartsWithProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkPartsWithProvider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel BackgroundLabel1;
    public javax.swing.JButton ExitButton;
    public javax.swing.JSpinner GananciaSpinner;
    public javax.swing.JButton LinkButton;
    public javax.swing.JComboBox<String> ParteComboBox;
    public javax.swing.JSpinner PrecioSpinner;
    public javax.swing.JComboBox<String> ProveedorComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
