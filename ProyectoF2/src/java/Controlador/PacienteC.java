/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel C
 */
public class PacienteC extends HttpServlet {

    
    Paciente p= new Paciente();
    PacienteDAO dao= new PacienteDAO();
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PacienteC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PacienteC at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        switch (accion) {
            
             /**Metodos Paciente*/
            
            
               
            case "Listar":
                List<Paciente>datos=dao.listar();
                request.setAttribute("datos",datos);
                request.getRequestDispatcher("Paciente.jsp").forward(request, response);
                break;

            /*
            case "Nuevo Proveedor":
                request.getRequestDispatcher("Proveedoradd.jsp").forward(request, response);
                break;
                
            
            case "Guardar Proveedor":
                String nombre=request.getParameter("txtnombre");
                String nit=request.getParameter("txtnit");
                String direccion=request.getParameter("txtdireccion");
                String telefono=request.getParameter("txttelefono");
                String email=request.getParameter("txtemail");
               
                p.setNombre_Proveedor(nombre);
                p.setNIT_Proveedor(nit);
                p.setDireccion(direccion);
                p.setTelefono(telefono);
                p.setE_mail(email);
                dao.agregar(p);
                request.getRequestDispatcher("Controlador?accion=Listar Proveedor").forward(request, response);
                break;
                
            case "Editar Proveedor":
                String ide=request.getParameter("id");
                Proveedor pe=dao.listarId(ide);
                request.setAttribute("proveedor", pe);
                request.getRequestDispatcher("Proveedoredit.jsp").forward(request, response);
                break;
                
            case "Actualizar Proveedor":
                
                String id1=request.getParameter("txtid");
                String nombre1=request.getParameter("txtnombre");
                String nit1=request.getParameter("txtnit");
                String direccion1=request.getParameter("txtdireccion");
                String telefono1=request.getParameter("txttelefono");
                String email1=request.getParameter("txtemail");
                
                p.setId_Proveedor(id1);
                p.setNombre_Proveedor(nombre1);
                p.setNIT_Proveedor(nit1);
                p.setDireccion(direccion1);
                p.setTelefono(telefono1);
                p.setE_mail(email1);
                dao.actualizar(p);
                request.getRequestDispatcher("Controlador?accion=Listar Proveedor").forward(request, response);
                break;
        
            case "Eliminar Proveedor":
                String id2=request.getParameter("id");
                dao.eliminar(id2);
                request.getRequestDispatcher("Controlador?accion=Listar Proveedor").forward(request, response);
                break;
        
        
        
        
        */
        
    default:
                throw new AssertionError();
                
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}