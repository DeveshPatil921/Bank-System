
package com.connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/*  ************************
    * @author Devesh patil *
    ************************    */

public class Connector {
    private static Connection con = null;
    
    public static Connection getConnector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localHost:3306/bankmanagementsystem","root","");

//            System.out.println("Connection successfull ! ");
            
        } 
        catch (SQLException ex) { ex.printStackTrace();   } 
        catch (ClassNotFoundException ex) { ex.printStackTrace();   }
        return con;
    }
}
