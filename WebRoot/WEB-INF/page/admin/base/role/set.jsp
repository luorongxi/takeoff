<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="pageContent">
	<s:form action="role_setPrivilege" cssClass="pageForm required-validate"
		onsubmit="return validateCallback(this, dialogAjaxDone);"
		namespace="/" method="post">
		<input type="hidden" name="dwz.navTabId" value="jsgl">
		<input type="hidden" name="dwz.callbackType" value="closeCurrent">
		<input type="hidden" name="dwz.forwardUrl" value="">
		<input type="hidden" name="roleRight.roleId" value="${roleInfo.id}" />
		<div class="pageFormContent" layoutH="56">
		    <fieldset>
				<legend>角色信息</legend>
				<dl>
					<dt>角&nbsp;&nbsp;色&nbsp;&nbsp;名： </dt>
					<dd><input type="text" name="roleInfo.roleName" 
					value="${roleInfo.roleName}" disabled="disabled"/></dd>
				</dl>
			</fieldset>
			<fieldset>
				<legend>权限设置</legend>
				<span id="checkMenuAll">
				<div class="unit">
					<input type="checkbox" id="menuPrivilege" /> 全选
				</div>
				<div class="unit">
					<c:forEach var="sysMenu" items="${menuListAll}">
					    <c:if test="${sysMenu.check=='true'}"><input type="checkbox" name="menuIds" checked="checked" value="${sysMenu.id }"/> </c:if>
					    <c:if test="${sysMenu.check!='true'}"><input type="checkbox" name="menuIds" value="${sysMenu.id }"/></c:if>
					    ${sysMenu.name }&nbsp;&nbsp;&nbsp;&nbsp;
					</c:forEach>
				</div>
				</span>
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
<script language="javaScript">
    //权限全选或全不选
    $("#menuPrivilege").click(function(){    
	    if(this.checked){    
	        $("#checkMenuAll :checkbox").attr("checked", true);   
	    }else{    
	        $("#checkMenuAll :checkbox").attr("checked", false); 
	    }    
	});
</script>