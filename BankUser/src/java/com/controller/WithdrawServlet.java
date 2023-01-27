
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "WithdrawServlet", urlPatterns = {"/WithdrawServlet"})
public class WithdrawServlet extends HttpServlet {
        Connection con = com.connection.Connector.getConnector();
        PreparedStatement ps = null;
        public static String result = "";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
                PrintWriter out = response.getWriter();
                HttpSession session = request.getSession();

            try {
                ps = con.prepareStatement("update customer_recorde set Amount = Amount - ? where AccountNumber = ? ;");
                ps.setInt(1, Integer.parseInt(request.getParameter("AmountW")));
                ps.setInt(2, (int) session.getAttribute("User"));
                if(ps.executeUpdate()==1){
                    WithdrawServlet.result ="Amount WithDraw Successfully !";
//                    System.out.println("Amount WithDraw Successfully !");
                }
//                request.getRequestDispatcher("LogedUser.jsp").include(request, response);
                
            } catch (SQLException ex) {}
            catch(NullPointerException e){}
            finally{
                response.sendRedirect("LogedUser.jsp");
            }
        
        
    }

}
