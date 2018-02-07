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
		$
				.get(
						"${ctx }/cargo/chat/loginLogTimeRecord",
						function(data) {
							var titles = new Array();
							var numbers = new Array();
							for (var i = 0; i < data.length; i++) {
								titles[i] = data[i].time;
								numbers[i] = data[i].count;
							}

							// 基于准备好的dom，初始化echarts实例
							var myChart = echarts.init(document
									.getElementById('main'));

							var colors = [ '#5793f3', '#d14a61', '#675bba' ];

							option = {
								color : colors,
								title : {
									text : '${year}' + '年份统计',
									textStyle : {
										color : '#235894'
									}
								},

								tooltip : {
									trigger : 'none',
									axisPointer : {
										type : 'cross'
									}
								},
								legend : {
									orient : 'vertical',
									x : 'left',
									data : [ '00' ]
								},
								grid : {
									top : 70,
									bottom : 50
								},
								xAxis : [
										{
											type : 'category',
											axisTick : {
												alignWithLabel : true
											},
											axisLine : {
												onZero : false,
												lineStyle : {
													color : colors[1]
												}
											},
											axisPointer : {
												label : {
													formatter : function(params) {
														return '登陆人数  '
																+ params.value
																+ (params.seriesData.length ? '：'
																		+ params.seriesData[0].data
																		: '');
													}
												}
											},
											data : titles
										},
										{
											type : 'category',
											axisTick : {
												alignWithLabel : true
											},
											axisLine : {
												onZero : false,
												lineStyle : {
													color : colors[0]
												}
											},
											axisPointer : {
												label : {
													formatter : function(params) {
														return '登陆人数  '
																+ params.value
																+ (params.seriesData.length ? '：'
																		+ params.seriesData[0].data
																		: '');
													}
												}
											},
											data : titles
										} ],
								yAxis : [ {
									type : 'value'
								} ],
								series : [ {

									type : 'line',
									xAxisIndex : 1,
									smooth : true,
									data : numbers
								}, {

									type : 'line',
									smooth : true,
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
					<div class="textbox-title">登陆统计</div>
				</div>


			</div>
			<td><select name="year">
					<option value="">--请选择--</option>
					<c:forEach items="${list}" var="f">

						<option value="${f.time}">${f.time}</option>
					</c:forEach>
					<input type="submit" value="查询">
			</select></td>

			<div>

				<div class="eXtremeTable">
					<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
					<div id="main" style="width: 1500px; height: 400px;"></div>



				</div>

			</div>
	</form>
</body>
</html>