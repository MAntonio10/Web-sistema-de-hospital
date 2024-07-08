<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="CSS/Css.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/tablitas.css" rel="stylesheet" type="text/css"/>
        <title>MEDICAMENTOS</title>
    </head>
    <body>
    <center>
        <div>
            <h3>MEDICAMENTOS</h3>
            
            <form action="MedicamentoC" method="POST">
               
                <button type="submit" name="accion" value="Listar"><span>Listar</span></button>
                <button type="submit" name="accion" value="Nuevo"><span>Agregar</span></button>
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID_Medicamento</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Stock</th>
                        <th>Precio</th>
                        <th>ACCIONES</th>
                    </tr> 
                </thead>
                <tbody>
                <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getID_Medicamento()}</td>
                        <td>${dato.getNombre()}</td>
                        <td>${dato.getDescripcion()}</td>
                        <td>${dato.getStock()}</td>
                        <td>${dato.getPrecio()}</td>
                        
                        <td>
                           <div class="button-container">
                                <form action="MedicamentoC" method="POST">
                                    <input type="hidden" name="id" value="${dato.getID_Medicamento()}">
                                    <button type="submit" name="accion" value="Editar">
                                        <span>Editar</span>
                                      </button>
                                    <br>    
                                    <button type="submit" name="accion" value="Eliminar">
                                        <span>Eliminar</span>
                                      </button>
                                </form>
                            </div>
                        </td>
                        
                    </tr>
                </c:forEach>    
                </tbody>
            </table>
        </div>
    </center>
    </body>
</html>