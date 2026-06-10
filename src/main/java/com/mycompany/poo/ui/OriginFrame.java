package com.mycompany.poo.ui;
import com.mycompany.poo.app.Plataforma;
import javax.swing.Box;


public class OriginFrame extends javax.swing.JFrame {
    private Plataforma plataforma = new Plataforma();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(OriginFrame.class.getName());
    
    private javax.swing.JPanel panelMenu;
    
   public OriginFrame() {
    initComponents();

    setTitle("Prototipo Viajes");
    setSize(800, 600);
    setLocationRelativeTo(null);

    crearInterfaz();

    mostrarMenuInicio();
}
   
   private void crearInterfaz() {

    getContentPane().removeAll();

    setLayout(new java.awt.BorderLayout());

    panelMenu = new javax.swing.JPanel();
    panelMenu.setPreferredSize(new java.awt.Dimension(220, 700));
    panelMenu.setBackground(new java.awt.Color(45, 52, 54));

    panelMenu.setLayout(
        new javax.swing.BoxLayout(
            panelMenu,
            javax.swing.BoxLayout.Y_AXIS
        )
    );

    javax.swing.JLabel titulo =
            new javax.swing.JLabel("Bienvenido");

    titulo.setForeground(java.awt.Color.WHITE);
    titulo.setFont(
            new java.awt.Font(
                    "Arial",
                    java.awt.Font.BOLD,
                    24
            )
    );

    titulo.setAlignmentX(CENTER_ALIGNMENT);

    javax.swing.JButton btnUsuarios =
            new javax.swing.JButton("Usuarios");

    javax.swing.JButton btnEnvios =
            new javax.swing.JButton("Envíos");

    javax.swing.JButton btnViajes =
            new javax.swing.JButton("Viajes");

    java.awt.Dimension tamaño =
            new java.awt.Dimension(180, 50);

    btnUsuarios.setMaximumSize(tamaño);
    btnEnvios.setMaximumSize(tamaño);
    btnViajes.setMaximumSize(tamaño);

    btnUsuarios.setAlignmentX(CENTER_ALIGNMENT);
    btnEnvios.setAlignmentX(CENTER_ALIGNMENT);
    btnViajes.setAlignmentX(CENTER_ALIGNMENT);

    panelMenu.add(Box.createVerticalStrut(30));
    panelMenu.add(titulo);
    panelMenu.add(Box.createVerticalStrut(40));

    panelMenu.add(btnUsuarios);
    panelMenu.add(Box.createVerticalStrut(15));

    panelMenu.add(btnEnvios);
    panelMenu.add(Box.createVerticalStrut(15));

    panelMenu.add(btnViajes);

    add(panelMenu, java.awt.BorderLayout.WEST);
    add(panelContenido, java.awt.BorderLayout.CENTER);

    btnUsuarios.addActionListener(e -> mostrarUsuarios());
    btnEnvios.addActionListener(e -> mostrarEnvios());
    btnViajes.addActionListener(e -> mostrarViajes());

    revalidate();
    repaint();
}
   
   public void mostrarMenuInicio() {

    panelContenido.removeAll();

    panelContenido.setLayout(
        new java.awt.GridBagLayout()
    );

    javax.swing.JLabel bienvenida =
            new javax.swing.JLabel(
                    "Sistema Uber en Linea"
            );

    bienvenida.setFont(
            new java.awt.Font(
                    "Arial",
                    java.awt.Font.BOLD,
                    28
            )
    );

    panelContenido.add(bienvenida);

    panelContenido.revalidate();
    panelContenido.repaint();
}
   private void mostrarUsuarios() {

    panelContenido.removeAll();

    panelContenido.add(
        new UsuarioPanel(plataforma, this)
    );

    panelContenido.revalidate();
    panelContenido.repaint();
}
   private void mostrarEnvios() {

    panelContenido.removeAll();

    panelContenido.add(
        new EnvioPanel(plataforma,this)
    );

    panelContenido.revalidate();
    panelContenido.repaint();
}
   private void mostrarViajes() {

    panelContenido.removeAll();

    panelContenido.add(
        new ViajePanel(plataforma,this)
    );

    panelContenido.revalidate();
    panelContenido.repaint();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenido.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new OriginFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}
