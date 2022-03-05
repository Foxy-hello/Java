<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<table>
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>
    </tr>

    <tr>
        <td>${admin.adminId}</td>
        <td>${admin.adminName}</td>
        <td>${admin.adminPwd}</td>
    </tr>

</table>
</body>
</html>