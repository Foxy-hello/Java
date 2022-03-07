<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
${msg}
<form action="loginServIet">
    账号名：<input type="text" name="adminName"><br>
    密  码：<input type="text" name="adminPwd"><br>
    <input type="submit" value="登录"> <input type="reset" value="取消">
</form>
</body>
</html>