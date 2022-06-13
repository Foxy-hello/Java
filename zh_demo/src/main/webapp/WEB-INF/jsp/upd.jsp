<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="/plug/js/jquery-1.9.1.min.js"></script>
<body>
    <form>
        <select id="one" name="sid" >
            <option value="">---请选择学生---</option>
        </select>
        <select id="two" name="hid" >
            <option value="">---请选择楼号---</option>
        </select>
        <select id="there" name="hid" >
            <option value="">---请选择宿舍---</option>
        </select>
        <input type="button" value="调寝" id="upd">
    </form>
</body>
    <script>
        $(function () {
            $.ajax({
                url: "getStu",
                type: "post",
                dataType: "json",
                success: function (stu) {
                    console.log(stu)
                    for (let i = 0; i < stu.length; i++) {
                        let op = $("<option value=" + stu[i].sid + ">" + stu[i].sname + "</option>");
                        $("#one").append(op)
                    }
                }
            })

            $.ajax({
                url: "getLou",
                type: "post",
                dataType: "json",
                success: function (lou) {
                    console.log(lou)
                    for (let i = 0; i < lou.length; i++) {
                        let op = $("<option value=" + lou[i].hid + ">" + lou[i].hname + "</option>");
                        $("#two").append(op)
                    }
                }
            })

            $.ajax({
                url: "getDormitory",
                type: "post",
                dataType: "json",
                success: function (su) {
                    console.log(su)
                    for (let i = 0; i < su.length; i++) {
                        let op = $("<option value=" + su[i].did + ">" + su[i].dname + "</option>");
                        $("#there").append(op)
                    }
                }
            })
        })

        $("#upd").click(function () {
            $.ajax({
                url:"upd",
                data:$("form").serialize(),
                type:"post",
                dataType:"json",
                success:function (i) {
                    console.log(i)
                    if (i > 0){
                        alert("ok")
                        location.assign("findAll")
                    }
                }
            })
        })

    </script>
</html>