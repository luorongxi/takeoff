<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent">
	<s:form action="role_edit" cssClass="pageForm required-validate"
		onsubmit="return validateCallback(this, dialogAjaxDone);"
		namespace="/" method="post">
		<input type="hidden" name="dwz.navTabId" value="jsgl">
		<input type="hidden" name="dwz.callbackType" value="closeCurrent">
		<input type="hidden" name="dwz.forwardUrl" value="">
		<input type="hidden" name="roleInfo.id" value="${roleInfo.id}" />
		<div class="pageFormContent" layoutH="56">
		    <fieldset>
				<legend>角色信息</legend>
				<dl>
					<dt>角&nbsp;&nbsp;色&nbsp;&nbsp;名： </dt>
					<dd><input type="text" name="roleInfo.roleName"
					value="${roleInfo.roleName}" size="20" minlength="2" maxlength="128"
					class="required" /></dd>
				</dl>
				<dl>
					<dt>状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态： </dt>
					<dd><input type="radio" name="roleInfo.status" value="true" <c:if test="${roleInfo.status=='true'}">checked</c:if> /> 可用 
					<input type="radio" name="roleInfo.status" value="false" <c:if test="${roleInfo.status=='false'}">checked</c:if> /> 禁用</dd>
				</dl>
				<dl>
					<dt>备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注： </dt>
					<dd><textarea name="roleInfo.memo" cols="45" rows="4">${roleInfo.memo}</textarea></dd>
				</dl>
				<dl>
				</dl>
				<dl>
				</dl>
			</fieldset>
		</div>
		<div class="formBar">
			<ul>
				<li>
					<div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">提交</button>
						</div>
					</div></li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div></li>
			</ul>
		</div>
	</s:form>
</div>