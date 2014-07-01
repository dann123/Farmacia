/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.farmacia.config;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HuBel
 */
public class Conexion {
     public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/bd_farmacia";
        String usuario="root";
        String pass ="root";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);    
    return conex;
    }
    

    public Connection conex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
