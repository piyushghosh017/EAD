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
import jakarta.servlet.http.Cookie;
import java.util.*;

/**
 *
 * @author NIRBHAY SINGH
 */
public class CookieTest extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (PrintWriter out = response.getWriter()) {
            Cookie c1=new Cookie("username","DSCE");
            Cookie c2=new Cookie("password","MCA-VTU");
            
            response.addCookie(c1);
            response.addCookie(c2);
            
            response.setContentType("text/html");
            out.println("<html><head>");
            out.println("<title>SET cookie</title>");
            out.println("</head><body><br><h2>please click the button to see the cookies sent to you.</h2><br><br>");
            out.println("<form method=\"post\"><input type=\"submit\"value=\"submit\"></form><body></html>");
            
        }
    }
        public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html");
            out.println("<html><head>");
            out.println("<title>Show cookie</title>");
            out.println("</head><body><br><h2>Here are all the headers.</h2><br><h3>");
            Enumeration enum1=request.getHeaderNames();
            while(enum1.hasMoreElements())
            {
                String header=(String)enum1.nextElement();
                out.println("<b>"+header+"</b>:");
                out.println(request.getHeader(header)+"<br>");
            }
            out.println("</h3><h2><b><br>And here are all the cookies.</br></b></h2><h3>");
            Cookie[] Cookies=request.getCookies();
            int length=Cookies.length;
            for(int i=0;i<length;i++)
            {
                Cookie cookie=Cookies[i];
                out.println("<br>cookie Name :"+cookie.getName());
                out.println("<br>cookie Value :"+cookie.getValue());
            }
            out.println("</h3></body></html>");
        }
    }
}