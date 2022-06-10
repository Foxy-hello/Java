<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
</head>
<body>
<center>

<form method="post" action="/house/list">
    <input type="text" name="name" placeholder="楼盘名称或地址" value="${house.name}">
    <select name="pid" onchange="getCity(this.value)">
        <option value="">省</option>
    </select>
    <select name="cid">
        <option value="">市</option>
    </select>
    <button>查询</button>
</form>
    <a href="/house/toAdd">添加</a>
    <a href="/house/toReport" target="_blank">查看报表</a>


<table class="table">

    <tr>
        <td>序号</td>
        <td>名称</td>
        <td>图片</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${pg.list}" var="house">
        <tr>
            <td>${house.id}</td>
            <td>${house.name}</td>
            <td><img src="${house.picurl}" height="80" width="120"></td>
            <td>${house.address}</td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="/static/common/pages.jsp"></jsp:include>

</center>
<script>


    $(function () {
        $.get("/house/getCity", {pid: 1}, function (list) {
            for (var i in list) {
                $("[name='pid']").append("<option value='" + list[i].id + "'>" + list[i].name + "</option>")
            }
            //省下拉框选中
            var pid='${house.pid}'
            $("[name='pid']").val(pid);//
            if(pid!=null){
                getCity(pid);
            }
        })
    })


    function getCity(pid) {
        $.get("/house/getCity", {pid: pid}, function (list) {
            $("[name='cid']").html("<option value=''>市</option>")
            for (var i in list) {
                $("[name='cid']").append("<option value='" + list[i].id + "'>" + list[i].name + "</option>")
            }
            //市下拉框选中
            $("[name='cid']").val('${house.cid}')
        })
    }

</script>
</body>
</html>
