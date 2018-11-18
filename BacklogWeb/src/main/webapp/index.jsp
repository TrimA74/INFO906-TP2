<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Application de gestion de gestion de backlog</title>
	<link rel="stylesheet" type="text/css" href="asset/css/base.css" >
    <link rel="stylesheet" type="text/css" href="asset/css/spectre.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-exp.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-icons.min.css">
</head>
<body>
<header class="navbar" style="padding: 1rem; box-shadow: 2px 2px 2px lightgrey;">
    <!-- Logo, here on the left -->
    <section class="navbar-primary">
        <a href="#" class="navbar-brand"><span class="text-large">Application de gestion de gestion de backlog</span></a>
    </section>
    <section class="navbar-section">
        <c:choose>
            <c:when test="${currentUser == null}">
                <a href="/BacklogWeb/LoginServlet" class="btn btn-success">Sign In</a>
            </c:when>
            <c:otherwise>
                <a href="" class="btn btn-link"><i class="icon icon-2x icon-people"></i>  <span class="text-large" style="margin-left: 1rem;vertical-align: super;">${sessionScope.currentUser.username}</span> </a>
            </c:otherwise>
        </c:choose>
    </section>
</header>
<section class="main grid-lg">
    <div class="container">
        <div class="column col-4 p-centered">
            <h1>Application de gestion de backlog</h1>
            <c:if test="${currentUser != null}">
                <div>
                    <form action="FetchBacklogServlet" method="post">
                        <div class="form-group">
                            <label class="form-label" for="select-agency">Sélectionnez une agence</label>
                            <select name="agency_id" class="form-select" id="select-agency">
                                <c:forEach var="agence"  items="${sessionScope.listAgence}" >
                                    <option value="${agence.id}">${agence.name}</option>
                                </c:forEach>
                            </select>
                            <button type="submit" class="btn btn-primary button">Voir le backlog</button>
                        </div>
                    </form>
                </div>
            </c:if>
        </div>
    </div>
</section>


</body>

</html>