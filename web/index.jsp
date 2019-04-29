<%--
  Created by IntelliJ IDEA.
  User: Sc
  Date: 2019/4/29
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>任八怪</title>
</head>
<body>
<form action="/web0429/ProductServlet" method="post">
    商品名:<input type="text" name="name"/><br />
    商品价格：<input type="text" name="price"/><br />
    备注：<input type="text" name="remark"/><br />
    <button type="submit">添加商品</button>


</form>
</body>
</html>
