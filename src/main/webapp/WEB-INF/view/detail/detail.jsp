<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <title>Item Detail</title>
</head>
<body>

<div class="container">
    <div class="inside-container">
        <header>
            <%@include file="/WEB-INF/view/header.jsp" %>
            <nav><h3><a href="../login/login.jsp"> login </a></h3></nav>
        </header>

        <!-- item list table -->
        <form:form action="${cp}/save" modelAttribute="aItem" method="post">
            <table>
                <tr>
                    <td><label> Name </label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
<%--                    <td><label> Size </label></td>--%>
<%--                    <td><form:input path="size"/></td>--%>
                </tr>
<%--                <c:forEach var="tempItem" items="${items}">--%>
<%--                    <tr>--%>
<%--                        <td> ${tempItem.name}</td>--%>
<%--                        <td>--%>
<%--                            <c:forEach var="tempDetail" items="${tempItem.detail}">--%>
<%--                                ${tempDetail.size}--%>
<%--                            </c:forEach>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
                <tr>
                    <td><input type="submit" value="Save" class="button"/></td>
                </tr>
            </table>
        </form:form>



<%--<form>--%>

<%--    <label for="name"> name </label>--%>
<%--    <input type="text" name="name" id="name">--%>

<%--    <br><br>--%>

<%--    <div class="button"><h2><a href="#"> save </a></h2></div>--%>

<%--</form>--%>
        <%@include file="/WEB-INF/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
