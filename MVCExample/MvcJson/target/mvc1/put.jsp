<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 5/4/2019
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PUT</title>
</head>
<body>

<form action="${contextPath}/user/put" method="post">
    <input type="hidden" name="_method"  value="put">
    <input type="text" name="name"><br>
    <button>submit</button>
</form>

</body>
</html>
