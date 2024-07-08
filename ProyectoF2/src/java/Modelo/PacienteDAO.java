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

public class PacienteDAO {
    PreparedStatement ps;
     ResultSet rs;
     Conexion c=new Conexion();
     Connection con;
    
    
    public List listar(){
        List<Paciente>lista=new ArrayList<>();
        String sql="select * from Paciente";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Paciente p=new Paciente();
                p.setID_Paciente(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                p.setFechaNacimiento(rs.getString(4));
                p.setGenero(rs.getString(5));
                p.setDireccion(rs.getString(6));
                p.setTelefono(rs.getString(7));
                p.setID_DoctorAsignado(rs.getString(8));
                lista.add(p);
                
            }
        } catch (Exception e){ 
        }
        return lista;
    }
       /*     
    public int agregar(Paciente p){
        int r=0;
        String sql="insert into Proveedor(Nombre_Proveedor, NIT_Proveedor, Direccion,  Telefono, E_mail)values(?,?,?,?,?)";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getNombre_Proveedor());
           ps.setString(2, p.getNIT_Proveedor());
           ps.setString(3, p.getDireccion());
           ps.setString(4, p.getTelefono());
           ps.setString(5, p.getE_mail());
           
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
    
    public Proveedor listarId(String id){
        String sql="select * from Proveedor where Id_Proveedor="+id;
        Proveedor p=new Proveedor();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               
                p.setId_Proveedor(rs.getString(1));
                p.setNombre_Proveedor(rs.getString(2));
                p.setNIT_Proveedor(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setE_mail(rs.getString(6));
            }
        } catch (Exception e){ 
        }
        return p;
    }
   
    public int actualizar(Proveedor p){
    int r = 0;
        String sql="UPDATE PROVEEDOR SET Nombre_Proveedor=?, NIT_proveedor=?, Direccion=?, Telefono=?, E_mail=? where Id_Proveedor=?";
        try{
           con=c.conectar();
           ps=con.prepareStatement(sql);
           
           ps.setString(1, p.getNombre_Proveedor());
           ps.setString(2, p.getNIT_Proveedor());
           ps.setString(3, p.getDireccion());
           ps.setString(4, p.getTelefono());
           ps.setString(5, p.getE_mail());
           ps.setString(6, p.getId_Proveedor());
           
          
        
        System.out.println("Query ejecutado: " + sql); // Mensaje de depuración
        System.out.println("Id_Proveedor: " + p.getId_Proveedor()); // Mensaje de depuración
        System.out.println("Nombre_Proveedor: " + p.getNombre_Proveedor()); // Mensaje de depuración
        System.out.println("NIT_Proveedor: " + p.getNIT_Proveedor()); // Mensaje de depuración
        System.out.println("Direccion: " + p.getDireccion()); // Mensaje de depuración
        System.out.println("Telefono: " + p.getTelefono()); // Mensaje de depuración
        System.out.println("E_mail: " + p.getE_mail()); // Mensaje de depuración
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
        String sql="delete from Proveedor where Id_Proveedor="+id;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
    }*/
}
