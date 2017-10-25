<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<s:form action="login" method="POST">
		<s:textfield name="userName" label="UserName: " />
		<s:password name="password" label="Password: " />
		<s:submit validate="true" value="Login" id="btnLogin" />
	</s:form>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#btnLogin").click(function() {
				$.ajax({
					url : "login.action",
					data : {
						userName : $("input[name='userName']").val(),
						password : $("input[name='password']").val(),
					},
					dataType : "json",
					type : "POST",
					async : false
				}).done(function(response) {
					var userName = response.userName;
					var password = response.password;
					alert("done");
				}).fail(function(error){
					alert(error.userName);
				})
			});
		});
	</script>
</body>
</html>