<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="plug/js/jquery-1.9.1.min.js"></script>
<script src="plug/js/jquery.validate.min.js"></script>
<script src="plug/js/messages_zh.js"></script>
<script src="plug/js/countdown.js"></script>
<body>
    <form>
        本人手机号: <input type="text" name="phone" id="phone"><br>
        短信验证码: <input type="text" name="pcode">
        <input type="button" value="获取验证码" onclick="send(this)"><br>
        图形验证码: <input type="text" name="vcode">
        <img src="getCode"><br>
        <input type="button" value="登录">
    </form>
</body>
    <script>

        function send(obj) {
            countdown(obj)
            $.ajax({
                url:"sendPhone",
                data:{"phone":$("#phone").val()},
                dataType:"post",
                success:function (i) {
                    console.log(i)
                }
            })
        }

    </script>
</html>