<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="plug/js/jquery-1.9.1.min.js"></script>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>宿舍号</td>
        <td>入住时间</td>
        <td>楼号</td>
        <td>居住学生</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.did}</td>
            <td>${s.dname}</td>
            <td>${s.time}</td>
            <td>${s.hname}</td>
            <td>${s.sname}</td>
            <td>
                <input type="button" value="调寝" onclick="toUpd()">
            </td>
        </tr>
    </c:forEach>
</table>
<a href="getExcel">生成Excel报表</a>
<a href="goEcharts">查看学生情况</a>
</body>
    <script>
        function toUpd() {
            location.assign("toUpd")
        }
    </script>
</html>