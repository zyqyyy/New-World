<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
	<script type="text/javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
	<script type="text/javascript">
	function del() {
		if (!confirm("确认要删除？")) {
			window.event.returnValue = false;
		}
	}
	function Check(){
		var flag = false;
	  for(var i=1;i<document.form1.elements.length-2;i++)
	  {
	   if(document.form1.elements[i].value=="") {
	     alert("当前表单不能有空项");
	     document.form1.elements[i].focus();
	     flag = false;
	     break;
	   }if(!flag) {
		   flag= true;
		}
	  }
	  return flag;
	  
	}
	function myCheck() {

		if (Check()) {
			formSubmit('${ctx}/cargo/contractproduct/productCreate', '_self');
		}

	}
		

	</script>
</head>
<body>
<form method="post" name="form1">
	

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="myCheck();this.blur();">确定</a></li>
<li id="back"><a href="${ctx}/cargo/contractproduct/tocreate">返回</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		新增货物信息
    </div> 
    </div>
    </div>
<div>
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle_mustbe">生产厂家：</td>
	            <td class="tableContentAuto">
	            	<select name="FACTORY_ID">
	            		<option value="">--请选择--</option>
	            		<c:forEach items="${factoryList}" var="f">
	            			<option value="${f.FACTORY_ID}">${f.FACTORY_NAME}</option>
	            		</c:forEach>
	            	</select>
	            </td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">货号：</td>
	            <td class="tableContent"><input type="text" name="PRODUCT_NO"/></td>
	            <td class="columnTitle_mustbe">数量：</td>
	            <td class="tableContent"><input type="text" name="CNUMBER"/></td>	        
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">包装单位：</td>
	            <td class="tableContentAuto">
	            	<input type="radio" name="PACKING_UNIT" value="PCS" class="input" checked>只
	            	<input type="radio" name="PACKING_UNIT" value="SETS" class="input">套
	            </td>	            
	            <td class="columnTitle_mustbe">单价：</td>
	            <td class="tableContent"><input type="text" name="PRICE"/></td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">货物描述：</td>
	            <td class="tableContent"><textarea name="PRODUCT_DESC" style="height:120px;"></textarea></td>
	        </tr>
		</table>
	</div>
	
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		货物信息列表
    </div> 
    </div>
    </div>
    
    
	<div class="eXtremeTable" >
	<table id="ec_table" class="tableRegion" width="98%" border="1">
		<thead>
		<tr>
			<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
			<td class="tableHeader">序号</td>
			<td class="tableHeader">厂家</td>
			<td class="tableHeader">货号</td>
			<td class="tableHeader" width="200">货物描述</td>
			<td class="tableHeader">数量</td>
			<td class="tableHeader">包装单位</td>
			<td class="tableHeader">单价</td>
			<td class="tableHeader">总金额</td>
			<td class="tableHeader">操作</td>
		</tr>
		</thead>
		<tbody class="tableBody" >
		
		<c:forEach items="${dataList}" var="o" varStatus="status">
		<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
			<td><input type="checkbox" name="CONTRACT_PRODUCT_ID" value="${o.CONTRACT_PRODUCT_ID}"/></td>
			<td>${status.index+1}</td>
			<td>${o.FACTORY_NAME}</td>
			<td>${o.PRODUCT_NO}</td>
			<td width="200">${o.PRODUCT_DESC}</td>
			<td>${o.CNUMBER}</td>
			<td>${o.PACKING_UNIT}</td>
			<td>${o.PRICE}</td>
			<td>${o.AMOUNT}</td>
			<td>
				<a href="${ctx}/cargo/contractproduct/toProductUpdate?id=${o.CONTRACT_PRODUCT_ID}">[修改]</a>
				<a href="${ctx}/cargo/contractproduct/deleteProduct?id=${o.CONTRACT_PRODUCT_ID}&contractId=${CONTRACT_ID}" onclick="return del()">[删除]</a>
				<a href="${ctx}/cargo/contractproduct/toExtProductCreate?contractProductId=${o.CONTRACT_PRODUCT_ID}">[附件]</a>
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

