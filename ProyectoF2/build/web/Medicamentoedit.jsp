<%-- 
    Document   : Proveedoredit
    Created on : 18-oct-2023, 20:35:11
    Author     : Manuel C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <center>
        <div>
            <h3>EDITAR MEDICAMENTO</h3>
        </div>
        <div>
            <form action="MedicamentoC" method="POST" >
                
                ID RECETA:
                <input type="text" name="txtid" value="${medicamento.getID_Medicamento()}"><br>
                NOMBRE:
                <input type="text" name="txtnombre" value="${medicamento.getNombre()}"><br>
                DESCRIPCION:
                <input type="text" name="txtdescripcion" value="${medicamento.getDescripcion()}"><br>
                STOCK:
                <input type="text" name="txtstock" value="${medicamento.getStock()}"><br>
                PRECIO:
                <input type="text" name="txtprecio" value="${medicamento.getPrecio()}"><br>
                
                
           
                
                <input type="submit" name="accion" value="Actualizar">
                               
            </form>
        </div>
    </center>
    </body>
</html>
