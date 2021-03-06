<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="../../resources/css/style.css">
    <title>List</title>
    <base href="${pageContext.request.contextPath}/"/>
</head>
<body>
<div class="container">
    <div class="inside-container">
        <header>
            <jsp:include page="/WEB-INF/view/header.jsp" />
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


    <%@include file="/WEB-INF/view/footer.jsp"%>
</div>

</body>
</html>
