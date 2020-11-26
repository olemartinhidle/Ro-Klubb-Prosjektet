<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Roprosjekt</title>
        <link rel="stylesheet" href="styles/indexstyle.css">
</head>
    <header>
        <a href="pages/results.jsp"> List results</a>
        <a href="pages/about.jsp">Om oss</a>
        <a href="pages/edit.jsp">Rediger lista</a>
        <a href="pages/registrerBruker.jsp">Registrer deg</a>
    </header>
<body>


    <div class="title"><h1>Logg inn her</h1></div>
    <div class="container">
        <div class="left"></div>
        <div class="right">
            <div class="formBox">
                <form action="./LogIn" method="post">
                    <p>Brukernavn</p>
                    <input type="text" name="epost" placeholder="Skriv din E-post">
                    <p>Passord</p>
                    <input type="Password" name="passord" placeholder="Skriv ditt passord">
                    <input type="submit" name="" value="Logg inn">
                    <a href="#">Glemt passord</a>
                </form>
        </div>
        </div>
    </div>
    </body>
</html>