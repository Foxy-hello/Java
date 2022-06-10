<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="/static/js/echarts.js"></script>

</head>
<body>
<center>
<form action="/house/toReport">
    <select name="pid" onchange="getCity(this.value)">
        <option value="">省</option>
    </select>
    <select name="cid">
        <option value="">市</option>
    </select>
    <button >查询</button>
</form>
<!-- 为 ECharts 准备一个定义了宽高的 DOM -->
<div id="main" style="width: 600px;height:400px;"></div>
</center>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
   var  names=[];//类目
    var  nums=[];//数量
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '统计数据'
        },
        tooltip: {},
        legend: {
            data: ['统计数据']
        },
        xAxis: {
            data:names
        },
        yAxis: {},
        series: [
            {
                name: '数量',
                type: 'bar',
                data: nums
            }
        ]


    };

    $.get("/house/getTJ",{cid:'${cid}'},function (list){
         for(var i in list){
            names.push(list[i].name);
            nums.push(list[i].num);
        }
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    })




    $(function () {
        $.get("/house/getCity", {pid: 1}, function (list) {
            for (var i in list) {
                $("[name='pid']").append("<option value='" + list[i].id + "'>" + list[i].name + "</option>")
            }
            //省下拉框选中
            var pid='${pid}'
            $("[name='pid']").val(pid);//
            if(pid!=null){
                getCity(pid);
            }
        })
    })


    function getCity(pid) {
        $.get("/house/getCity", {pid: pid}, function (list) {
            $("[name='cid']").html("<option value=''>市</option>")
            for (var i in list) {
                $("[name='cid']").append("<option value='" + list[i].id + "'>" + list[i].name + "</option>")
            }
            //市下拉框选中
            $("[name='cid']").val('${cid}')
        })
    }

</script>
</body>
</html>
