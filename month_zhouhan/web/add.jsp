<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
        <form action="add">
            饭店名称：<input type="text" name="name"><br>
            饭店简介：<input type="text" name="description"><br>
            营业日期：<input type="text" name="time"><br>
            营业状态：<input type="text" name="state"><br>
            菜   系： <select name="cid" ><br>
                            <option value="">---请选择---</option>
                        <c:forEach items="${by}" var="b">
                            <option value="${b.cid}">${b.cName}</option>
                        </c:forEach>
                        </select>
            <br> <input type="submit" value="添加">
        </form>
</body>
</html>