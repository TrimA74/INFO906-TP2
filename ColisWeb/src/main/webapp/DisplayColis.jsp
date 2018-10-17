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
    <form>
        <div>
            <label>Identifiant</label>
            <input type="text" name="identifiant" value="${colis.identifiant }"/>
        </div>

        <div>
            <label>Poids</label>
            <input type="number" name="poid" value="${colis.poid }"/>
        </div>

        <div>
            <label>Valeur</label>
            <input type="text" name="name" value="${colis.name }"/>
        </div>

        <div>
            <label>Lieu de départ</label>
            <input type="search" id="cityStart" placeholder="Ville" name="origin" value="${colis.origin }"/>
        </div>

        <div>
            <label>Lieu d'arrivé</label>
            <input type="search" id="cityStop" placeholder="Ville" name="destination" ${colis.destination }/>
        </div>

        <div>
            <input type="submit" value="Modifier"/>
        </div>
    </form>
</body>
<footer>
    <script src="asset/js/places.js"></script>
</footer>
</html>
