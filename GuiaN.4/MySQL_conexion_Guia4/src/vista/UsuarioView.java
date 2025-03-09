/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.UsuarioController;
import modelo.Usuario;
import exceptions.DAOException;
import exceptions.ValidationException;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuario
 */
public class UsuarioView extends JFrame {

    private UsuarioController controller;
    private DefaultTableModel tableModel;
    private JTextField txtTipoID, txtNroID, txtNombres, txtCorreo, txtCelular;
    private JTable tablaUsuarios;

    public UsuarioView() {
        try {
            controller = new UsuarioController();
            initComponents();
            cargarDatos();
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, "Error inicial: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void initComponents() {
        setTitle("Gestión de Usuarios");
        setLayout(new BorderLayout(10, 10));
        setSize(800, 600);          
        setLocationRelativeTo(null); 
        setResizable(false);        
        // Panel de formulario
        JPanel panelForm = new JPanel(new GridLayout(5, 2, 5, 5));
        panelForm.add(new JLabel("Tipo ID:"));
        txtTipoID = new JTextField();
        panelForm.add(txtTipoID);

        panelForm.add(new JLabel("Número ID:"));
        txtNroID = new JTextField();
        panelForm.add(txtNroID);

        panelForm.add(new JLabel("Nombres:"));
        txtNombres = new JTextField();
        panelForm.add(txtNombres);

        panelForm.add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        panelForm.add(txtCorreo);

        panelForm.add(new JLabel("Celular:"));
        txtCelular = new JTextField();
        panelForm.add(txtCelular);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this::guardarUsuario);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(this::actualizarUsuario);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this::eliminarUsuario);

        JButton btnLimpiar = new JButton("Limpiar Datos");
        btnLimpiar.addActionListener(e -> limpiarCampos());

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> {
            System.exit(0);
        });
        
        panelBotones.add(btnGuardar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnSalir);

        // Tabla de resultados
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Tipo ID");
        tableModel.addColumn("Número ID");
        tableModel.addColumn("Nombres");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Celular");

        tablaUsuarios = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);

        add(panelForm, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void cargarDatos() {
        try {
            List<Usuario> usuarios = controller.listarUsuarios();
            tableModel.setRowCount(0);
            for (Usuario u : usuarios) {
                tableModel.addRow(new Object[]{
                    u.getTipoID(),
                    u.getNroID(),
                    u.getNombres(),
                    u.getCorreo(),
                    u.getCelular()
                });
            }
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarUsuario(ActionEvent e) {
        try {
            Usuario usuario = obtenerUsuarioDesdeFormulario();
            controller.crearUsuario(usuario);
            cargarDatos();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Usuario creado exitosamente");
        } catch (ValidationException | DAOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarUsuario(ActionEvent e) {
        try {
            String nroID = JOptionPane.showInputDialog(this, "Ingrese el Número ID a actualizar:", "Actualizar Usuario", JOptionPane.QUESTION_MESSAGE);
            if (nroID == null || nroID.trim().isEmpty()) {
                throw new ValidationException("Debe ingresar un Número ID válido");
            }

            Usuario usuarioExistente = controller.buscarUsuario(nroID);
            if (usuarioExistente == null) {
                throw new ValidationException("Usuario no encontrado");
            }

            // Crear diálogo de selección de campos
            JComboBox<String> campoCombo = new JComboBox<>(new String[]{"Tipo ID", "Nombres", "Correo", "Celular"});
            JOptionPane.showMessageDialog(this, campoCombo, "Seleccione el campo a modificar", JOptionPane.QUESTION_MESSAGE);
            String campoSeleccionado = (String) campoCombo.getSelectedItem();

            String nuevoValor = JOptionPane.showInputDialog(this, "Ingrese nuevo valor para " + campoSeleccionado + ":", "Actualizar Campo", JOptionPane.QUESTION_MESSAGE);
            if (nuevoValor == null || nuevoValor.trim().isEmpty()) {
                throw new ValidationException("Debe ingresar un valor válido");
            }

            // Actualizar campo correspondiente
            Usuario usuarioActualizado = new Usuario(
                    usuarioExistente.getTipoID(),
                    usuarioExistente.getNroID(),
                    usuarioExistente.getNombres(),
                    usuarioExistente.getCorreo(),
                    usuarioExistente.getCelular()
            );

            switch (campoSeleccionado) {
                case "Tipo ID":
                    usuarioActualizado.setTipoID(nuevoValor);
                    break;
                case "Nombres":
                    usuarioActualizado.setNombres(nuevoValor);
                    break;
                case "Correo":
                    if (!validarEmail(nuevoValor)) {
                        throw new ValidationException("Formato de correo inválido");
                    }
                    usuarioActualizado.setCorreo(nuevoValor);
                    break;
                case "Celular":
                    if (!validarCelular(nuevoValor)) {
                        throw new ValidationException("Celular debe contener solo números");
                    }
                    usuarioActualizado.setCelular(nuevoValor);
                    break;
            }

            controller.actualizarUsuario(usuarioActualizado);
            cargarDatos();
            JOptionPane.showMessageDialog(this, "Usuario actualizado exitosamente");
        } catch (ValidationException | DAOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarUsuario(ActionEvent e) {
        try {
            String nroID = JOptionPane.showInputDialog(this, "Ingrese el Número ID a eliminar:", "Eliminar Usuario", JOptionPane.QUESTION_MESSAGE);
            if (nroID == null || nroID.trim().isEmpty()) {
                throw new ValidationException("Debe ingresar un Número ID válido");
            }

            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de eliminar al usuario con ID: " + nroID + "?",
                    "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                controller.eliminarUsuario(nroID);
                cargarDatos();
                JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente");
            }
        } catch (DAOException | ValidationException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, email);
    }

    private boolean validarCelular(String celular) {
        return Pattern.matches("\\d+", celular);
    }

    private Usuario obtenerUsuarioDesdeFormulario() {
        Usuario usuario = new Usuario();
        usuario.setTipoID(txtTipoID.getText().trim());
        usuario.setNroID(txtNroID.getText().trim());
        usuario.setNombres(txtNombres.getText().trim());
        usuario.setCorreo(txtCorreo.getText().trim());
        usuario.setCelular(txtCelular.getText().trim());
        return usuario;
    }

    private void limpiarCampos() {
        txtTipoID.setText("");
        txtNroID.setText("");
        txtNombres.setText("");
        txtCorreo.setText("");
        txtCelular.setText("");
    }

    public static void main(String[] args) {
        // Establecer el Look and Feel de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        UIManager.put("Button.arc", 999);                  // Esquinas más redondas en botones
        UIManager.put("Component.focusWidth", 2);          // Grosor del "focus" al hacer tab
        UIManager.put("Component.focusColor", new Color(0xFF4081)); // Color de foco
        UIManager.put("TextComponent.arc", 10);            // Esquinas redondeadas en campos de texto
        UIManager.put("Button.background", new Color(0xC8E6C9));  // Fondo de botones (verde claro)
        UIManager.put("Panel.background", new Color(0xF2F5F8));
        // Iniciar la ventana
        SwingUtilities.invokeLater(() -> {
            new UsuarioView().setVisible(true);
        });
    }
}
