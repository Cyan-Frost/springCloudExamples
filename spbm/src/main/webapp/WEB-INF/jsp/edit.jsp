<%--
  Created by IntelliJ IDEA.
  User: ke
  Date: 19-3-11
  Time: 上午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/updateOrder" method="post">

        编号：<input type="text" value="${order.orderNo}" name="orderNo"><br>
        姓名：<input type="text" value="${order.nickName}" name="nickName"><br>
        价格：<input type="text" value="${order.totalPrice}" name="totalPrice"><br>
        <button type="submit">修改</button>
        <button type="reset">重置</button>
    </form>
</body>
</html>
