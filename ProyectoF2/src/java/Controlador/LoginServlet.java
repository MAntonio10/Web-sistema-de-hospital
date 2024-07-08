package Controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidUser(username, password)) {
            String userRole = getUserRole(username);

            if ("Doctor".equals(userRole)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("DoctorHome.jsp");
            } else if ("Administrador".equals(userRole)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("AdministradorHome.jsp");
            } else {
                response.sendRedirect("Login.jsp?error=2");
            }
        } else {
            response.sendRedirect("Login.jsp?error=1");
        }
    }

    private boolean isValidUser(String username, String password) {
        try {
            String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
            String dbUser = "system";
            String dbPassword = "12345";

            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String query = "SELECT * FROM Usuario WHERE Nombre = ? AND Contraseña = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getUserRole(String username) {
        try {
            String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
            String dbUser = "system";
            String dbPassword = "12345";

            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String query = "SELECT Rol FROM Usuario WHERE Nombre = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("Rol");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
