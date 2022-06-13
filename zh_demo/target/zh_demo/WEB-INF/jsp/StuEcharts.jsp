<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
    <title></title>
</head>
<script src="plug/js/jquery-1.9.1.min.js"></script>
<script src="plug/js/echarts.min.js"></script>
<body>
<div id="div" style="width: 100%;height: 100%"></div>
</body>
<script>
    $(function () {
        let xArray = new Array();
        let yArray = new Array();
        $.ajax({
            async: false,
            url: "getEchartsNum",
            type: "post",
            dataType: "json",
            success: function (arr) {
                console.log(arr)
                for (let i = 0; i < arr.length; i++) {
                    xArray.push(arr[i].hname);
                    yArray.push(arr[i].num);
                }
            }
        })

        var chartDom = document.getElementById('div');
        var myChart = echarts.init(chartDom);
        var option;

        option = {
            xAxis: {
                type: 'category',
                data: xArray
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    data: yArray,
                    type: 'bar',
                    showBackground: true,
                    backgroundStyle: {
                        color: 'rgba(180, 180, 180, 0.2)'
                    }
                }
            ]
        };

        option && myChart.setOption(option);

    })
</script>
</html>