
package com.connector;
import java.sql.*;


/*      ****************************************
        *       @author : Devesh Patil         *
        *       @author : Omkar shelke         *
        *       @author : Kishitaj Hadkey      *
        *       @author : Munawwar Miyan       *
        *       @author : Yash Ghuge           *
        *       @author : Karan Rathod         *
        ****************************************        */

public class Connetro {
    private static Connection con;
    
    
    public static Connection getConnectro(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localHost:3306/bankmanagementsystem","root","");

//            System.out.println("Connection successfull ! ");
            
        } 
        catch (SQLException ex) { ex.printStackTrace();   } 
        catch (ClassNotFoundException ex) { ex.printStackTrace();   }
        return con;
    }
    
//    public static void main(String args[]){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            java.sql.Connection con = con = java.sql.DriverManager.getConnection("jdbc:mysql://localHost:3306/","root","sql@dev");
//            System.out.println("connection Successfull !!! 111 @@@ ");
//            
//            System.out.println("Connection successfull ! ");
//            
//            
//            
//            con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Connetro.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Connetro.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
