<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css">
    <title>Search</title>
</head>
<body>
<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/WEB-INF/view/header.jsp" />
        </header>


        <form action="search2" method="get">
            Search by name <input type="text" name="item">
            <br>
            <input type="submit">
        </form>

        <table>
            <tr>
                <th>Name</th>
                <th>Item Size</th>
            </tr>
            <c:forEach var="item" items="${item}">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.detail.size}</td>
                </tr>
            </c:forEach>
        </table>

    </div>


    <%@include file="/WEB-INF/view/footer.jsp"%>
</div>

</body>
</html>
