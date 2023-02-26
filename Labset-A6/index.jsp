<%-- 
    Document   : index
    Created on : Feb 8, 2023, 10:26:54 PM
    Author     : NIRBHAY SINGH
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page buffer="32kb"%>
<%@page isErrorPage="false"%>
<%@page session="true"%>
<%@page autoFlush="true"%>
<%@page info="This is a jsp page.It display current Date & time"%>
<%@page isThreadSafe="true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Date & Time</title>
    </head>
    <body>
        <h4>
            <br><br>
            Current Date/Time is...<br><br>
            <%=new java.util.Date()%><br><br>
            Formatted Date/Time is...<br><br>
            <jsp:useBean id="now" class="java.util.Date"/>
            <p>Formatted Date (1) : <fmt:formatDate type ="time" value ="${now}" /></p>
            <p>Formatted Date (2) : <fmt:formatDate type ="date" value ="${now}" /></p>
            <p>Formatted Date (3) : <fmt:formatDate type ="both" value ="${now}" /></p>
            <p>Formatted Date (4) : <fmt:formatDate type ="both" dateStyle = "short" timeStyle = "short" value ="${now}" /></p>
            <p>Formatted Date (5) : <fmt:formatDate type ="both" dateStyle = "medium" timeStyle = "medium" value ="${now}" /></p>
            <p>Formatted Date (6) : <fmt:formatDate type ="both" dateStyle = "long" timeStyle = "long" value ="${now}" /></p>
            <p>Formatted Date (7) : <fmt:formatDate pattern ="YYYY-MM-dd" value ="${now}" /></p><br><br>
                    
        </h4>
            <form method="get">
                <input type="submit" name="Refresh Time" value="Refresh Time">
            </form>
    </body>
</html>
