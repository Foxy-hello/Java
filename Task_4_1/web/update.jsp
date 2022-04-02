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
        编   号:<input type="hidden" name="id" id="one"><br>
        姓   名:<input type="text" name="name" id="two"><br>
        性   别:<input type="text" name="gender" id="there"><br>
        爱   好:<input type="checkbox" value="抽烟" name="hobby" class="four">抽烟
        <input type="checkbox" value="喝酒" name="hobby" class="four">喝酒
        <input type="checkbox" value="烫头" name="hobby" class="four">烫头<br>
        入职时间:<input type="text" name="time" id="five"><br>
        科室: <select name="depName" id="six">
        <option value="">请选择</option>
        <option value="内科">内科</option>
        <option value="外科">外科</option>
        <option value="妇科">妇科</option>
    </select><br>
        <input type="button" value="修改" id="upDoc">
    </form>
</body>
    <script>
        //页面加载时查找数据
     var id = ${param.id};
     $.ajax({
         url:"DocById",
         type:"post",
         dataType:"json",
         data:{"id":id},
         success:function (s) {
             console.log(s);
             $("#one").val(s.id);
             $("#two").val(s.name);
             $("#there").val(s.gender);
             $("#five").val(s.brith);
             var hobby = s.hobby;
             var arr = hobby.split(",");
             //$("[value='"+arr[i]+"']").attr("checked",true);
             for (let i = 0; i < arr.length; i++) {
                 $("[value='"+arr[i]+"']").attr("checked",true);
             }
         }
     })

     //修改方法
     $("#upDoc").click(function () {
         $.ajax({
             url: "update",
             type: "post",
             dataType: "json",
             data: $("#fm").serialize(),
             success:function (i) {
                 if (i > 0){
                     alert("修改成功!");
                     location="FindDoctor";
                 }
             }
         })
     })
    </script>
</html>