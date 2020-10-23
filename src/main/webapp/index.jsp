<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Roprosjekt</title>
    <link rel="stylesheet" href="style.css">

    <style>
        body {
            background-image: url("https://img.redbull.com/images/q_auto,f_auto/redbullcom/2014/09/22/1331680274837_2/eliminasjonsregatta-p%C3%A5-nord%C3%A5svatnet.jpg");
            background-size: 100% 100%;
        }
    </style>

<body>

    <header>
        <nav>
            <ul>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="results.jsp">Results</a></li>
                <li><a href="about.jsp">About us</a></li>
            </ul>
        </nav>
    </header>

        <form action="./LogIn" method="get">

            <div class="login-box">
             <h1>Login</h1>
            <div class="textbox">
              <label>
                 <input type="text" placeholder="Your username" name="username" value="">
             </label>
            </div>

            <div class="textbox">
                <label>
                 <input type="password" placeholder="Your password" name="password" value="">
                </label>
             </div>

                 <input class="btn" type="submit" name="" value="Sign in">

             <div class="remember-group">
                <label>
                   <input type="checkbox">
                </label>
                <label for="">Remember Me!</label>
             </div>

             <div class="pass">Forgot Password?
             </div></div>

         </form>

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

-->