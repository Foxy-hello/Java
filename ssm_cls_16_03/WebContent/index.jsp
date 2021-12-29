<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<!-- 最新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="themes/bootstrap/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="jsLibrary/jquery-1.9.1.min.js"></script>

    <script src="jsLibrary/common.js"></script>
    <link rel="stylesheet" type="text/css" href="jsLibrary/zebra/css/default/zebra_dialog.css">
<script src="jsLibrary/zebra/javascript/zebra_dialog.src.js"></script>
<link rel="stylesheet" type="text/css" href="themes/default/common.css">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <!--<script src="themes/bootstrap/js/bootstrap.min.js"></script>-->

    <!-- TODO @lutz 主页面css文件 -->
    <link rel="stylesheet" href="themes/default/main.css">
</head>
<body>
<div class="header">
    <!-- TODO @lutz 页眉 -->
    <div class="topBar"> </div>
    <div class="mainNav">
        <div class="container">
            <nav class="navbar navbar-default">
                <span class="logo"><img src="themes/default/images/logo.png" alt="平台logo" onclick="location.href='index.html'"></span>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">首页</a></li>
                    <li><a href="${pageContext.request.contextPath }/queryMeeting">会议管理</a></li>
                    <li><a href="${pageContext.request.contextPath }/queryMeetingUser">信息管理</a></li>
                    <li><a href="pages/data_return.html">数据统计</a></li>
                    <li><a href="pages/setup_personal.jsp">系统设置</a></li>
                </ul>
                <div class="textWelc">
                    <span>欢迎，${sessionScope.user.userName }</span><a href="#" class="ml20">退出</a>
                </div>
            </nav>
        </div>
    </div>
</div>
<div class="wrap">
    <div class="container">
        <div class="container UCContainer">
            <div class="row">
                <div class="col-xs-3 userInfo">
                    <div class="media">
                        <span class="media-left ph">
                           <!-- <img src="themes/default/images/ph.png" alt="用户头像"> --> 
                           <img src="${pageContext.request.contextPath }/upload/${userDetail.photo}" alt="用户头像" width="100px" height="100px">
                        </span>
                        <div class="media-body">
                            <h4 class="media-heading pl10">${userDetail.nikeName }</h4>
                            <ul>
                                <li><a href="index_personal.jsp" class="btn btn-link btn-sm">查看个人资料</a></li>
                            </ul>
                        </div>
                    </div>
                    <dl class="clearfix mt20">
                        <dt class="pull-left">最后一次登录：</dt>
                        <dd class="pull-right">${lastTime }</dd>
                    </dl>
                    <hr>
                    <dl class="clearfix mt20 userMessage">
                        <dt class="">所有会议：</dt>
                        <dd class="clearfix"><i class="glyphicon glyphicon-adjust"></i> 未发布会议 <span class="pull-right"><a href="index_pulic.html" class="">10</a>个</span></dd>
                        <dd class="clearfix"><i class="glyphicon glyphicon-adjust"></i> 已发布会议 <span class="pull-right"><a href="#" class="">10</a>个</span></dd>
                        <dd class="clearfix"><i class="glyphicon glyphicon-adjust"></i> 已结束会议 <span class="pull-right"><a href="#" class="">10</a>个</span></dd>
                    </dl>
                </div>
                <div id="rrrr" class="hidden">
<form class="row" role="form">
</form></div>
                <div class="col-xs-9 UCContent">
                    <!--欢迎图-->
                    <img src="themes/default/images/banner.jpg">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>