<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="jquery-1.8.2.min.js"></script>
<body>
    <form>
        <input type="text" name="sId" id="sId"><br>
        学生姓名:<input type="text" name="sName" id="sName"><br>
        学生性别:<input type="text" name="sSex" id="sSex"><br>
        学生生日:<input type="text" name="sBirth" id="sBirth"><br>
        课程: <div id="div"></div>
        <br>
        <input type="button" value="修改" id="update"><br>
    </form>
</body>
<script>
    var sId = ${param.sId};
    $.ajax({
        url:"findCourseName",
        success:function (arr) {
            console.log(arr)
            for (let i = 0; i < arr.length; i++) {
                /*var op = $("<input type='checkbox' value='"+arr[i].cId+"' name='cIds'>"+arr[i].cName);*/
                $("#div").append("<input type='checkbox' class='cIds' value='"+arr[i].cId+"' name='cIds'>"+arr[i].cName);
            }
            $.ajax({
                url: "findById",
                data:{"sId":sId},
                success:function (obj) {
                    console.log(obj)
                    $("#sId").val(obj.sId);
                    $("#sName").val(obj.sName)
                    $("#sSex").val(obj.sSex)
                    $("#sBirth").val(obj.sBirth)
                    console.log(obj.cIds);
                    $(".cIds").each(function () {
                        if (obj.cIds.includes($(this).val())){
                            $(this).attr("checked",true)
                        }
                    })
                }
            })
        }
    })

    $("#update").click(function () {
        $.ajax({
            url:"update",
            type:"post",
            data: $("form").serialize(),
            success:function (i) {
                if (i > 0){
                    alert("修改成功!")
                    location.assign("findAll")
                }
            }
        })
    })

</script>
</html>