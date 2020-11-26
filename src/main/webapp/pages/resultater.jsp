<%@page import="main.classes.hoved.Tester"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Tester tester = (Tester) session.getAttribute("logTest");
    if(tester==null){
        response.sendRedirect("home.jsp"); }                           %>
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
</header>
<body>

<h1>
    Welcome, <%= tester.getEpost() %></h1>
<h3>
    Your Account ID: <%= tester.getId() %> </h3>
<h3>
    Your Access: <%= tester.getRettigheter() %> </h3>
<h3>
    Your Password: <%= tester.getPassord() %></h3>
<h1>
    Welcome, <%= tester.getEpost() %></h1>
<h3>
    Your Account ID: <%= tester.getId() %> </h3>
<h3>
    Your Access: <%= tester.getRettigheter() %> </h3>
<h3>
    Your Password: <%= tester.getPassord() %></h3>
<h1>
    Welcome, <%= tester.getEpost() %></h1>
<h3>
    Your Account ID: <%= tester.getId() %> </h3>
<h3>
    Your Access: <%= tester.getRettigheter() %> </h3>
<h3>
    Your Password: <%= tester.getPassord() %></h3>

<br/><br/><br/><br/>

<h1>Result Data</h1>
<!--Sender en Get request ut til web app-->
<form action=".././Resultater" method="Get">
    </br></br></br>
    <button style="animation-play-state: running" type="submit">Show Athlete</button>

</form>

<br/><br/>

<button><a href=".././LogUt">Log Out</a></button>
</body>
</html>