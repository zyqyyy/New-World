<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<script type="text/javascript">
function Check(){
	var flag = false;
  for(var i=1;i<document.form1.elements.length-1;i++)
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
		formSubmit('${ctx}/fac/basicinfo/factory/insert.action', '_self');
	}

}

</script>
</head>
<body>
	<form method="post" name="form1">


		<input type="hidden" name="id" value="${obj.contractor}" />

		<div id="menubar">
			<div id="middleMenubar"></div>
		</div>

		<div class="textbox" id="centerTextbox">

			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">添加工厂信息</div>
				</div>
			</div>
			<div>

				<div>
					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">工厂简称：</td>
							<td class="tableContent"><input type="text"
								name="FACTORY_NAME" value="${obj.contractor}" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">工厂全称：</td>
							<td class="tableContent"><input type="text"
								name="FULL_NAME" value="${obj.contractor}" /></td>
						</tr>
								<tr>
							<td class="columnTitle_mustbe">验货员：</td>
							<td class="tableContent"><input type="text"
								name="INSPECTOR" value="${obj.contractor}" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">联系人：</td>
							<td class="tableContent"><input type="text"
								name="CONTACTS" value="${obj.contractor}" /></td>
						</tr>
						
						<tr>
							<td class="columnTitle_mustbe">手机：</td>
							<td class="tableContent"><input type="text"
								name="MOBILE" value="${obj.contractor}" /></td>
						</tr>
						
						<tr>
							<td class="columnTitle_mustbe">联系方式：</td>
							<td class="tableContent"><input type="text"
								name="PHONE" value="${obj.contractor}" /></td>
						</tr>

						<tr>
							<td class="columnTitle_mustbe">传真：</td>
							<td class="tableContent"><input type="text"
								name="FAX" value="${obj.contractor}" /></td>
						</tr>
					
						<tr>
							<td class="columnTitle_mustbe">说明：</td>
							<td class="tableContent"><textarea 
								name="CNOTE"   style="width: 385px; height: 100px;">
								</textarea>
								</td>
						</tr>
					</table>
				</div>
			</div>
			</div>
			<div id="innerMenubar">
				<div id="navMenubar">
					<ul>
						<li id="save"><a href="#"
							onclick="myCheck();this.blur();">确定</a></li>
						<li id="back"><a href="${ctx}/fac/list">返回</a></li>
					</ul>
				</div>
			</div>
	</form>
</body>
</html>

