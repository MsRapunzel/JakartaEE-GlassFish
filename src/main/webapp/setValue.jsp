<%-- 
    Document   : setValue
    Created on : Sep 17, 2024, 8:28:48 PM
    Author     : msrapunzel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Set Value</title>
    </head>
    <body>
        <jsp:useBean id="valueBean" class="com.beans.ValueBean" scope="session" />
        <jsp:setProperty name="valueBean" property="*"/>
        <form method="post">
            Use the input text box below to set the value, and then hit submit.
            <br/><br/>
            <label for="fieldValue">Set the field value: </label>
            <input id="fieldValue" name="fieldValue" type="text" size="30"/>
            <br/>
            <input type="submit"><br>
            <a href="/JakartaEEApp/showValue.jsp">See set value</a><br>
            <a href="/JakartaEEApp/">Go to Homepage</a>
        </form>
    </body>
</html>
