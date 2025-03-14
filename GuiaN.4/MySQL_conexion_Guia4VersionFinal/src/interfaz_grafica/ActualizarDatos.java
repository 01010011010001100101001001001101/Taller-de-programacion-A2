package interfaz_grafica;

import controlador.UsuarioControlador;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Validador;

/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class ActualizarDatos extends javax.swing.JFrame {

    public ActualizarDatos() {
        initComponents();
        btnActualizarDatos.setEnabled(false);
        txtAreaActualizar.setEditable(false);
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
        PanelActualizarDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldActualizar = new javax.swing.JTextField();
        btnActualizarDatosRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaActualizar = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(12, 12, 12)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelActualizarDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelActualizarDatos.setPreferredSize(new java.awt.Dimension(786, 600));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/Sebastian&Thomas.png"))); // NOI18N
        jLabel2.setText("SRE&THOMAS");
        jLabel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(247, 19, 19));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actualización de datos con su numero de ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("Debera ingresar el numero de ID que es el identificador principal del usuario en el registro o en la base de datos");

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setText("posteriormente darle al boton actualizar y le saldra un menu de opciones acerca del dato que desea actualizar.");

        jPanel4.setBackground(new java.awt.Color(129, 19, 19));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el numero del ID a actualizar:");

        txtFieldActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizarDatosRegistro.setBackground(new java.awt.Color(247, 19, 19));
        btnActualizarDatosRegistro.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarDatosRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatosRegistro.setText("Actualizar");
        btnActualizarDatosRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosRegistroActionPerformed(evt);
            }
        });

        txtAreaActualizar.setColumns(20);
        txtAreaActualizar.setRows(5);
        jScrollPane1.setViewportView(txtAreaActualizar);

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setText("Ya ingresado el numero del ID que desea actualizar, por favor hacer clic en el boton \"Actualizar\" para dar");

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("continuidad al proceso donde mediante una ventana emergente le pedira uno de los 7 datos que desea ");

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel17.setText("modificar, excluyendo el numero de id que es inmodificable, luego le mostrara un mensaje de confirmación.");

        javax.swing.GroupLayout PanelActualizarDatosLayout = new javax.swing.GroupLayout(PanelActualizarDatos);
        PanelActualizarDatos.setLayout(PanelActualizarDatosLayout);
        PanelActualizarDatosLayout.setHorizontalGroup(
            PanelActualizarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarDatosLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(PanelActualizarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelActualizarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarDatosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelActualizarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarDatosLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarDatosLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(PanelActualizarDatosLayout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)))
        );
        PanelActualizarDatosLayout.setVerticalGroup(
            PanelActualizarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(4, 4, 4)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarDatosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnActualizarDatosRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosRegistroActionPerformed
        try {
            String idStr = txtFieldActualizar.getText().trim();
            if (!Validador.validarCampoRequerido(idStr, "ID")) {
                return;
            }
            long nroID = Long.parseLong(idStr);
            UsuarioControlador controlador = new UsuarioControlador();
            Usuario usuario = controlador.obtenerUsuario(nroID);
            if (usuario == null) {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                return;
            }
            String[] campos = {"Tipo ID", "Nombres", "Edad", "Correo", "Teléfono", "Semestre", "Carrera"};
            String campo = (String) JOptionPane.showInputDialog(
                    this,
                    "Seleccione campo a actualizar:",
                    "Actualizar Campo",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    campos,
                    campos[0]
            );

            if (campo == null) {
                return;
            }
            String nuevoValor = JOptionPane.showInputDialog(this, "Ingrese nuevo valor para " + campo + ":");
            if (!Validador.validarCampoRequerido(nuevoValor, campo)) {
                return;
            }
            switch (campo) {
                case "Nombres" -> {
                    if (!Validador.validarNombre(nuevoValor)) {
                        return;
                    }
                    usuario.setNombres(nuevoValor);
                }
                case "Edad" -> {
                    try {
                        int edad = Integer.parseInt(nuevoValor);
                        if (!Validador.validarEdad(edad)) {
                            return;
                        }
                        usuario.setEdad(edad);
                    } catch (NumberFormatException e) {
                        Validador.mostrarError("La edad debe ser un número válido");
                        return;
                    }
                }
                case "Correo" -> {
                    if (!Validador.validarCorreo(nuevoValor)) {
                        return;
                    }
                    usuario.setCorreo(nuevoValor);
                }
                case "Teléfono" -> {
                    if (!Validador.validarTelefono(nuevoValor)) {
                        return;
                    }
                    try {
                        usuario.setCelular(Long.parseLong(nuevoValor));
                    } catch (NumberFormatException e) {
                        Validador.mostrarError("El teléfono debe contener solo números");
                        return;
                    }
                }
                case "Semestre" -> {
                    try {
                        int semestre = Integer.parseInt(nuevoValor);
                        if (!Validador.validarSemestre(semestre)) {
                            return;
                        }
                        usuario.setSemestre(semestre);
                    } catch (NumberFormatException e) {
                        Validador.mostrarError("El semestre debe ser un número válido");
                        return;
                    }
                }
                case "Carrera" -> {
                    if (!Validador.validarCarrera(nuevoValor)) {
                        return;
                    }
                    usuario.setCarrera(nuevoValor);
                }
            }
            if (controlador.actualizarUsuario(usuario)) {
                JOptionPane.showMessageDialog(this, "Actualización exitosa");
                txtAreaActualizar.setText(obtenerDatosUsuario(usuario));
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar los datos");
            }
        } catch (NumberFormatException e) {
            Validador.mostrarError("El ID debe ser un número válido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarDatosRegistroActionPerformed
    private String obtenerDatosUsuario(Usuario usuario) {
        return """
           Datos actualizados:
           N\u00famero ID: """ + usuario.getNroID() + "\n"
                + "Tipo ID: " + usuario.getTipoID() + "\n"
                + "Nombres: " + usuario.getNombres() + "\n"
                + "Edad: " + usuario.getEdad() + "\n"
                + "Correo: " + usuario.getCorreo() + "\n"
                + "Teléfono: " + usuario.getCelular() + "\n"
                + "Semestre: " + usuario.getSemestre() + "\n"
                + "Carrera: " + usuario.getCarrera();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new ActualizarDatos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelActualizarDatos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnActualizarDatosRegistro;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnBuscarDatos;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaActualizar;
    private javax.swing.JTextField txtFieldActualizar;
    // End of variables declaration//GEN-END:variables
}
