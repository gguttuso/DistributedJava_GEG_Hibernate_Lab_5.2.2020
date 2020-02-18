<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/header.jsp" />
        </header>

        <table>
            <tr>
                <th>Name</th>
                <th>Item Size</th>
            </tr>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.detail.size}</td>
                </tr>
            </c:forEach>
        </table>

    </div>


    <%@include file="/footer.jsp"%>
</div>

</body>
</html>
