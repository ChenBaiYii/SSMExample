<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 5/4/2019
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
    <script src="${contextPath}/static/js/jquery.js"></script>
</head>
<body>
<button id="b1">请求得到一个User</button>
<button id="b2">请求得到一个Map</button>
<button id="b3">请求得到一个Array</button>

<div>

</div>

<script>
    $(function () {
        $("#b1").click(function () {
            $.ajax({
                url:"${contextPath}/json/m1",
                type: 'post',
                success:function (data) {
                    alert(data.name + data.password);
                }

            })
        });

        $("#b2").click(function () {
            $.ajax({
                url:"${contextPath}/json/m2",
                type: 'post',
                success:function (data) {
                    alert(data.name);
                }

            })
        })

    })
    
</script>

</body>
</html>
