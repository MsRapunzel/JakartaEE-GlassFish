<%-- 
    Document   : showValue
    Created on : Sep 17, 2024, 7:48:24 PM
    Author     : msrapunzel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Show Value</title>
    </head>
    <body>
        <jsp:useBean id="valueBean" class="com.beans.ValueBean" scope="session" />
        The value contained within the field is currently:
        <b><jsp:getProperty name="valueBean" property="fieldValue"/></b><br>
        <a href="/JakartaEEApp/setValue.jsp">Set the value again</a><br>
        <a href="/JakartaEEApp/">Go to Homepage</a>
    </body>
</html>
