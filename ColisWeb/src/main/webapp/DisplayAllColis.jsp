<%--
  Created by IntelliJ IDEA.
  User: ludovic
  Date: 17/10/18
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Affichage des colis</h1>

    <c:forEach var="colis"  items="${requestScope['listColis']}" >
        <p>${colis.name}</p>
    </c:forEach>
</body>
</html>
