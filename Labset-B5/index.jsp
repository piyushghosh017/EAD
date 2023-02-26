<%-- 
    Document   : index
    Created on : Feb 10, 2023, 8:00:17 PM
    Author     : NIRBHAY SINGH
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="jakarta.servlet.*"%>
<%@page import="java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DB Search</title>
    </head>
    <body>
        <h2>Retrieve the student information from database.</h2>
        <form method="get">
            Enter Register Number: <input type="text" name="regno"><br>
            <input type="Submit" value="GetInfo">
            <%
                String regno=request.getParameter("regno");
                if(regno!=null){
                    String qry="select * from studentinfo where regno='"+regno+"'";
                    
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirbhay?useSSL=false","root","1234");
                Statement stmt = conn.createStatement();
                

                ResultSet rs=stmt.executeQuery(qry);
                System.out.println("Outside resultSet!");
                if(rs.next()){
                    System.out.println("Inside resultset!");
                
            %>
            <table border="1">
                <tr>
                    <th>Student Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>SSLC Percentage</th>
                    <th>PUC Percentage</th>
                    <th>Degree Percentage</th>
                </tr>
                <tr>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                    <td><%=rs.getString(7)%></td>
                </tr>
                <%
                    }
                        else
                            out.println("<b>Unable to get information. Register number not found!");

                    }
                %>
            </table>
        
            
        </form>
    </body>
</html>
