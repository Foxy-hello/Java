<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
 <!-- 最新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="themes/bootstrap/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="jsLibrary/jquery-1.9.1.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <!--<script src="themes/bootstrap/js/bootstrap.min.js"></script>-->

    <!-- TODO @lutz 主页面css文件 -->
    <link rel="stylesheet" href="themes/default/main.css">
</head>
<body style="background: #f8f8f8; height: auto;">
    <div class="containerLg">
        <div class="logo"></div>
        <div class="loginPanel">
            <div class="loginBox">
                <p class="userAlt">欢迎登录会议助理</p>
                <form class="form" action="${pageContext.request.contextPath }/login" method="post">
                    <div class="text-center">
                        <input type="text" class="input user" placeholder="用户名" name="userName"/>
                    </div>
                    <div class="text-center">
                        <input type="password" class="input pwd" placeholder="密码" name="password"/>
                    </div>
                    <!--  
                    <div class="clearfix" style="width: 230px; margin:5px auto;">
                        <label class="checkbox pull-left ml20">
                            <input type="checkbox"/> 记住密码
                        </label>
                        <div class="pull-right fgPwd">
                            <a href="#">忘记密码？</a>
                        </div>
                    </div>
                    -->
                    <div class="text-center">
                    	<input type="submit" class="btn LoginBtn" value="登录"/>
                        <!-- <a href="index.html" class="btn LoginBtn">登录</a> -->
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>