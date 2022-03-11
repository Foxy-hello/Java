<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
        <form action="add">
            学生姓名：<input type="text" name="name"><br>
            学生性别：<input type="radio" name="sex" value="男">男
                    <input type="radio" name="sex" value="女">女<br>
            学生年龄：<input type="text" name="age"><br>
            学生爱好：<input type="text" name="happy"><br>
            入学时间：<input type="date" name="time"><br>
            班级编号：<input type="text" name="cid"><br>
            <input type="submit" value="提交">
            <input type="reset" value="取消">
        </form>
</body>
</html>