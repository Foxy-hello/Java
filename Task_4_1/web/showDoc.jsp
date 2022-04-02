<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
<table>
    <tr>
        <td>请选择</td>
        <td>医生编号</td>
        <td>医生姓名</td>
        <td>医生性别</td>
        <td>医生爱好</td>
        <td>入职时间</td>
        <td>所在科室</td>
        <td>操作</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td><input type="checkbox" class="chb" value="${s.id}"></td>
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.gender}</td>
        <td>${s.hobby}</td>
        <td>${s.brith}</td>
        <td>${s.depName}</td>
        <td>
            <input type="button" value="修改" onclick="update(${s.id})">
            <input type="button" value="删除">
        </td>
    </tr>
</c:forEach>
</table>
    <input type="button" value="添加" id="add">
    <input type="button" value="全选" id="chooseAll">
    <input type="button" value="全不选" id="noneChoose">
    <input type="button" value="反选" id="resChoose">
    <input type="button" value="批量删除" id="delAll">
</body>
    <script>
        //全选
        $("#chooseAll").click(function () {
            $(".chb").attr("checked",true);
        })
        //全不选
        $("#noneChoose").click(function () {
            $(".chb").attr("checked",false);
        })
        //反选
        $("#resChoose").click(function () {
            $(".chb").each(function () {
                $(this).attr("checked",!$(this).attr("checked"));
            })
        })
        //批量删除
        $("#delAll").click(function () {
            var str = "";
            $(".chb:checked").each(function () {
                var eid = $(this).val();
                str += ","+eid;
            })
            var eid = str.substring(1);
            if (confirm("确认删除编号"+eid+"的数据吗?")){
                $.ajax({
                    url:"delAll",
                    type:"post",
                    data:{"eid":eid},
                    success:function (num){
                        if (num > 0){
                            alert("成功删除了"+num+"条数据");
                            location.reload();
                        }
                    }
                })
            }
        })
        //添加数据
        $("#add").click(function () {
            location="add.jsp";
        })
        //修改数据
        function update(id) {
            if (confirm("确认修改编号为"+id+"的医生吗?")){
                location="update.jsp?id="+id;
            }
        }



    </script>
</html>