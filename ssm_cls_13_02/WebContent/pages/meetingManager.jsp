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
    <script type="text/javascript">
	    /*修改*/
		function update(){
			$.each($('input:checkbox:checked'),function(){
				var count=$('input[type=checkbox]:checked').length;
				if(count>1){
					alert("只能选择一项");
				}else{
					var id=$(this).val();
					window.location.href="${pageContext.request.contextPath }/queryMettingById?id="+id;
				}
            });
		}
	    
	    /*删除*/
	    function del() {
	    	$.each($('input:checkbox:checked'),function(){
				var count=$('input[type=checkbox]:checked').length;
				if(count>1){
					alert("只能选择一项");
				}else{
					var id=$(this).val();
					window.location.href="${pageContext.request.contextPath }/deleteMetting?id="+id;
				}
            });
		}
    </script>
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
                    <li><a href="${pageContext.request.contextPath }/queryMeetingUser">信息管理</a></li>
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
                        <div class="panel-heading">会议列表</div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/queryMeetingAll" method="post">
                                <div class="form-group col-xs-5">
                                    <label class="control-label col-xs-4">会议编号</label>
                                    <div class="col-xs-8">
                                        <input type="text" class="form-control input-sm" name="id" value="${metting.id }">
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label class="control-label col-xs-4">会议名称</label>
                                    <div class="col-xs-8">
                                        <input type="text" class="form-control input-sm" name="meetingName" value="${metting.meetingName }">
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label class="control-label col-xs-4">会议状态</label>
                                    <div class="col-xs-8">
                                        <select class="form-control input-sm" name="state">
                                            <c:if test="${metting.state==0 }">
                                            	<option value="0" selected="selected">未发布</option>
	                                            <option value="2">已结束</option>
	                                            <option value="1">进行中</option>  
                                            </c:if>
                                            <c:if test="${metting.state==2 }">
                                            	<option value="0">未发布</option>
	                                            <option value="2" selected="selected">已结束</option>
	                                            <option value="1">进行中</option>  
                                            </c:if>
                                            <c:if test="${metting.state==1 }">
                                            	<option value="0">未发布</option>
	                                            <option value="2">已结束</option>
	                                            <option value="1" selected="selected">进行中</option>  
                                            </c:if>                     
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group col-xs-5">
                                    <label class="control-label col-xs-4">会议日期</label>
                                    <div class="col-xs-8 pr0">
                                        <input type="text" class="form-control w4 input-sm" name="startTime" value="${metting.startTime }">
                                        <span class="w1 text-center">至</span>
                                        <input type="text" class="form-control w4 input-sm" name="endTime" value="${metting.endTime }">
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
                                    <th>会议联系人</th>
                                    <th>会议状态</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${meetings.list }" var="meet" varStatus="status">
                            	 <tr>
                                    <td class="text-center"><input type="checkbox" name="checkbox" id="checkbox" value="${meet.id }"></td>
                                    <td class="text-center">${status.index }</td>
                                    <td class="text-center">${meet.id }</td>
                                    <td><a href="${pageContext.request.contextPath }/queryMettingById?id=${meet.id}">${meet.meetingName }</a></td>
                                    <td>${meet.startTime }</td>
                                    <td>${meet.endTime }</td>
                                    <td class="text-center">${meet.contact }</td>
                                    <td class="text-center">
                                      <c:if test="${meet.state==0 }">
                                      	  未发布
                                      </c:if>
                                      <c:if test="${meet.state==1 }">
                                      	  进行中
                                      </c:if>
                                      <c:if test="${meet.state==2 }">
                                      	  已结束
                                      </c:if>
                                    </td>
                                </tr>
                            </c:forEach>           
                            </tbody>
                        </table>
                        <div class="panel-footer clearfix">
                            <div class="btn-toolbar pull-left">
                                <div class="btn-group btn-group-sm">
                                    <a type="button" id="add" href="${pageContext.request.contextPath }/pages/meetingAdd.jsp" class="btn btn-default"><span class="icon icon-plus-sign"></span>新增</a>
                                    <a type="button" id="edit" onclick="update()" class="btn btn-default"><span class="icon icon-edit"></span> 编辑</a>
                                    <button type="button" class="btn btn-default" onclick="del()"><span class="icon icon-trash"></span> 删除</button>
                                </div>
                            </div>
                            <ul class="pagination pull-right">
                                <li><a href="${pageContext.request.contextPath }/queryMeetingAll?page=${meetings.prePage }&rows=${meetings.pageSize}&id=${metting.id}&meetingName=${metting.meetingName}&state=${metting.state }&startTime=${metting.startTime }&endTime=${metting.endTime }">上一页</a></li>
                                <li class="active"><a href="${pageContext.request.contextPath }/queryMeetingAll?page=1&rows=${meetings.pageSize}&id=${metting.id}&meetingName=${metting.meetingName}&state=${metting.state }&startTime=${metting.startTime }&endTime=${metting.endTime }">1</a></li>
                                <li><a href="${pageContext.request.contextPath }/queryMeetingAll?page=2&rows=${meetings.pageSize}&id=${metting.id}&meetingName=${metting.meetingName}&state=${metting.state }&startTime=${metting.startTime }&endTime=${metting.endTime }">2</a></li>
                                <li><a href="${pageContext.request.contextPath }/queryMeetingAll?page=3&rows=${meetings.pageSize}&id=${metting.id}&meetingName=${metting.meetingName}&state=${metting.state }&startTime=${metting.startTime }&endTime=${metting.endTime }">3</a></li>
                                <li><a href="${pageContext.request.contextPath }/queryMeetingAll?page=${meetings.nextPage }&rows=${meetings.pageSize}&id=${metting.id}&meetingName=${metting.meetingName}&state=${metting.state }&startTime=${metting.startTime }&endTime=${metting.endTime }">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>