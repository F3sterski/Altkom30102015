
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person</title>
    </head>
    <body>
        <table border="1" color="red">
        <c:forEach var="person" items="${persons}" varStatus="loop">
            <tr>
                <td><c:out value="${loop.index + 1}" /> </td> 
                <td><c:out value="${person.imie}" /> </td> 
                <td><c:out value="${person.nazwisko}" /> </td>
            </tr>
        </c:forEach>
        <a href="myfolder/adres.jsp">Link do adresu</a>
        
        </table>
    </body>
</html>
