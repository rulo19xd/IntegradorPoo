/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.poo.ui;
import com.mycompany.poo.app.Plataforma;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.enums.PackageSize;
import com.mycompany.poo.services.Servicio;
import com.mycompany.poo.accounts.Driver;

/**
 *
 * @author juamp
 */
public class EnvioPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnvioPanel
     */
public EnvioPanel(Plataforma plataforma, OriginFrame frame) {

    initComponents();

    this.plataforma = plataforma;
    this.frame = frame;

    cmbUsuarios.setPrototypeDisplayValue(
        "XXXXXXXXXX"
    );
    
    cargarUsuarios();
    cargarTamanos();

    btnConfirmar.setEnabled(false);
}
private Plataforma plataforma;
private OriginFrame frame;
private boolean envioCotizado = false;

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
        btnConfirmar = new javax.swing.JButton();
        lblEnvioConfirmado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tamaño del paquete:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Distancia (km):");

        cmbUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuariosActionPerformed(evt);
            }
        });

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

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblEnvioConfirmado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEnvioConfirmado)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCotizar)
                    .addComponent(lblResultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(lblEnvioConfirmado))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
            try {
        String nombreUsuario = (String) cmbUsuarios.getSelectedItem();
        if (nombreUsuario == null) {
            envioCotizado = false;
            lblResultado.setText("No hay usuarios creados");
            return;
        }
        User usuario = plataforma.getUsuarios().stream()
                .filter(u -> u.getName().equals(nombreUsuario))
                .findFirst().orElse(null);
        PackageSize tamano = PackageSize.valueOf((String) cmbTamano.getSelectedItem());
        double distancia = Double.parseDouble(txtDistancia.getText().trim());
             if (distancia <= 0) {
    envioCotizado = false;
    btnConfirmar.setEnabled(false);
    lblResultado.setText("La distancia debe ser mayor que 0");
    lblEnvioConfirmado.setText("");
        return;
}
        
        Servicio s = plataforma.pedirEnvio(usuario, tamano, distancia);
        lblResultado.setText("Precio: $" + String.format("%.2f", s.calcularPrecio()));
        envioCotizado = true;
        btnConfirmar.setEnabled(true);
    }catch (NumberFormatException e) {
        envioCotizado = false;
        btnConfirmar.setEnabled(false);
        lblResultado.setText("Ingresá una distancia válida");
        lblEnvioConfirmado.setText("");
        }           
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void cmbTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTamanoActionPerformed
                                                 
    }//GEN-LAST:event_cmbTamanoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!envioCotizado) {
            lblEnvioConfirmado.setText("Primero debe cotizar el envio");
        return;
    }
    PackageSize tamano =
        PackageSize.valueOf(
            (String) cmbTamano.getSelectedItem()
        );

    Driver conductor =
        plataforma.getRepartidorPorTamano(tamano);

    if (conductor == null) {
    lblEnvioConfirmado.setText("No hay repartidores disponibles");
    return;
    }
    int tiempo = plataforma.generarTiempoLlegada(conductor);

    lblEnvioConfirmado.setText(
        "<html>Envio confirmado.<br>" +
        "Conductor: " + conductor.getName() +
        "<br>Vehículo: " +
        conductor.getVehicle().getBrand() +
        " " +
        conductor.getVehicle().getModel() +
        "<br> Llegara en aproximadamente " + tiempo + " minutos</html>"
    );              
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cmbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JComboBox<String> cmbTamano;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEnvioConfirmado;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}
