<html>

<body>

<h1>  Welcome!!  </h1>

<h2>        Hello Rowing Enthusiasts! <3  </h2>

<form action="./LogIn" method="get">
    <label>
        <input type="text" name="name" placeholder="Write your name here...">
    </label>
    <button style="animation-direction: normal" type="submit">Return</button>
</form>


<form action="./InsertToDatabase" method="post">
    <p>MedlemsID:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <label>
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


</body>
</html>
