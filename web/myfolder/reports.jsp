<%-- 
    Document   : my2
    Created on : 2015-10-28, 14:01:02
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="rep" uri="http://adamzielke.com/reportstag"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/extraWeb/css/bootstrap.min.css" rel="stylesheet">
        <title>Reports</title>
    </head>
    <body>
        <div class="container">
            <div class="table-responsive">
        <rep:report for="persons" name="osoby"/>
        </br></br>
        <rep:report for="expenses" name="wydatki"/>   
            </div>
        </div>
    </body>
</html>
