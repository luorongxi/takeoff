<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent">
	<div class="pageFormContent" layoutH="56">
	    <fieldset>
			<legend>角色信息</legend>
			<dl>
				<dt>角&nbsp;&nbsp;色&nbsp;&nbsp;名：</dt>
				<dd>${roleInfo.roleName}</dd>
			</dl>
			<dl>
				<dt>状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态： </dt>
				<dd style="display: block; margin-top: 5px;">
				    <c:if test="${roleInfo.status=='true'}">
					<font color="blue">可用</font>
					</c:if>
					<c:if test="${roleInfo.status=='false'}">
						<font color="red">禁用</font>
					</c:if>
				</dd>
			</dl>
			<div class="divider"></div>
			<dl>
				<dt>创建时间：</dt>
				<dd><fmt:formatDate value="${roleInfo.addTime}"
	                 pattern="yyyy-MM-dd HH:mm:ss" /></dd>
			</dl>
			<dl>
				<dt>修改时间：</dt>
				<dd><fmt:formatDate value="${roleInfo.upTime}"
	                 pattern="yyyy-MM-dd HH:mm:ss" /></dd>
			</dl>
			<dl>
				<dt>备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注： </dt>
				<dd>${roleInfo.memo}</dd>
			</dl>
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