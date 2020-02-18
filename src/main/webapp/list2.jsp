<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List</title>
    <base href="${pageContext.request.contextPath}/"/>
</head>
<body>
<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/header.jsp" />
        </header>

        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                </tr>
            </c:forEach>
        </table>
    </div>


    <%@include file="/footer.jsp"%>
</div>

</body>
</html>
