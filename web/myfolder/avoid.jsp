<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
            <%
            String rowsNumber = request.getParameter("rows");
            if(rowsNumber!=null) {
            Integer rows = new Integer(rowsNumber);
            for(int i = 1 ; i <= rows ; i++){
            %>
            <tr>
                <td><%=i%>.</td>
                <td>Adam</td>
                <td>Zielke</td>
            </tr>
             <% } }%>
        </table>
        
    </body>
</html>
