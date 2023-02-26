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
import java.util.*;

/**
 *
 * @author NIRBHAY SINGH
 */
public class servletResponse extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String authorname=request.getParameter("text");
                out.println("<html><body><font size=\"5\">");
                out.println("<br>Server port: "+request.getServerPort());
                out.println("<br>Server name: "+request.getServerName());
                out.println("<br>Protocol : "+request.getProtocol());
                out.println("<br>Character encoding: "+request.getCharacterEncoding());
                out.println("<br>Content type : "+request.getContentType());
                out.println("<br>Remote address : "+request.getRemoteAddr());
                out.println("<br>Remote Host : "+request.getRemoteHost());
                out.println("<br>Scheme : "+request.getScheme());
                out.println("</font></body></html>");
                
                Enumeration parameters=request.getParameterNames();
                String ParameterName=(String)parameters.nextElement();
                out.println("<html><body><font size=\"5\">");
                out.println("<br>Parameter Name : "+ParameterName);
                out.println("<br>Parameter value : "+request.getParameter(ParameterName));
                out.println("</font</body></html>");
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
