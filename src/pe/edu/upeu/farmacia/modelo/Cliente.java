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
public class Cliente {
    private int idCliente;
    private String Nombre;
    private String ApellidoPat;
    private String ApellidoMat;
    private int DNI;
    private int Telefono;
    private String Direccion;
    private String Sexo;
    private int FechaNac;

    public Cliente() {
    }

    public Cliente(String Nombre, String ApellidoPat, String ApellidoMat, int DNI, int Telefono, String Direccion, String Sexo, int FechaNac) {
        this.Nombre = Nombre;
        this.ApellidoPat = ApellidoPat;
        this.ApellidoMat = ApellidoMat;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Sexo = Sexo;
        this.FechaNac = FechaNac;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(int FechaNac) {
        this.FechaNac = FechaNac;
    }
    
}
