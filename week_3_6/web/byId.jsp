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
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>邮箱</td>
        <td>电话</td>
        <td>地址</td>
        <td>确认</td>
    </tr>
    <tr>
            <td>${byId.id}</td>
            <td>${byId.name}</td>
            <td>${byId.sex}</td>
            <td>${byId.age}</td>
            <td>${byId.mail}</td>
            <td>${byId.phone}</td>
            <td>${byId.address}</td>
            <td><a href="FinAll">Yes</a></td>
    </tr>

</table>
</body>
</html>