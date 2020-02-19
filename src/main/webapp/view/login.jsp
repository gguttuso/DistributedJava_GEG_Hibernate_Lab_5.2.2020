<%--
  Created by IntelliJ IDEA.
  User: Brie
  Date: 1/27/20
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Login</title>
</head>
<body>

<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/view/header.jsp" />
        </header>

<form action="">
    <label for="username"> Username </label>
    <input type="text" name="username" id="username">

    <br><br>

    <label for="password"> Password </label>
    <input type="text" name="username" id="password">

    <div class="button"><h2><a href="#"> log on </a></h2></div>

</form>

        <%@include file="/view/footer.jsp"%>
    </div>
</div>
</body>
</html>
