
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username=(String) session.getAttribute("username");
        if(username==null || username=="invalid")
        {
            response.sendRedirect("login.jsp");
        }
        else
        {
         %>
         <h4>Hello <%=username%>!</h4>
         <%
        }
        %>
    </body>
</html>
