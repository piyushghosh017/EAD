
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username=(String)session.getAttribute("username");
    if(username==null)
        username="";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Session</title>
    </head>
    <body>
        <h2>Display Session</h2><br>
        <h3><p>Welcome : <%=username %></p></h3>
    </body>
</html>
