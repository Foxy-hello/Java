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
<form id="fm">
    学生姓名:<input type="text" name="sName"><br>
    学生性别:<input type="radio" name="sSex" value="男">男
            <input type="radio" name="sSex" value="女">女 <br>
    学生生日: <input type="date" name="sBirth"><br>
    学生成绩: <input type="text" name="sScore"><br>
    课程名称:<div id="courseName">

            </div>
    <input type="button" value="入学" id="insert">
</form>
</body>
    <script>
        $.ajax({
            url:"findCourseName",
            success:function (arr) {
                console.log(arr)
                for (let i = 0; i < arr.length; i++) {
                    /*var op = $("<input type='checkbox' value='"+arr[i].cId+"' name='cIds'>"+arr[i].cName);*/
                    $("#courseName").append("<input type='checkbox' value='"+arr[i].cId+"' name='cIds'>"+arr[i].cName);
                }
            }
        })
        $("#insert").click(function () {
            $.ajax({
                url: "insert",
                type:"post",
                data:$("#fm").serialize(),
                success: function (i) {
                    if (i > 0){
                        alert("添加成功!")
                        location="findAll";
                    }
                }
            })
        })
    </script>
</html>