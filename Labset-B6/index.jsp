<%-- 
    Document   : login
    Created on : Feb 10, 2023, 10:58:49 PM
    Author     : NIRBHAY SINGH
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body align="center">
        <h2>Welcome to login page</h2>
        <hr style="background-color:gray; height:5px" align="center"/>
        <br><br>
        <%
            try{
                String username=(String)session.getAttribute("username");
                if(username=="invalid")
                {
        %>
        <h3 style="color:red"><b>Enter valid Username & Password!</b></h3>
        <%
         }
          else if(username!=null)
            {
                response.sendRedirect("homepage.jsp");
            }
            }
            catch (Exception e)
            {
            System.out.println(e);
            }
        %>
        <form method="post" action="authorize">
            <table align="center" border="1">
                <tr>
                    <td><h3 style="color:darkmagenta">Enter Username : </td></h3>
                    <td><input type="text" name="UNAME" align="right" style="width:160"></td>
                </tr>
                 <tr>
                    <td><h3 style="color:darkmagenta">Enter Password : </td></h3>
                    <td><input type="password" name="PWD" align="right" style="width:160"></td>
                </tr>
                <tr>
                    <td align="center"><input type="submit" value="LOGIN" style="background-color:#0088FF;color:#FFFFFF;font-weight:bolder">
                    <td align="center"><input type="reset" value="RESET" style="background-color:#0088FF;color:#FFFFFF;font-weight:bolder">
                
                </tr>
            </table>
        </form>
    </body>
</html>
