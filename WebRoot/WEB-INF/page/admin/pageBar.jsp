<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="panelBar">
	<div class="pages">
		<span>显示</span>
		<s:select theme="simple" cssClass="combox"
			list="{5,15,20,30,50,100,200}" name="numPerPage"
			value="%{numPerPage}"
			onchange="navTabPageBreak({numPerPage:this.value})"></s:select>
		<span> 条,共${pageBean.totalCount}条, 共<s:property
				value="pageBean.totalPage" />页, 当前第<s:property
				value="pageBean.currentPage" />页 </span>
	</div>
	<div class="pagination" targetType="navTab"
		totalCount="${pageBean.totalCount}" numPerPage="${numPerPage}"
		pageNumShown="${pageBean.numPerPage}"
		currentPage="${pageBean.currentPage}"></div>
</div>