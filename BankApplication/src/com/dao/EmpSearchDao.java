
package com.dao;

import java.sql.SQLException;

/*
         * @author patil
*/
public class EmpSearchDao {
    private final static  java.sql.Connection con = com.connector.Connetro.getConnectro();
    private static  java.sql.PreparedStatement ps = null;
    private static  java.sql.ResultSet rs = null;
    
    
    public static com.bean.addempVar SearchName(String Name){
        com.bean.addempVar data = null;
        
        try {
            ps = con.prepareStatement("Select * from employee_recorde where Name Like ? ");
            
            ps.setString(1, Name);

            rs = ps.executeQuery();
            
            if(rs.next()){
                data = new com.bean.addempVar();
                
                data.setName(rs.getString(2));
                data.setPhone(rs.getInt(3));
                data.setPosition(rs.getString(4));
                data.setSalary(rs.getInt(5));
                data.setDob(rs.getString(6));
                data.setGender(rs.getString(7));
                data.setAddress(rs.getString(8));
            }
            
            
        }
        catch (SQLException ex) {     ex.printStackTrace();        }
            return data;
        
    }
    
    public static com.bean.addempVar SearchUsername(String Name){
        com.bean.addempVar data = null;
        
        try {
            ps = con.prepareStatement("Select * from employee_recorde where Username Like ? ");
            
            ps.setString(1, Name);

            rs = ps.executeQuery();
            
            if(rs.next()){
                data = new com.bean.addempVar();
                
                data.setName(rs.getString(2));
                data.setPhone(rs.getInt(3));
                data.setPosition(rs.getString(4));
                data.setSalary(rs.getInt(5));
                data.setDob(rs.getString(6));
                data.setGender(rs.getString(7));
                data.setAddress(rs.getString(8));
            }
            
        }
        catch (SQLException ex) {     ex.printStackTrace();        }
            return data;
        
    }
    
    
    
    
    
    
}
