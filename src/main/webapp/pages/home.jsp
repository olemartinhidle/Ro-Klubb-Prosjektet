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
    <a href="../index.jsp">Logg inn</a>
    <a href="about.jsp">Om oss</a>
    <a href="edit.jsp">Rediger</a>
    <a href="registerUtøver.jsp"></a>
    <a href="LeggTilDistanseTest.jsp"></a>
    <a href="LeggTilStyrkeTest.jsp"></a>
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
<form action=".././SøkEtterResultater" method="Post">
    <br/>
    <p>Søk</p>
    <input type="text" name="fornavn" placeholder="Søk etter fornavn">
    <button style="animation-play-state: running" type="submit">Vis valgtes resultater over tid</button>

</form>

<br/><br/>

<button><a href=".././LogUt">Log Out</a></button>
</body>
</html>