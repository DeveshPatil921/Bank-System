
package com.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
        * @author patil
*/

@WebServlet(name = "DepositeServlet", urlPatterns = {"/DepositeServlet"})
public class DepositeServlet extends HttpServlet {
    Connection con = com.connection.Connector.getConnector();
        PreparedStatement ps = null;
        public static String result = "";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session = request.getSession();

            try {
                ps = con.prepareStatement("update customer_recorde set Amount = Amount + ? where AccountNumber = ? ;");
                ps.setInt(1, Integer.parseInt(request.getParameter("AmountD")));
                ps.setInt(2, (int) session.getAttribute("User"));
                if(ps.executeUpdate()==1){
                    DepositeServlet.result ="Amount Deposite Successfully !";
//                    System.out.println("Amount Deposite Successfully !");
                }
                
            } catch (SQLException ex) {}
            catch(NullPointerException e){}
            catch(NumberFormatException e){}
            finally{
//                request.getRequestDispatcher("LogedUser.jsp").include(request, response);
                response.sendRedirect("LogedUser.jsp");
            }
        
    }


}
