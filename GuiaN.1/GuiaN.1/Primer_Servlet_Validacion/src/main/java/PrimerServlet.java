/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;//
import java.io.PrintWriter;//
import jakarta.servlet.ServletException;//
import jakarta.servlet.http.HttpServlet;//
import jakarta.servlet.http.HttpServletRequest;//
import jakarta.servlet.http.HttpServletResponse;//

/**
 * *@author Thomas Sanmiguel y Sebastian Revelo
 */
    
public class PrimerServlet extends HttpServlet {

    private static final String USUARIOS_FILE = "C:\\Users\\Usuario\\OneDrive - Universidad Manuela Beltrán\\Documentos\\NetBeansProjects\\GuiaN.1\\Primer_Servlet_Validacion\\src\\main\\webapp\\WEB-INF\\usuarios.txt";

    private boolean validarUsuario(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(USUARIOS_FILE))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    String user = datos[0].trim();
                    String pass = datos[1].trim();
                    if (user.equals(username) && pass.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("username");
        String password = request.getParameter("passwd");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Validación de Usuario</title></head><body>");

            if (validarUsuario(login, password)) {
                out.println("<h1>Bienvenido " + login + "</h1>");
            } else {
                out.println("<h1>Acceso denegado, usuario o contraseña no válidos</h1>");
            }

            out.println("</body></html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
