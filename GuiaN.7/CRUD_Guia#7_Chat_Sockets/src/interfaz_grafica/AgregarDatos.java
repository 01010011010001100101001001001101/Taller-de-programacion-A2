package interfaz_grafica;

import chat.ChatSockets;
import controlador.UsuarioControlador;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Validador;

/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class AgregarDatos extends javax.swing.JFrame {

    public AgregarDatos() {
        initComponents();
        btnAgregarDatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        btnAgregarDatos = new javax.swing.JButton();
        btnActualizarDatos = new javax.swing.JButton();
        btnEliminarDatos = new javax.swing.JButton();
        btnMostrarTabla = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarDatos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        PanelAgregarDatos = new javax.swing.JPanel();
        txtFieldTipoID = new javax.swing.JTextField();
        txtFieldNumeroID = new javax.swing.JTextField();
        txtFieldNombreCompleto = new javax.swing.JTextField();
        txtFieldEdad = new javax.swing.JTextField();
        txtFieldCorreo = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();
        txtFieldSemestre = new javax.swing.JTextField();
        txtFieldCarrera = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarDatosRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelMenu.setBackground(new java.awt.Color(129, 19, 19));
        PanelMenu.setPreferredSize(new java.awt.Dimension(220, 600));

        btnAgregarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnAgregarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnAgregarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDatos.setText("Agregar datos ");
        btnAgregarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatosActionPerformed(evt);
            }
        });

        btnActualizarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnActualizarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatos.setText("Actualizar datos ");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        btnEliminarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnEliminarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDatos.setText("Eliminar datos ");
        btnEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosActionPerformed(evt);
            }
        });

        btnMostrarTabla.setBackground(new java.awt.Color(207, 38, 53));
        btnMostrarTabla.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMostrarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarTabla.setText("Mostrar tabla");
        btnMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTablaActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/Menú de opciones parte superior.png"))); // NOI18N

        btnBuscarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnBuscarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDatos.setText("Buscar datos");
        btnBuscarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDatosActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(207, 38, 53));
        btnVolver.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a menu");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnChat.setBackground(new java.awt.Color(207, 38, 53));
        btnChat.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setText("Chat");
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btnAgregarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(btnAgregarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBuscarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEliminarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        PanelAgregarDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelAgregarDatos.setForeground(new java.awt.Color(255, 255, 255));
        PanelAgregarDatos.setPreferredSize(new java.awt.Dimension(786, 600));

        txtFieldTipoID.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txtFieldTipoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTipoIDActionPerformed(evt);
            }
        });

        txtFieldNumeroID.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldNombreCompleto.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldEdad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldTelefono.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldSemestre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txtFieldCarrera.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/Sebastian&Thomas.png"))); // NOI18N
        jLabel9.setText("SRE&THOMAS");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel10.setText("Creación y ingreso de datos del usuario");

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("A continuación debera ingresar en los campos de texto los datos que se le son pedidos, los datos como el ");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("numero de ID, edad, telefono y semestre deberan ser numeros enteros y los datos de tipo de id, nombres");

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setText("y carrera seran caracteres igual que correo solo que para el correo debera ingresar el correo en el formato");

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setText("(contexto@direcciondelcorreo), asi se podran ingresar de manera exitosa sus datos.");

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel16.setText("Ingrese los siguientes datos:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de ID:");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel4.setText("Numero de ID:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setText("Nombre completo:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel6.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel7.setText("Correo electronico:");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel8.setText("Numero telefonico:");

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel17.setText("Semestre:");

        jLabel26.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel26.setText("Carrera:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/derecha decoracion ingreso.png"))); // NOI18N

        btnAgregarDatosRegistro.setBackground(new java.awt.Color(247, 19, 19));
        btnAgregarDatosRegistro.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnAgregarDatosRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDatosRegistro.setText("Agregar datos a el registro");
        btnAgregarDatosRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatosRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarDatosLayout = new javax.swing.GroupLayout(PanelAgregarDatos);
        PanelAgregarDatos.setLayout(PanelAgregarDatosLayout);
        PanelAgregarDatosLayout.setHorizontalGroup(
            PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(504, 504, 504)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel17)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel26)
                        .addGap(6, 6, 6)
                        .addComponent(txtFieldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarDatosRegistro)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        PanelAgregarDatosLayout.setVerticalGroup(
            PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(12, 12, 12)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(txtFieldTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addComponent(txtFieldNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(txtFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6))
                            .addComponent(txtFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(txtFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel17))
                            .addComponent(txtFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelAgregarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel26))
                            .addComponent(txtFieldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarDatosRegistro)
                        .addGap(70, 70, 70))
                    .addComponent(jLabel1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelAgregarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelAgregarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatosActionPerformed
        new AgregarDatos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarDatosActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        new ActualizarDatos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnEliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosActionPerformed
        new EliminarDatos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminarDatosActionPerformed

    private void btnMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTablaActionPerformed
        new MostrarTablaConDatos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarTablaActionPerformed

    private void btnBuscarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDatosActionPerformed
        new BuscarDatos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarDatosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtFieldTipoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTipoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTipoIDActionPerformed

    private void btnAgregarDatosRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatosRegistroActionPerformed
        try {
            String tipoID = txtFieldTipoID.getText().trim();
            String nroIDStr = txtFieldNumeroID.getText().trim();
            String nombres = txtFieldNombreCompleto.getText().trim();
            String edadStr = txtFieldEdad.getText().trim();
            String correo = txtFieldCorreo.getText().trim();
            String telefonoStr = txtFieldTelefono.getText().trim();
            String semestreStr = txtFieldSemestre.getText().trim();
            String carrera = txtFieldCarrera.getText().trim();
            if (!validarCamposRequeridos(tipoID, nroIDStr, nombres, edadStr, correo, telefonoStr, semestreStr, carrera)) {
                return;
            }
            long nroID = Long.parseLong(nroIDStr);
            int edad = Integer.parseInt(edadStr);
            long telefono = Long.parseLong(telefonoStr);
            int semestre = Integer.parseInt(semestreStr);
            if (!validarDatos(tipoID, nombres, edad, correo, telefonoStr, semestre, carrera)) {
                return;
            }
            Usuario nuevoUsuario = new Usuario(nroID, tipoID, nombres, edad, correo, telefono, semestre, carrera);
            UsuarioControlador controlador = new UsuarioControlador();
            if (controlador.crearUsuario(nuevoUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar usuario");
            }
        } catch (NumberFormatException e) {
            Validador.mostrarError("Formato numérico inválido en campos numéricos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarDatosRegistroActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        new ChatSockets().setVisible(true);
    }//GEN-LAST:event_btnChatActionPerformed
    private boolean validarCamposRequeridos(String... campos) {
        String[] nombresCampos = {"Tipo ID", "Número ID", "Nombres", "Edad", "Correo", "Teléfono", "Semestre", "Carrera"};

        for (int i = 0; i < campos.length; i++) {
            if (campos[i] == null || campos[i].trim().isEmpty()) {
                Validador.mostrarError("El campo " + nombresCampos[i] + " es obligatorio");
                return false;
            }
        }
        return true;
    }

    private boolean validarDatos(String tipoID, String nombres, int edad, String correo, String telefonoStr, int semestre, String carrera) {
        if (!Validador.validarTelefono(telefonoStr)) {
            return false;
        }
        if (!Validador.validarCorreo(correo)) {
            return false;
        }
        if (!Validador.validarNombre(nombres)) {
            return false;
        }
        if (!Validador.validarEdad(edad)) {
            return false;
        }
        if (!Validador.validarSemestre(semestre)) {
            return false;
        }
        if (!Validador.validarCarrera(carrera)) {
            return false;
        }
        return true;
    }

    private void limpiarCampos() {
        txtFieldTipoID.setText("");
        txtFieldNumeroID.setText("");
        txtFieldNombreCompleto.setText("");
        txtFieldEdad.setText("");
        txtFieldCorreo.setText("");
        txtFieldTelefono.setText("");
        txtFieldSemestre.setText("");
        txtFieldCarrera.setText("");
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AgregarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarDatos().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregarDatos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnAgregarDatosRegistro;
    private javax.swing.JButton btnBuscarDatos;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFieldCarrera;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldEdad;
    private javax.swing.JTextField txtFieldNombreCompleto;
    private javax.swing.JTextField txtFieldNumeroID;
    private javax.swing.JTextField txtFieldSemestre;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldTipoID;
    // End of variables declaration//GEN-END:variables
}
