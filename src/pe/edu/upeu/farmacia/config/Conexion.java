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
    Connection cn=null;
        
        String url="jdbc:mysql://localhost/db_farmaci";
        String usuario="root";
        String pass ="root";
         cn=DriverManager.getConnection("jdbc:sqlserver:");
        cn =(Connection) DriverManager.getConnection(url,usuario,pass);    
    return cn;
    }

   

   
    

    

    

}
