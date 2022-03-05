<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
${no}
<form action="loginServIet">
    账号：<input type="text" name="adminName">
    密码：<input type="text" name="adminPwd">
    <input type="submit" value="登录">
</form>
</body>
</html>