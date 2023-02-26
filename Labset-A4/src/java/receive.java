/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author NIRBHAY SINGH
 */
public class receive extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head></head><body><center>"+"<form method=\"get\"><bgcolor=\"hotpink\">"+"<font size=\"4px\">");
            out.println("You are in get method!");
            String name=request.getParameter("name");
            String addr=request.getParameter("address");
            String phone=request.getParameter("phone");
            out.println("<br>Data received:<br><br>Name:"+name+"<br><br>Address:"+addr+"<br><br>Phone No:"+phone);
            out.println("</center></body></html>");
        }
    }
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/html;charset=UTF-8");
              try (PrintWriter out = response.getWriter()) {
                  String name=request.getParameter("name");
                out.println("Hello "+name+"!<br> Your name is received through post method.");
                out.println("<html><head></head><body><center>"+"<bgcolor=\"hotpink\">"+"<font size=\"4px\">");
                out.println("<form action=\"receive\"method=\"get\"><h1>Demonstration of Get & Post Method</h1>");
                out.println("Name : <input type=\"text\" name=\"name\"><br><br>");
                out.println("Address : <input type=\"textarea\"name=\"address\"><br><br>");
                out.println("Phone No.:<input type=\"text\"name=\"phone\"><br><br>");
                out.println("<label>click here to send the data through get METHED:</label><br><br>");
                out.println("<input type=\"Submit\"value=\"submit\"> </form></center></body></html>");
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
