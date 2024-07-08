package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Doctor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link href=\"CSS/Tabla.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<header>\n");
      out.write("        <h1>HOSPITAL CENTRAL</h1>\n");
      out.write("</header>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"ag-format-container\">\n");
      out.write("  <div class=\"ag-courses_box\">\n");
      out.write("    \n");
      out.write("    <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Cita.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Cita\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Examen.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Examen\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Medicamento.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Medicamento\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Paciente.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Paciente\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"ResultadoExamen.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Resultado Examen\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Servicio.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Servicio\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"ag-courses_item\">\n");
      out.write("      <a href=\"Medicamento.jsp\" class=\"ag-courses-item_link\">\n");
      out.write("        <div class=\"ag-courses-item_bg\"></div>\n");
      out.write("        <div class=\"ag-courses-item_date-box\">\n");
      out.write("          Medicamento\n");
      out.write("        </div>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
