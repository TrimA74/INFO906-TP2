<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Application de gestion de gestion de backlog</title>
	<link rel="stylesheet" type="text/css" href="asset/css/base.css" >
</head>
<body>
    <div class="navbar">
        <c:choose>
            <c:when test="${currentUser == null}">
                <a href="/BacklogWeb/LoginServlet"><button>Se connecter</button></a>
            </c:when>
            <c:otherwise>
                <p>${sessionScope.currentUser.username} est connecté :)</p>
            </c:otherwise>
        </c:choose>
    </div>
	<div class="container">
        <h1>Application de gestion de backlog</h1>
        <c:if test="${currentUser != null}">
            <div>
                <form action="FetchBacklogServlet" method="post">
                    <div>
                        <label>Sélectionnez une agence</label>
                        <select name="agency_id">
                            <c:forEach var="agence"  items="${sessionScope.listAgence}" >
                                <option value="${agence.id}">${agence.name}</option>
                            </c:forEach>
                        </select>
                        <button type="submit">Voir le backlog</button>
                    </div>
                </form>
            </div>
        </c:if>
	</div>

</body>

</html>