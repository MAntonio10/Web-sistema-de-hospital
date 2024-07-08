<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INVENTARIO</title>
    </head>
    <body>
    <center>
        <div>
            <h3>INVENTARIO</h3>
            <form action="VistaInventarioC" method="POST">
                <input type="submit" name="accion" value="Listar">
                 
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID INVENTARIO</th>
                        <th>NOMBRE MEDICAMENTO</th>
                        <th>DESCRIPCION</th>
                        <th>STOCK</th>
                        <th>PRECIO</th>
                        <th>FECHA DE ACTUALIZACION</th>
                        <th>ACCIONES</th>
                        
                    </tr> 
                </thead>
                <tbody>
                <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getID_InventarioMedicamento()}</td>
                        <td>${dato.getNombreMedicamento()}</td>
                        <td>${dato.getDescripcionMedicamento()}</td>
                        <td>${dato.getStock()}</td>
                        <td>${dato.getPrecio()}</td>
                        <td>${dato.getFechaActualizacion()}</td>
                        
                        <td>
                            <form action="VistaInventarioC" method="POST">
                                <input type="hidden" name="id" value="${dato.getID_InventarioMedicamento()}">
                                
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
