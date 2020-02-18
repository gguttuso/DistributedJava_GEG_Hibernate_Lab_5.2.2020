<%--
  Created by IntelliJ IDEA.
  User: Brie
  Date: 1/27/20
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/style.css">
    <title>Item List</title>
</head>
<body>

<div class="container">
    <div class="inside-container">

        <header>
            <jsp:include page="/header.jsp" />
            <nav><h3><a href="login.jsp"> login </a></h3></nav>
        </header>
<ul>
    <li>
        t-shirts<br>
    </li>
    <a href="#"> edit </a> <a href="#"> delete </a>

    <br><br><br>

    <li> mugs <br>
    </li>
    <a href="#"> edit </a> <a href="#"> delete </a>

    <br><br><br>

    <li> prints <br>
    </li>
    <a href="#"> edit </a> <a href="#"> delete </a>

    <br><br><br>

    <li> phone cases <br>
    </li>
    <a href="#"> edit </a> <a href="#"> delete </a>
</ul>

        <div class="button"><h2><a href="detail.jsp"> add item </a></h2></div>

        <%@include file="/footer.jsp"%>
    </div>
</div>

</body>
</html>
