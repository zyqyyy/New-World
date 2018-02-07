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

	function createPie(name,value){
		var obj =  new Object();
		obj.name = name;
		obj.value = value;
		return obj;	 
	}

	$(function() {
		$.get("${ctx }/cargo/chat/productRecord", function(data) {
			var pies = new Array();
			for (var i = 0; i < data.length; i++) {
				var pie = createPie(data[i].factory_name, data[i].countnum);
				pies[i] = pie;
			}


		var myChart = echarts.init(document.getElementById('main'));
		option = {
			    tooltip: {
			        trigger: 'item',
			        formatter: "{a} <br/>{b}: {c} ({d}%)"
			    },
			      legend: {
			        orient: 'vertical',
			        x: 'left',
			        data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
			    }, 
			    series: [
			        {
			            name:'访问来源',
			            type:'pie',
			            radius: ['50%', '70%'],
			            avoidLabelOverlap: false,
			            label: {
			                normal: {
			                    show: false,
			                    position: 'center'
			                },
			                emphasis: {
			                    show: true,
			                    textStyle: {
			                        fontSize: '30',
			                        fontWeight: 'bold'
			                    }
			                }
			            },
			            labelLine: {
			                normal: {
			                    show: false
			                }
			            },
			            data:pies
			        }
			    ]
			};
		myChart.setOption(option);
		})
	})
	
</script>

</head>
<body>
	<form name="icform" method="post">



		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">商品销售排行Top10</div>
				</div>
			</div>

			<div>

				<div class="eXtremeTable">


					<div id="main" style="width: 600px; height: 400px;"></div>


				</div>

			</div>
	</form>
</body>
</html>