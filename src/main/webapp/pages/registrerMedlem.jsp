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
            <li><a href="about.jsp">About us</a></li>
            <li><a href="edit.jsp">Edit</a></li>
        </ul>
    </nav>
</header>
<body>


<div class="title"><h1>Logg inn her</h1></div>
<div class="container">
    <div class="left"></div>
    <div class="right">
        <div class="formBox">
            <form action="./LogIn" method="get">
                <p>Lag ditt brukernavn</p>
                <input type="text" name="epost" placeholder="Din E-post">
                <p>Lag et passord</p>
                <input type="Password" name="passord" placeholder="Passord">
                <input type="submit" name="" value="Register medlem">

            </form>
        </div>
    </div>
</div>
</body>
</html>