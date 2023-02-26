<%-- 
    Document   : index
    Created on : Feb 11, 2023, 12:19:12 PM
    Author     : NIRBHAY SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="jakarta.servlet.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE DATABASE</title>
    </head>
    <body>
        <h2 align="center">Add or Remove Record from Database </h2>
        <form action="updateDB" method="get">
            <b>Enter name : <input type="text" name="name1"><br>
                <input type="submit" value="Add">
            
        </form>
        <form action="updateDB" method="post">
            <h3>Select an Item and click Remove.<br></h3>
            <select style="width:200px" name="list1"multiple="multiple">
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirbhay?useSSL=false","root","1234");
                    Statement stmt = conn.createStatement();
                    String qry = "select * from names";
                    ResultSet rs=stmt.executeQuery(qry);
                    if(rs!=null)
                    {
                        while(rs.next())
                        {
                        %>
                        <option><%=rs.getString(1)%></option>
                        <%
                        }
                    }
                %>
            </select><br>
            <input type="submit" value="Remove">
        </form>
    </body>
</html>
