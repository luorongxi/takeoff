<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent" style="padding:5px;">	
	<div layoutH="12" style="float:left; display:block; overflow:auto; width:240px; height:540px; border:solid 1px #CCC; line-height:21px; background:#fff">
	    <ul id="menuTreeList" class="ztree"></ul>
	</div>				
	<div id="jbsxBox" class="unitBox" style="margin-left:246px;">
		<form id="pagerForm" method="post" action="menu_getChildList">
			<%@include file="/WEB-INF/page/admin/pageParam.jsp" %>
		    <input type="hidden" name="parentId" value="${parentId}" />
		</form>
		<div class="pageHeader" style="border:1px #B8D0D6 solid;">
			<form  id="menu_form" onsubmit="return navTabSearch(this);" action="menu_getChildList"
				method="post">
				<input type="hidden" name="parentId" id="parentId" value="${parentId}" />
				<input type="hidden" name="rel" id="rel" value="cdgl" />
				<div class="searchBar">
					<table class="searchContent">
						<tr>
							<td>菜单名：<input type="text" name="sysMenu.name"
							    alt="请输入菜单名" />
							</td>
							<td>
								<div class="buttonActive">
									<div class="buttonContent">
									     <button title="查询" type="submit">查&nbsp;询</button>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
		<div class="pageContent" class="pageContent j-resizeGrid" style="border-left:1px #B8D0D6 solid;border-right:1px #B8D0D6 solid;">
			<div class="panelBar">
				<ul class="toolBar">
				    <c:if test="${parentId!=null&&parentId!=''}">
					<li>
					    <a title="菜单添加" class="add" href="menu_addUI?parentId=${parentId}&&rel=cdgl" target="dialog" mask="true"
						width="420" height="360"><span>添加</span> </a>
					</li>
					<li class="line">line</li>
					</c:if>
					<li>
					   <a title="确实要删除这些记录吗?" target="selectedTodo" postType="string" 
					   href="menu_delete?rel=cdgl" class="delete"><span>批量删除</span></a></li>
					<li>
				</ul>
			</div>
			<table class="table" width="101%" layoutH="124">
				<thead>
					<tr>
					    <th width="3%"><input type="checkbox" group="ids" class="checkboxCtrl"></th>
						<th width="5%">序号</th>
						<th width="15%">菜单名</th>
						<th width="30%">链接路径</th>
						<th width="5%">打开方式</th>
						<th width="8%">是否展开</th>
						<th width="5%">状态</th>
						<th width="5%">排序</th>
						<th width="22%">操作</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator id="pageBean" value="pageBean.list" status="li">
						<tr>
						    <td><input name="ids" value="${id }" type="checkbox"></td>
							<td><s:property value="#li.index+1" />
							</td>
							<td>${name}</td>
							<td>${url}</td>
							<td>${target}</td>
							<td>
							    <c:if test="${open=='true'}">是</c:if> 
								<c:if test="${open=='false'}">否</c:if>
							</td>
							<td>
							    <c:if test="${status==0}">可用</c:if> 
							    <c:if test="${status==1}">禁用</c:if>
							</td>
							<td>${sort }</td>
							<td>
							    <a title="菜单详情" target="dialog" mask="true" width="500"
									height="280" href="menu_view?sysMenu.id=${id}"
									class="btnView">详情</a>
								<a title="菜单编辑" target="dialog" mask="true"
									width="420" height="360"
									href="menu_editUI?sysMenu.id=${id}&&rel=cdgl" class="btnEdit">编辑</a>
								<a title="删除" target="ajaxTodo" method="remove"
									href="menu_delete?sysMenu.id=${id}&&rel=cdgl" class="btnDel">删除</a>
							</td>
						</tr>
					</s:iterator>
					<c:if test="${pageBean.totalCount==0}"><tr><td>暂无数据</td></tr></c:if>
				</tbody>
			</table>
			<%@include file="/WEB-INF/page/admin/pageBar.jsp" %>
		</div>
	</div>
</div>
<script language="javaScript">
	var setting = {
	    data: {
			simpleData: {
			   enable: true
			}
		},
		callback: {
		    onExpand: menuZtreeList
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
	         url: "menu_getMenuList",//请求的action路径
	         error: function () {//请求失败处理函数
	            alert("请求失败!");
	         },
	         success:function(data){ //请求成功后处理函数
	            treeNodes = data;   //把后台封装好的简单Json格式赋给treeNodes
	         }
	     });
	     $.fn.zTree.init($("#menuTreeList"), setting, treeNodes);
	});

	//加载完数据后打开菜单.
	function menuZtreeList(event, treeId, treeNode) {
　                   initUI($('#'+treeId));//可直接调用initUI()；但考虑性能则直接找到tree的DOM对象
    }
    
    //获取子级菜单
    function getChildList(id){
        $("#parentId").val(id);
        $("#menu_form").submit();
    }
</script>