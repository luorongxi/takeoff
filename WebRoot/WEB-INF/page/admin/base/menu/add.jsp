<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent">
	<s:form action="menu_add" cssClass="pageForm required-validate"
		onsubmit="return validateCallback(this, dialogAjaxDone);"
		namespace="/" method="post">
		<input type="hidden" name="dwz.navTabId" value="cdgl">
		<input type="hidden" name="dwz.callbackType" value="closeCurrent">
		<input type="hidden" name="dwz.forwardUrl" value="">
		<input type="hidden" name="parentId" value="${parentId}" />
		<div class="pageFormContent" layoutH="68">
		    <fieldset>
				<legend>菜单信息</legend>
				<dl>
					<dt> 菜&nbsp;&nbsp;单&nbsp;&nbsp;名： </dt>
					<dd><input type="text" name="sysMenu.name"
					size="20" minlength="4" maxlength="128"
					class="required" /></dd>
				</dl>
				<dl>
					<dt> 刷新路径： </dt>
					<dd><input type="text" name="sysMenu.rel"
					size="20" minlength="2" maxlength="128"
					class="required alphanumeric"/></dd>
				</dl>
				<dl>
					<dt> 链接路径：</dt>
					<dd><input type="text" name="sysMenu.url"
					size="20" minlength="4" maxlength="256"
					class=""/></dd>
				</dl>
				<dl>
					<dt> 打开方式： </dt>
					<dd><input type="radio" name="sysMenu.target" value="navTab" checked/> 新开窗口&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="sysMenu.target" value="null" /> 不开窗口 </dd>
				</dl>
				<dl>
					<dt> 是否打开： </dt>
					<dd><input type="radio" name="sysMenu.open" value="true" checked /> 是 &nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="sysMenu.open" value="false" /> 否</dd>
				</dl>
				<dl>
					<dt> 状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态：</dt>
					<dd><input type="radio" name="sysMenu.status" value="0" checked /> 可用 
					<input type="radio" name="sysMenu.status" value="1" /> 禁用</dd>
				</dl>
				<dl>
					<dt> 排&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序： </dt>
					<dd><input type="text" name="sysMenu.sort"
					size="20" minlength="1" maxlength="2" class="digits" /></dd>
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