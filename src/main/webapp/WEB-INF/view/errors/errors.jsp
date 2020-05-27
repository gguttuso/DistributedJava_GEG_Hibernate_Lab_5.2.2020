<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Items - Oops!</title>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
</head>
<body>

<%@include file="/WEB-INF/view/header.jsp" %>

<div id="container">
    <div id="content">
        <h3>Oops! An error occurred</h3>
        <p>${errorMessage}</p>
    </div>
</div>

    <c:forEach items="${exception.stackTrace}" var="element">
        <c:out value="${element}"/>
    </c:forEach>

<%@include file="/WEB-INF/view/footer.jsp"%>
</body>
</html>
