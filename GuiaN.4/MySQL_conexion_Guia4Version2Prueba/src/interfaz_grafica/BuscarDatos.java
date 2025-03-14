package interfaz_grafica;
import controlador.UsuarioControlador;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Validador;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class BuscarDatos extends javax.swing.JFrame {
    public BuscarDatos() {
        initComponents();
        btnBuscarDatos.setEnabled(false);
        txtAreaBusqueda.setEditable(false);
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
        PanelBuscarDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarDatosRegistro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaBusqueda = new javax.swing.JTextArea();

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

        PanelBuscarDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuscarDatos.setPreferredSize(new java.awt.Dimension(786, 600));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setText("Busqueda de datos con su numero de ID");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/Sebastian&Thomas.png"))); // NOI18N
        jLabel2.setText("SRE&THOMAS");
        jLabel2.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("En este apartado debera ingresar el numero del ID, del cual se le solicita para posteriormente realizar");

        txtFieldBusqueda.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese el numero del ID a buscar:");

        btnBuscarDatosRegistro.setBackground(new java.awt.Color(255, 51, 51));
        btnBuscarDatosRegistro.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnBuscarDatosRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDatosRegistro.setText("Realizar la busqueda");
        btnBuscarDatosRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDatosRegistroActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("la busqueda en el registro o base de datos en la tabla Usuario.");

        jPanel3.setBackground(new java.awt.Color(207, 38, 53));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estos son los datos de este ID:");

        txtAreaBusqueda.setBackground(new java.awt.Color(207, 38, 53));
        txtAreaBusqueda.setColumns(20);
        txtAreaBusqueda.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        txtAreaBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaBusqueda.setRows(5);
        jScrollPane2.setViewportView(txtAreaBusqueda);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 448, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelBuscarDatosLayout = new javax.swing.GroupLayout(PanelBuscarDatos);
        PanelBuscarDatos.setLayout(PanelBuscarDatosLayout);
        PanelBuscarDatosLayout.setHorizontalGroup(
            PanelBuscarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarDatosLayout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarDatosLayout.createSequentialGroup()
                .addGroup(PanelBuscarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(PanelBuscarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelBuscarDatosLayout.createSequentialGroup()
                            .addComponent(txtFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarDatosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        PanelBuscarDatosLayout.setVerticalGroup(
            PanelBuscarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(PanelBuscarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDatosRegistro))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(PanelBuscarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelBuscarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBuscarDatosRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDatosRegistroActionPerformed
    try {
        String idStr = txtFieldBusqueda.getText().trim();
        if (!Validador.validarCampoRequerido(idStr, "ID")) return;
        long nroID = Long.parseLong(idStr);
        Usuario usuario = new UsuarioControlador().obtenerUsuario(nroID);       
        if (usuario != null) {
            txtAreaBusqueda.setText(obtenerDatosUsuario(usuario));
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el usuario con ID: " + nroID);
        }
    } catch (NumberFormatException e) {
        Validador.mostrarError("El ID debe ser un número válido");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarDatosRegistroActionPerformed
    private String obtenerDatosUsuario(Usuario usuario) {
        return """
           Datos del usuario:
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
            java.util.logging.Logger.getLogger(BuscarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new BuscarDatos().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscarDatos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnBuscarDatos;
    private javax.swing.JButton btnBuscarDatosRegistro;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaBusqueda;
    private javax.swing.JTextField txtFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
