<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 2019/5/5
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${contextPath}/user/login">
    username: <input type="text" name="name"> <br>
    password: <input type="text" name="password"> <br>
    <button>submit</button>
</form>


</body>
</html>
