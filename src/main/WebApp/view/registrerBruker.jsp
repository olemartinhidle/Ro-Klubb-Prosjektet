<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Roprosjekt</title>
    <link rel="stylesheet" href="../styles/indexstyle.css">
</head>
<header>
    <nav>
        <ul>
            <li><a href="results.jsp">Results</a></li>
            <li><a href="omOss.jsp">About us</a></li>
            <li><a href="edit.jsp">Edit</a></li>
        </ul>
    </nav>
</header>
<body>
<div class="title"><h1>Registrer ny bruker</h1></div>
<div class="container">
    <div class="left"></div>
    <div class="right">
        <div class="formBox">
            <form action=".././nyBruker" method="post">
                <p>Register din Epost</p>
                <input type="text" name="epost" placeholder="Din E-post">
                <p>Lag et passord</p>
                <input type="Password" name="passord" placeholder="Passord">
                <p>Bestem rettigheter</p>
                <input type="text" name="rettigheter" placeholder="Medlem, Moderator eller Admin">
                <input type="submit" name="" value="Register bruker">
            </form>
        </div>
    </div>
</div>
</body>
</html>