/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI403_BDatos;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    Connection conn = null; 
    private String userName;
    private String password;
    private String url;
    

    public ConexionMySQL()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            url = "jdbc:mysql://localhost:3306/topicos";
            userName = "root";
            password = "ruben";
        } 
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public Connection getConn()
    {
        return conn;
    }
    
    public Connection abrir() throws Exception
    {
        conn = DriverManager.getConnection(url, userName, password);        
        return conn;
    }
    
    public void cerrar()
    {
        try
        {
            if (conn != null)
            {
                conn.close();
                conn = null;
            }
        } 
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
