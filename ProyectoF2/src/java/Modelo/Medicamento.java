/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose Sandoval
 */
public class Medicamento {
    String ID_Medicamento;
    String Nombre;
    String Descripcion;
    String Stock;
    String Precio;

    public Medicamento() {
    }

    public Medicamento(String ID_Medicamento, String Nombre, String Descripcion, String Stock, String Precio) {
        this.ID_Medicamento = ID_Medicamento;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;
    }

    public String getID_Medicamento() {
        return ID_Medicamento;
    }

    public void setID_Medicamento(String ID_Medicamento) {
        this.ID_Medicamento = ID_Medicamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    
}