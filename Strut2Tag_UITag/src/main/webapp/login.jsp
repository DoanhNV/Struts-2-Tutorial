<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head />
</head>
<body>
	<s:form action="/admin/register" method="POST">
		<s:textfield name="userName" label="UserName: " />
		<s:password name="password" label="Password: "/>
		<s:checkboxlist name="favorites"  list="{'playGame','Cook','Reading','Coding','Working','Loving'}" label="Favorites: "/>
		<%-- Default Value: value="'Cook'"  --%>
		<s:radio name="gender" list="#{'1':'Male'}" label="Gender: "/>
		<s:radio name="gender" list="#{'2':'Female'}"/>
		<s:radio name="gender" list="#{'4':'Boy','3':'Girl'}"/>
		<s:select name="country" list="#{'VN':'VietNam','US':'USA'}" label="Country: "/>
		<s:combobox name="" list="#{'1':'Doanh','2':'Doanh2','3':'Doanh3'}" />
		<sx:datetimepicker  name="birthOfDate" displayFormat="MM-dd-yyyy"   label="BirthDay"/>
		<!-- Default Value: value="11-05-2017" -->
		<s:submit value="Register"/>
	</s:form>
</body>
</html>