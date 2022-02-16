<%@page import="com.te.mail_simulation.bean.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	UserInfo info = (UserInfo) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EM | welcome</title>
</head>
<body>
	<%
		if (info != null) {
	%>
	<h1 style="text-align: center">
		WELCOME 
		<%=info.getUserName()%>
		<%-- <%=info.getId()%> --%>
		<%
			}
		%>

	</h1>
	<h1>click any of the given options</h1>

	<br>
	<br>
	<div>
	<a href="./getmails">sent items</a><br>
	   <a href="./getinbox">inbox</a><br>
		<a href="./delete">Delete mail</a><br> 
		<a href="./mail">Compose Mail</a><br> 
		<a href="./logout">LogOut</a>
	</div>
</body>
</html>