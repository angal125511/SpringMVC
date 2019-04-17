<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/17
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
        <form action="/list/add">
        <table>
            <tr>
                <td>username</td>
                <td>
                    <input name="username" type="text" value=""/>
                </td>
            </tr>

            <tr>
                <td>password</td>
                <td>
                    <input name="password" type="text" value=""/>
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
        </form>
</body>
</html>
