<%--
  Created by Spencer Barriball.
  Date: 25/04/2019
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error { color:red;}
    </style>
</head>
<body>
    <i>Fill out the form. Askerisk (*) means required.</i>
    <br><br>
    <form:form action="processForm" modelAttribute="customer"/>

    <form:input type="text" value="First Name" path="firstName"/>
    <br><br>
    <form:input type="text" value="Last Name (*)" path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit"/>
    <br><br>
</body>
</html>
