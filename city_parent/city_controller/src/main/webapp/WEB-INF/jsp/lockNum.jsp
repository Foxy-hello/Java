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
            let data = new Array();

            $.ajax({
                async:false,
                url:"getLockNum",
                type:"post",
                dataType:"json",
                success:function (obj) {
                    console.log(obj)
                    for (let i = 0; i < obj.length; i++) {
                        xArray.push(obj[i].bname)
                        yArray.push(obj[i].num)
                        data.push({name:obj[i].bname,value:obj[i].num})
                    }
                }
            })





            var chartDom = document.getElementById('div');
            var myChart = echarts.init(chartDom);
            var option;

            option = {
                title: {
                    text: 'Referer of a Website',
                    subtext: 'Fake Data',
                    left: 'center'
                },
                tooltip: {
                    trigger: 'item'
                },
                legend: {
                    orient: 'vertical',
                    left: 'left'
                },
                series: [
                    {
                        name: 'Access From',
                        type: 'pie',
                        radius: '50%',
                        data: data,
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            option && myChart.setOption(option);




        })
    </script>
</html>