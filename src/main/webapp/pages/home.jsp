<%@page import="main.classes.login.Bruker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Bruker bruker = (Bruker) session.getAttribute("logUser");
    if(bruker==null){
        response.sendRedirect("index.jsp"); }                           %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<header>
    <a href="../index.jsp">LogIn</a>
    <a href="results.jsp">Results</a>
    <a href="about.jsp">About us</a>
    <a href="edit.jsp">Edit</a>
</header>
<body>

<h1>
    Welcome, <%= bruker.getEpost() %></h1>
<h3>
    Your Account ID: <%= bruker.getId() %> </h3>
<h3>
    Your Access: <%= bruker.getRettigheter() %> </h3>
<h3>
    Your Password: <%= bruker.getPassord() %></h3>

<button><a href=".././LogUt">Log Out</a></button>
</body>
</html>