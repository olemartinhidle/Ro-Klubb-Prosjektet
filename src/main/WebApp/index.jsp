<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Roprosjekt</title>
        <link rel="stylesheet" href="css/indexstyle.css">
</head>
    <header>
        <a href="jsp/omOss.jsp">Om oss</a>
        <a href="jsp/registrerBruker.jsp">Registrer deg</a>
    </header>
<body>


    <div class="title"><h1>Logg inn her</h1></div>
    <div class="container">
        <div class="left"></div>
        <div class="right">
            <div class="formBox">
                <form action="./loggInn" method="post">
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