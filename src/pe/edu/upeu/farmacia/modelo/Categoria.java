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
public class Categoria {

    
    private int idCategoria;
    private String Nombre;
    private String Estado;

    public Categoria() {
    }

    public Categoria(String Nombre, String Estado) {
        this.Nombre = Nombre;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public static Categoria loadCategoria(ResultSet rs) throws SQLException{
    Categoria ca = new Categoria();
    ca.setIdCategoria(rs.getInt("idCategoria"));
    ca.setNombre(rs.getString("Nombre"));
    ca.setEstado(rs.getString("Estado"));
    
    
    
    return ca;
    
    } 
}
