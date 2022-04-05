<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
    <form id="fm">
        菜品名称:<input type="text" name="name" id="foodName"><br>
        菜品价格:<input type="text" name="price" id="foodPrice"><br>
        上架时间:<input type="text" name="time" id="foodTime"><br>
        菜品描述:<textarea name="content" id="foodCon"></textarea><br>
        菜品类型:<select name="tid" id="foodTid">
            <option value="">请选择</option>
        </select><br>
        <input type="button" value="添加" id="add">
    </form>
</body>
<script>
    $.ajax({
        url:"byFoodType",
        type:"post",
        dataType:"json",
        success:function (a) {
            console.log(a);
            for (let i = 0; i < a.length; i++) {
               var s = "<option value='"+a[i].tid+"'>"+a[i].tName+"</option>"
                $("#foodTid").append(s);
            }
        }
    })
    //价格
    $("#foodPrice").blur(function () {
        var rule = /^\d+(\.\d+)?$/;
        var val = $("#foodPrice").val();
        if (!rule.test(val)){
            alert("请输入小数或整数");
            $("#add").attr("disabled",true);
        }else{
            $("#add").attr("disabled",false);
        }
    })
    //时间
    var date = new Date();
    var y = date.getFullYear();
    var m = date.getMonth();
    var d = date.getDate();

    if (m<10){
        m=("0"+Number((m+1)));
    }if (d < 10){
        d=("0"+d)
    }
    var s1 = y+"-"+m+"-"+d;
    $("#foodTime").val(s1);
    //判断时间
    $("#foodTime").blur(function () {
        //文本框的时间
        var time = $("#foodTime").val();
        console.log(time)
        //当前时间
        var d = new Date();
        if (new Date(time) > d){
            alert("不能大于现在时间");
            $("#add").attr("disabled",true);
        }else{
            $("#add").attr("disabled",false);
        }
    })
    //添加
    $("#add").click(function () {
        $.ajax({
            url: "add",
            type: "post",
            data:$("#fm").serialize(),
            dataType: "json",
            success:function (i) {
                if (i > 0){
                    alert("添加成功");
                    location = "FindAll";
                }
            }
        })
    })
</script>
</html>