<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>

${admin}
<form action="newUp">
    <input type="text" name="adminName" value="${admin.adminName}">
    <input type="text" name="adminId" value="${admin.adminId}">
    <input type="text" name="adminPwd" value="${admin.adminPwd}">
    <input type="submit" value="修改">

</form>
</body>
</html>