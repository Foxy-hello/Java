<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 40851
  Date: 2021/5/21
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/css1.css">
    <script src="js/jquery-1.4.4.min.js"></script>
</head>
<script>
    function fenye(cpage) {
        var mohu = $("[name=mohu]").val();
        location.href="list?cpage="+cpage+"&mohu="+mohu;
    }
</script>
<body>
    <marquee onmouseover="this.stop()" onmouseout="this.start()">欢迎${sessionScope.user1.name}</marquee>
    <form action="list" method="post">

        根据姓名查询：<input type="text" name="mohu" value="${map.get('mohu')}">
        <input type="submit" value="查询">
    </form>
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>操作</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="11">
                <input type="button" value="首页" onclick="fenye(1)">
                <input type="button" value="上一页" onclick="fenye(${pageUtil.prevPage})">
                <input type="button" value="下一页" onclick="fenye(${pageUtil.nextPage})">
                <input type="button" value="尾页" onclick="fenye(${pageUtil.lastPage})">
                ${pageUtil.currentPage}/${pageUtil.lastPage}
                共${pageUtil.count}条记录
            </td>
        </tr>
    </table>
</body>
</html>
