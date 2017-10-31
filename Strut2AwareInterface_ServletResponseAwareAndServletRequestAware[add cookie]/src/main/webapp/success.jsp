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
	UserName: <s:property value="#cookie.cookie_username.value"/><br/>
	Password: <s:property value="#session.cookie_password.value"/><br/>
	UserName2: <s:property value="cookie.cookie_username.value"/><br/>
	Password2: <s:property value="session.cookie_password.value"/><br/>
	UserName3: ${cookie.cookie_username.value}  <br/>
	Password3: ${cookie.cookie_password.value}<br/>
	<% 
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies ){
			out.println("cookie: "+ cookie.getName() + " - " + cookie.getValue() + "<br/>");
		}
	%><br/>
	
</body>
</html>