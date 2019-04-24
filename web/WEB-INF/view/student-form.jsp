<%--
  Created by Spencer Barriball.
  Date: 24/04/2019
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last Name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favourite Programming Languages:
        <form:radiobuttons path="favLanguage" items="${student.favouriteLanguageOptions}"/>
        <br><br>
        Operating Systems:
        <form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
        <form:checkbox path="operatingSystems" value="Mac OS" label="Mac OS"/>
        <form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
        <br><br>

        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
