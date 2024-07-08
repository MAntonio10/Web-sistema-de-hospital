/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Medicamento;
import Modelo.MedicamentoDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jose Sandoval
 */
public class MedicamentoC extends HttpServlet {
    
    Medicamento p=new Medicamento();
    MedicamentoDAO dao=new MedicamentoDAO();
    
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
            out.println("<title>Servlet MedicamentoC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MedicamentoC at " + request.getContextPath() + "</h1>");
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
            
             /*Metodos Paciente*/
            
            
               
            case "Listar":
                List<Medicamento>datos=dao.listar();
                request.setAttribute("datos",datos);
                request.getRequestDispatcher("Medicamento.jsp").forward(request, response);
                break;

           
            case "Nuevo":
                request.getRequestDispatcher("Medicamentoadd.jsp").forward(request, response);
                break;
                
            
            case "Guardar":
                String nombre=request.getParameter("txtnombre");
                String descripcion=request.getParameter("txtdescripcion");
                String stock=request.getParameter("txtstock");
                String precio=request.getParameter("txtprecio");
                
               
                p.setNombre(nombre);
                p.setDescripcion(descripcion);
                p.setStock(stock);
                p.setPrecio(precio);
               
                dao.agregar(p);
                request.getRequestDispatcher("MedicamentoC?accion=Listar").forward(request, response);
                break;
                
             
            case "Editar":
                String ide=request.getParameter("id");
                Medicamento pe=dao.listarId(ide);
                request.setAttribute("medicamento", pe);
                request.getRequestDispatcher("Medicamentoedit.jsp").forward(request, response);
                break;
                
            case "Actualizar":
                
                String id1=request.getParameter("txtid");
                String nombre1=request.getParameter("txtnombre");
                String descripcion1=request.getParameter("txtdescripcion");
                String stock1=request.getParameter("txtstock");
                String precio1=request.getParameter("txtprecio");
               
                
                p.setID_Medicamento(id1);
                p.setNombre(nombre1);
                p.setDescripcion(descripcion1);
                p.setStock(stock1);
                p.setPrecio(precio1);
                
                dao.actualizar(p);
                request.getRequestDispatcher("MedicamentoC?accion=Listar").forward(request, response);
                break;
        
            case "Eliminar":
                String id2=request.getParameter("id");
                dao.eliminar(id2);
                request.getRequestDispatcher("MedicamentoC?accion=Listar").forward(request, response);
                break;
        
            
        
        
        
        
    default:
                throw new AssertionError();
                
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}