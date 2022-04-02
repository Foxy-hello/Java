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
    姓   名:<input type="text" name="name"><br>
    性   别:<input type="text" name="gender"><br>
    爱   好:<input type="checkbox" value="抽烟" name="hobby">抽烟
            <input type="checkbox" value="喝酒" name="hobby">喝酒
            <input type="checkbox" value="烫头" name="hobby">烫头<br>
    入职时间:<input type="date" name="time"><br>
    科室: <select name="depName">
                <option value="">请选择</option>
                <option value="内科">内科</option>
                <option value="外科">外科</option>
                <option value="妇科">妇科</option>
          </select><br>
    <input type="button" value="添加" id="addDoc">
</form>
</body>
    <script>
        $("#addDoc").click(function () {
            $.ajax({
                url:"add",
                type:"post",
                data:$("#fm").serialize(),
                success:function (num) {
                    if (num > 0){
                        alert("添加成功");
                        location = "FindDoctor";
                    }
                }
            })
        })
    </script>
</html>