<%--
  Created by IntelliJ IDEA.
  User: 朝菌
  Date: 2022/3/3
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UserInsert">
    姓名：<input type="text" name="name" ><br>
    性别：<input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女<br>
    年龄：<input type="text" name="age" ><br>
    邮箱：<input type="text" name="mail" ><br>
    电话：<input type="text" name="phone" ><br>
    地址：<select name="address">
        <option value="北京">北京</option>
        <option value="上海">上海</option>
        <option value="南京">南京</option>
        <option value="广州">广州</option>
    </select><br><br>
    <input type="submit" value="立即注册"> <input type="reset"value="重置">
</form>
</body>
</html>
