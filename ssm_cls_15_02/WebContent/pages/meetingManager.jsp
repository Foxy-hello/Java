<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会议管理</title>
 <!-- 最新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/themes/bootstrap/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="${pageContext.request.contextPath }/jsLibrary/jquery-1.9.1.min.js"></script>

    <script src="${pageContext.request.contextPath }/jsLibrary/common.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <!--<script src="../themes/bootstrap/js/bootstrap.min.js"></script>-->

    <!-- TODO @lutz 主页面css文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/themes/default/main.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/jsLibrary/jquery-1.9.1.min.js"></script>
</head>
<body>
<div class="header">
    <!-- TODO @lutz 页眉 -->
    <div class="topBar"> </div>
    <div class="mainNav">
        <div class="container">
            <nav class="navbar navbar-default">
                <span class="logo"><img src="../themes/default/images/logo.png" alt="平台logo" onclick="location.href='index.html'"></span>
                <ul class="nav navbar-nav">
                    <li><a href="../index.html">首页</a></li>
                    <li class="active"><a href="会议管理.html">会议管理</a></li>
                    <li><a href="info_person.html">信息管理</a></li>
                    <li><a href="data_return.html">数据统计</a></li>
                    <li><a href="setup_personal.html">系统设置</a></li>
                </ul>
                <div class="textWelc">
                    <span>欢迎，张先生</span><a href="#" class="ml20">退出</a>
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
                                <li><a href="会议管理.html" class="active"><i class=""></i> 会议管理 </a></li>
                                <li><a href="会议配置.html"><i class=""></i> 会议配置</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="col-xs-10">
                    <div class="panel panel-default">
                        <!-- Default panel contents -->
                        <div class="panel-heading">会议列表</div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group col-xs-5">
                                    <label for="" class="control-label col-xs-4">会议编号</label>
                                    <div class="col-xs-8">
                                        <input type="text" class="form-control input-sm" id="" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label for="" class="control-label col-xs-4">会议名称</label>
                                    <div class="col-xs-8">
                                        <input type="text" class="form-control input-sm" id="" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label for="" class="control-label col-xs-4">会议状态</label>
                                    <div class="col-xs-8">
                                        <select id="" class="form-control input-sm">
                                            <option>未发布</option>
                                            <option>已结束</option>
                                            <option>进行中</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label for="" class="control-label col-xs-4">会议日期</label>
                                    <div class="col-xs-8 pr0">
                                        <input type="text" class="form-control w4 input-sm" id="" placeholder="">
                                        <span class="w1 text-center">至</span>
                                        <input type="text" class="form-control w4 input-sm" id="" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group col-xs-2 text-right">
                                    <button type="submit" class="btn btn-default btn-sm">查询</button>
                                </div>
                            </form>
                        </div>
                        <!-- Table -->
                        <table width="100%" border="0" cellspacing="0" cellpadding="0" class="table table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th width="60"><input type="checkbox" name="allCheckbox" id="allCheckbox"></th>
                                    <th width="60">序号</th>
                                    <th>会议编号</th>
                                    <th>会议名称</th>
                                    <th>开始日期</th>
                                    <th>结束日期</th>
                                    <th>会议城市</th>
                                    <th>会议状态</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox"></td>
                                    <td class="text-center">1</td>
                                    <td class="text-center">1301</td>
                                    <td><a href="会议基本信息.html">2014年互联网大会</a></td>
                                    <td>2014-11-30</td>
                                    <td>2014-12-07</td>
                                    <td class="text-center">北京</td>
                                    <td class="text-center">未发布</td>
                                </tr>
                                <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox"></td>
                                    <td class="text-center">2</td>
                                    <td class="text-center">1301</td>
                                    <td>2014年互联网大会</td>
                                    <td>2014-11-30</td>
                                    <td>2014-12-07</td>
                                    <td class="text-center">北京</td>
                                    <td class="text-center">未发布</td>
                                </tr>
                                <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox"></td>
                                    <td class="text-center">3</td>
                                    <td class="text-center">1301</td>
                                    <td>2014年互联网大会</td>
                                    <td>2014-11-30</td>
                                    <td>2014-12-07</td>
                                    <td class="text-center">北京</td>
                                    <td class="text-center">未发布</td>
                                </tr>
                                <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox"></td>
                                    <td class="text-center">4</td>
                                    <td class="text-center">1301</td>
                                    <td>2014年互联网大会</td>
                                    <td>2014-11-30</td>
                                    <td>2014-12-07</td>
                                    <td class="text-center">北京</td>
                                    <td class="text-center">未发布</td>
                                </tr>
                                <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox"></td>
                                    <td class="text-center">5</td>
                                    <td class="text-center">1301</td>
                                    <td>2014年互联网大会</td>
                                    <td>2014-11-30</td>
                                    <td>2014-12-07</td>
                                    <td class="text-center">北京</td>
                                    <td class="text-center">未发布</td>
                                </tr>
                            </tbody>
                        </table>
                        <div class="panel-footer clearfix">
                            <div class="btn-toolbar pull-left">
                                <div class="btn-group btn-group-sm">
                                    <a type="button" id="add" href="${pageContext.request.contextPath}/toMeetingAdd" class="btn btn-default"><span class="icon icon-plus-sign"></span> 新增</a>
                                    <a type="button" id="edit" href="#" class="btn btn-default"><span class="icon icon-edit"></span> 编辑</a>
                                    <button type="button" class="btn btn-default"><span class="icon icon-trash"></span> 删除</button>
                                </div>
                                <div class="btn-group btn-group-sm">
                                    <button type="button" class="btn btn-default">发布</button>
                                </div>
                                <div class="btn-group btn-group-sm">
                                    <button type="button" id="export" class="btn btn-default"><i class="icon icon-share-alt"></i> 导出</button>
                                </div>
                            </div>
                            <ul class="pagination pull-right">
                                <li><a href="#">上一页</a></li>
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li><a href="#">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <p class="text-center copyright">© 2014 版权所有 软通动力</p>
</div>
</body>
</html>