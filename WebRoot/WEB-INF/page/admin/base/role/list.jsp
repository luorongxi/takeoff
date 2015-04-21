<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<form id="pagerForm" method="post" action="role_list">
	<%@include file="/WEB-INF/page/admin/pageParam.jsp" %>
</form>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="role_list"
		method="post">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>角色名：<input type="text" name="roleInfo.roleName" alt="请输入角色名" />
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
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
		    <li>
			    <a title="角色添加" class="add" href="role_addUI?rel=jsgl"
				target="dialog" mask="true" width="450" height="280"><span>添加</span></a>
			</li>
			<li class="line">line</li>
			<li>
			   <a title="确实要删除这些记录吗?" target="selectedTodo" postType="string" 
			   href="role_delete?rel=jsgl" class="delete"><span>批量删除</span></a></li>
			<li>
		</ul>
	</div>
	<table class="table" width="101%" layoutH="114">
		<thead>
			<tr>
			    <th width="2%"><input type="checkbox" group="ids" class="checkboxCtrl"></th>
				<th width="8%">序号</th>
				<th width="20%">角色名</th>
				<th width="20%">状态</th>
				<th width="20%">创建时间</th>
				<th width="25%">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator id="pageBean" value="pageBean.list" status="li">
				<tr>
				    <td><input name="ids" value="${id }" type="checkbox"></td>
					<td><s:property value="#li.index+1" />
					</td>
					<td>${roleName}</td>
					<td>
					    <c:if test="${status=='true'}">可用</c:if>
					    <c:if test="${status=='false'}">禁用</c:if>
					</td>
					<td><fmt:formatDate value="${addTime}"
							pattern="yyyy-MM-dd HH:mm:ss" />
					</td>
					<td>
					    <a title="设置权限" target="dialog" mask="true" width="480" height="300"
						    href="role_setUI?roleInfo.id=${id}" class="btnSelect">设置权限</a>
						<a title="角色详情" target="dialog" mask="true" width="420" height="300"
						    href="role_view?roleInfo.id=${id}" class="btnView">详情</a>
					    <a title="角色编辑" target="dialog" mask="true" width="450" height="280"
							href="role_editUI?roleInfo.id=${id}&&rel=jsgl" class="btnEdit">编辑</a>
						<a title="删除" target="ajaxTodo" method="remove"
							href="role_delete?roleInfo.id=${id}&&rel=jsgl" class="btnDel">删除</a>
					</td>
				</tr>
			</s:iterator>
			<c:if test="${pageBean.totalCount==0}">
				<tr>
					<td>暂无数据</td>
				</tr>
			</c:if>
		</tbody>
	</table>
	<%@include file="/WEB-INF/page/admin/pageBar.jsp" %>
</div>
