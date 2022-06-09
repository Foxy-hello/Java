<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2022/5/10 0010
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${loginUser}
    <c:if test="${loginUser == null}">
        <a href="http://localhost:8084/tologin?target=http://localhost:8085/index">登录</a>
    </c:if>
    <c:if test="${loginUser != null}">
<%--        <jsp:forward page="/list"></jsp:forward>--%>
    </c:if>
</body>
</html>
