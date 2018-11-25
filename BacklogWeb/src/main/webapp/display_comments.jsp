<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: SEBIRE
  Date: 25/11/2018
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voir les commentaires</title>
    <link rel="stylesheet" type="text/css" href="asset/css/base.css" >
    <link rel="stylesheet" type="text/css" href="asset/css/spectre.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-exp.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-icons.min.css">
    <link rel="icon" href="favicon.ico" />
</head>
<body>
<header class="navbar" style="padding: 1rem; box-shadow: 2px 2px 2px lightgrey;">
    <!-- Logo, here on the left -->
    <section class="navbar-primary">
        <a href="/BacklogWeb" class="navbar-brand"><img src="asset/img/favicon-256.png" width="32" height="32" alt=""></a>
    </section>
    <section class="navbar-section">
        <c:choose>
            <c:when test="${sessionScope.currentUser == null}">
                <a href="/BacklogWeb/LoginServlet" class="btn btn-success">Sign In</a>
            </c:when>
            <c:otherwise>
                <a href="/BacklogWeb" class="btn btn-link"><i class="icon icon-2x icon-people"></i>  <span class="text-large" style="margin-left: 1rem;vertical-align: super;">${sessionScope.currentUser.username}</span> </a>
            </c:otherwise>
        </c:choose>
    </section>
</header>

<div class="login">
    <div class="container grid-lg">
        <div class="column col-10">
            <c:if test="${error != null}">
                <div class="toast toast-error">
                    <button class="btn btn-clear float-right"></button>
                        ${error}
                </div>
            </c:if>
            <h2>Commentaires</h2>
            <div class="panel">
                <div class="panel-header">
                    <div class="panel-title">Comments</div>
                </div>
                <div class="panel-nav">
                    <!-- navigation components: tabs, breadcrumbs or pagination -->
                </div>
                <div class="panel-body">
                    <c:forEach var="comment"  items="${comments}" >
                        <c:set var = "initial" value = "${fn:substring(comment.author.username, 0, 1)}" />
                        <div class="tile">
                            <div class="tile-icon">
                                <figure class="avatar" data-initial="${initial}"></figure>
                            </div>
                            <div class="tile-content">
                                <p class="tile-title text-bold">${comment.author.username}</p>
                                <p class="tile-subtitle">${comment.content}</p>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="panel-footer">
                    <!-- buttons or inputs -->
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
