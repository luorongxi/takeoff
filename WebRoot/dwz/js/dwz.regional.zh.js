/**
 * @author ZhangHuihua@msn.com
 */
(function($){
	// jQuery validate
	$.extend($.validator.messages, {
		required: "必填项",
		remote: "请修正该选项",
		email: "电子邮箱格式不正确",
		url: "网址格式不正确",
		date: "日期格式不正确",
		dateISO: "日期 (ISO)格式不正确",
		number: "请输入数字",
		digits: "请输入整数",
		creditcard: "信用卡号格式不正确",
		equalTo: "两次输入内容不一致",
		accept: "请输入拥有正确后缀名的字符串",
		maxlength: $.validator.format("长度最多是 {0}"),
		minlength: $.validator.format("长度最少是 {0}"),
		rangelength: $.validator.format("长度介于 {0} 和 {1} 之间"),
		range: $.validator.format("请输入一个介于 {0} 和 {1} 之间的值"),
		max: $.validator.format("请输入一个最大为 {0} 的值"),
		min: $.validator.format("请输入一个最小为 {0} 的值"),
		alphanumeric: "请输入字母、数字、下划线",
		lettersonly: "必须是字母",
		phone: "数字、空格、括号"
	});
	
	// DWZ regional
	$.setRegional("datepicker", {
		dayNames: ['日', '一', '二', '三', '四', '五', '六'],
		monthNames: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月']
	});
	$.setRegional("alertMsg", {
		title:{error:"错误", info:"提示", warn:"警告", correct:"成功", confirm:"确认提示"},
		butMsg:{ok:"确定", yes:"是", no:"否", cancel:"取消"}
	});
})(jQuery);