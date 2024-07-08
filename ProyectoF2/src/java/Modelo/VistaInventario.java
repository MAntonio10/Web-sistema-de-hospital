/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;





public class VistaInventario {
    
    
    String ID_InventarioMedicamento;
    String NombreMedicamento;
    String DescripcionMedicamento;
    String Stock;
    String Precio;
    String FechaActualizacion;

    public VistaInventario() {
    }

    public VistaInventario(String ID_InventarioMedicamento, String NombreMedicamento, String DescripcionMedicamento, String Stock, String Precio, String FechaActualizacion) {
        this.ID_InventarioMedicamento = ID_InventarioMedicamento;
        this.NombreMedicamento = NombreMedicamento;
        this.DescripcionMedicamento = DescripcionMedicamento;
        this.Stock = Stock;
        this.Precio = Precio;
        this.FechaActualizacion = FechaActualizacion;
    }

    public String getID_InventarioMedicamento() {
        return ID_InventarioMedicamento;
    }

    public void setID_InventarioMedicamento(String ID_InventarioMedicamento) {
        this.ID_InventarioMedicamento = ID_InventarioMedicamento;
    }

    public String getNombreMedicamento() {
        return NombreMedicamento;
    }

    public void setNombreMedicamento(String NombreMedicamento) {
        this.NombreMedicamento = NombreMedicamento;
    }

    public String getDescripcionMedicamento() {
        return DescripcionMedicamento;
    }

    public void setDescripcionMedicamento(String DescripcionMedicamento) {
        this.DescripcionMedicamento = DescripcionMedicamento;
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

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(String FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }
    
    
}
