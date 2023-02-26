<%-- 
    Document   : index.jsp
    Created on : Feb 8, 2023, 4:40:30 PM
    Author     : NIRBHAY SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login">
            <table style="border-spacing:10px">
                <tr><td><h1>LOGIN</h1></td></tr>
                <tr>
                    <td>username : </td>
                    <td><input type="Text" name="username"></td>
                </tr>
                
                <tr>
                    <td>password : </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="Submit" values="submit"></td>
                    <td><input type="reset"value="reset"></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
