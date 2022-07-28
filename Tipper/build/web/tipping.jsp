<%-- 
    Document   : tipping
    Created on : Jul 28, 2022, 7:23:38 AM
    Author     : Chris Francis
    Comments   : Getting ready to teach a java class and web based apps seems reasonable in 2022 so JSP for out GUI section, tested on a Tomcat server so far

--%>

<%@page import="tipper.Bill"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Big Tipper</title>
        <link rel="stylesheet" href="tipper.css"/>
    </head>
    <body>
        <h1>Big Tipper Tip Calculator</h1>
        <%
            
            double price = Double.parseDouble(request.getParameter("price"));
            int satisfaction = Integer.parseInt(request.getParameter("satisfaction"));

            Bill bill = new Bill(price, satisfaction);
            
        %>
        
        <p>That's $<%= price %> for the meal and rate a <%= satisfaction %> out of 100 for the service...</p>
        <h3>I'd think a tip of about <%= bill.getApproxPercent() %>% is reasonable...</h3>
        <h2>Which would make the total <%= bill.totalString() %> </h2>
    </body>
</html>
