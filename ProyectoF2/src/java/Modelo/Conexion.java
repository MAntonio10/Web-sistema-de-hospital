
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Conexion {
    
   Connection con;
   String url="jdbc:oracle:thin:@localhost:1521:xe";
   String user="system";
   String pass="12345";
   
   public Connection conectar(){
       try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection(url, user, pass);
       } catch (Exception e){
           
       }
       return con;
   }
}


