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
        <td>更多操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
    <tr>
        <td>${s.adminId}</td>
        <td>${s.adminName}</td>
        <td>${s.adminPwd}</td>
        <td><a href="FinById?adminId=${s.adminId}">详情</a>
            <a href="DelServIet?adminId=${s.adminId}">删除</a>
            <a href="Update?adminId=${s.adminId}">修改</a>
        </td>
    </tr>
    </c:forEach>
    <a href="add.jsp">添加信息</a>
</table>
</body>
</html>