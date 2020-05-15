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
public class AddBuyToOrder extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public AddBuyToOrder() {
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
        AddButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        CedulaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProveedorComboBox = new javax.swing.JComboBox<>();
        ParteComboBox = new javax.swing.JComboBox<>();
        OrdenComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cantidadSpinner = new javax.swing.JSpinner();
        buscarClienteButton = new javax.swing.JButton();
        buscarProveedor = new javax.swing.JButton();
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
        jLabel3.setBounds(50, 230, 160, 180);

        AddButton.setBackground(new java.awt.Color(213, 213, 213));

        AddButton.setForeground(new java.awt.Color(4, 83, 125));
        AddButton.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        AddButton.setForeground(new java.awt.Color(4, 83, 125));
        AddButton.setText("Agregar");
        AddButton.setToolTipText("");
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(400, 520, 170, 50);

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
        ExitButton.setBounds(10, 550, 110, 50);

        CedulaText.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        CedulaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CedulaText.setText("Cedula");
        getContentPane().add(CedulaText);
        CedulaText.setBounds(290, 320, 160, 30);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 83, 125));
        jLabel2.setText("Numero de Orden");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 360, 180, 50);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 83, 125));
        jLabel4.setText("Añadir a Pedido");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 410, 240, 50);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 83, 125));
        jLabel5.setText("Seleccione una proveedor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 360, 190, 50);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 83, 125));
        jLabel6.setText("Cédula Cliente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 270, 140, 50);

        ProveedorComboBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        ProveedorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(ProveedorComboBox);
        ProveedorComboBox.setBounds(510, 410, 200, 30);

        ParteComboBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        getContentPane().add(ParteComboBox);
        ParteComboBox.setBounds(510, 320, 200, 30);

        OrdenComboBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        OrdenComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenComboBoxMouseClicked(evt);
            }
        });
        getContentPane().add(OrdenComboBox);
        OrdenComboBox.setBounds(290, 410, 160, 30);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 83, 125));
        jLabel7.setText("Indique la cantidad");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(770, 340, 160, 50);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 83, 125));
        jLabel8.setText("Seleccione una parte");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(530, 270, 160, 50);

        cantidadSpinner.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        cantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(cantidadSpinner);
        cantidadSpinner.setBounds(800, 390, 70, 30);

        AddButton.setBackground(new java.awt.Color(213, 213, 213));

        AddButton.setForeground(new java.awt.Color(4, 83, 125));
        buscarClienteButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        buscarClienteButton.setForeground(new java.awt.Color(4, 83, 125));
        buscarClienteButton.setText("Buscar Cliente");
        buscarClienteButton.setToolTipText("");
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buscarClienteButton);
        buscarClienteButton.setBounds(300, 450, 140, 29);

        AddButton.setBackground(new java.awt.Color(213, 213, 213));

        AddButton.setForeground(new java.awt.Color(4, 83, 125));
        buscarProveedor.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        buscarProveedor.setForeground(new java.awt.Color(4, 83, 125));
        buscarProveedor.setText("Buscar Proveedor");
        buscarProveedor.setToolTipText("");
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(buscarProveedor);
        buscarProveedor.setBounds(520, 450, 170, 29);

        BackgroundLabel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundLabel.setOpaque(true);
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 160, 1020, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void OrdenComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenComboBoxMouseClicked
        
    }//GEN-LAST:event_OrdenComboBoxMouseClicked

    private void buscarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarClienteButtonActionPerformed

    private void buscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(AddBuyToOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBuyToOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBuyToOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBuyToOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddBuyToOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddButton;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel BackgroundLabel1;
    public javax.swing.JTextField CedulaText;
    public javax.swing.JButton ExitButton;
    public javax.swing.JComboBox<String> OrdenComboBox;
    public javax.swing.JComboBox<String> ParteComboBox;
    public javax.swing.JComboBox<String> ProveedorComboBox;
    public javax.swing.JButton buscarClienteButton;
    public javax.swing.JButton buscarProveedor;
    public javax.swing.JSpinner cantidadSpinner;
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
