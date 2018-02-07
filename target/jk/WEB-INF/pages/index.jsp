<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="base.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="${ctx}/skin/default/css/login.css" rel="stylesheet"
	type="text/css" />

<title>陕西杰信商务综合管理平台</title>
<script type="text/javascript">
	function checkUser() {

		document.getElementById("login_main").submit();
	}
	/* 点击Enter实现登陆操作 */
	function submitFind(){

		document.getElementById("login_main").submit();
		}

	function formReset() {
		document.getElementById("login_main").reset()
	}
</script>
</head>

<body>
	<form id="login_main" method="post" action="${ctx}/login" name="Form1">
		<div id="warpbox">
			<div class="main">
				<div class="zck">
					<div class="zc">
						<div class="zc_line">
							用户名： <input type="text" value="${userName }" name="userName" id="userName"
								onkeyup="" onFocus="this.select();" autocomplete="off"
								title="请您输入用户名" />
							<div id="ts" style="z-index: 1;"></div>
						</div>
						<div class="zc_line">
							密 码：      <input type="password" value="${password }" name="password"
								id="password"
								onfocus="$('#ts').css('display','none');this.select();"
								onKeyDown="javascript:if(event.keyCode==13){ submitFind(); }"
								title="请您输入密码" />
						</div>
					</div>
					<div class="dl">
						<input class="loginImgOut" value="" type="button" 
							onclick="checkUser()" onmouseover="this.className='loginImgOver'"
							onmouseout="this.className='loginImgOut'" /> <input
							class="resetImgOut" value="" type="button" onclick="formReset()"
							onmouseover="this.className='resetImgOver'"
							onmouseout="this.className='resetImgOut'" />
					</div>
				</div>
				<div class="bqxx" style="text-align: right; margin-top: 0px;">
					<a href="#">系统帮助</a> | <a href="#" onclick="bookmarkit();">加入收藏</a>
				</div>

				<div class="mirro"></div>
				<logic:notEmpty name="loginFailed">
					<c:if test="${loginFailed==1}">
						<c:set var="errorInfo" value="用户名或密码错误, 请重新输入!" />
					</c:if>
					<c:if test="${loginFailed==2}">
						<c:set var="errorInfo" value="用户名不存在, 请重新输入!" />
					</c:if>
					<div class="erro" id="erro">
						<div class="erro_intro">${errorInfo}</div>
					</div>
				</logic:notEmpty>
			</div>
		</div>
	</form>
	<script type="text/JavaScript">
		document.getElementById('login_main').userName.focus();
	</script>

</body>
</html>


