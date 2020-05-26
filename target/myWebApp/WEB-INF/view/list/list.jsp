<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
<%--    <link rel="stylesheet" href="${cp}/resources/css/style.css">--%>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <title>Item List</title>
</head>
<body>

<div class="container">
    <div class="inside-container">
        <header>
            <%@include file="/WEB-INF/view/header.jsp" %>
            <nav><h3><a href="../login/login.jsp"> login </a></h3></nav>
        </header>

        <table>
        <tr>
            <th> Name</th>
            <th> Size(s)</th>
        </tr>
        <c:forEach var="tempItem" items="${items}">
            <tr>
                <td> ${tempItem.name}</td>
                <td>
                    <c:forEach var="tempDetail" items="${tempItem.detail}">
                        ${tempDetail.size}&nbsp;
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
    </table>


<%--<ul>--%>
<%--    <li>--%>
<%--        t-shirts<br>--%>
<%--    </li>--%>
<%--    <a href="#"> edit </a> <a href="#"> delete </a>--%>

<%--    <br><br><br>--%>

<%--    <li> mugs <br>--%>
<%--    </li>--%>
<%--    <a href="#"> edit </a> <a href="#"> delete </a>--%>

<%--    <br><br><br>--%>

<%--    <li> prints <br>--%>
<%--    </li>--%>
<%--    <a href="#"> edit </a> <a href="#"> delete </a>--%>

<%--    <br><br><br>--%>

<%--    <li> phone cases <br>--%>
<%--    </li>--%>
<%--    <a href="#"> edit </a> <a href="#"> delete </a>--%>
<%--</ul>--%>

        <button class="button"
                onclick="window.location.href='${cp}/details/showAddItemForm'; return false;">
                  add item
        </button>

        <%@include file="/WEB-INF/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
