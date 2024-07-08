<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PACIENTES</title>
    </head>
    <body>
    <center>
        <div>
            <h3>PACIENTES</h3>
            <form action="PacienteC" method="POST">
                <input type="submit" name="accion" value="Listar">
                 <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID Paciente</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Genero</th>
                        <th>Direccion</th>
                        <th>Telefono</th>
                        <th>ID_DoctorAsignado</th>
                        <th>ACCIONES</th>
                    </tr> 
                </thead>
                <tbody>
                <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getID_Paciente()}</td>
                        <td>${dato.getNombre()}</td>
                        <td>${dato.getApellido()}</td>
                        <td>${dato.getFechaNacimiento()}</td>
                        <td>${dato.getGenero()}</td>
                        <td>${dato.getDireccion()}</td>
                        <td>${dato.getTelefono()}</td>
                        <td>${dato.getID_DoctorAsignado()}</td>
                        
                        <td>
                            <form action="PacienteC" method="POST">
                                <input type="hidden" name="id" value="${dato.getID_Paciente()}">
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
