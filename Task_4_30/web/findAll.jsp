<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
<form action="findAll">
    <input type="hidden" name="pageNum" id="pageNum">
</form>
<input type="button" value="办理入学" id="insert">
<table>
    <tr>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>课程数量</td>
        <td>课程名称</td>
        <td>操作</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td>${s.sId}</td>
        <td>${s.sName}</td>
        <td>${s.sSex}</td>
        <td>${s.sBirth}</td>
        <td>${s.count}</td>
        <td>${s.courseName}</td>
        <td>
            <input type="button" value="毕业" onclick="del(${s.sId})">
            <input type="button" value="编辑" onclick="update(${s.sId})">
        </td>
    </tr>
</c:forEach>
</table>
<input type="button" value="首页" page="1">
<c:if test="${page.getPageNum()!=1}">
    <input type="button" value="上一页" page="${page.getPageNum()-1}">
</c:if>
<c:if test="${page.getPageNum()!=page.getPages()}">
<input type="button" value="下一页" page="${page.getPageNum()+1}">
</c:if>
    <input type="button" value="尾页" page="${page.getPages()}">
</body>
<script>
    $("input[page]").click(function () {
        var pageNum = $(this).attr("page");
        $("#pageNum").val(pageNum);
        $("form").submit();
    })
    function del(sId) {
        if (confirm("确认把编号为"+sId+"的学生调整毕业吗?")){
            $.ajax({
                url:"del",
                data:{"sId":sId},
                success:function (i) {
                    alert("已毕业");
                    location.reload();
                }
            })
        }
    }
    $("#insert").click(function () {
        location.assign("insert.jsp")
    })

    function update(sId) {
        location="update.jsp?sId="+sId;
    }

</script>
</html>