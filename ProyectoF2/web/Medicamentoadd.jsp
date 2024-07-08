<%-- 
    Document   : Proveedoradd
    Created on : 18-oct-2023, 18:41:31
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
            <h3>AGREGAR MEDICAMENTO</h3>
        </div>
        <div>
            <form action="MedicamentoC" method="POST" >
                
               
                
                
                NOMBRE:
                <input type="text" name="txtnombre"><br>
                DESCRIPCION:
                <input type="text" name="txtdescripcion"><br>
                STOCK:
                <input type="text" name="txtstock"><br>
                PRECIO:
                <input type="text" name="txtprecio"><br>
                
                <input type="submit" name="accion" value="Guardar">
                               
            </form>
        </div>
        
        
        
        
        
        
        
    </center>          
    </body>
</html>
