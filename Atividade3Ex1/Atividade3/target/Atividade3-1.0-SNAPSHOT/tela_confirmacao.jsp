<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: lab
  Date: 10/04/2023
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String nome = (String) request.getAttribute("attr_name");
    LocalDate data = (LocalDate) request.getAttribute("attr_data");

    // transformar data para string

    String idioma = (String) request.getAttribute("attr_idioma");
    String[] habilidades = (String[]) request.getAttribute("attr_habilidades");

%>

<html>
<head>
    <title>Cadastro submetido</title>
</head>
<body>
<h1>Cadastro Submetido</h1>
<ul>
    <li> <% out.print(nome); %></li>
    <li> <% out.print(data); %></li>
    <li> <% out.print(idioma); %></li>
    <ul>
        <% for (String habilidade:habilidades) {%>
        <li> <% out.print(habilidade); %> </li>
        <% } %>
    </ul>

</ul>
</body>
</html>