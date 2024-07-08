/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel C
 */
public class VistaInventarioDAO {
    
    PreparedStatement ps;
     ResultSet rs;
     Conexion c=new Conexion();
     Connection con;
    
    
    public List listar(){
        List<VistaInventario>lista=new ArrayList<>();
        String sql="select * from Vista_InventarioMedicamento";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                
                VistaInventario p=new VistaInventario();
                
                p.setID_InventarioMedicamento(rs.getString(1));
                p.setNombreMedicamento(rs.getString(2));
                p.setDescripcionMedicamento(rs.getString(3));
                p.setStock(rs.getString(4));
                p.setPrecio(rs.getString(5));
                p.setFechaActualizacion(rs.getString(6));
                
                lista.add(p);
                
            }
        } catch (Exception e){ 
        }
        return lista;
    }
       

    public void eliminar (String id){
        String sql="delete from InventarioMedicamento where ID_InventarioMedicamento="+id;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
    }
    
    
    
    
}
