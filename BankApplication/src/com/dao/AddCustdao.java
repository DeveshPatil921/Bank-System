package com.dao;

import java.sql.SQLException;

public class AddCustdao {
    private java.sql.Connection con = null;
    private java.sql.PreparedStatement ps = null;
    
    
    public boolean addCust(com.bean.AddCustVar data){
        boolean result=false;
        try {
            con = com.connector.Connetro.getConnectro();
            ps = con.prepareStatement("insert into `customer_recorde` values(?,?,?,?,?,?,?,?); ");
            ps.setInt(1, data.getUsername());
            ps.setInt(2, data.getAmount());
            ps.setString(3, data.getName());
            ps.setInt(4,data.getPhone());
            ps.setString(5,data.getAddress());
            ps.setString(6,data.getDOB());
            ps.setString(7,data.getGender());
            ps.setString(8,data.getPassword());
                    
            if(ps.executeUpdate()==1){
                result=true;
            }
            
            System.out.println(result);
            
            
        } catch (SQLException ex) {  ex.printStackTrace();   }
            
        
        return result;
    }
    
    
}
