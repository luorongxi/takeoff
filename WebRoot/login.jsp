<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>快捷订餐系统管理后台</title>
<link href="dwz/themes/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" language="javascript" src="<%=request.getContextPath() %>/js/login/login.js"></script>
</head>

<body onLoad="document.getElementById('randomCode').click()">
	<div id="login">
		<div id="login_header">
			<h1 class="login_logo">
				<a href="http://demo.dwzjs.com"><img src="dwz/themes/default/images/login_logo.gif" /></a>
			</h1>
			<div class="login_headerContent">
				<div class="navList">
					<ul>
						<li><a href="#">设为首页</a></li>
						<li><a href="http://bbs.dwzjs.com">反馈</a></li>
						<li><a href="dwz/doc/dwz-user-guide.pdf" target="_blank">帮助</a></li>
					</ul>
				</div>
				<h2 class="login_title"><img src="dwz/themes/default/images/login_title.png" /></h2>
			</div>
		</div>
		<div id="login_content">
			<div class="loginForm">
				<s:form id="form1" action="login_login" namespace="/" method="post">
				    <div style="color: red;padding-bottom: 10px;">
							<center>
								${message}
							</center>
					</div>
					<div class="login_user">
			              <ul>
			                  <li><label>帐&nbsp;&nbsp;&nbsp;&nbsp;号：</label></li>
			                  <li>
			                       <input type="text" name="userInfo.loginName" size="18" class="login_input" />
			                  </li>
			              </ul>
			              <ul>
			                  <li><label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label></li>
			                  <li>
			                      <input type="password" name="userInfo.loginPass" size="18" class="login_input" />
			                  </li>
			              </ul>
			        </div>
			        <div class="login_code">
			              <ul>
			                  <li><label>验证码：</label></li>
			                  <li class="input_code">
			                      <input id="code" name="code" size="6"/>
			                  </li>
			                  <li>
				                  <span><img src="randomCode.action" id="randomCode"
										onclick="changeRandomCode(this);" alt="验证码" title="验证码"
									    width="65" height="24" /> </span>
							  </li>
			              </ul>
			        </div>
					<div class="login_bar">
						<input class="sub" type="submit" value=" " />
					</div>
				</s:form>
			</div>
			<div class="login_banner"><img src="dwz/themes/default/images/login_banner.jpg" /></div>
			<div class="login_main">
				<ul class="helpList">
					<li><a href="#">下载驱动程序</a></li>
					<li><a href="#">如何安装密钥驱动程序？</a></li>
					<li><a href="#">忘记密码怎么办？</a></li>
					<li><a href="#">为什么登录失败？</a></li>
				</ul>
				<div class="login_inner">
					<p>您可以使用 网易网盘 ，随时存，随地取</p>
					<p>您还可以使用 闪电邮 在桌面随时提醒邮件到达，快速收发邮件。</p>
					<p>在 百宝箱 里您可以查星座，订机票，看小说，学做菜…</p>
				</div>
			</div>
		</div>
		<div id="login_footer">
			Copyright &copy; 2015 www.dwzjs.com Inc. All Rights Reserved.
		</div>
	</div>
</body>
</html>