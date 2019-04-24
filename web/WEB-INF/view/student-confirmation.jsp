<%--
  Created by Spencer Barriball.
  Date: 24/04/2019
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

<p>The student is confirmed: ${student.firstName} ${student.lastName} from country code: ${student.country}</p>
<p>Their favourite language is ${student.favLanguage}</p>
<p>They can use Operating systems:</p>
<ul>
    <c:forEach var="opsys" items="${student.operatingSystems}">
        <li>${opsys}</li>
    </c:forEach>
</ul>
</body>
</html>
