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
        <td>编号：</td>
        <td>姓名：</td>
        <td>性别：</td>
        <td>年龄：</td>
        <td>邮箱：</td>
        <td>电话：</td>
        <td>地址：</td>
        <td>操作：</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.age}</td>
            <td>${s.mail}</td>
            <td>${s.phone}</td>
            <td>${s.address}</td>
            <td><a href="FindByID?id=${s.id}">详情</a>
                <a href="add.jsp">添加</a>
                <a href="del?id=${s.id}">删除</a>
                <a href="">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>