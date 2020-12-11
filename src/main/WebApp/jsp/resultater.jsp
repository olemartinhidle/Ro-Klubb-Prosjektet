<%@page import="main.modell.forbund.Tester"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Tester tester = (Tester) session.getAttribute("logTest");
    if(tester==null){
        response.sendRedirect("hjem.jsp"); }                           %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<header>
    <a href="../index.jsp">Logg inn</a>
    <a href="omOss.jsp">Om oss</a>
    <a href="registerUtøver.jsp"></a>
</header>
<body>
<center><h1>Nyligste resultater</h1></center>
<h3>
    Dato: <%= tester.getDato() %></h3>
<h3>
    Født: <%= tester.getFødt() %> </h3>
<h3>
    Fornavn: <%= tester.getFornavn() %> </h3>
<h3>
    Etternavn: <%= tester.getEtternavn() %></h3>
<h3>
    Klubb: <%= tester.getKlubb() %></h3>
<h3>
    Watt 5000 Meter: <%= tester.getFemtusenWatt() %> </h3>
<h3>
    Tid 5000 Meter: <%= tester.getFemtusentid() %> </h3>
<h3>
    Watt 2000 Meter: <%= tester.getTotusenWatt() %></h3>
<h3>
    Tid 2000 Meter, <%= tester.getTotuseniTid() %></h3>
<h3>
    Watt 60 Meter: <%= tester.getSekstiWatt() %> </h3>
<h3>
    Ligg i ro prosent: <%= tester.getLiggiroProsent() %> </h3>
<h3>
    Ligg i ro KG: <%= tester.getLiggiroKG() %></h3>
<h3>
    Knebøy i prosent: <%= tester.getKnebøyiProsent() %> </h3>
<h3>
    Knebøy i KG: <%= tester.getKnebøyiKG() %></h3>
<h3>
    Antall beveg: <%= tester.getAntallBeveg() %> </h3>

<br/><br/><br/><br/>


<br/><br/>

<button><a href=".././LoggUt">Logg ut</a></button>
</body>
</html>