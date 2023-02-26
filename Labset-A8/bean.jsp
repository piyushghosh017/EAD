<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="student" scope="request" class="pkg1.StudentBean"/>
        <jsp:setProperty name="student" property="*"/>
    <center><b>STUDENT DETAILS</b><br/>
        Name :<jsp:getProperty name="student" property="sname"/><br/><br>
        USN :<jsp:getProperty name="student" property="susnno"/><br/><br>
        Branch :<jsp:getProperty name="student" property="sbranch"/><br/><br>
    </body>
</html>
