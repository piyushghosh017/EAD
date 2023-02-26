
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username=request.getParameter("username");
    if(username==null)
            username="";
    session.setAttribute("username",username);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Save Session</title>
    </head>
    <body>
        <h2>Session Created</h2><br>
        <h3><p><a href="show.jsp">Click here to view the session value</a></p></h3>
    </body>
</html>
