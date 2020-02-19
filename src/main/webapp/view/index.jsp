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
    <title>Home</title>
</head>
<body>
<div class="containter">
    <div class="inside-container">
    <header>
        <jsp:include page="/view/header.jsp" />
    </header>

<!-- <h1> my store </h1> -->
<div class="button"><h2><a href="list.jsp"> browse items </a></h2></div>
        <%@include file="/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
