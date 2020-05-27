<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <title>Home</title>
</head>
<body>
<div class="container">

            <header>
                <%@include file="/WEB-INF/view/header.jsp" %>
            </header>

        <div class="inside-container">
            <section class="menu">
                <%--        <a href="index/home"> Home </a><br>--%>
                <a href="details/showAddItemForm"> Add Item</a><br><br>
                <a href="list/listPage"> List Items / Details</a><br><br>
                <a href="login/loginPage"> Login </a><br><br>
            </section>
 <h1> my store </h1>
            <%@include file="/WEB-INF/view/footer.jsp"%>
        </div>

</div>

</body>
</html>
