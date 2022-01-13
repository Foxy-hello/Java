<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/pojo2" method="post">
        用户id:<input type="text" name="id" value="2"><br>
        用户名:<input type="text" name="username" value="Marry"><br>
        性别:<input type="text" name="sex" value="女"><br>
        出生日期:<input type="text" name="birthday" value="2017-08-25"><br>
        地址:<input type="text" name="contactInfo.address" value="山东"><br>
        电话:<input type="text" name="contactInfo.tel" value="50070"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>