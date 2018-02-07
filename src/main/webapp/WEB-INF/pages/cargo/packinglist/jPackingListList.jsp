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
	function shangbao(){
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
        	formSubmit('${ctx}/packinglist/update','_self')	
        }else{
        	alert("请选择要上报的装箱单！");
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
			formSubmit('${ctx}/packinglist/delete','_self');
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
							<li id="view"><a href="#"
							onclick="shangbao();this.blur();" >上报</a></li>
								<li id="delete"><a href="#"
								onclick="deletee();this.blur();">删多条</a></li>

						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">装箱单列表</div>
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
								<td class="tableHeader">卖方</td>
								<td class="tableHeader">买方</td>
								<td class="tableHeader">发票号</td>
								<td class="tableHeader">发票时间</td>
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
									value="${o.PACKING_LIST_ID}" />
									 <input type="hidden" value="${o.STATE}" name="status"/>
									
									
									</td>
								<td>${status.index+1}</td>
								<td>${o.SELLER}</td>
								<td>${o.BUYER}</td>
								<td>${o.INVOICE_NO}</td>
								<td><fmt:formatDate value="${o.INVOICE_DATE}"
										pattern="yyyy-MM-dd" /></td>

								<td><c:if test="${o.STATE==0}">草稿</c:if> <c:if
										test="${o.STATE==1}">已上报</c:if></td>
								<td>
									<div id="menubar">
										<div id="middleMenubar">
											<div id="innerMenubar">
												<div id="navMenubar">
													<ul>
														<li id="view"><a
															href="${ctx}/packinglist/PackingListView?id=${o.PACKING_LIST_ID}">查看</a></li>
														<li id="update"><a
															href="${ctx}/packinglist/toPackingListUpdate?id=${o.PACKING_LIST_ID}">修改</a></li>
														<li id="delete"><a
															href="${ctx}/packinglist/delete?id=${o.PACKING_LIST_ID}"
															onclick="return del()">删除</a></li>
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


