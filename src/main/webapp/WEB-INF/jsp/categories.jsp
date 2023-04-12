<%--
  Created by IntelliJ IDEA.
  User: return
  Date: 4/11/2023
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" errorPage="not_found.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Categories</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:700" rel="stylesheet">
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
            display: block;
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
            flex: 1;
            padding: 30px 30px;
        }

        #category-title {
            font-weight: bold;
            color: #222;
            font-size: 1.1em;
            padding: 15px 30px;
        }
        .d-row {
            display: flex;
            flex-direction: row;
        }
        .d-column {
            display: flex;
            flex-direction: column;
        }
        #tabs {
            padding: 15px 30px;
            font-weight: bold;
        }
        #cards-container {
            display: grid;
            grid-template-columns: repeat(2, 1fr);
        }
        .card {
            width: 350px;
            height: auto;
            background-color: #F9F9F9;
            box-shadow: rgba(0, 0, 0, 0.35) 0 5px 15px;
            margin-right: 30px;
            margin-bottom: 30px;
            padding: 20px;
        }
        .card-img {
            width: auto;
            height: 200px;
            object-fit: contain;
        }
        .card-desc {
            padding: 20px 0 10px 0;
            font-weight: bold;
            color: #151515;
            margin: 0;
        }
        .card-body {
            font-size: 0.95em;
            color: #222222;
            margin: 0;
            padding: 5px 10px 5px 0;
        }
        #title {
            margin: 30px 0 20px 30px;
        }
    </style>
</head>
<body>
    <div id="app">
        <nav id="drawer">
            <ul>
                <c:forEach var="category" items="${categories}">
                    <li>
                        <a class="category-list-item" href="./categories/category?name=${category.name}">${category.name}</a>
                    </li>
                </c:forEach>
            </ul>
        </nav>
        <div id="content" class="d-column">
            <h2 id="title">Welcome to our store</h2>
            <div id="cards-container">
                <c:if test="${products.isEmpty()}">
                    Sorry, there is no products in this category
                </c:if>
                <c:if test="${!products.isEmpty()}">
                    <c:forEach var="product" items="${products}">
                        <div class="card d-column">
                            <img src="${product.photoUrl}" alt="${product.description}" class="card-img"/>

                            <p class="card-desc">${product.description}</p>

                            <c:if test="${product.getClass().getName().equals(\"com.example.lab2.data.model.Car\")}">
                                <p class="card-body"><strong>Mileage:</strong> <c:out value="${product.mileage}"/></p>
                            </c:if>

                            <c:if test="${product.getClass().getName().equals(\"com.example.lab2.data.model.Car\")}">
                                <p class="card-body"><strong>Price:</strong> $<c:out value="${product.price}"/></p>
                            </c:if>

                                <%--                            <p class="card-body"></p>--%>
                        </div>
                    </c:forEach>
                </c:if>
            </div>
        </div>
    </div>
</body>
</html>