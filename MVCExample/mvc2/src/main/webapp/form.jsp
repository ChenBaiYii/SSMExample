<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 5/4/2019
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<%--请求路径永远写/
    / 代表上下文路径，上下文处于web容器之中，容器本项目为tomcat
    /项目名称/URI
--%>

<%--此处idea已经提示m2仅支持get方法--%>
<form action="${contextPath}/web/m2" method="post">
    <button>submit</button>
</form>
delete:
<hr>
<form action="${contextPath}/web/delete" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <button>submit</button>
</form>


</body>
</html>
