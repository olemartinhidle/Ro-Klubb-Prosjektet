<%@page import="main.modell.loggInn.Bruker"%>
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
    <a href="omOss.jsp">Om oss</a>
    <a href="registerUtøver.jsp">Registrer utøver</a>
    <a href="leggTilDistanseTest.jsp">Legg til distanse test</a>
    <a href="leggTilStyrkeTest.jsp">Legg til styrke test</a>
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

<br/><br/><br/><br/>

<h1>Resultater</h1>
<!--Sender en post request ut til web app-->
<form action=".././søkEtterResultater" method="Post">
    <br/>
    <p>Søk</p>
    <input type="text" name="medlemsID" placeholder="Søk etter medlemsID">
    <button style="animation-play-state: running" type="submit">Vis utøvers resultater</button>

</form>

<br/><br/>

<button><a href=".././loggUt">Log Out</a></button>
</body>
</html>