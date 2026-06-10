package com.mycompany.poo.ui;
import com.mycompany.poo.app.Plataforma;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.services.Servicio;
import com.mycompany.poo.accounts.Driver;
/**
 *
 * @author juamp
 */
public class ViajePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViajePanel
     */
public ViajePanel(Plataforma plataforma, OriginFrame frame) {
    
    initComponents();
    
    this.plataforma = plataforma;
    this.frame = frame;
    
        cmbUsuarios.setPrototypeDisplayValue(
        "XXXXXXXXXX"
    );
    
    cargarUsuarios();
    cargarTipos();
    
    btnConfirmar.setEnabled(false);
}
private Plataforma plataforma;
private OriginFrame frame;
private boolean viajeCotizado = false;

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
        btnConfirmar = new javax.swing.JButton();
        lblViajeConfirmado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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
        cmbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuariosActionPerformed(evt);
            }
        });

        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblViajeConfirmado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblViajeConfirmado)
                            .addComponent(lblResultado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbTipo, 0, 115, Short.MAX_VALUE)
                        .addComponent(cmbUsuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDistancia)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnCotizar))))
                .addGap(54, 54, 54))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCotizar)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(lblViajeConfirmado))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
            try {
        String nombreUsuario = (String) cmbUsuarios.getSelectedItem();
        if (nombreUsuario == null) {
            viajeCotizado = false;
            lblResultado.setText("No hay usuarios creados");
            return;
        }
        User usuario = plataforma.getUsuarios().stream()
                .filter(u -> u.getName().equals(nombreUsuario))
                .findFirst().orElse(null);
        String tipo = (String) cmbTipo.getSelectedItem();
        double distancia = Double.parseDouble(txtDistancia.getText().trim());
            if (distancia <= 0) {
    viajeCotizado = false;
    btnConfirmar.setEnabled(false);
    lblResultado.setText("La distancia debe ser mayor que 0");
    lblViajeConfirmado.setText("");
    return;
}
        
        Servicio s = plataforma.pedirViaje(usuario, tipo, distancia);
        lblResultado.setText("Precio: $" + String.format("%.2f", s.calcularPrecio()));
        viajeCotizado = true;
        btnConfirmar.setEnabled(true);
    } catch (NumberFormatException e) {
        viajeCotizado = false;
        btnConfirmar.setEnabled(false);
        lblResultado.setText("Ingresá una distancia válida");
        lblViajeConfirmado.setText("");
        
    }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!viajeCotizado) {
        lblViajeConfirmado.setText("Primero debe cotizar el viaje");
        return;
    }
    String tipo = (String) cmbTipo.getSelectedItem();

    Driver conductor = plataforma.getConductorPorTipo(tipo);

    if (conductor == null) {
        lblViajeConfirmado.setText("No hay conductores disponibles");
        return;
    }

    int tiempo = plataforma.generarTiempoLlegada(conductor);

     lblViajeConfirmado.setText(
    "<html>Viaje confirmado.<br>" +
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
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblViajeConfirmado;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}
