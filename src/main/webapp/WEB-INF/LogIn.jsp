<%--
  Created by IntelliJ IDEA.
  User: bezot
  Date: 29.03.2023
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
</head>
<body>
<h1>Log In</h1>
<form action="AuthServlet" method="POST">
    Username: <input type="text" name="username" value=""/>
    Password: <input type="password" name="password" value=""/>
    <button type="submit">Log In</button>
</form>
</body>
</html>
