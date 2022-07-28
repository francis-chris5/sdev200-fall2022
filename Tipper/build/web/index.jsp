<%-- 
    Document   : index
    Created on : Jul 28, 2022, 7:12:02 AM
    Author     : franc
    Comments   : Getting ready to teach a java class and web based apps seems reasonable in 2022 so JSP for out GUI section, tested on a Tomcat server so far

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Big Tipper</title>
    </head>
    <body>
        <h1>Big Tipper Tip Calculator</h1>
        <form action="tipping.jsp" method="GET">
            <p>Price: <input type="number" min="0.00" step="0.01" name="price"/></p>
            <p>Satisfaction: ); <input type="range" min="0" max="100" name="satisfaction"/> (: </p>
            <p><input type="submit" value="Calculate"/><input type="reset" value="Reset"/></p>
        </form>
    </body>
</html>
