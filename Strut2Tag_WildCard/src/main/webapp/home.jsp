<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:url var="url" action="home/login/123" />
	<s:a href="%{#url}">URL</s:a>
	<s:a namespace="/" href="/home/login/123">Test5</s:a>
	<s:a href="/home/login/123">Login</s:a>
	<s:a action="home/login/123">Login3</s:a>
	<br />
	<a href="/<s:property value="#application.domain" />/home/login/123">Solution</a>
	<br/>
	<a href="/Strut2Tag_WildCard/home/login/123">Login1</a>
	<s:form action="/home/login/123">
		<s:submit value="Login2" />
	</s:form>
</body>
</html>