<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css">
    <title>Home</title>
</head>
<body>
<div class="container">

            <header>
                <jsp:include page="/WEB-INF/view/header.jsp" />
            </header>

        <div class="inside-container">
            <section class="menu">
                <%--        <a href="index/home"> Home </a><br>--%>
                <a href="details/detailPage"> Details </a><br>
                <a href="list/listPage"> List </a><br>
                <a href="login/loginPage"> Login </a><br>
            </section>
 <h1> my store </h1>
            <%@include file="/WEB-INF/view/footer.jsp"%>
        </div>

</div>

</body>
</html>
