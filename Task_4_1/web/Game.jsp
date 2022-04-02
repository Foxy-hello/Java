<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
<input type="button" value="查看用户信息" id="bto"><br>
<table>
    <tr>
        <td>名次</td>
        <td>用户名</td>
        <td>积分</td>
        <td>级别</td>
        <td>地区</td>
    </tr>
</table>
</body>
<script>
    $("#bto").click(function () {
        $("table").load("FindGame");
    })
</script>
</html>