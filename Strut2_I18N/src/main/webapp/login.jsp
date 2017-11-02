<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<%-- <meta content="text/html;charset=utf-8"/> --%>
</head>
<body>
	<s:form action="login" method="POST">
		<s:property value="getText('global.username')" />
		<s:textfield key="global.username" name="userName" />
		<br />
		<s:password key="global.password" name="password" />
		<br />
		<s:submit key="global.login" />
	</s:form>
	<s:label value="CurrentDate: "/> <s:date name="curentDate" format="%{getText('global.date.format')}"/><br/>
	Date format 2: 
	<s:text name="global.product.date">
		<s:param value="curentDate"></s:param>
	</s:text><br/>
	Curency: 
	<s:text name="global.product.cost">
		<s:param value="money" ></s:param>
	</s:text>
	<br/>
	<s:a href="changeLanguage?request_locale=en"> 
		English
	</s:a>
	<s:a href="changeLanguage?request_locale=vi"> 
		Tiếng Việt
	</s:a>
	
	<br/>
	Link tham khảo (reference link): https://www.roseindia.net/struts/struts2/struts-2-format.shtml
</body>
</html>
