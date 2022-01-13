<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>数组参数绑定</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/array" method="post">
        兴趣爱好:<input type="checkbox" name="hobby" value="旅游">旅游
        <input type="checkbox" name="hobby" value="健身">健身
        <input type="checkbox" name="hobby" value="读书">读书
        <input type="checkbox" name="hobby" value="唱歌">唱歌
        <input type="checkbox" name="hobby" value="跳舞">跳舞<br><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>