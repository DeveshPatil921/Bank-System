
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateEmpdao {
    private Connection con=null;
    private PreparedStatement ps = null;
    public boolean updatedata(com.bean.addempVar data){
    
            int r = 0;
        try {
            con = com.connector.Connetro.getConnectro();

            ps = con.prepareStatement("UPDATE `employee_recorde`"
                    + " SET  `Name` = ?,  `Phone` = ?, `Position` = ?, `Salary` = ?, `DOB` = ?, `Gender` = ?, `Address` = ? "
                    + " WHERE  Username = ? && password = ? ");
            ps.setString(1,data.getName());
            ps.setInt(2,data.getPhone());
            ps.setString(3,data.getPosition());
            ps.setInt(4,data.getSalary());
            ps.setString(5,data.getDob());
            ps.setString(6,data.getGender());
            ps.setString(7,data.getAddress());
            ps.setString(8,data.getUsername());
            ps.setString(9,data.getPassword());
            
            r = ps.executeUpdate();
        
        } 
        
        catch (SQLException ex) { ex.printStackTrace(); }
        
        return r==1?true:false;
    }
    

}
    

