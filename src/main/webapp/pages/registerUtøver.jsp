
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Legg til medlem</title>
</head>
<body>
<h1>Register et nytt medlem</h1>

<form action=".././RegisterMedlem" method="post">
    <p>Fornavn</p>
    <input type="text" name="fornavn" placeholder="Skriv fornavn">
    <p>Etternavn</p>
    <input type="text" name="etternavn" placeholder="Skriv etternavn">
    <p>År født</p>
    <input type="text" name="født" placeholder="1999">
    <p>Klubb</p>
    <input type="text" name="klubb" placeholder="Skriv navn på klubb">
    <input type="submit" name="" value="Register medlem">
    <a href="#">Glemt passord</a>
</form>


</body>
</html>
