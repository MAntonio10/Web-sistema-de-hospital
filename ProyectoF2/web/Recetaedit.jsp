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
            <h3>EDITAR RECETA</h3>
        </div>
        <div>
            <form action="RecetaC" method="POST" >
                
                ID RECETA:
                <input type="text" name="txtid" value="${receta.getID_Receta()}"><br>
                NOMBRES:
                <input type="text" name="txtdiagnostico" value="${receta.getDiagnostico()}"><br>
                
           
                
                <input type="submit" name="accion" value="Actualizar">
                               
            </form>
        </div>
    </center>
    </body>
</html>
