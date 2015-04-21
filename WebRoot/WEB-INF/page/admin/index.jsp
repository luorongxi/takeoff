<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>快捷订餐系统后台首页</title>
<jsp:include page="/WEB-INF/page/admin/dwz.jsp" />
</head>
<% String userName = (String) request.getSession().getAttribute("USER_NAME"); %>
<% String loginPass = (String) request.getSession().getAttribute("LOGIN_PASS"); %>
<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<a class="logo" href="#">标志</a>
				<ul class="nav">
				    <li><a target="dialog" mask="true" width="500" height="380" ><%=userName%>，快捷订餐系统欢迎您！</a></li>
					<li><a target="dialog" mask="true" width="520" height="280" href="employee_editPwdUI" target="dialog" width="550">修改密码</a></li>
					<li><a href="./" target="_blank">前台首页</a></li>
					<li><a target="dialog" mask="true" width="300" height="200" href="logout_confirm">退出系统</a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default"><div class="selected">蓝色</div></li>
					<li theme="green"><div>绿色</div></li>
					<li theme="purple"><div>紫色</div></li>
					<li theme="silver"><div>银色</div></li>
					<li theme="azure"><div>天蓝</div></li>
				</ul>
			</div>

			<!-- navMenu -->

		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>系统菜单</h2><div>收缩</div></div>
				<div class="accordion" fillSpace="sidebar">
					<div class="accordionContent">
						<div class="zTreeDemoBackground left">
					        <ul id="menuTree" class="ztree"></ul>
					    </div>
					</div>
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">主页</a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox">
						<div class="accountInfo">
							<p><span>欢迎使GuWei建站系统</span></p>
							<p>GuWei建站系统官网：<a href="http://www.xiaoguwei.com" target="_blank">http://www.xiaoguwei.com</a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">Copyright &copy; 2014 <a href="demo_page2.html" target="dialog">GuWei团队</a> Tel：020-39341021</div>
</body>
</html>
<script language="javaScript">
	var setting = {
	    data: {
			simpleData: {
			   enable: true
			}
		},
		callback: {
		    onExpand: zTreeRegisterTarget
		}
	};
	var zTree;
	var treeNodes;

	//异步加载数据.
	$(function(){
	    $.ajax({
	         async : false,
	         cache:false,
	         type: "POST",
	         dataType : "json",
	         url: "menu_treeList",//请求的action路径
	         error: function () {//请求失败处理函数
	            alert("请求失败!");
	         },
	         success:function(data){ //请求成功后处理函数
	            treeNodes = data;   //把后台封装好的简单Json格式赋给treeNodes
	         }
	     });
	     $.fn.zTree.init($("#menuTree"), setting, treeNodes);
	});

	//加载完数据后打开菜单.
	function zTreeRegisterTarget(event, treeId, treeNode) {
　                    initUI($('#'+treeId));//可直接调用initUI()；但考虑性能则直接找到tree的DOM对象
    }
</script>