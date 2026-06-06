/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.poo.ui;
import com.mycompany.poo.app.Plataforma;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.enums.PackageSize;
import com.mycompany.poo.services.Servicio;

/**
 *
 * @author juamp
 */
public class EnvioPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnvioPanel
     */
public EnvioPanel(Plataforma plataforma) {
    initComponents();
    this.plataforma = plataforma;
    cargarUsuarios();
    cargarTamanos();
}
private Plataforma plataforma;

private void cargarUsuarios() {
    cmbUsuarios.removeAllItems();
    for (User u : plataforma.getUsuarios()) {
        cmbUsuarios.addItem(u.getName());
    }
}

private void cargarTamanos() {
    cmbTamano.removeAllItems();
    cmbTamano.addItem("SMALL");
    cmbTamano.addItem("MEDIUM");
    cmbTamano.addItem("LARGE");
}

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
            java.util.logging.Logger.getLogger(EnvioPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvioPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvioPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvioPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new EnvioPanel(new com.mycompany.poo.app.Plataforma()).setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();
        cmbTamano = new javax.swing.JComboBox<>();
        txtDistancia = new javax.swing.JTextField();
        btnCotizar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tamaño del paquete:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Distancia (km):");

        cmbUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbTamano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTamanoActionPerformed(evt);
            }
        });

        txtDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCotizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbUsuarios, 0, 94, Short.MAX_VALUE)
                            .addComponent(txtDistancia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTamano, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCotizar)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCotizar)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(83, Short.MAX_VALUE))
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
        PackageSize tamano = PackageSize.valueOf((String) cmbTamano.getSelectedItem());
        double distancia = Double.parseDouble(txtDistancia.getText().trim());
        Servicio s = plataforma.pedirEnvio(usuario, tamano, distancia);
        lblResultado.setText("Precio: $" + String.format("%.2f", s.calcularPrecio()));
    } catch (NumberFormatException e) {
        lblResultado.setText("Ingresá una distancia válida");
    }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void cmbTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTamanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTamanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCotizar;
    private javax.swing.JComboBox<String> cmbTamano;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}
