<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../resources/css/style.css">
    <title>Item Detail</title>
</head>
<body>

<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/WEB-INF/view/header.jsp" />
            <nav><h3><a href="../login/login.jsp"> login </a></h3></nav>
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
        <%@include file="/WEB-INF/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
