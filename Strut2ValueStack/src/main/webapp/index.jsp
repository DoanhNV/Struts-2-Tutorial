<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.login-table{
		border: solid 1px green;
	}
	.login-submit-tr{
		text-align: center;
	}
</style>
</head>
<body>
	<s:form action="login" method="POST">
		<table class="login-table">
			<tr>
				<td>UserName:</td>
				<td><s:textfield name="user.userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><s:password  name="user.password"/></td>
			</tr>
			<tr>
				<td>id:</td>
				<td><s:textfield name="id" /></td>
			</tr>
			<tr class="login-submit-tr">
				<td colspan="2"><s:submit value="login" /> </td>
			</tr>
		</table>
	</s:form>
</body>
</html>