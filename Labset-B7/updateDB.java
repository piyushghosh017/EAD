/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

//import java.io.IOException;
//import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;


/**
 *
 * @author NIRBHAY SINGH
 */
public class updateDB extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           try
           {
               String name1 = request.getParameter("name1");
               if(name1.length()==0){
                   response.sendRedirect("index.jsp");
           }    
               else{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirbhay?useSSL=false","root","1234");
                   Statement stmt = conn.createStatement();
                   String qry = "insert into names values('"+name1+"')";
                   stmt.executeUpdate(qry);
                   response.sendRedirect("index.jsp");
               }
           }
           catch (IOException | ClassNotFoundException | SQLException e){
               System.out.println(e);
           }
        }
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{
                String[]list1 = request.getParameterValues("list1");
                if(list1==null){
                    response.sendRedirect("index.jsp");
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirbhay?useSSL=false","root","1234");
                Statement stmt = conn.createStatement();
                String qry;
                for(int i=0;i<list1.length;i++){
                    qry="delete from names where name='"+list1[i]+"'";
                    if(stmt.executeUpdate(qry)==1){
                        System.out.println(list1[i]+"--Data deleted successfully.");
                    }
                }
                response.sendRedirect("index.jsp");
            }
            catch (Exception e){
                System.out.println(e);
            }
            
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
