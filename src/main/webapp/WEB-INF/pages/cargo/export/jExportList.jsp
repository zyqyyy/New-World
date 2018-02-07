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
	function zhuangxiang(){
		// 获取所有多选按钮
        var names = document.getElementsByName("id"); 
        //上报合同的个数
        var count = 0;
        for(var i=0;i<names.length;i++){  
            if(names[i].checked){  
            	var ns=names[i].nextElementSibling;   //获得s的下一个兄弟节点
            	alert(ns.value);
            	if (ns.value=='0') {
            		names[i].checked = true;
            		count++;
    			}else{
    				names[i].checked = false;
    			}
            }
        }
        if(count>0){
        	formSubmit('${ctx}/export/tojPackingCreated','_self')	
        }else{
        	alert("请选择要装箱的报运单！");
        }
	}

	
    //必须选择一个  
    function selectOne() {  
        var names = document.getElementsByName("id");            
        var flag = false ;//标记判断是否选中一个                 
        for(var i=0;i<names.length;i++){  
            if(names[i].checked){  
                    flag = true ;  
                    break ;  
             }  
         }  
         if(!flag){  
            alert("请最少选择一项！");  
            return false ;  
         }  
         return flag;
    }  
    function deletee(){
		if(selectOne()){
			formSubmit('${ctx}/export/delete','_self');
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
							<li id="new"><a href="#"
								onclick="zhuangxiang();this.blur();">装箱</a></li>
							<li id="delete"><a href="#"
								onclick="deletee();this.blur();">删除</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">出口报运列表</div>
				</div>
			</div>

			<div>

				<div class="eXtremeTable">
					<table id="ec_table" class="tableRegion" width="98%">
						<thead>
							<tr>
								<td class="tableHeader"><input type="checkbox" name="selid"
									onclick="checkAll('id',this)"></td>
								<td class="tableHeader">序号</td>
								<td class="tableHeader">报运号</td>
								<td class="tableHeader">货物数/附件数</td>
								<td class="tableHeader">L/C</td>
								<td class="tableHeader">装运港</td>
								<td class="tableHeader">收货人及地址</td>
								<td class="tableHeader">运输方式</td>
								<td class="tableHeader">价格条件</td>
								<td class="tableHeader">录入日期</td>
								<td class="tableHeader">状态</td>
								<td class="tableHeader">操作</td>
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
								<td><input type="checkbox" name="id"
									value="${o.export_id}" />
									<input type="hidden" value="${o.state}" name="status"/>
									
									</td>
								<td>${status.index+1}</td>
								<td>${o.customer_contract}</td>
								<td>${o.cnumber}/${o.expNum}</td>
								<td>${o.lcno}</td>
								<td>${o.shipment_port}</td>
								<td>${o.consignee}</td>
								<td>${o.transport_mode}</td>
								<td>${o.price_condition}</td>
								<td><fmt:formatDate value="${o.input_date}"
										pattern="yyyy-MM-dd" /></td>
								<!-- 0-草稿 1-已上报 2-装箱 3-委托 4-发票 5-财务 -->
								<td><c:if test="${o.state==0}">草稿</c:if> <c:if
										test="${o.state==1}">
										<font color="green">已上报</font>
									</c:if> <c:if test="${o.state==2}">
										<font color="green">装箱</font>
									</c:if> <c:if test="${o.state==3}">
										<font color="green">委托</font>
									</c:if> <c:if test="${o.state==4}">
										<font color="green">发票</font>
									</c:if> <c:if test="${o.state==5}">
										<font color="green">财务</font>
									</c:if></td>
								<td>
									<div id="menubar">
										<div id="middleMenubar">
											<div id="innerMenubar">
												<div id="navMenubar">
													<ul>
														
														<li id="update"><a href="#"
															onclick="formSubmit('${ctx}/export/toExportUpdate?exportId=${o.export_id}','_self');this.blur();">修改</a></li>
														<li id="delete"><a href="${ctx}/export/delete?id=${o.export_id}" onclick="return del()">删除</a></li>
														

													</ul>
												</div>
											</div>
										</div>
									</div>

								</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>

			</div>
	</form>
</body>
</html>


