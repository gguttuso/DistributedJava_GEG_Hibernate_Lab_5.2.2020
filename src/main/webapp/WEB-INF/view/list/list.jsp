<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

        <!-- search form -->
        <form:form action="${cp}/details/search" method="GET">
            Search items <input type="search" name="searchTerm"/>
            <input type="submit" value="Search" class="add-button"/>
        </form:form>

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

                    <c:url var="updateLink" value="/details/showUpdateForm">
                        <c:param name="itemId" value="${tempItem.id}"/>
                    </c:url>

                    <!-- construct a "delete" link with item id -->
                     <c:url var="deleteLink" value="/details/delete">
                            <c:param name="itemId" value="${tempItem.id}"/>
                     </c:url>
                <td>
                    <!-- display the update link -->
                    <a href="${updateLink}">Update</a>

                    <!-- only display the delete link if user is admin-->
                        <a href="${deleteLink}"
                           onclick="if (!confirm('Are you sure?')) return false">Delete
                        </a>
                </td>
                </td>
            </tr>
        </c:forEach>
    </table>

        <button class="button"
                onclick="window.location.href='${cp}/details/showAddItemForm'; return false;">
                  add item
        </button>

        <%@include file="/WEB-INF/view/footer.jsp"%>
    </div>
</div>

</body>
</html>
