<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MS | Login</title>
</head>
<body>
<%
		if (err != null && !err.isEmpty()) {
	%>
	<h2 style="color: red">
		<%=err%>
	</h2>
	<%
		}
	%>
	<fieldset>
		<legend>Login Form</legend>
		<div>
			<form action="./login" method="post">
				<table>
					<tr>
						<th> User id</th>
						<th>:</th>
						<td><input type="number" name="id" required="required">
						</td>
					</tr>
					<tr>
						<th>User Password</th>
						<th>:</th>
						<td><input type="password" name="password" required="required">
						</td>
					</tr>
					<tr>
						<td><a href="./signup">register</a></td>
						<td><a href="./forgetpassword">Forgot password</a></td>
						<th><input type="submit" value="Login"></th>
					</tr>
					<tr>
					</tr>
				</table>
			</form>
		</div>
	</fieldset>
</body>
</html>