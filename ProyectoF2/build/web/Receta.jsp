<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RECETAS</title>
    </head>
    <body>
    <center>
        <div>
            <h3>RECETAS</h3>
            <form action="RecetaC" method="POST">
                <input type="submit" name="accion" value="Listar">
                 <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID RECETA</th>
                        <th>ID PACIENTE</th>
                        <th>NOMBRE DEL PACIENTE</th>
                        <th>APELLIDO DEL PACIENTE</th>
                        <th>NOMBRE DEL DOCTOR</th>
                        <th>APELLIDO DEL DOCTOR</th>
                        <th>FECHA DE LA RECETA</th>
                        <th>DIAGNOSTICO</th>
                        <th>ACCIONES</th>
                    </tr> 
                </thead>
                <tbody>
                <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getID_Receta()}</td>
                        <td>${dato.getID_Paciente()}</td>
                        <td>${dato.getNombrePaciente()}</td>
                        <td>${dato.getApellidoPaciente()}</td>
                        <td>${dato.getNombreDoctor()}</td>
                        <td>${dato.getApellidoDoctor()}</td>
                        <td>${dato.getFecha()}</td>
                        <td>${dato.getDiagnostico()}</td>
                        
                        <td>
                            <form action="RecetaC" method="POST">
                                <input type="hidden" name="id" value="${dato.getID_Receta()}">
                                <input type="submit" name="accion" value="Editar">
                                <input type="submit" name="accion" value="Eliminar">
                            </form>
                        </td>
                        
                    </tr>
                </c:forEach>    
                </tbody>
            </table>
        </div>
    </center>
    </body>
</html>
