
package com.dao;

import java.sql.Connection ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*  ************************
    * @author Devesh patil *
    ************************    */

public class Logindao {
    
    static Connection con = com.connection.Connector.getConnector();
    static PreparedStatement ps = null;
    public static  boolean VarifyLogin(com.bean.loginVar data){
        ResultSet rs =null;    
        boolean Result=false;
        
        try {
            ps = con.prepareCall("select AccountNumber,Password from customer_recorde where AccountNumber = ? and Password like ?");
            ps.setInt(1, data.getAccountnum());
            ps.setString(2, data.getPassword());
            rs = ps.executeQuery();
            
            if (rs.next()){
                Result = true;
//              System.out.println("*********************************************************");  
            }
        }
        catch (SQLException ex) {}
        
//      System.out.println("Result : "+Result);
        
        return Result;
    }
    
    
}
