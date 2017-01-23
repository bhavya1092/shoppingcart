<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="perform_login" method="POST">
			<table>
				<tr style="color: blue; font-size: 20pt">
					<td>Email-id:</td>
					<td><input type="email" name="username"
						placeholder="xxx@gmail.com" /></td>
				</tr>
				<tr style="color: blue; font-size: 20pt">
					<td>Password:</td>
					<td><input type="password" name="password" /><br></td>
				</tr>
				<tr>
					<td><input type="submit" value="Sign-in"
						style="color: blue; font-size: 20pt" /></td>
					<td><input type="reset" value="Cancel"
						style="color: red; font-size: 20pt" /></td>
				</tr>
			</table>
		</form>
		
<%@ include file="Footer.jsp"%>