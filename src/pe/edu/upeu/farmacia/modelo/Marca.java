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
public class Marca {
    private int idMarca;
    private String Nombre ;
    private String estado;

    public Marca() {
    }

    public Marca(String Nombre, String estado) {
        this.Nombre = Nombre;
        this.estado = estado;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   public static Marca loadDistrito(ResultSet rs) throws SQLException{
    Marca m = new Marca();
    m.setIdMarca(rs.getInt("idMarca"));
    m.setNombre(rs.getString("Nombre"));
    m.setEstado(rs.getString("Estado"));
    
    return m;
    
    }  
}
