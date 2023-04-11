<%--
  Created by IntelliJ IDEA.
  User: return
  Date: 4/11/2023
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="false" errorPage="not_found.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Categories</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:700" rel="stylesheet">
</head>
<style>
    html {
        padding: 0;
        margin: 0;
    }
    body {
        padding: 0;
        margin: 0;
        font-family: 'Roboto', sans-serif;
    }
    #app {
        display: flex;
    }
    #drawer {
        margin: 0;
        padding: 0;
        padding-top: 30px;
        height: 100vh;
        width: 250px;
        background: darkgrey;
    }
    ul {
        list-style: none;
        margin: 0;
        padding: 0;
    }
    .category-list-item {
        padding: 15px 30px 15px 40px;
    }
    .category-list-item:hover {
        background-color: gray;
    }
    a {
        text-decoration: none;
        color: #111;
    }
    #content {
        display: flex;
        width: 100%;
        flex-direction: column;
        padding: 30px 50px;
    }

    .card {
        width: 350px;
        height: 250px;
        background-color: #F9F9F9;
        box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
    }
</style>
<body>
    <div id="app">
        <nav id="drawer">
            <ul>
                <c:forEach var="category" items="${categories}">
                    <li class="category-list-item">
                        <a href="./categories/category?name=${category.name}&id=${category.id}">${category.name}</a>
                    </li>
                </c:forEach>
            </ul>
        </nav>
        <div id="content">
            <div class="card"></div>
        </div>
    </div>
</body>
</html>