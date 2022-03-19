<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
        <form action="update">
            编号：<input type="text" name="id" value="${ho.id}"><br>
            名称：<input type="text" name="name" value="${ho.name}"><br>
            简介：<input type="text" name="description" value="${ho.description}"><br>
            时间：<input type="text" name="time" value="${ho.time}"><br>
            状态：<input type="text" name="state" value="${ho.state}"><br>
            菜系：<select name="cid" >
            <c:forEach items="${by}" var="b">
                        <option ${cid==b.cid?"selected":""} value="${b.cid}">${b.cName}</option>
            </c:forEach>
        </select><br>
            <input type="submit"  value="修改">
            <input type="reset"  value="取消">

        </form>
</body>
</html>