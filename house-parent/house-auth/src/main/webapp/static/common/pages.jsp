<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="btn-group btn-sm">

    <c:if test="${pg.total==0}">
        <i>暂无数据</i>
    </c:if>

    <c:if test="${pg.total!=0}">
        <ul class="nav">
            <li class="nav-item">
                <a class="nav-link" href="#" active>共 ${pg.total} 条信息</a>
            </li>
        </ul>
        <input type="number" name="pageSize" value="${pg.pageSize}" placeholder="每页显示" style="width: 88px" id="pageSize">
        <button class="btn btn-sm btn-outline-primary" type="button" onclick="changePageSize($('#pageSize').val())">确定</button>
        &emsp;
        <c:if test="${pg.pageNum!=1}">
            <button type="button" class="btn btn-sm btn-outline-primary" onclick="goPage(1)">首页</button>
        </c:if>
        <button type="button" class="btn btn-sm btn-outline-primary" onclick="goPage(${pg.prePage==0?1:pg.prePage})">&laquo;
        </button>
        <c:forEach items="${pg.navigatepageNums}" var="n">
            <button type="button" class="btn btn-sm btn-outline-primary" onclick="goPage(${n})">${n}</button>
        </c:forEach>
        <button type="button" class="btn btn-sm btn-outline-primary" onclick="goPage(${pg.nextPage==0?pg.pages:pg.nextPage})">
            &raquo;
        </button>
        <c:if test="${pg.pageNum!=pg.pages}">
            <button type="button" class="btn btn-outline-primary" onclick="goPage(${pg.pages})">尾页</button>
        </c:if>
        <ul class="nav">
            <li class="nav-item">
                <a class="nav-link" href="#">合计：${pg.pageNum}/${pg.pages}页</a>
            </li>
        </ul>
        <input type="number" name="pageNum" placeholder="跳转至..." style="width: 88px" id="goNum">
        <button class="btn btn-sm btn-outline-primary" type="button" onclick="goPage($('#goNum').val())">跳转</button>
    </c:if>
    <script type="text/javascript">
        function goPage(pageNum){

            $("form").append("<input type='hidden' name='pageNum' value='"+pageNum+"'>");
            $("form").append("<input type='hidden' name='pageSize' value='${pg.pageSize}'>");
            $("form").submit();
        }
        function changePageSize(pageSize){
            $("form").append("<input type='hidden' name='pageSize' value='"+pageSize+"'>");
            $("form").submit();
        }
    </script>
</div>





