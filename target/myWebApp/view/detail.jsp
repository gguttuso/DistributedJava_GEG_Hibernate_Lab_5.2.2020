<%--
  Created by IntelliJ IDEA.
  User: Brie
  Date: 1/27/20
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Item Detail</title>
</head>
<body>

<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/view/header.jsp" />
            <nav><h3><a href="login.jsp"> login </a></h3></nav>
        </header>


<form>

    <label for="name"> name </label>
    <input type="text" name="name" id="name">

    <br><br>

    <label for="price"> price </label>
    <input type="text" name="price" id="price">

    <br><br>

    <label for="color"> color </label>
    <input type="text" name="color" id="color">

    <br>
    <br>
    <div class="button"><h2><a href="#"> save </a></h2></div>

</form>
        <%@include file="/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
