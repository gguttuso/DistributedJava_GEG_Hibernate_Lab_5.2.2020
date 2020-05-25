<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Donut Reviews - Edit Donut</title>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/donut-form-style.css">
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/select-style.css">
</head>
<body>

<%@include file="/WEB-INF/view/header.jsp" %>

<div id="container">

    <div id="content">
        <form:form action="${cp}/item/user/save" modelAttribute="aItem" enctype="multipart/form-data"
                   method="post">
            <form:hidden path="id" value="${aItem.id}"/>

            <table>
                <tr>
                    <td><label>Name</label></td>
                    <td><form:input path="name"/>
                        <form:errors path="name" cssClass="error"/></td>
                </tr>
<%--                <tr>--%>
<%--                    <td><label>Shop</label></td>--%>
<%--                    <td>--%>
<%--                        <form:select path="shop" items="${donutShops}" itemLabel="name" itemValue="id"--%>
<%--                                     cssClass="select-css">--%>
<%--                        </form:select>--%>
<%--                        <form:errors path="shop" cssClass="error"/>--%>
<%--                    </td>--%>
<%--                </tr>--%>

                <tr>
                    <td></td>
                    <td><input type="submit" value="Save" class="save"></td>
                </tr>
            </table>
        </form:form>

        <%@include file="/WEB-INF/view/footer.jsp" %>

    </div>
</div>
</body>
</html>
