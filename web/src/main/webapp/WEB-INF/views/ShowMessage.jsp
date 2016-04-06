<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2016/4/6
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:out value="学生列表"></c:out>
<c:forEach var="studentList" items="${list}">
<c:out value="${studentList}"></c:out>
</c:forEach>
</body>
</html>
