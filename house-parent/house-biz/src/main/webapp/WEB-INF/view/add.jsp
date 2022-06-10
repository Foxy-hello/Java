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

  <h3>添加</h3>

<form action="/house/add" method="post">
    楼盘名称：<input type="text" name="name"><br>
    楼盘图片：<input type="file"  onchange="upFile(this)"><br>
    <span id="pic"></span>
    <br>
   城市地区：
    <select name="pid" onchange="getCity(this.value)">
        <option value="">请选择</option>
    </select>
    <select name="cid" onchange="getArea(this.value)" >
        <option value="">请选择</option>
    </select>
    <select name="aid">
        <option value="">请选择</option>
    </select>
    <br>
    商圈：<div id="shangquan">
    ${sids}



</div>

    建筑面积：<input type="text" name="area"><br>
    地址：<input type="text" name="address"><br>
    <button type="submit">保存</button>


</form>
</center>

<script>

    function upFile(obj){

        var formData = new  FormData();
        formData.append("file",obj.files[0]);

        $.ajax({
            type:"post",
            url:"/house/upFile",
            data:formData,
            processData:false,
            contentType:false,
            success:function (url){
                $("#pic").empty();
                $("#pic").append("<img src='"+url+"' height='80' width='120'>")//显示上传图片
                $("#pic").append("<input type='hidden' name='picurl' value='"+url+"'>")//封装上传地址
            }
        })

    }


    //文档就绪函数
    $(function (){
        //获取所有的省
        $.get("/house/getCity",{pid:1},function (list){
            for(var i in list){
             $("[name='pid']").append("<option value='"+list[i].id+"'>"+list[i].name+"</option>")
            }
        })
    })

    //根据省id获取所有的市
    function  getCity(pid){
        $.get("/house/getCity",{pid:pid},function (list){
            $("[name='cid']").html("<option value=''>请选择</option>");
            for(var i in list){
                $("[name='cid']").append("<option value='"+list[i].id+"'>"+list[i].name+"</option>")
            }
        })
    }


    //根据市id获取所有的区
    function  getArea(pid){
        $.get("/house/getCity",{pid:pid},function (list){
            $("[name='aid']").html("<option value=''>请选择</option>");
            for(var i in list){
                $("[name='aid']").append("<option value='"+list[i].id+"'>"+list[i].name+"</option>")
            }
        })

        //根据市id 获取 旗下的商圈
        $.get("/house/getShangQuan",{cid:pid},function (list){
            //清空上次查询的
            $("#shangquan").empty();
            for(var i in list){
                $("#shangquan").append("<input type='checkbox' name='sids' value='"+list[i].id+"'>"+list[i].name+"")
            }
        })
    }

</script>

</body>
</html>
