/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Manuel C
 */
public class Receta {
    
    String ID_Receta;
    String ID_Paciente;
    String NombrePaciente;
    String ApellidoPaciente; 
    String NombreDoctor; 
    String ApellidoDoctor; 
    String Fecha;
    String Diagnostico;

    public Receta() {
    }

    public Receta(String ID_Receta, String ID_Paciente, String NombrePaciente, String ApellidoPaciente, String NombreDoctor, String ApellidoDoctor, String Fecha, String Diagnostico) {
        this.ID_Receta = ID_Receta;
        this.ID_Paciente = ID_Paciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.NombreDoctor = NombreDoctor;
        this.ApellidoDoctor = ApellidoDoctor;
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

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public String getApellidoPaciente() {
        return ApellidoPaciente;
    }

    public void setApellidoPaciente(String ApellidoPaciente) {
        this.ApellidoPaciente = ApellidoPaciente;
    }

    public String getNombreDoctor() {
        return NombreDoctor;
    }

    public void setNombreDoctor(String NombreDoctor) {
        this.NombreDoctor = NombreDoctor;
    }

    public String getApellidoDoctor() {
        return ApellidoDoctor;
    }

    public void setApellidoDoctor(String ApellidoDoctor) {
        this.ApellidoDoctor = ApellidoDoctor;
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
