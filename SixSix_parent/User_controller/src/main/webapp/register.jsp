<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title>注册</title>
</head>
<script src="/plug/js/jquery-1.9.1.min.js"></script>
<script src="/plug/js/jquery.validate.min.js"></script>
<script src="/plug/js/messages_zh.js"></script>
<body>
    <form action="insertUser" method="post">
        用 户 名: <input type="text" name="name" class="required"><br>
        密   码: <input type="text" name="pwd" id="pwd" class="required"><br>
        确认密码: <input type="text" name="tpwd" class="required"><br>
        验 证 码: <input type="text" name="vcode" >
        <img src="getcode" onclick="reload()"><br>
        昵    称: <input type="text" name="nickname" class="required"><br>
        <input type="submit" value="注册">
    </form>
</body>
    <script>
        $(function () {
            $("form").validate({
                rules:{
                    tpwd:{
                        equalTo:"#pwd",
                    },
                    name:{
                        remote:{
                            url:"findName",
                            dataType:"json",
                            type:"post",
                            data:{
                                name: function () {
                                    return $("[name='name']").val()
                                }
                            }
                        }
                    }
                },
                messages:{
                    tpwd:{
                        equalTo: "密码不一致",
                    },
                    name:{
                        remote:"用户已存在"
                    }
                }
            })
        })

        function reload() {
            let img = $("img");
            img.attr("src","getcode?"+Math.random())
        }

    </script>
</html>