/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.farmacia.modelo;

/**
 *
 * @author alum.fial7
 */
public class Empleado {
    private int idEmpleado;
    private String Nombre;
    private String ApellidoPat;
    private String ApellidoMat;
    private int DNI;
    private int Telefono;
    private String Direccion;
    private String Sexo;
    private Double salario;
    private int FechaInic;
    private int FechaNaci;

    public Empleado() {
    }

    public Empleado(String Nombre, String ApellidoPat, String ApellidoMat, int DNI, int Telefono, String Direccion, String Sexo, Double salario, int FechaInic, int FechaNaci) {
        this.Nombre = Nombre;
        this.ApellidoPat = ApellidoPat;
        this.ApellidoMat = ApellidoMat;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Sexo = Sexo;
        this.salario = salario;
        this.FechaInic = FechaInic;
        this.FechaNaci = FechaNaci;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPat() {
        return ApellidoPat;
    }

    public void setApellidoPat(String ApellidoPat) {
        this.ApellidoPat = ApellidoPat;
    }

    public String getApellidoMat() {
        return ApellidoMat;
    }

    public void setApellidoMat(String ApellidoMat) {
        this.ApellidoMat = ApellidoMat;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getFechaInic() {
        return FechaInic;
    }

    public void setFechaInic(int FechaInic) {
        this.FechaInic = FechaInic;
    }

    public int getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(int FechaNaci) {
        this.FechaNaci = FechaNaci;
    }
    
}
