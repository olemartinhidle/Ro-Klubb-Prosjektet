<%@page import="main.modell.forbund.Resultater"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Resultater resultater = (Resultater) session.getAttribute("logTest");
    if(resultater==null){
        response.sendRedirect("hjem.view"); }                           %>
<!-- Vi utnytter dataene fra test modellen til å finne frem test resultatene, og eventuelt sender bruker tilbake om bruker ikke eksisterer -->
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
<!-- Under henter vi ut dataene fra objektet -->
<center><h1>Nyligste resultater</h1></center>
<h3>
    Dato: <%= resultater.getDato() %></h3>
<h3>
    Født: <%= resultater.getFødt() %> </h3>
<h3>
    Fornavn: <%= resultater.getFornavn() %> </h3>
<h3>
    Etternavn: <%= resultater.getEtternavn() %></h3>
<h3>
    Klubb: <%= resultater.getKlubb() %></h3>
<h3>
    Watt 5000 Meter: <%= resultater.getFemtusenWatt() %> </h3>
<h3>
    Tid 5000 Meter: <%= resultater.getFemtusentid() %> </h3>
<h3>
    Watt 2000 Meter: <%= resultater.getTotusenWatt() %></h3>
<h3>
    Tid 2000 Meter, <%= resultater.getTotuseniTid() %></h3>
<h3>
    Watt 60 Meter: <%= resultater.getSekstiWatt() %> </h3>
<h3>
    Ligg i ro prosent: <%= resultater.getLiggiroProsent() %> </h3>
<h3>
    Ligg i ro KG: <%= resultater.getLiggiroKG() %></h3>
<h3>
    Knebøy i prosent: <%= resultater.getKnebøyiProsent() %> </h3>
<h3>
    Knebøy i KG: <%= resultater.getKnebøyiKG() %></h3>
<h3>
    Antall beveg: <%= resultater.getAntallBeveg() %> </h3>

<br/><br/><br/><br/>


<br/><br/>

<button><a href=".././LoggUt">Logg ut</a></button>
</body>
</html>