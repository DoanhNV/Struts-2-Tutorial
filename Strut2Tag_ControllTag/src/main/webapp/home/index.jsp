<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:bean name="com.comparator.AgeComparator" var="ageComparator" />
</head>
<body>
	<h1>Sort:</h1>
	<s:sort comparator="#ageComparator" source="users">
		<s:iterator>
			<li>UserName: <s:property value="userName" /> Age: <s:property
					value="age" />
			</li>
		</s:iterator>
	</s:sort>
	<h1>Generator:</h1>
	<s:generator separator="|" val="%{'laptop|tao|le|suon xun|Dưa'}" >
		<s:iterator>
			<s:iterator>
				<li><s:property /></li>
			</s:iterator>
		</s:iterator>
	</s:generator>
	<h1>Append Tag</h1>
	<s:append var="listUser">
		<s:param value="list1"/>
		<s:param value="list2"/>
		<s:param value="list3"/>
	</s:append>
	<s:iterator value="listUser">
		<li><s:property value="userName"/>-<s:property value="age"/></li>
	</s:iterator>
	
	
</body>
</html>