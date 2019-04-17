<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/17
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list页面</title>
</head>
<body>
    <table>
        <tr>
            <td>编号</td>
            <td>&nbsp;&nbsp;名称&nbsp;</td>
            <td>&nbsp;&nbsp;密码&nbsp;</td>
            <td>&nbsp;操作&nbsp;</td>
        </tr>

        <c:forEach var="user" items="${list}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <a href="/user/delete/${user.id}">删除</a>
                    <a href="/user/update/${user.id}">修改</a>
                </td>
            </tr>
        </c:forEach>

   </table>
<a href="/user/toadd">添加</a>
</body>
</html>
