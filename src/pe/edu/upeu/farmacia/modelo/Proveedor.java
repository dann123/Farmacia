/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.farmacia.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alum.fial7
 */
public class Proveedor {
    private int IdProvedor;
    private String Nombre;
    private int Telefonopro;
    private String DireccionPro;
    private int RUC;
    private String Representante;

    public Proveedor() {
    }

    public Proveedor(String nombre, int telefonopro, String direccionPro, int ruc, String Representante) {
        this.Nombre = nombre;
        this.Telefonopro = telefonopro;
        this.DireccionPro = direccionPro;
        this.RUC = ruc;
        this.Representante = Representante;
    }

    public int getProvedor() {
        return IdProvedor;
    }

    public void setProvedor(int Provedor) {
        this.IdProvedor = Provedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getTelefonopro() {
        return Telefonopro;
    }

    public void setTelefonopro(int telefonopro) {
        this.Telefonopro = telefonopro;
    }

    public String getDireccionPro() {
        return DireccionPro;
    }

    public void setDireccionPro(String direccionPro) {
        this.DireccionPro = direccionPro;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int ruc) {
        this.RUC = ruc;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }
   public static Proveedor loadProveedor(ResultSet rs) throws SQLException{
    Proveedor o = new Proveedor();
   
    o.setNombre(rs.getString("Nombre"));   
    o.setTelefonopro(rs.getInt("Telefonopro"));
    o.setDireccionPro(rs.getString("DireccionPro"));
    o.setRUC(rs.getInt("RUC"));
    o.setRepresentante(rs.getString("Representante"));
  
    
    
    return o;
    
    }  
}
