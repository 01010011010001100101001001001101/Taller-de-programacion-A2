package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CRUD_ODBC_Bridge extends JFrame {
    
    // Componentes de la interfaz
    private JTextField txtId, txtNombre, txtApellido;
    private JButton btnInsertar, btnActualizar, btnEliminar, btnListar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    // Constructor
    public CRUD_ODBC_Bridge() {
        super("Ejemplo CRUD con MySQL JDBC");

        // Panel superior con campos
        JPanel panelCampos = new JPanel(new GridLayout(3, 2, 5, 5));
        panelCampos.add(new JLabel("ID:"));
        txtId = new JTextField();
        panelCampos.add(txtId);

        panelCampos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCampos.add(txtNombre);

        panelCampos.add(new JLabel("Apellido:"));
        txtApellido = new JTextField();
        panelCampos.add(txtApellido);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        btnInsertar = new JButton("Insertar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnListar = new JButton("Listar");

        panelBotones.add(btnInsertar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnListar);

        // Tabla
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido"}, 0);
        tabla = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tabla);

        // Layout principal
        setLayout(new BorderLayout(10, 10));
        add(panelCampos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(scrollTabla, BorderLayout.SOUTH);

        // Eventos de botones
        btnInsertar.addActionListener(e -> insertarRegistro());
        btnActualizar.addActionListener(e -> actualizarRegistro());
        btnEliminar.addActionListener(e -> eliminarRegistro());
        btnListar.addActionListener(e -> listarRegistros());

        // Configuración de ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // --------------------------------------------------
    // Métodos CRUD
    // --------------------------------------------------

    private void insertarRegistro() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();

        if (nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete nombre y apellido.");
            return;
        }

        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = obtenerConexion();
            String sql = "INSERT INTO persona (nombre, apellido) VALUES (?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro insertado.");
            listarRegistros();  // Refrescar tabla
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al insertar: " + ex.getMessage());
        } finally {
            cerrarConexion(conn, pst, null);
        }
    }

    private void actualizarRegistro() {
        String idStr = txtId.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();

        if (idStr.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete ID, nombre y apellido.");
            return;
        }

        Connection conn = null;
        PreparedStatement pst = null;
        try {
            int id = Integer.parseInt(idStr);

            conn = obtenerConexion();
            String sql = "UPDATE persona SET nombre=?, apellido=? WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, id);
            int filas = pst.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(this, "Registro actualizado.");
                listarRegistros(); 
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró registro con ese ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID debe ser numérico.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + ex.getMessage());
        } finally {
            cerrarConexion(conn, pst, null);
        }
    }

    private void eliminarRegistro() {
        String idStr = txtId.getText();
        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete ID.");
            return;
        }

        Connection conn = null;
        PreparedStatement pst = null;
        try {
            int id = Integer.parseInt(idStr);

            conn = obtenerConexion();
            String sql = "DELETE FROM persona WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int filas = pst.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(this, "Registro eliminado.");
                listarRegistros();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró registro con ese ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID debe ser numérico.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage());
        } finally {
            cerrarConexion(conn, pst, null);
        }
    }

    private void listarRegistros() {
        // Limpia la tabla
        modeloTabla.setRowCount(0);

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = obtenerConexion();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT id, nombre, apellido FROM persona");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                modeloTabla.addRow(new Object[]{id, nombre, apellido});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al listar: " + ex.getMessage());
        } finally {
            cerrarConexion(conn, st, rs);
        }
    }

    // --------------------------------------------------
    // Conexión JDBC con MySQL
    // --------------------------------------------------
    private Connection obtenerConexion() throws SQLException {
        try {
            // Carga el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver JDBC de MySQL: " + e.getMessage());
        }

        // URL de conexión: usamos la base de datos "crud_taller_programación"
        String url = "jdbc:mysql://127.0.0.1:3306/crud_taller_programación?useSSL=false&serverTimezone=UTC";
        // Usuario y contraseña de MySQL
        String user = "root";
        String pass = "9rB@n28v#4Sx!Lz1"; // Cambia si tu root tiene contraseña

        return DriverManager.getConnection(url, user, pass);
    }

    // Método para cerrar recursos y evitar fugas
    private void cerrarConexion(Connection conn, Statement st, ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException ignored) {}
        try {
            if (st != null) st.close();
        } catch (SQLException ignored) {}
        try {
            if (conn != null) conn.close();
        } catch (SQLException ignored) {}
    }

    // --------------------------------------------------
    // Main
    // --------------------------------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CRUD_ODBC_Bridge();
        });
    }
}
