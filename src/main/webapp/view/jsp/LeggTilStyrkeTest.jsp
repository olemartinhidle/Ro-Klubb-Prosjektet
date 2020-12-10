
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Legg Til Styrke</title>
</head>
<body>
<h1>Legg til Styrke Test</h1>
<form action=".././regStyrke" method="post">
    <p>TestID</p>
    <input type="text" name="testID" placeholder="Skriv TestID">
    <p>MedlemsID</p>
    <input type="text" name="medlemsID" placeholder="Skriv MedlemsID">
    <p>Ligg i ro prosent</p>
    <input type="text" name="liggiroProsent" placeholder="Skriv Ligg i ro prosent">
    <p>Ligg i ro KG</p>
    <input type="text" name="liggiroKG" placeholder="Skriv ligg i ro KG">
    <p>Knebøy i prosent</p>
    <input type="text" name="kneiProsent" placeholder="Skriv knebøy i prosent">
    <p>Knebøy i KG</p>
    <input type="text" name="kneiKG" placeholder="Skriv knebøy i KG">
    <p>Antall beveg</p>
    <input type="text" name="antallBeveg" placeholder="Skriv antall beveg">
    <input type="submit" name="" value="Legg til styrketest">
</form>
</body>
</html>
