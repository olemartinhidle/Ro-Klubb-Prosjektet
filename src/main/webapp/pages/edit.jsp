
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../styles/editstyle.css">
</head>
<body>

<header>
    <nav>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="../index.jsp">LogIn</a></li>
            <li><a href="results.jsp">Results</a></li>
            <li><a href="about.jsp">About us</a></li>
        </ul>
    </nav>
</header>

<h1>Edit Atleet Data</h1>

<form action=".././InsertToDatabase" method="post">
    <p>AtleetID:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <label>
        <input type="number" name="atleetID"/>
    </label>
        <br/>
        <p>Name:</p>
    <label>
        <input type="text" name="name"/>
    </label>
    <label>
        <br/>
        <p>Last Name</p>
        <input type="text" name="last_name"/>
    </label>
        <br/>
        <p>Phone Number:</p>
    <label>
        <input type="text" name="phoneNumber"/>
    </label>

    <br/><br/><br/>


    <button style="animation-play-state: running" type="submit">Add</button>

</form>
