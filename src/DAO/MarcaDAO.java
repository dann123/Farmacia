/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.upeu.farmacia.config.Conexion;
import pe.edu.upeu.farmacia.modelo.Marca;

/**
 *
 * @author alum.fial7
 */
public class MarcaDAO {
     private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Marca> ListarMarca() throws ClassNotFoundException{
        ArrayList<Marca> lista = new ArrayList();
        try {            
            cx = Conexion.GetConexion();
            sql ="SELECT * FROM distrito";
            st = cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                lista.add(Marca.loadDistrito(rs));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
