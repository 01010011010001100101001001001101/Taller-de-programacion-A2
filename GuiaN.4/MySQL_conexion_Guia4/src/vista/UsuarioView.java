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
import java.util.regex.Pattern;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
         /*
         * Establecemos FlatLaf y algunas propiedades
         */
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        UIManager.put("Button.arc", 30);
        UIManager.put("TextComponent.arc", 10);

        setTitle("Gestión de Usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

         JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); 
        mainPanel.setBackground(new Color(0x004aad)); 
        setContentPane(mainPanel);
        JPanel panelForm = new JPanel(new GridBagLayout());
        panelForm.setBackground(new Color(0x38b6ff));
        panelForm.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Datos de Usuario",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14), 
                Color.DARK_GRAY
        ));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // espacio entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTipoID = new JLabel("Tipo ID:");
        txtTipoID = new JTextField(15);

        JLabel lblNroID = new JLabel("Número ID:");
        txtNroID = new JTextField(15);

        JLabel lblNombres = new JLabel("Nombres:");
        txtNombres = new JTextField(15);

        JLabel lblCorreo = new JLabel("Correo:");
        txtCorreo = new JTextField(15);

        JLabel lblCelular = new JLabel("Celular:");
        txtCelular = new JTextField(15);

        // Fila 0: Tipo ID
        gbc.gridx = 0; gbc.gridy = 0;
        panelForm.add(lblTipoID, gbc);
        gbc.gridx = 1; 
        panelForm.add(txtTipoID, gbc);

        // Fila 1: Número ID
        gbc.gridx = 0; gbc.gridy = 1;
        panelForm.add(lblNroID, gbc);
        gbc.gridx = 1;
        panelForm.add(txtNroID, gbc);

        // Fila 2: Nombres
        gbc.gridx = 0; gbc.gridy = 2;
        panelForm.add(lblNombres, gbc);
        gbc.gridx = 1;
        panelForm.add(txtNombres, gbc);

        // Fila 3: Correo
        gbc.gridx = 0; gbc.gridy = 3;
        panelForm.add(lblCorreo, gbc);
        gbc.gridx = 1;
        panelForm.add(txtCorreo, gbc);

        // Fila 4: Celular
        gbc.gridx = 0; gbc.gridy = 4;
        panelForm.add(lblCelular, gbc);
        gbc.gridx = 1;
        panelForm.add(txtCelular, gbc);
        mainPanel.add(panelForm, BorderLayout.NORTH);
        JPanel panelTabla = new JPanel(new BorderLayout());
        panelTabla.setBackground(new Color(0x5271ff));
        panelTabla.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Lista de Usuarios",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                Color.DARK_GRAY
        ));

        tableModel = new DefaultTableModel(new Object[][]{}, 
                new String[]{"Tipo ID", "Número ID", "Nombres", "Correo", "Celular"});
        tablaUsuarios = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        panelTabla.add(scrollPane, BorderLayout.CENTER);

        mainPanel.add(panelTabla, BorderLayout.CENTER);
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(new Color(0x38b6ff)); 
        panelBotones.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                "Acciones",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                Color.DARK_GRAY
        ));

        JButton btnGuardar = new JButton("Guardar");
        // btnGuardar.addActionListener(e -> guardarUsuario());
        
        JButton btnActualizar = new JButton("Actualizar");
        // btnActualizar.addActionListener(e -> actualizarUsuario());

        JButton btnEliminar = new JButton("Eliminar");
        // btnEliminar.addActionListener(e -> eliminarUsuario());

        JButton btnLimpiar = new JButton("Limpiar Datos");
        // btnLimpiar.addActionListener(e -> limpiarCampos());

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));

        panelBotones.add(btnGuardar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnSalir);

        mainPanel.add(panelBotones, BorderLayout.SOUTH);
    }

    // Ejemplo simple para acomodar un SpringLayout (si no quieres usar SpringUtilities, puedes cambiar a GridBagLayout)
    private static void makeCompactGrid(JPanel parent, int rows, int cols, int initX, int initY, int xPad, int yPad) {
        SpringLayout layout = (SpringLayout) parent.getLayout();
        Spring xPadSpring = Spring.constant(xPad);
        Spring yPadSpring = Spring.constant(yPad);
        Spring initialXSpring = Spring.constant(initX);
        Spring initialYSpring = Spring.constant(initY);
        Spring maxWidthSpring = Spring.constant(0);
        Spring maxHeightSpring = Spring.constant(0);

        // Calcular la celda más grande
        for (int c = 0; c < cols; c++) {
            Spring maxWidth = Spring.constant(0);
            for (int r = 0; r < rows; r++) {
                maxWidth = Spring.max(maxWidth, getConstraintsForCell(r, c, parent, cols).getWidth());
            }
            for (int r = 0; r < rows; r++) {
                SpringLayout.Constraints constraints = getConstraintsForCell(r, c, parent, cols);
                constraints.setX(Spring.sum(initialXSpring, maxWidthSpring));
                constraints.setWidth(maxWidth);
            }
            maxWidthSpring = Spring.sum(maxWidthSpring, Spring.sum(maxWidth, xPadSpring));
        }

        for (int r = 0; r < rows; r++) {
            Spring maxHeight = Spring.constant(0);
            for (int c = 0; c < cols; c++) {
                maxHeight = Spring.max(maxHeight, getConstraintsForCell(r, c, parent, cols).getHeight());
            }
            for (int c = 0; c < cols; c++) {
                SpringLayout.Constraints constraints = getConstraintsForCell(r, c, parent, cols);
                constraints.setY(Spring.sum(initialYSpring, maxHeightSpring));
                constraints.setHeight(maxHeight);
            }
            maxHeightSpring = Spring.sum(maxHeightSpring, Spring.sum(maxHeight, yPadSpring));
        }

        // Ajustar tamaño del contenedor
        SpringLayout.Constraints pCons = layout.getConstraints(parent);
        pCons.setConstraint(SpringLayout.SOUTH, Spring.sum(Spring.constant(initY), maxHeightSpring));
        pCons.setConstraint(SpringLayout.EAST, Spring.sum(Spring.constant(initX), maxWidthSpring));
    }

    private static SpringLayout.Constraints getConstraintsForCell(int row, int col, Container parent, int cols) {
        SpringLayout layout = (SpringLayout) parent.getLayout();
        Component c = parent.getComponent(row * cols + col);
        return layout.getConstraints(c);
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

    private void guardarUsuario() {
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

    private void actualizarUsuario() {
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

    private void eliminarUsuario() {
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
        SwingUtilities.invokeLater(() -> {
            new UsuarioView().setVisible(true);
        });
    }
}
