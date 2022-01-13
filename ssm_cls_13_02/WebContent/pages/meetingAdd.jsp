<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会议管理新增</title>
<!-- 最新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/themes/bootstrap/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="${pageContext.request.contextPath }/jsLibrary/jquery-1.9.1.min.js"></script>

    <script src="${pageContext.request.contextPath }/jsLibrary/common.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <!--<script src="../themes/bootstrap/js/bootstrap.min.js"></script>-->

    <!-- TODO @lutz 主页面css文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/themes/default/main.css">
</head>
<body>
<div class="header">
    <!-- TODO @lutz 页眉 -->
    <div class="topBar"> </div>
    <div class="mainNav">
        <div class="container">
            <nav class="navbar navbar-default">
                <span class="logo"><img src="${pageContext.request.contextPath }/themes/default/images/logo.png" alt="平台logo" onclick="location.href='index.html'"></span>
                <ul class="nav navbar-nav">
                    <li><a href="${pageContext.request.contextPath }/index.jsp">首页</a></li>
                    <li class="active"><a href="${pageContext.request.contextPath }/queryMeetingAll">会议管理</a></li>
                    <li><a href="info_person.html">信息管理</a></li>
                    <li><a href="data_return.html">数据统计</a></li>
                    <li><a href="setup_personal.html">系统设置</a></li>
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
                <div class="col-xs-2 UCMenu">
                    <ul id="sideNav" class="nav nav-pills nav-stacked show-arrows">
                        <li class="hasSub"><a href="#" class="expand"><i class="glyphicon glyphicon-th-list"></i> 会议管理 </a>
                            <ul class="nav sub show" style="display: block;">
                                 <li><a href="${pageContext.request.contextPath }/queryMeetingAll" class="active"><i class=""></i> 会议管理 </a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="col-xs-10">
                    <div class="panel panel-default">
                        <!-- Default panel contents -->
                        <div class="panel-heading">新增会议</div>
                        <div class="panel-body">
                            <div class="col-xs-10 addForm">
                                <form class="form-horizontal mb20" action="${pageContext.request.contextPath }/addMeeting" method="post">
                                    <div class="form-group">
                                        <label class="col-xs-2 control-label" for=""><s>*</s>会议名称</label>
                                        <div class="col-xs-8">
                                            <input type="text" class="form-control" placeholder="会议名称" name="meetingName">
                                            <p class="help-inline text-muted">最多只能输入180个字符</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-2 control-label" for=""><s>*</s>会议日期</label>
                                        <div class="col-xs-8">
                                            <input type="text" class="form-control w3" name="startTime" placeholder="开始日期">
                                            <span class="w1 text-center">至</span>
                                            <input type="text" class="form-control w3" name="endTime" placeholder="结束日期">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-2 control-label" for=""><s>*</s>会议地址</label>
                                        <div class="col-xs-8 form-inline">
                                          <select class="form-control" id="province" name="provinceId">
                                                <option>请选择省份</option>
                                                <option value="2">山东</option>
                                            </select>
                                          <select class="form-control" id="city" name="cityId">
                                                <option>请选择市</option>
                                                <option value="6">青岛</option>
                                            </select>
                                           <select class="form-control" id="county" name="countyId">
                                                <option>请选择地区</option>
                                                <option value="14">黄岛</option>
                                            </select>
                                        </div>
                                        <div class="col-xs-8 col-xs-offset-2 mt10">
                                            <input type="text" class="form-control" name="address" placeholder="地址">
                                            <p class="help-inline text-muted">省份、城市和会议地点为必填项</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-2 control-label" for=""><s>*</s>会议服务联系人</label>
                                        <div class="col-xs-8">
                                            <input type="text" class="form-control" name="contact" placeholder="会议服务联系人">
                                            <p class="help-inline text-muted">请输入联系人的姓名</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-2 control-label" for="">固定电话</label>
                                        <div class="col-xs-8">
                                            <input type="text" class="form-control" name="telephone" placeholder="区号-固定电话">        
                                            <p class="help-inline text-muted">区号最多4位数，号码最多8位数</p>
                                        </div>
                                    </div>    
                                     <div class="form-group">   
                                         <label class="col-xs-2 control-label" for=""><s>*</s>移动电话</label>
                                        <div class="col-xs-8">
                                            <input type="text" class="form-control" name="mobilephone" placeholder="移动电话">
                                            <p class="help-inline text-muted">手机号最多11位</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                      <label class="col-xs-2 control-label" for="">会议介绍</label>
                                        <div class="col-xs-8">
                                            <textarea class="form-control" rows="5" name="introduce"></textarea>
                                            <p class="help-inline text-muted">长度不低于2个字符，不多于100个字符</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-xs-offset-2 col-xs-8">
                                            <button type="submit" class="btn btn-warning">新增会议</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>