/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import Modelo.Receta;
import Modelo.RecetaDAO;
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
public class RecetaC extends HttpServlet {

    Receta p = new Receta();
    RecetaDAO dao=new RecetaDAO();
    
    
    
    
    
    
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
            out.println("<title>Servlet RecetaC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RecetaC at " + request.getContextPath() + "</h1>");
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
                List<Receta>datos=dao.listar();
                request.setAttribute("datos",datos);
                request.getRequestDispatcher("Receta.jsp").forward(request, response);
                break;

            
            case "Nuevo":
                request.getRequestDispatcher("Recetaadd.jsp").forward(request, response);
                break;
                
            
            case "Guardar":
                String diagnostico=request.getParameter("txtdiagnostico");
               
                p.setDiagnostico(diagnostico);
                
                dao.agregar(p);
                request.getRequestDispatcher("RecetaC?accion=Listar").forward(request, response);
                break;
               
            case "Editar":
                String ide=request.getParameter("id");
                Receta pe=dao.listarId(ide);
                request.setAttribute("receta", pe);
                request.getRequestDispatcher("Recetaedit.jsp").forward(request, response);
                break;
                
            case "Actualizar":
                
                String id1=request.getParameter("txtid");
                String diagnostico1=request.getParameter("txtdiagnostico");
                
                
                p.setID_Receta(id1);
                p.setDiagnostico(diagnostico1);
                
                dao.actualizar(p);
                request.getRequestDispatcher("RecetaC?accion=Listar").forward(request, response);
                break;
        
            case "Eliminar":
                String id2=request.getParameter("id");
                dao.eliminar(id2);
                request.getRequestDispatcher("RecetaC?accion=Listar").forward(request, response);
                break;
        
        
        
        
        
        
    default:
                throw new AssertionError();
                
        }
      
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
