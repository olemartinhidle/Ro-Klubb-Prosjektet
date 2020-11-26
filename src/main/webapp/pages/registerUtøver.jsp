
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Legg til medlem</title>
</head>
<body>
<h1>Register et nytt medlem</h1>

<form action=".././regUt" method="post">

    <p>KlasseID</p>
    <input type="text" name="klasseID" placeholder="Skriv klasseID">
    <p>KlubbID</p>
    <input type="text" name="klubbID" placeholder="Skriv klubbID">
    <p>Fornavn</p>
    <input type="text" name="fornavn" placeholder="Skriv fornavn">
    <p>Etternavn</p>
    <input type="text" name="etternavn" placeholder="Skriv etternavn">
    <p>År født</p>
    <input type="text" name="født" placeholder="1999">
    <p>Stilling</p>
    <input type="text" name="stilling" placeholder="Skriv stilling">
    <p>Klubb</p>
    <input type="text" name="klubb" placeholder="Skriv navn på klubb">
    <p>Klasse</p>
    <input type="text" name="klasse" placeholder="Skriv klasse">
    <input type="submit" name="" value="Register medlem">
</form>


</body>
</html>
