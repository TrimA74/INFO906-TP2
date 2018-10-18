<%--
  Created by IntelliJ IDEA.
  User: ludovic
  Date: 17/10/18
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="asset/css/base.css" >
    <title>Title</title>
</head>
<body>
    <div class="navbar">
        <a href="/ColisWeb/"><button>Ajouter un colis</button></a>
        <a href="/ColisWeb/DisplayAllColisServlet"><button>Visualiser les colis</button></a>
    </div>

    <div class="container">
        <h1>Gestion des colis</h1>
        <div>
            <h2>Affichage des colis</h2>

            <c:forEach var="colis"  items="${listColis}" >
                <div>
                    <p>${colis.name}</p>
                    <a href="/ColisWeb/DisplayColisServlet?identifiant=${colis.identifiant}">
                        <button>Visualiser</button>
                    </a>
                </div>

            </c:forEach>
        </div>
    </div>
</body>
</html>
