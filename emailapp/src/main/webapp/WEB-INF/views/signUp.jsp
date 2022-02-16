<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EM | register</title>
</head>
<body>
<fieldset>
		<legend>Sign Up Form</legend>
		<div>
			<form action="./register" method="post">
				<table>
					<tr>
						<th>User Id</th>
						<th>:</th>
						<td><input type="number" name="id" required="required">
						</td>
					</tr>
					<tr>
						<th>User Name</th>
						<th>:</th>
						<td><input type="Text" name="userName" required="required">
						</td>
					</tr>
					<tr>
						<th>User Email</th>
						<th>:</th>
						<td><input type="email" name="email" required="required">
						</td>
					</tr>
					<tr>
						<th>User Password</th>
						<th>:</th>
						<td><input type="password" name="password"
							required="required"></td>
					</tr>
					<tr>
						<td><a href="./login">Login</a></td>
						<th><input type="submit" value="SignUp"></th>
					</tr>
				</table>
				 

			</form>
		</div>
	</fieldset>
</body>
</html>