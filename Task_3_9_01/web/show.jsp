<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<form action="fuzzy">
    学生姓名:<input type="text" name="name" value="${name}">
    开始时间:<input type="text" name="stats" value="${stats}" >
    结束时间:<input type="text" name="end" value="${end}">
    班   级:<input type="text" name="cid">
    <input type="submit" value="查询">
</form>
<br>
<a href="add.jsp" style="color: red">添加学生信息</a>
<br>

<table>
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>学生性别</td>
        <td>学生年龄</td>
        <td>学生爱好</td>
        <td>入学时间</td>
        <td>班级编号</td>
        <td>班级名称</td>
        <td>操   作</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td>${s.sid}</td>
        <td>${s.sName}</td>
        <td>${s.sex}</td>
        <td>${s.age}</td>
        <td>${s.happy}</td>
        <td>${s.time}</td>
        <td>${s.cid}</td>
        <td>${s.cName}</td>
        <td>
            <a href="byId?sid=${s.sid}">修改</a>
            <a href="del?sid=${s.sid}">删除</a>
        </td>
    </tr>
</c:forEach>

</table>

</body>
</html>