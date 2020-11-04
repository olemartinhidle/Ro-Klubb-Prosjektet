<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Roprosjekt</title>
        <link rel="stylesheet" href="styles/indexstyle.css">
</head>
    <header>
        <nav>
            <ul>
                <li><a href="pages/results.jsp">Results</a></li>
                <li><a href="pages/about.jsp">About us</a></li>
                <li><a href="pages/edit.jsp">Edit</a></li>
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
                    <p>Brukernavn</p>
                    <input type="text" name="epost" placeholder="Skriv din E-post">
                    <p>Passord</p>
                    <input type="Password" name="passord" placeholder="Skriv ditt passord">
                    <input type="submit" name="" value="Logg inn">
                    <a href="#">Glemt passord</a>
                    <ul><li><a href="pages/registrerMedlem.jsp">Registrer medlem</a></li></ul>
                </form>
        </div>
        </div>
    </div>
    </body>
</html>

<!-- <h1>  Welcome!!  </h1>

<h2>        Hello Rowing Enthusiasts! <3  </h2>

<form action="./LogIn" method="get">
    <label>
        <input type="text" name="name" placeholder="Write your name here...">
    </label>
    <button style="animation-direction: normal" type="submit">Return</button>
</form>


<form action="./InsertToDatabase" method="post">
    <p>MedlemsID:</p>                           -->
<!-- Create an element with mandatory name attribute,
so that data can be transfer to the servlet using getParameter() -->
<!--    <label>
        <input type="text" name="medlemsid"/>
    </label>
    <br/>
    <p>String:</p>
    <label>
        <input type="text" name="string"/>
    </label>
    <br/><br/><br/>
    <button style="animation-play-state: running" type="submit">Add</button>
</form>

egentlig kode:
<style>
body {
background-image: url("https://www.linkpicture.com/q/roing_1.jpg");
background-repeat: no-repeat;
background-size: 97% 95%;
background-position: center;
}
</style>

<body>
<form action="./LogIn" method="get">

<div class="login-box">
<h1>Logg inn</h1>

<div class="textbox">
<label>
<input type="text" placeholder="Brukernavn" name="brukernavn" value="">
</label>
</div>

<div class="textbox">
<label>
<input type="passord" placeholder="Passord" name="passord" value="">
</label>
</div>

<input class="btn" type="submit" name="" value="Logg inn">

<div class="remember-group">
<label>
<input type="checkbox">
</label>
<label for="Husk meg"></label>
</div>

</form>

-->