<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="../../css/css.css">
    <title></title>
</head>
<script src="/plug/js/jquery-1.9.1.min.js"></script>
<body>
<form>
    用 户 名: <input type="text" name="name" ><br>
    密   码: <input type="text" name="pwd"><br>
    验 证 码: <input type="text" name="vcode">
    <img src="getcode" onclick="reload()"><br>
    <input type="button" id="but" value="登录">
</form>
    <script>
        $("#but").click(function () {
            $.ajax({
                url:"login",
                type:"post",
                data:$("form").serialize(),
                success:function (i) {
                    if (i > 0){
                        alert("成功登录!")
                        location.assign("../../yes.jsp")
                    }
                }
            })
        })

        function reload() {
            let img = $("img");
            img.attr("src","getcode?"+math.random())
        }

    </script>
</body>
</html>