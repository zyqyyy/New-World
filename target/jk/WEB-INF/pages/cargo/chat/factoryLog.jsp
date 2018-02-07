<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../../baselist.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${ctx }/js/echarts.min.js"></script>
<script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$.get("${ctx }/cargo/chat/factoryRecord", function(data) {
			var titles = new Array();
			var numbers = new Array();
			for (var i = 0; i < data.length; i++) {
				titles[i] = data[i].factory_name;
				numbers[i] = data[i].countnum;
			}

			

			// 基于准备好的dom，初始化echarts实例
			var myChart = echarts.init(document.getElementById('main'));

			// 指定图表的配置项和数据
			var option = {
					 tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
				
				xAxis : {
					name : "厂家",
					data : titles
				},
				yAxis :[
			        {
			            type : 'value'
			        }
			    ],
				series : [ {
					
					type : 'bar',
					data : numbers
				} ]
			};

			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
		});
	})



</script>



</head>
<body>
	<form name="icform" method="post">



		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">厂家销售记录</div>
				</div>
			</div>

			<div>

				<div class="eXtremeTable">
					<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
					<div id="main" style="width: 1000px; height: 400px;"></div>



				</div>

			</div>
	</form>
</body>
</html>