
package com.dao;

import com.bean.TransactionVar;
import java.sql.SQLException;

/*
        * @author patil
*/

public class tarnsactiondao {
    
    private final static  java.sql.Connection con = com.connector.Connetro.getConnectro();
    private static  java.sql.PreparedStatement ps = null;
    private static  java.sql.ResultSet rs = null;
    
    
    public static boolean AlterAmount(com.bean.TransactionVar data){
        try {
            ps = con.prepareStatement("update customer_recorde set Amount =? where AccountNumber = ? and Password like ? ");
            
            ps.setInt(1, data.getAmount());
            ps.setInt(2, data.getAccountNum());
            ps.setString(3,data.getPassword());

            if(ps.executeUpdate()==1){
                return true;
            }
            ps.close();
        }
        catch (SQLException ex) {     ex.printStackTrace();        }
            return false;
        
    }
    
//    public static java.sql.ResultSet Search(int AccountNum,String Password){
    public static com.bean.TransactionVar Search(int AccountNum,String Password){
            com.bean.TransactionVar data = new com.bean.TransactionVar();
            
        try {
            
            ps = con.prepareStatement("Select Amount,Name,Phone from customer_recorde where AccountNumber = ? and Password like ? ");
            
            ps.setInt(1, AccountNum);
            ps.setString(2,Password);

            rs = ps.executeQuery();
            if(rs.next()){
                data.setAvailabelBal(rs.getInt(1));
                data.setName(rs.getString(2));
                data.setPhone(rs.getInt(3));
                
            }else{
                data=null;
            }
            ps.close();
        }
        catch (SQLException ex) {     ex.printStackTrace();        }
        
        return data;
    }
}
