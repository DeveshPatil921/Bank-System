
package com.dao;

import java.sql.*;

public class addempdao {
        
    private Connection con=null;
    private PreparedStatement ps = null;
    
    
    public boolean addindb(com.bean.addempVar data){
        int r = 0;
        try {
            con = com.connector.Connetro.getConnectro();

            ps = con.prepareStatement("INSERT INTO `employee_recorde`(`sr`, `Name`, `Phone`, `Position`, `Salary`, `DOB`, `Gender`, `Address`, `Username`, `Password`) "
                    + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
    
//    public static void main(String[] args){
//    
//        addempdao obj = new addempdao();
//        com.bean.addempVar data = new com.bean.addempVar();
//        
//        data.setName("kishtaj hadkey");
//        data.setPhone(152364987);
//        data.setDob("2004-03-24");
//        data.setAddress("Amravati. ");
//        data.setposition("Manager ");
//        data.setSalary(8976);
//        data.setUsername("125edd");
//        data.setPassword("dkjejfedkejdk");
//        data.setGender("Male");
//        obj.addindb(data);
//    
//    }
//    
    
}
