<%-- 
    Document   : index
    Created on : Feb 8, 2023, 4:57:46 PM
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
        <form action="login" method="get">
            <center>
                <h1>DESIGN</h1>
                <table border=1 color="ivory">
                    <tr>
                        <td>Name : </td>
                        <td><input type="Text" name="name"></td>
                    </tr>
                    <tr>
                        <td>AGE : </td>
                        <td><input type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td>GENDER : </td>
                        <td><input type="radio" name="gender" value="male" checked>Male</td>
                    </tr>
                     <tr>
                        <td> </td>
                        <td><input type="radio" name="gender" value="female">Female</td>
                    </tr>
                     <tr>
                        <td>HOBBIES : </td>
                        <td><input type="checkbox" name="hobbies" value="cricket">Cricket</td>
                    </tr>
                      <tr>
                        <td> </td>
                        <td><input type="checkbox" name="hobbies" value="tennis">Tennis</td>
                    </tr>
                      <tr>
                        <td> </td>
                        <td><input type="checkbox" name="hobbies" value="movies">Movies</td>
                    </tr>
                      <tr>
                        <td> </td>
                        <td><input type="checkbox" name="hobbies" value="music">Music</td>
                    </tr>
                    <tr>
                        <td><input type="Submit" values="submit"></td>
                        <td><input type="reset" values="clear"></td>
                    </tr>
                    
                </table>
        </form>
    </body>
</html>
