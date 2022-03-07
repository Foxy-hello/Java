<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<form action="insert">
    姓名：<input type="text" name="name"><br>
    性别：<input type="radio" name="sex" value="男">男
    性别：<input type="radio" name="sex" value="女">女<br>
    年龄：<input type="text" name="age"><br>
    邮箱：<input type="text" name="mail"><br>
    电话：<input type="text" name="phone"><br>
    地址：<select name="address">
    <option value="北京">北京</option>
    <option value="上海">上海</option>
    <option value="杭州">杭州</option>
    <option value="南京">南京</option>
    <option value="广东">广东</option>
         </select>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>