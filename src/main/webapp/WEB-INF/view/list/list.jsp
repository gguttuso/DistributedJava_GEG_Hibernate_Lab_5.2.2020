<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link rel="stylesheet" href="${cp}/resources/css/style.css">
    <title>Item List</title>
</head>
<body>

<div class="container">
    <div class="inside-container">

        <header>
            <jsp:include page="/WEB-INF/view/header.jsp" />
            <nav><h3><a href="../login/login.jsp"> login </a></h3></nav>
        </header>

        <table>
            <th> Name </th>
            <c:forEach var="tempItem" items="${detail}">
                <tr>
                    <td> ${tempItem.name}</td>
                </tr>
            </c:forEach>
        </table>
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

        <div class="button"><h2><a href="../detail/detail.jsp"> add item </a></h2></div>

        <%@include file="/WEB-INF/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
