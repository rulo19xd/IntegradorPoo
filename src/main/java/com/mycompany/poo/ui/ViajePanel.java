package com.mycompany.poo.ui;
import com.mycompany.poo.app.Plataforma;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.services.Servicio;

/**
 *
 * @author juamp
 */
public class ViajePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViajePanel
     */
public ViajePanel(Plataforma plataforma) {
    initComponents();
    this.plataforma = plataforma;
    cargarUsuarios();
    cargarTipos();
}
private Plataforma plataforma;

private void cargarUsuarios() {
    cmbUsuarios.removeAllItems();
    for (User u : plataforma.getUsuarios()) {
        cmbUsuarios.addItem(u.getName());
    }
}

private void cargarTipos() {
    cmbTipo.removeAllItems();
    cmbTipo.addItem("UberX");
    cmbTipo.addItem("UberComfort");
    cmbTipo.addItem("UberMoto");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        cmbUsuarios = new javax.swing.JComboBox<>();
        cmbTipo = new javax.swing.JComboBox<>();
        txtDistancia = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de viaje:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Distancia(km):");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCotizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        cmbUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbTipo, 0, 115, Short.MAX_VALUE)
                    .addComponent(btnCotizar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUsuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDistancia))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCotizar)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
            try {
        String nombreUsuario = (String) cmbUsuarios.getSelectedItem();
        if (nombreUsuario == null) {
            lblResultado.setText("No hay usuarios creados");
            return;
        }
        User usuario = plataforma.getUsuarios().stream()
                .filter(u -> u.getName().equals(nombreUsuario))
                .findFirst().orElse(null);
        String tipo = (String) cmbTipo.getSelectedItem();
        double distancia = Double.parseDouble(txtDistancia.getText().trim());
        Servicio s = plataforma.pedirViaje(usuario, tipo, distancia);
        lblResultado.setText("Precio: $" + String.format("%.2f", s.calcularPrecio()));
    } catch (NumberFormatException e) {
        lblResultado.setText("Ingresá una distancia válida");
    }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaActionPerformed
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
            java.util.logging.Logger.getLogger(ViajePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViajePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViajePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViajePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ViajePanel(new com.mycompany.poo.app.Plataforma()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCotizar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}
