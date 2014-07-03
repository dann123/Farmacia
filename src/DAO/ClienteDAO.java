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

import pe.edu.upeu.farmacia.vista.Cliente;

/**
 *
 * @author alum.fial7
 */
public class ClienteDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Cliente> ListarCliente() throws ClassNotFoundException{
        ArrayList<Cliente> lista = new ArrayList();
        try {            
            cx = Conexion.GetConexion();
            sql ="SELECT * FROM distrito";
            st = cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                lista.add(Cliente.loadCliente(rs));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
