<%-- 
    Document   : index
    Created on : Sep 6, 2022, 7:31:56 PM
    Author     : franc
--%>

<%@page import="methods.Methods1" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css"/>

    </head>
    <body>
        
        <%
            Methods1 exampleObject = new Methods1();
            int wholeNumber = exampleObject.addingTwoNumbers(12, 18);
            double floatNumber = exampleObject.addingTwoNumbers(12.34, 56.78);
            %>
        
            <p>12 plus 18 is a whole number and it is <%= wholeNumber %></p>
            <p>12.34 plus 56.78 is a floating point number and it is <%= floatNumber %></p>
    </body>
</html>
