<%--
  Created by IntelliJ IDEA.
  User: estudo
  Date: 23/04/2023
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Página Jsp</title>
</head>
<body>
    <h1>Bem vindo <%= session.getAttribute("user") %></h1>

<% Boolean isLoggedIn = (Boolean) session.getAttribute("is_logged_in");
if(isLoggedIn == null || isLoggedIn == false){
    response.sendRedirect("http://localhost:8080/login/index.jsp");
}
%>
<a href=http://localhost:8080/login/login">Sair</a>
</body>
</html>
