
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
        *************************
        * @author Devesh patil  *
        *************************
*/

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {
    private com.bean.loginVar data;
//    private PrintWriter pw;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            data = new com.bean.loginVar();
            data.setAccountnum(Integer.parseInt( request.getParameter("AccountNum").replace("GPA","").trim()));
            data.setPassword(request.getParameter("Password"));
//            System.out.println("User Name : "+data.getAccountnum());
//            System.out.println("Password : "+data.getPassword());
//            
            if(com.dao.Logindao.VarifyLogin(data)){
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(60);
                session.setAttribute("User",data.getAccountnum());

//                System.out.println("this is session id : "+ session.getId());

                request.getRequestDispatcher("LogedUser.jsp").include(request, response);

            }
            else{
                response.sendRedirect("UserLogin.html");
            }
            
            
    }

}
