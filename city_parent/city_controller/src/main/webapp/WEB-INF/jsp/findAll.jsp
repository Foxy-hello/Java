<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title>详情</title>
</head>
<script src="plug/js/jquery-1.9.1.min.js"></script>
<body>
    <form action="findAll">
        <input type="hidden" name="pageNum" id="pageNum">
    </form>
<table>
    <tr>
        <td>编号</td>
        <td>省份</td>
        <td>城市</td>
        <td>楼盘数量</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td>${s.pid}</td>
        <td>${s.bname}</td>
        <td>${s.cname}</td>
        <td>${s.num}</td>
    </tr>
</c:forEach>
    <tr>
        <td colspan="4">
            <input type="button" value="首页" onclick="go(1)">
            <input type="button" value="上页" onclick="go(${pageInfo.isFirstPage?1:pageInfo.prePage})">
            <input type="button" value="下页" onclick="go(${pageInfo.isLastPage?pageInfo.pages:pageInfo.nextPage})">
            <input type="button" value="尾页" onclick="go(${pageInfo.pages})">&emsp;
            <input type="button" value="生成Excel报表" id="getExcel">
            <input type="button" value="查看具体楼盘数量" id="lockNum">
        </td>
    </tr>
</table>
</body>
<script>

    function go(pageNum) {
        $("#pageNum").val(pageNum);
        $("form").submit();
    }

    $("#getExcel").click(function () {
        location.assign("getExcel")
    })

    $("#lockNum").click(function () {
        location.assign("lockNum");
    })

</script>
</html>