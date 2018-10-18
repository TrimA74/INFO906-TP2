<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Application de gestion de colis</title>
	<link rel="stylesheet" type="text/css" href="asset/css/base.css" >
</head>
<body>
    <div class="navbar">
        <a href="//LoginServlet"><button>Se connecter</button></a>
    </div>
	<div class="container">
        <h1>Backlog des agences</h1>
		<div>
			<form action="FetchAgenciesServlet" method="post">
                <div>
                    <label>Sélectionnez une agence</label>
                    <select name="agency_id">
                        <c:forEach var="agence"  items="${listAgence}" >
                            <option value="${agence.id}">${agence.name}</option>
                        </c:forEach>
                    </select>
                </div>
			</form>
		</div>
	</div>

</body>

</html>