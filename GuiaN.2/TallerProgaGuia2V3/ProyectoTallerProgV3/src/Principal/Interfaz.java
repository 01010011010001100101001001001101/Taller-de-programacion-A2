/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.RegistroUsuario;

/**
 *
 * @author Usuario
 */
public class Interfaz extends javax.swing.JFrame {
    
    // Instancia para las operaciones CRUD
    private final RegistroUsuario registro;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        // Inicializar la lógica de registros (o controlador)
        registro = new RegistroUsuario();
        // Mostrar lista de usuarios al arrancar
        mostrarUsuariosEnTextArea();
    }

    /**
     * Muestra en txtAreaInfo todos los usuarios almacenados.
     */
    private void mostrarUsuariosEnTextArea() {
        List<RegistroUsuario> usuarios = registro.listarRegistros();
        if (usuarios.isEmpty()) {
            txtAreaInfo.setText("No hay usuarios registrados.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (RegistroUsuario u : usuarios) {
                sb.append(u).append("\n");
            }
            txtAreaInfo.setText(sb.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInfo = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txfieldID = new javax.swing.JTextField();
        txfieldNombre = new javax.swing.JTextField();
        txfieldEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtAreaInfo.setColumns(20);
        txtAreaInfo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtAreaInfo.setRows(5);
        txtAreaInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(0, 12, 119))); // NOI18N
        jScrollPane1.setViewportView(txtAreaInfo);

        btnSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 12, 119));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 107, 182));

        btnEditar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 12, 119));
        btnEditar.setText("Editar datos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 12, 119));
        btnBuscar.setText("Buscar datos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 12, 119));
        btnEliminar.setText("Eliminar datos");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 107, 182));

        txfieldID.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txfieldNombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        txfieldEdad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad:");

        btnAgregar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 12, 119));
        btnAgregar.setText("Agregar datos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(txfieldNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Interfaz/Imagen izquierda.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Interfaz/parte superior derecha decoracion.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Interfaz/parte inferior derecha  decoracion.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String id = txfieldID.getText().trim();
            String nombre = txfieldNombre.getText().trim();
            String edadStr = txfieldEdad.getText().trim();

            if (id.isEmpty() || nombre.isEmpty() || edadStr.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, complete todos los campos: ID, Nombre y Edad.",
                        "Campos incompletos",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            int edad = Integer.parseInt(edadStr);
            // Crear el usuario y agregar
            RegistroUsuario nuevo = new RegistroUsuario(id, nombre, edad);
            if (registro.agregarRegistro(nuevo)) {
                JOptionPane.showMessageDialog(this,
                        "Usuario agregado exitosamente.",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error al agregar usuario (posible ID duplicado).",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "La edad debe ser un número entero.",
                    "Formato inválido",
                    JOptionPane.ERROR_MESSAGE);
        }

        // Refrescamos la lista de usuarios en el TextArea
        mostrarUsuariosEnTextArea();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Pedimos el ID por JOptionPane
        String id = JOptionPane.showInputDialog(this,
                "Ingrese ID del usuario a editar:",
                "Editar Usuario",
                JOptionPane.QUESTION_MESSAGE);
        if (id == null || id.isBlank()) {
            return; // Cancelado o vacío
        }

        // Buscamos el usuario
        RegistroUsuario usuarioEditar = registro.buscar(id);
        if (usuarioEditar == null) {
            JOptionPane.showMessageDialog(this,
                    "Usuario no encontrado (ID inválido).",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Preguntamos qué desea editar (Nombre, Edad o Ambos)
        Object[] opciones = { "Nombre", "Edad", "Ambos" };
        int opcionEdicion = JOptionPane.showOptionDialog(
                this,
                "¿Qué desea editar?",
                "Editar Usuario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opciones, 
                opciones[0]
        );
        // Devuelve 0 (Nombre), 1 (Edad), 2 (Ambos), o -1 si cierra

        if (opcionEdicion == -1) {
            return; // Cerró la ventana de opciones
        }

        switch (opcionEdicion) {
            case 0 -> { // Editar solo Nombre
                String nuevoNombre = JOptionPane.showInputDialog(this,
                        "Nuevo Nombre:",
                        usuarioEditar.getNombre());
                if (nuevoNombre != null && !nuevoNombre.isBlank()) {
                    usuarioEditar.setNombre(nuevoNombre);
                }
            }
            case 1 -> { // Editar solo Edad
                String nuevaEdadStr = JOptionPane.showInputDialog(this,
                        "Nueva Edad:",
                        String.valueOf(usuarioEditar.getEdad()));
                if (nuevaEdadStr != null && !nuevaEdadStr.isBlank()) {
                    try {
                        int nuevaEdad = Integer.parseInt(nuevaEdadStr);
                        usuarioEditar.setEdad(nuevaEdad);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "La edad debe ser un número entero.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            case 2 -> { // Editar ambos
                // Nombre
                String nuevoNombre = JOptionPane.showInputDialog(this,
                        "Nuevo Nombre:",
                        usuarioEditar.getNombre());
                if (nuevoNombre != null && !nuevoNombre.isBlank()) {
                    usuarioEditar.setNombre(nuevoNombre);
                }
                // Edad
                String nuevaEdadStr = JOptionPane.showInputDialog(this,
                        "Nueva Edad:",
                        String.valueOf(usuarioEditar.getEdad()));
                if (nuevaEdadStr != null && !nuevaEdadStr.isBlank()) {
                    try {
                        int nuevaEdad = Integer.parseInt(nuevaEdadStr);
                        usuarioEditar.setEdad(nuevaEdad);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "La edad debe ser un número entero.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }

        // Guardamos los cambios
        boolean actualizado = registro.editarRegistro(usuarioEditar);
        if (actualizado) {
            JOptionPane.showMessageDialog(this,
                    "Usuario actualizado correctamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al actualizar usuario.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        // Refrescamos la lista en el txtAreaInfo
        mostrarUsuariosEnTextArea();                                    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = JOptionPane.showInputDialog(this,
                "Ingrese ID del usuario a buscar:",
                "Buscar Usuario",
                JOptionPane.QUESTION_MESSAGE);
        if (id == null || id.isBlank()) {
            return;
        }

        RegistroUsuario encontrado = registro.buscar(id);
        if (encontrado != null) {
            JOptionPane.showMessageDialog(this,
                    "Usuario encontrado:\n" + encontrado,
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Usuario no encontrado.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = JOptionPane.showInputDialog(this,
                "Ingrese ID del usuario a eliminar:",
                "Eliminar Usuario",
                JOptionPane.QUESTION_MESSAGE);
        if (id == null || id.isBlank()) {
            return;
        }

        if (registro.borrarRegistro(id)) {
            JOptionPane.showMessageDialog(this,
                    "Usuario eliminado correctamente.",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar usuario (ID no encontrado).",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        // Refrescamos la lista en el txtAreaInfo
        mostrarUsuariosEnTextArea();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de que desea SALIR y ELIMINAR todos los datos?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            registro.borrarTodo();
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txfieldEdad;
    private javax.swing.JTextField txfieldID;
    private javax.swing.JTextField txfieldNombre;
    private javax.swing.JTextArea txtAreaInfo;
    // End of variables declaration//GEN-END:variables
}
