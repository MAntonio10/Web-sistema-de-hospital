
<!-- Define que el documento esta bajo el estandar de HTML 5 -->
<!doctype html>

<!-- Representa la raíz de un documento HTML o XHTML. Todos los demás elementos deben ser descendientes de este elemento. -->
<html lang="es">
    
    <head>
        <meta charset="utf-8">
        
        <title> Formulario de Acceso </title>    
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Nunito&display=swap" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css?family=Overpass&display=swap" rel="stylesheet">
        
        <!-- Link hacia el archivo de estilos css -->
        <link href="login.css" rel="stylesheet" type="text/css"/>
        
        <style type="text/css">
            
        </style>
        
        <script type="text/javascript">
        
        </script>
        
    </head>
    
    <body>
        
        <div id="contenedor">
            <div id="central">
                <div id="login">
                    <div class="titulo">
                        Bienvenido
                    </div>
                    <form action="LoginServlet" method="post"> <!-- El atributo "action" debe coincidir con la URL del Servlet -->
                        <label for="columnA">Usuario</label>
                        <input type="text" id="columnA" name="username" required>
                        <br>
                        <label for="columnB">Contraseña</label>
                        <input type="password" id="columnB" name="password" required>
                        <br>
                        <input type="submit"  value="Iniciar Sesión">
                    </form>
                </div>
            </div>
        </div>
            
    </body>
</html>