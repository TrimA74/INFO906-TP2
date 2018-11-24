<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SEBIRE
  Date: 23/11/2018
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier une entrée du backlog</title>
    <link rel="stylesheet" type="text/css" href="asset/css/base.css" >
    <link rel="stylesheet" type="text/css" href="asset/css/spectre.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-exp.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/spectre-icons.min.css">
    <link rel="icon" href="favicon.ico" />
</head>
<body>


<div class="login">
    <div class="container grid-lg">
        <div class="column col-10">
            <c:if test="${error != null}">
                <div class="toast toast-error">
                    <button class="btn btn-clear float-right"></button>
                        ${error}
                </div>
            </c:if>
            <h2>Modifier une entrée du backlog</h2>
            <!-- form input control -->
            <div class="form-group">
                <form action="ModifyBacklogEntryServlet" method="post">
                    <input type="hidden" name="entry_id" value="${entry.id}">
                    <label class="form-label" for="name">Name</label>
                    <input class="form-input" name="name" type="text" id="name" placeholder="Name" value="${entry.name}">
                    <label class="form-label" for="priority" >Priorité</label>
                    <input class="form-input" id="priority" name="priority" type="number" value="${entry.priority}">
                    <label class="form-label" for="estimation">Estimation</label>
                    <input class="form-input" id="estimation" name="estimation" type="number" value="${entry.estimation}">
                    <label class="form-label" for="textarea">Description</label>
                    <textarea class="form-input" id="textarea" name="description" placeholder="Textarea" rows="3">${entry.description}</textarea>
                    <button class="btn btn-primary button" type="submit">Modifier</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
