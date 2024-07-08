/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Paciente {
    
    String ID_Paciente;
    String Nombre;
    String Apellido;
    String FechaNacimiento;
    String Genero;
    String Direccion;
    String Telefono;
    String ID_DoctorAsignado;

    public Paciente() {
    }

    public Paciente(String ID_Paciente, String Nombre, String Apellido, String FechaNacimiento, String Genero, String Direccion, String Telefono, String ID_DoctorAsignado) {
        this.ID_Paciente = ID_Paciente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.ID_DoctorAsignado = ID_DoctorAsignado;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getID_DoctorAsignado() {
        return ID_DoctorAsignado;
    }

    public void setID_DoctorAsignado(String ID_DoctorAsignado) {
        this.ID_DoctorAsignado = ID_DoctorAsignado;
    }
    
    
    
    
    
}
