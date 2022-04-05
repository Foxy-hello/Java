<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
    <form action="Fuzzy">
        菜名:<input type="text" name="name" value="${name}">
        发布时间<input type="text" name="start" value="${start}">->
        <input type="text" name="end" value="${end}">
        <input type="submit" value="查找">
    </form>
<table>
    <tr>
        <td>请选择</td>
        <td>菜品编号</td>
        <td>菜品名称</td>
        <td>菜品价格</td>
        <td>上架时间</td>
        <td>菜品简介</td>
        <td>菜品类型</td>
        <td>操作</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td><input type="checkbox" value="${s.fid}" class="bto"></td>
        <td>${s.fid}</td>
        <td>${s.fName}</td>
        <td>${s.price}</td>
        <td>${s.time}</td>
        <td>${s.content}</td>
        <td>${s.tName}</td>
        <td>
            <input type="button" value="修改">
            <input type="button" value="删除">
        </td>
    </tr>
</c:forEach>
</table>
    <input type="button" value="全选" id="chooseAll">
    <input type="button" value="全不选" id="chooseNone">
    <input type="button" value="反选" id="resChoose">
    <input type="button" value="添加" id="addFood">
    <input type="button" value="批量删除" id="delAll">
</body>
    <script>
        //全选
        $("#chooseAll").click(function () {
            $(".bto").attr("checked",true);
        })
        //全不选
        $("#chooseNone").click(function () {
            $(".bto").attr("checked",false);
        })
        //反选
        $("#resChoose").click(function () {
            $(".bto").each(function () {
                $(this).attr("checked",!$(this).attr("checked"));
            })
        })
        //批量删除
        $("#delAll").click(function () {
            var str = "";
           $(".bto:checked").each(function () {
               var val = $(this).val();
               str += ","+val;
           })
            var s = str.substring(1);
           if (s.length <= 0){
               alert("请选中要删除的选项")
           }else{
               if (confirm("确认删除编号为"+s+"的数据吗?")){
                   $.ajax({
                       url:"delAll",
                       type:"post",
                       data:{"id":s},
                       success:function (num) {
                           if (num > 0){
                               alert("删除了"+num+"条数据")
                               location.reload();
                           }
                       }
                   })
               }
           }
        })
        //添加
        $("#addFood").click(function () {
            location="add.jsp";
        })
    </script>
</html>