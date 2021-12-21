<%--
  Created by IntelliJ IDEA.
  User: 40851
  Date: 2021/5/21
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/css1.css">
    <script src="js/jquery-1.4.4.min.js"></script>
</head>
<script>
    function login() {

        $.post(
            "login",
            $("form").serialize(),
            function (obj) {
                if(obj){
                    alert("登录成功");
                    location.href="list";
                }else{
                    alert("登录失败");
                    location.reload();
                }
            },"json"
        )
    }
</script>
<body>

    <form>
        <table>
            <tr>
                <td>
                    用户名：<input type="text" name="name">
                </td>
            </tr>
            <tr>
                <td>
                    密码：<input type="text" name="pwd">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="登录" onclick="login()">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
