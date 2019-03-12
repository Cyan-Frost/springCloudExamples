<%--
  Created by IntelliJ IDEA.
  User: ke
  Date: 19-3-11
  Time: 上午9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr><td>编号</td><td>名字</td><td>价格</td><td>操   作</td></tr>
<c:forEach items="${orders}" var="c" varStatus="st">
    <tr>
        <td>${c.orderNo}</td>
        <td>${c.nickName}</td>
        <td>${c.totalPrice}</td>
        <td><a href="/findOne?orderNo=${c.orderNo}">修改</a>
            <a href="/removeOrderByOrderNo?orderNo=${c.orderNo}">删除</a> </td>
    </tr>

</c:forEach>
</table>
<a href="/add">添加新数据</a>
</body>
</html>
