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
public class Proveedor {
    private int Provedor;
    private String nombre;
    private int telefonopro;
    private String DireccionPro;
    private int RUC;
    private String Representante;

    public Proveedor() {
    }

    public Proveedor(String nombre, int telefonopro, String DireccionPro, int RUC, String Representante) {
        this.nombre = nombre;
        this.telefonopro = telefonopro;
        this.DireccionPro = DireccionPro;
        this.RUC = RUC;
        this.Representante = Representante;
    }

    public int getProvedor() {
        return Provedor;
    }

    public void setProvedor(int Provedor) {
        this.Provedor = Provedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefonopro() {
        return telefonopro;
    }

    public void setTelefonopro(int telefonopro) {
        this.telefonopro = telefonopro;
    }

    public String getDireccionPro() {
        return DireccionPro;
    }

    public void setDireccionPro(String DireccionPro) {
        this.DireccionPro = DireccionPro;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }
    
}
