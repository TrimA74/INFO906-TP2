<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SEBIRE
  Date: 15/11/2018
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>

<c:if test="${error != null}">
    <p style="color: red;">Wrong creditentials ! (${error}) </p>
</c:if>

<form action="LoginServlet" method="post">
    <input name="username" type="text">
    <input name="password" type="password">
    <button type="submit">Sign In</button>
</form>

</body>
</html>
