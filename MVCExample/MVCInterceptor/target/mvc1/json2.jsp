<%--
  Created by IntelliJ IDEA.
  User: 63406
  Date: 5/4/2019
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON2</title>
</head>
<body>


<script>
    $('#b1').click(function () {
        var obj = {
            'name': "l",
            'pwd': 'y'
        };
        $.ajax({
            url:'${contextPath}/json2/add',
            type: 'post',
            contentType:'application/json',
            data: JSON.stringify(obj),
            success:function (data) {
            }
        })
    })


</script>
</body>
</html>
