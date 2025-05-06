package interfaz_grafica;
import chat.ChatSockets;
import controlador.UsuarioControlador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
    public class MostrarTablaConDatos extends javax.swing.JFrame {
    public MostrarTablaConDatos() {
    initComponents();
    btnMostrarTabla.setEnabled(false);
    actualizarTabla();
   TableDatos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        int row = TableDatos.rowAtPoint(e.getPoint());
        int column = TableDatos.columnAtPoint(e.getPoint());
        if (row > -1 && column > -1) {
            Object value = TableDatos.getValueAt(row, column);
            if (value != null) {
                TableDatos.setToolTipText("<html><p width='300'>" + value.toString() + "</p></html>");
            } else {
                TableDatos.setToolTipText(null);
            }
        }
    }
}); 
}
private void actualizarTabla() {
    DefaultTableModel model = (DefaultTableModel) TableDatos.getModel();
    model.setRowCount(0);
    List<Usuario> usuarios = null;
        try {
            usuarios = new UsuarioControlador().obtenerTodosUsuarios();
        } catch (Exception ex) {
            Logger.getLogger(MostrarTablaConDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    for (Usuario u : usuarios) {
        model.addRow(new Object[]{
            u.getNroID(),
            u.getTipoID(),
            u.getNombres(),
            u.getEdad(),
            u.getCorreo(),
            u.getCelular(),
            u.getSemestre(),
            u.getCarrera()
        });
    }
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
        PanelMostrarTablaDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelMenu.setBackground(new java.awt.Color(129, 19, 19));
        PanelMenu.setPreferredSize(new java.awt.Dimension(220, 600));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnAgregarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnAgregarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDatos.setText("Agregar datos ");
        btnAgregarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatosActionPerformed(evt);
            }
        });
        PanelMenu.add(btnAgregarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 126, 185, 45));

        btnActualizarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnActualizarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatos.setText("Actualizar datos ");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });
        PanelMenu.add(btnActualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 240, 185, 45));

        btnEliminarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnEliminarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarDatos.setText("Eliminar datos ");
        btnEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosActionPerformed(evt);
            }
        });
        PanelMenu.add(btnEliminarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 297, 185, 45));

        btnMostrarTabla.setBackground(new java.awt.Color(207, 38, 53));
        btnMostrarTabla.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnMostrarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarTabla.setText("Mostrar tabla");
        btnMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTablaActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 354, 185, 45));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_interfaz/Menú de opciones parte superior.png"))); // NOI18N
        PanelMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        btnBuscarDatos.setBackground(new java.awt.Color(207, 38, 53));
        btnBuscarDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnBuscarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDatos.setText("Buscar datos");
        btnBuscarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDatosActionPerformed(evt);
            }
        });
        PanelMenu.add(btnBuscarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 183, 185, 45));

        btnVolver.setBackground(new java.awt.Color(207, 38, 53));
        btnVolver.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a menu");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        PanelMenu.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 185, 45));

        btnChat.setBackground(new java.awt.Color(207, 38, 53));
        btnChat.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnChat.setForeground(new java.awt.Color(255, 255, 255));
        btnChat.setText("Chat");
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });
        PanelMenu.add(btnChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 411, 185, 45));

        PanelMostrarTablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelMostrarTablaDatos.setPreferredSize(new java.awt.Dimension(786, 600));

        TableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero ID", "Tipo ID", "Nombres", "Edad", "Correo", "Celular", "Semestre", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(TableDatos);

        javax.swing.GroupLayout PanelMostrarTablaDatosLayout = new javax.swing.GroupLayout(PanelMostrarTablaDatos);
        PanelMostrarTablaDatos.setLayout(PanelMostrarTablaDatosLayout);
        PanelMostrarTablaDatosLayout.setHorizontalGroup(
            PanelMostrarTablaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMostrarTablaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMostrarTablaDatosLayout.setVerticalGroup(
            PanelMostrarTablaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarTablaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelMostrarTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelMostrarTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        new ChatSockets().setVisible(true);
    }//GEN-LAST:event_btnChatActionPerformed
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
            java.util.logging.Logger.getLogger(MostrarTablaConDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarTablaConDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarTablaConDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarTablaConDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new MostrarTablaConDatos().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelMostrarTablaDatos;
    private javax.swing.JTable TableDatos;
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnBuscarDatos;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
