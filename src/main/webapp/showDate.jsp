<%-- 
    Document   : showDate
    Created on : Sep 17, 2024, 7:31:32 PM
    Author     : msrapunzel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Current Date</title>
    </head>
    <body>
        <jsp:useBean id="dateBean" class="com.beans.DateBean" scope="page" />
        <h1>The current date is: ${dateBean.currentDate}</h1>
        <a href="/JakartaEEApp/">Go to Homepage</a>
    </body>
</html>

