<html>

<head>


</head>


<body>

<h1>  Welcome!!  </h1>

<h2>        Hello Rowing Enthusiasts! <3  </h2>

<form action="/LogIn" method="get">
    <input type="text" name="name" placeholder="Skriv navnet ditt her...">
    <button style="color: blue" style="animation-direction: normal" type="submit">Log in</button>
</form>


<form action="/InsertToDatabase" method="post">
    <p>ID:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <input type="text" name="id"/>
    <br/>
    <p>String:</p>
    <input type="text" name="string"/>
    <br/><br/><br/>
    <input type="submit"/>
</form>


</body>
</html>
