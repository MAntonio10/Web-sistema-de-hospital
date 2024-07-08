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
 * @author Jose Sandoval
 */
public class MedicamentoDAO {
    PreparedStatement ps;
     ResultSet rs;
     Conexion c=new Conexion();
     Connection con;
    
    
    public List listar(){
        List<Medicamento>lista=new ArrayList<>();
        String sql="select * from Medicamento";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Medicamento p=new Medicamento();
                p.setID_Medicamento(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setStock(rs.getString(4));
                p.setPrecio(rs.getString(5));
                lista.add(p);
                
            }
        } catch (Exception e){ 
        }
        return lista;
    }
            
    public int agregar(Medicamento p){
        int r=0;
        String sql="insert into Medicamento(Nombre, Descripcion, Stock,  Precio)values(?,?,?,?)";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
          
           ps.setString(1, p.getNombre());
           ps.setString(2, p.getDescripcion());
           ps.setString(3, p.getStock());
           ps.setString(4, p.getPrecio());
           
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
    
    public Medicamento listarId(String id){
        String sql="select * from Medicamento where ID_Medicamento="+id;
        Medicamento p=new Medicamento();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               
                p.setID_Medicamento(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setStock(rs.getString(4));
                p.setPrecio(rs.getString(5));
               
            }
        } catch (Exception e){ 
        }
        return p;
    }
   
    public int actualizar(Medicamento p){
    int r = 0;
        String sql="UPDATE Medicamento SET Nombre=?, Descripcion=?, Stock=?, Precio=? where ID_Medicamento=?";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getNombre());
           ps.setString(2, p.getDescripcion());
           ps.setString(3, p.getStock());
           ps.setString(4, p.getPrecio());
           ps.setString(5, p.getID_Medicamento());
           
          
        
        System.out.println("Query ejecutado: " + sql); // Mensaje de depuración
        System.out.println("ID_Medicamento: " + p.getID_Medicamento()); // Mensaje de depuración
        System.out.println("Nombre: " + p.getNombre()); // Mensaje de depuración
        System.out.println("Descripcion: " + p.getDescripcion()); // Mensaje de depuración
        System.out.println("Stock: " + p.getStock()); // Mensaje de depuración
        System.out.println("Precio: " + p.getPrecio()); // Mensaje de depuración
       
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
        String sql="delete from Medicamento where ID_Medicamento="+id;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
    }
}