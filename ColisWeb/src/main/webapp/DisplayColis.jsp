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
</head>
<body>
    <h1>Affichage du colis</h1>
    <h2>Informations colis :</h2>
    <p>identifiant : ${colis.identifiant }</p>
    <p>name : ${colis.name }</p>
    <p>poid : ${colis.poid } </p>
    <p>origine : ${colis.origin } </p>
    <p>destination : ${colis.destination } </p>
    <p>state : ${colis.state } </p>
    <a href="index.html">Revenir à la page principale</a>
</body>
</html>
