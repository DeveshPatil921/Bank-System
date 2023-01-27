
package com.dao;

import java.sql.SQLException;

/*

* @author patil

*/
public class LoginVarify {
    private static java.sql.Connection con = com.connector.Connetro.getConnectro();
    
    public static boolean VarifyEmp(String Username, String Password){
        boolean Result=false;
        try {
            java.sql.PreparedStatement ps = con.prepareStatement(" SELECT Username, Password from employee_recorde WHERE Username LIKE ? and Password LIKE ? ");
            ps.setString(1, Username);
            ps.setString(2, Password);
            
            java.sql.ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                Result = true;
            }
        
        }
        catch (SQLException ex) {     ex.printStackTrace();       }
        return Result;
    }
}
