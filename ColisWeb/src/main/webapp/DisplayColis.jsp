<%--
  Created by IntelliJ IDEA.
  User: SEBIRE
  Date: 10/10/2018
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Suivi du colis</title>
    <script src="https://cdn.jsdelivr.net/npm/places.js@1.11.0"></script>
</head>
<body>
    <div class="navbar">
        <a href="/ColisWeb/"><button>Ajouter un colis</button></a>
        <a href="/ColisWeb/DisplayAllColisServlet"><button>Visualiser les colis</button></a>
    </div>

    <h1>Affichage du colis</h1>
    <h2>Informations colis :</h2>

    <p>identifiant : ${colis.identifiant }</p>
    <p>name : ${colis.name }</p>
    <p>poid : ${colis.poid } </p>
    <p>origine : ${colis.origin } </p>
    <p>destination : ${colis.destination } </p>
    <p>state : ${colis.state } </p>
    <p>latitude : ${colis.latitude } </p>
    <p>longitude : ${colis.longitude } </p>
    <p>emplacement : ${colis.emplacement } </p>

</body>
<footer>
    <script src="asset/js/places.js"></script>
</footer>
</html>
