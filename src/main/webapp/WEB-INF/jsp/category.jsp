<%--
  Created by IntelliJ IDEA.
  User: return
  Date: 4/12/2023
  Time: 1:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Category: ${category.name}</title>
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
        #drawer {
            margin: 0;
            padding: 0;
            padding-top: 30px;
            height: 100vh;
            width: 250px !important;
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
        .justify-center {
            justify-items: center;
        }
        .align-center {
            align-items: center;
        }
        #tabs {
            padding: 15px 30px;
            font-weight: bold;
        }
        #cards-container {
            display: flex;
            justify-content: flex-start;
        }
        .card {
            width: 350px;
            height: 400px;
            background-color: #F9F9F9;
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
            margin-right: 30px;
            margin-bottom: 30px;
        }
        .card-img {
            width: 310px;
            height: 200px;
            margin-top: 20px;
            object-fit: contain;
        }
        /* cover */
        .card-desc {
            padding: 10px;
            font-weight: bold;
            color: #151515;
            margin: 0;
        }
        .card-body {
            font-size: 0.95em;
            color: #222222;
            margin: 0;
            padding: 5px 10px;
        }
    </style>
</head>
<body>
    <div id="app" class="d-row">
        <nav id="drawer">
            <p id="category-title">${category.name}</p>
            <c:if test="${!category.subCategories.isEmpty()}">
                <ul>
                    <c:forEach var="cat" items="${category.subCategories}">
                        <li>
                            <a class="category-list-item" href="./categories/category?name=${cat.name}&id=${cat.id}">${cat.name}</a>
                        </li>
                    </c:forEach>
                </ul>
            </c:if>
        </nav>
        <div id="content" class="d-column">
            <p id="tabs" class="d-row">
                <c:if test="${category.parentCategory != null}">
                    ${category.parentCategory.name} /
                </c:if>
                ${category.name}
            </p>
            <div id="cards-container" class="d-column">
                <c:if test="${products.isEmpty()}">
                    Sorry, there is no products in this category
                </c:if>
                <c:if test="${!products.isEmpty()}">
                    <c:forEach var="product" items="${products}">
                        <div class="card d-column align-center">
                            <img src="${product.photoUrl}" alt="${product.description}" class="card-img"/>

                            <p class="card-desc">${product.description}</p>

                            <c:out value="${product.getClass().getName()}"/>

<%--                            <p class="card-body"></p>--%>
                        </div>
                    </c:forEach>
                </c:if>
            </div>
        </div>
    </div>
</body>
</html>