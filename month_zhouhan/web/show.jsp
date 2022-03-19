<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
            <form action="fuzzy">
                饭店名称:<input type="text" name="name" value="${name}"><br>
                菜   系: <select name="cid" >
                            <option value="">---下拉菜单---</option>
                        <c:forEach items="${by}" var="b">
                            <option ${cid==b.cid?"selected":""} value="${b.cid}">${b.cName}</option>
                        </c:forEach>
                        </select>

                <br>
                <input type="submit"  value="查询">
                <input type="reset"  value="取消">
            </form>
            <br>
            <a href="byCui" style="color: red">添加</a>
<table>
    <tr>
        <td>编号</td>
        <td>菜系</td>
        <td>名称</td>
        <td>简介</td>
        <td>开业时间</td>
        <td>营业状态</td>
        <td>菜系名称</td>
        <td>发源地</td>
        <td>操作</td>
    </tr>
<c:forEach items="${list}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>${s.cid}</td>
        <td>${s.name}</td>
        <td>${s.description}</td>
        <td>${s.time}</td>
        <td>${s.state==0?"休息":"营业"}</td>
        <td>${s.cName}</td>
        <td>${s.area}</td>
        <td>
            <a href="byUpdate?sid=${s.id}">修改</a>
            <a href="byState?sid=${s.id}&state=${s.state}">${s.state==0?"营业":"休息"}</a>
            <a href="del?sid=${s.id}">删除</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>