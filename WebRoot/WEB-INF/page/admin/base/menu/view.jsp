<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent">
	<div class="pageFormContent" layoutH="68">
	    <fieldset>
			<legend>菜单信息</legend>
		    <table>
				<tr height="38">
					<td width="80" style="padding-left:5px;line-height: 24px">
						 菜&nbsp;&nbsp;单&nbsp;&nbsp;名：
					</td>
					<td width="180" style="line-height: 24px">
						${sysMenu.name}
					</td>
					<td width="80" style="padding-left:5px;line-height: 24px">
						 刷新路径：
					</td>
					<td style="line-height: 24px">
						${sysMenu.rel}
					</td>
				</tr>
				<tr height="38">
					<td width="80" style="padding-left:5px;line-height: 24px">
						 链接路径： 
					</td>
					<td width="180" style="line-height: 24px">
						${sysMenu.url}
					</td>
					<td width="80" style="padding-left:5px;line-height: 24px">
						 打开方式：
					</td>
					<td style="line-height: 24px">
						<c:if test="${sysMenu.target=='null'}">
						<font color="red">不开窗口</font>
						</c:if>
						<c:if test="${sysMenu.target=='navTab'}">
							<font color="blue">新开窗口</font>
						</c:if>
					</td>
				</tr>
				<tr height="38">
					<td width="80" style="padding-left:5px;line-height: 24px">
						 是否打开： 
					</td>
					<td width="180" style="line-height: 24px">
						<c:if test="${sysMenu.open=='true'}">
							<font color="blue">是</font>&nbsp;&nbsp;&nbsp;&nbsp;
						</c:if> <c:if test="${sysMenu.open=='false'}">
							<font color="red">否</font>
						</c:if>
					</td>
					<td width="80" style="padding-left:5px;line-height: 24px">
						 状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态： 
					</td>
					<td style="line-height: 24px">
						<c:if test="${sysMenu.status==0}">
						<font color="blue">可用</font>
						</c:if>
						<c:if test="${sysMenu.status==1}">
							<font color="red">禁用</font>
						</c:if>
					</td>
				</tr>
				<tr>
				    <td width="80" style="padding-left:5px;line-height: 24px">
						 排&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序：
					</td>
					<td style="line-height: 24px">
						${sysMenu.sort}
					</td>
				</tr>
			</table>
		</fieldset>
	</div>
	<div class="formBar">
		<ul>
			<li>
				<div class="button">
					<div class="buttonContent">
						<button type="button" class="close">关闭</button>
					</div>
				</div></li>
		</ul>
	</div>
</div>