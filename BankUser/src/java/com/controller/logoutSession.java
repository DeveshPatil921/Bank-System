package com.controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*  *****************
    * @author patil *
    *****************
*/
@WebServlet(name = "closeSession", urlPatterns = {"/closeSession"})
public class logoutSession extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         try {
        HttpSession session = request.getSession(false);
        session.removeAttribute("User");
        session.invalidate();
        response.sendRedirect("index.html");
    } catch (Exception exp) {
        RequestDispatcher dd = request.getRequestDispatcher("index.html");
        dd.forward(request, response);
    }


        
//        try{
//    accnum = (int)session.getAttribute("User");

//            HttpSession ss = request.getSession(false);
//            if (ss.getAttribute("User") == null) {
//                response.sendRedirect("index.html");
//            }
//
//            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
//            response.setHeader("Pragma", "no-cache");
//            response.setDateHeader("Expires", 0);
//            HttpSession session = request.getSession(false);
//            session.setAttribute("User", null);
//            session.invalidate();
//            response.sendRedirect("index.html");
//        } 
//        catch (Exception exp) {
//            RequestDispatcher dd = request.getRequestDispatcher("index.html");
//            dd.forward(request, response);
//        }

            
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
