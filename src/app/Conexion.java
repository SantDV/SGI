/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    public static final String URL ="jdbc:mysql://localhost:3306/sgi";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1528";
    
    public Connection getConnection(){
        
        Connection con = null;
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME,  PASSWORD);
            
            
        }
        catch(Exception e)
        {
            System.out.println("error: "+ e);
        }
        
        return con;
        
    } 
    
}
