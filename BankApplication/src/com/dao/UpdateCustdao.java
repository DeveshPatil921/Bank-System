
package com.dao;

import java.sql.SQLException;

/*
* @author patil
 */

public class UpdateCustdao {
    private java.sql.Connection con = null;
    private java.sql.PreparedStatement ps = null;
    private boolean result = false;    
    
    public boolean updateCustomer(com.bean.AddCustVar data){
        con = com.connector.Connetro.getConnectro();
        try {
            ps = con.prepareStatement("update customer_recorde set Name= ?, Phone = ?, Address = ?, DOB = ?, Gender = ? where AccountNumber = ? and Password = ?");
            ps.setString(1 ,data.getName());
            ps.setInt( 2,data.getPhone());
            ps.setString(3,data.getAddress());
            ps.setString(4,data.getDOB());
            ps.setString(5 ,data.getGender());
            
            ps.setInt(6,data.getUsername());
            ps.setString( 7,data.getPassword());
            
            
            if(ps.executeUpdate()==1){
                result=true;
            }
            
        ps.close();
        con.close();
        }
        catch (SQLException ex) {     ex.printStackTrace();       }
        
        return result;
    }
}
