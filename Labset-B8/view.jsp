<%-- 
    Document   : view
    Created on : Feb 11, 2023, 6:06:34 PM
    Author     : NIRBHAY SINGH
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,jakarta.servlet.*,java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagination in JSP</title>
    </head>
    <body><center>
        <%
            String spageid=request.getParameter("page");
            int pageid=Integer.parseInt(spageid);
            int total=5;
            if(pageid==1){}
            else{
                pageid=pageid-1;
                pageid=pageid*total+1;
            }
            out.println("<h1>Page No: "+spageid+"</h1>");
            out.println("<table border='1' cellpadding='4' width='60%'>");
            out.println("<tr><th>Id</th><th>Name</th><th>Salary</th>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirbhay?useSSL=false","root","1234");
            Statement stmt = conn.createStatement();
            String qry="select * from emp1 limit "+(pageid-1)+","+total;
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next()){
                out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getFloat(3)+"</td></tr>");
                
            }
            conn.close();
            out.print("</table>");
        
        %>
        <br><br><br>
        <a href="view.jsp?page=1">1</a>
        <a href="view.jsp?page=2">2</a>
        <a href="view.jsp?page=3">3</a>
    </center>
        
    </body>
</html>
