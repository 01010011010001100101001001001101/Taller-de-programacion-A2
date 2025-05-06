package chat;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class ServidorChat extends JFrame {
    private ServerSocket servidor;
    private final java.util.List<PrintWriter> clientes;
    private final JTextArea areaChat;
    private int contadorClientes = 0;
    public ServidorChat() {
        setTitle("Servidor de Chat");
        setSize(792, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        areaChat = new JTextArea();
        areaChat.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        areaChat.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaChat);
        add(scroll, BorderLayout.CENTER);
        clientes = Collections.synchronizedList(new ArrayList<>());
        iniciarServidor();
    }
    private void iniciarServidor() {
        Thread hiloServidor = new Thread(() -> {
            try {
                servidor = new ServerSocket(5000);
                areaChat.append("Servidor iniciado en el puerto 5000...\n");
                while (true) {
                    Socket socketCliente = servidor.accept();
                    PrintWriter salidaCliente = new PrintWriter(socketCliente.getOutputStream(), true);
                    BufferedReader entradaCliente = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
                    String mensajeBienvenida = entradaCliente.readLine(); // ej: "*** Sebastián se ha unido al chat ***"
                    String nombreUsuario = extraerNombreDesdeMensaje(mensajeBienvenida);
                    contadorClientes++;
                    int numeroCliente = contadorClientes;
                    areaChat.append("Cliente " + numeroCliente + " [" + nombreUsuario + "] se ha conectado desde "
                            + socketCliente.getInetAddress() + "\n");
                    clientes.add(salidaCliente);
                    enviarATodos(mensajeBienvenida);
                    Thread hiloCliente = new Thread(new ClienteHandler(socketCliente, salidaCliente, entradaCliente, nombreUsuario, numeroCliente));
                    hiloCliente.start();
                }
            } catch (IOException ex) {
                areaChat.append("Error en el servidor: " + ex.getMessage() + "\n");
            }
        });
        hiloServidor.start();
    }
    private String extraerNombreDesdeMensaje(String mensaje) {
        if (mensaje != null && mensaje.contains("***") && mensaje.contains("se ha unido")) {
            return mensaje.replace("***", "").replace("se ha unido al chat", "").replace("***", "").trim();
        }
        if (mensaje != null && mensaje.contains("***") && mensaje.contains("se ha desconectado")) {
            return mensaje.replace("***", "").replace("se ha desconectado del chat", "").replace("***", "").trim();
        }
        return "Desconocido";
    }
    private void enviarATodos(String mensaje) {
        synchronized (clientes) {
            for (PrintWriter cliente : clientes) {
                cliente.println(mensaje);
            }
        }
    }
    private class ClienteHandler implements Runnable {
        private final Socket socket;
        private final PrintWriter salida;
        private final BufferedReader entrada;
        private final String nombreUsuario;
        private final int numeroCliente;
        public ClienteHandler(Socket socket, PrintWriter salida, BufferedReader entrada, String nombreUsuario, int numeroCliente) {
            this.socket = socket;
            this.salida = salida;
            this.entrada = entrada;
            this.nombreUsuario = nombreUsuario;
            this.numeroCliente = numeroCliente;
        }
        @Override
        public void run() {
            try {
                String mensaje;
                while ((mensaje = entrada.readLine()) != null) {
                    areaChat.append(mensaje + "\n");
                    enviarATodos(mensaje);
                }
            } catch (IOException ex) {
                String msgDesconexion = "*** " + nombreUsuario + " se ha desconectado del chat ***";
                areaChat.append("Cliente " + numeroCliente + " [" + nombreUsuario + "] se ha desconectado\n");
                enviarATodos(msgDesconexion);
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException e) {
                    areaChat.append("Error cerrando socket del cliente.\n");
                }
                clientes.remove(salida);
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ServidorChat().setVisible(true);
        });
    }
}
