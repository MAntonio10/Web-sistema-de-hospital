/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Receta2 {
    
    String ID_Receta;
    String ID_Paciente;
    String ID_Doctor;
    String Fecha;
    String Diagnostico;

    public Receta2() {
    }

    public Receta2(String ID_Receta, String ID_Paciente, String ID_Doctor, String Fecha, String Diagnostico) {
        this.ID_Receta = ID_Receta;
        this.ID_Paciente = ID_Paciente;
        this.ID_Doctor = ID_Doctor;
        this.Fecha = Fecha;
        this.Diagnostico = Diagnostico;
    }

    public String getID_Receta() {
        return ID_Receta;
    }

    public void setID_Receta(String ID_Receta) {
        this.ID_Receta = ID_Receta;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getID_Doctor() {
        return ID_Doctor;
    }

    public void setID_Doctor(String ID_Doctor) {
        this.ID_Doctor = ID_Doctor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    
    
    
    
    
    
}
