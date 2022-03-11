<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>

    <form action="update">
        编号：<input type="hidden" name="sid" value="${stu.sid}"><br>
        名称：<input type="text" name="name" value="${stu.sName}"><br>
        性别：<input type="radio" ${stu.sex.equals("男")?"checked":""} name="sex" value="男">男
             <input type="radio" ${stu.sex.equals("女")?"checked":""} name="sex" value="女">女<br>
        年龄：<input type="text" name="age" value="${stu.age}"><br>
        爱好：<input type="text" name="happy" value="${stu.happy}"><br>
        时间：<input type="date" name="time" value="${stu.time}"><br>
        班级：
        <select name="cid" >
            <c:forEach items="${cls}" var="s">
            <option ${s.cid==stu.cid?"selected":""} value="${s.cid}">${s.cName}</option>
            </c:forEach>
        </select>
        <input type="submit" value="修改">
    </form>
</body>
</html>