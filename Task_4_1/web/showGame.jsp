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
        <td>名次</td>
        <td>用户名</td>
        <td>积分</td>
        <td>级别</td>
        <td>地区</td>
    </tr>
<c:forEach items="${game}" var="g" varStatus="vs">
    <tr>
        <td>${vs.count}</td>
        <td>${g.name}</td>
        <td>${g.score}</td>
        <td>${g.level}</td>
        <td>${g.address}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>