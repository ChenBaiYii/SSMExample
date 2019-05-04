<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 19.5.3
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${orders}" var="obj">
    <tr>
        <td>${obj.id}</td>
        <td>${obj.name}</td>
        <td>${obj.total}</td>
    </tr>
</c:forEach>
</body>
</html>
