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
    <h2>欢迎登录</h2>
    <form>
        <input type="text" placeholder="输入手机号" name="phone"><br>
        <input type="text" name="code" placeholder="输入验证码">
        <button type="button" onclick="getCode()">获取验证码</button>
        <br>
        <button type="button" onclick="login()">登录</button>
        <span id="msg" class="text-danger"></span>
    </form>
</center>

<script>
    function getCode(){
        var phone =$("[name='phone']").val();
        if(phone==''){
            alert("请输入手机号再获取")
            return ;
        }
     $.get("http://127.0.0.1:81/sendCode",{phone:phone},function (obj){
         alert(obj.data)
     })
    }


    function login() {
        //使用ajax 请求权限认证中心
        $.post("http://127.0.0.1:81/auth/login", $("form").serialize(), function (result) {
            if (result.code == 200) {//登录成功--存入cookie
                document.cookie ="login_token="+ result.data;//写入cookie
                location.href="/house/list";
            } else {
               alert(result.name)
               // $("#msg").text(result.name)
            }
        })
    }
</script>
</body>
</html>
