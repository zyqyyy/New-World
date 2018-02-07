<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<script type="text/javascript">
	function del() {
		if (!confirm("确认要删除？")) {
			window.event.returnValue = false;
		}
	}
	function baoyun() {
		// 获取所有多选按钮
		var names = document.getElementsByName("contractId");
		//上报合同的个数
		var count = 0;
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				var ns = names[i].nextElementSibling; //获得s的下一个兄弟节点
				alert(ns.value);
				if (ns.value == '1') {
					names[i].checked = true;
					count++;
				} else {
					names[i].checked = false;
				}
			}
		}
		if (count > 0) {
			formSubmit('${ctx}/cargo/contractproduct/baoyun', '_self')
		} else {
			alert("请选择已上报的合同！");
		}
	}

	//必须选择一个  
	function selectOne() {
		var names = document.getElementsByName("contractId");
		var flag = false;//标记判断是否选中一个                 
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			alert("请最少选择一项！");
			return false;
		}
		return flag;
	}
	function deletee() {
		if (selectOne()) {
			formSubmit('${ctx}/cargo/contractproduct/delete', '_self');
		}
	}
	function updateState() {
		if (selectOne()) {
			formSubmit('${ctx}/cargo/updateState', '_self');
		}
	}
</script>
</head>

<body>
	<form name="icform" method="post">

		<div id="menubar">
			<div id="middleMenubar">
				<div id="innerMenubar">
					<div id="navMenubar">
						<ul>
							<%-- <li id="view"><a href="#" onclick="formSubmit('${ctx}/cargo/contractproduct/toView','_self');this.blur();">查看</a></li> --%>
							<li id="new"><a href="#"
								onclick="formSubmit('${ctx}/cargo/contractproduct/toAdd','_self');this.blur();">新增</a></li>
							<!-- <li id="update"><a href="#" onclick="formSubmit('toupdate.action','_self');this.blur();">修改</a></li> -->
							<li id="delete"><a href="#" onclick="deletee();this.blur();">删除</a></li>
							<li id="update"><a href="#"
								onclick="updateState();this.blur();">上报</a></li>
							<li id="new"><a href="#" onclick="baoyun();this.blur();">报运</a></li>
							<!-- 	<li id="new"><a href="#" onclick="formSubmit('cancel.action','_self');this.blur();">取消</a></li>
	<li id="print"><a href="#" onclick="formSubmit('print.action','_self');this.blur();">打印</a></li>
	<li id="print" style="white-space:nowrap;"><a href="#" onclick="formSubmit('printTemplate.action','_self');this.blur();">模板打印</a></li> -->
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">购销合同列表</div>
				</div>
			</div>

			<div>

				<div class="eXtremeTable">
					<table id="ec_table" class="tableRegion" width="98%" border="1">
						<thead>
							<tr>
								<td class="tableHeader"><input type="checkbox" name="selid"
									onclick="checkAll('contractId',this)"></td>
								<td class="tableHeader">序号</td>
								<td class="tableHeader">合同号</td>
								<td class="tableHeader">货物数/附件数</td>
								<td class="tableHeader">客户名称</td>
								<td class="tableHeader">交期</td>
								<td class="tableHeader">船期</td>
								<td class="tableHeader">签单日期</td>
								<td class="tableHeader">总金额</td>
								<td class="tableHeader">状态</td>
								<td class="tableHeader">操作</td>
								<td class="tableHeader">持久化操作</td>
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
								<td><input type="checkbox" name="contractId"
									value="${o.CONTRACT_ID}" /> <input type="hidden"
									value="${o.STATE}" name="status" /></td>

								<td>${status.index+1}</td>
								<td><a
									href="${ctx}/cargo/contractproduct/toView?contractId=${o.CONTRACT_ID}">${o.CONTRACT_NO}</a></td>

								<td>${o.CNUMBER}/${o.expNum}</td>
								<td>${o.CUSTOM_NAME}</td>
								<td><fmt:formatDate value="${o.DELIVERY_PERIOD}"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${o.SHIP_TIME}"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${o.SIGNING_DATE}"
										pattern="yyyy-MM-dd" /></td>
								<td>${o.TOTAL_AMOUNT}</td>
								<td><c:if test="${o.STATE==0}">
										<font color="green">草稿</font>
									</c:if> <c:if test="${o.STATE==1}">
										<font color="red">已上报</font>
									</c:if>
									<c:if test="${o.STATE==2}">
										<font color="blue">已报运</font>
									</c:if></td>
								<td><a
									href="${ctx}/cargo/contractproduct/toProductCreate?contractId=${o.CONTRACT_ID}">[货物]</a></td>
								<td><a
									href="${ctx}/cargo/contractproduct/toView?contractId=${o.CONTRACT_ID}"><font
										color="purple">查看</font> <c:if test="${o.STATE==1}"></a> <a
									href="${ctx}/cargo/contractproduct/delete?contractId=${o.CONTRACT_ID}"
									onclick="return del()"><font color="brown">级联删除</font></a> </c:if> <c:if
										test="${o.STATE==0}">
										<a
											href="${ctx}/cargo/contractproduct/toUpdate?contractId=${o.CONTRACT_ID}"><font
											color=blue>修改</font></a></td>
								</c:if>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>

			</div>
	</form>
</body>
</html>

