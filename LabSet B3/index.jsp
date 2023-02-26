

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Telephone Directory</title>
    </head>
    <body>
        <form action="Search" method="get">
            <h1>click your choice</h1><br>
            <input type="radio" name="name" value="telephone_no" checked>Telephone Number<br>
            <input type="radio" name="name"value="name">Name
            <h1>Enter your Choice</h1>
            <input type="text" name="val">
            <input type="submit" value="submit">
        </form>
       
    </body>
</html>
