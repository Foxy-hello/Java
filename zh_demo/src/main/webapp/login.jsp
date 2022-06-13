<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<body>
    <form action="login">
        用户名: <input type="text" name="uname"><br>
        密  码: <input type="text" name="pwd"><br>
        <input type="submit" value="登录"><br>
        <a href="GitLogin">gitee登录</a>
    </form>
</body>

</html>