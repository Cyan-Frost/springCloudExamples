<%--
  Created by IntelliJ IDEA.
  User: ke
  Date: 19-3-8
  Time: 下午5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/saveOrder" method="post">
        昵称：<input type="text" name="nickName">
        编号：<input type="text" name="orderNo">
        价格：<input type="text" name="totalPrice">
        <button type="submit">提交</button>
    </form>
</body>
</html>
