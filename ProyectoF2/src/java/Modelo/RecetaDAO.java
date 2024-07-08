/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel C
 */
public class RecetaDAO {
    PreparedStatement ps;
     ResultSet rs;
     Conexion c=new Conexion();
     Connection con;
    
    
    public List listar(){
        List<Receta>lista=new ArrayList<>();
        String sql="select * from Vista_RecetaCompleta";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Receta p=new Receta();
                p.setID_Receta(rs.getString(1));
                p.setID_Paciente(rs.getString(2));
                p.setNombrePaciente(rs.getString(3));
                p.setApellidoPaciente(rs.getString(4));
                p.setNombreDoctor(rs.getString(5));
                p.setApellidoDoctor(rs.getString(6));
                p.setFecha(rs.getString(7));
                p.setDiagnostico(rs.getString(8));
                lista.add(p);
                
            }
        } catch (Exception e){ 
        }
        return lista;
    }
           
    public int agregar(Receta p){
        int r=0;
        String sql="INSERT INTO Receta (Diagnostico) VALUES (?)";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getDiagnostico());
          
           r=ps.executeUpdate();
           if(r==1){
               r=1;   
           }else{
               r=0;
           }
        } catch (Exception e){ 
        }
        return r;
    }
   
    public Receta listarId(String id){
        String sql="select * from Receta where ID_Receta="+id;
        Receta p=new Receta();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               
                p.setID_Receta(rs.getString(1));
                p.setDiagnostico(rs.getString(5));
                
            }
        } catch (Exception e){ 
        }
        return p;
    }
   
    public int actualizar(Receta p){
    int r = 0;
        String sql="UPDATE Receta SET Diagnostico=? where ID_Receta=?";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getDiagnostico());
           ps.setString(2, p.getID_Receta());
           
          
        
        System.out.println("Query ejecutado: " + sql); // Mensaje de depuración
        System.out.println("ID_Receta: " + p.getDiagnostico()); // Mensaje de depuración
        System.out.println("Diagnostico: " + p.getDiagnostico()); // Mensaje de depuración
        
        // Agrega más mensajes de depuración para los otros valores si es necesario
        
     
           r=ps.executeUpdate();
        System.out.println("Filas actualizadas: " + r); // Mensaje de depuración
    } catch (Exception e){ 
        e.printStackTrace(); // Esto imprimirá información sobre cualquier error que ocurra.
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar cualquier error al cerrar la conexión.
        }
    }
    return r;
}

    public void eliminar (String id){
        String sql="delete from Receta where ID_Receta="+id;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
    }
}
