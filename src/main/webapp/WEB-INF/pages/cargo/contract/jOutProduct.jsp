<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<%@ include file="../../baselist.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
	<script type="text/javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>

</head>
<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="print"><a href="#" onclick="formSubmit('${ctx}/contractproduct/outProductPrint','_self');">打印</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		出货表月统计
    </div> 
    </div>
    </div>
<div>
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle_mustbe">船期：</td>
	            <td class="tableContent">
	            	<input type="text" name="inputDate" style="width:90px;" value="2011-12"
	            		onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM'});" readonly/>
	            		<input type="submit" value="查询">
	            </td>
	        </tr>
		</table>
	</div>
</div>
<div>

				<div class="eXtremeTable">
					<table id="ec_table" class="tableRegion" width="98%" border="1">
						<thead>
							<tr>
								<td class="tableHeader">序号</td>
								<td class="tableHeader">合同号</td>
								<td class="tableHeader">客户名称</td>
								<td class="tableHeader">合同编号</td>
								<td class="tableHeader">货物号</td>
								<td class="tableHeader">交期</td>
								<td class="tableHeader">船期</td>
								<td class="tableHeader">贸易条款</td>
								<td class="tableHeader">生产厂家</td>
								<td class="tableHeader">出货数量</td>
							</tr>

						</thead>
						<tbody class="tableBody">

							<c:forEach items="${dataList}" var="o" varStatus="status">
								<c:if test="${status.index%2==0 }">
									<tr class="odd" onmouseover="this.className='highlight'"
										onmouseout="this.className='odd'">
								</c:if>

								<c:if test="${status.index%2==1 }">
									<tr class="even" onmouseover="this.className='highlight'"
										onmouseout="this.className='even'">
								</c:if>
									<td>${status.index+1}</td>
									<td>${o.contract_product_id}</td>
									<td>${o.custom_name}</td>
									<td>${o.contract_no}</td>
									<td>${o.product_no }</td>
									<td>${o.delivery_period}</td>
									<td>${o.ship_time}</td>
									<td>${o.trade_terms}</td>
									<td>${o.factory_name}</td>
									<td>${o.cnumber}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>

 
 
</form>
</body>
</html>

