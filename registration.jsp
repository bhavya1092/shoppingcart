<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here</title>
</head>
<body>
<div class="container">
	<form:form  method='post' action="addus" commandName="user">
		<fieldset>
			<legend>Registration Form</legend>
			<div class="control-group">
				<label class="control-label">Username</label>
				<div class="controls">
					<form:input type="text" path="username"></form:input>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Password</label>
				<div class="controls">
					<form:input type="text" path="password"></form:input>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Confirm Password</label>
				<div class="controls">
					<form:input type="text" path="cpassword"></form:input>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Email</label>
				<div class="controls">
					<form:input type="text" path="email"></form:input>
					</div>
				</div>
				<div class="control-group">
				<label class="control-label">Phno</label>
				<div class="controls">
					<form:input type="text" path="phno"></form:input>
					</div>
					</div>
					<div class="control-group">
					<div class="controls">
			<input type="submit" value="Register"/>
					</div>
					</div>
					</fieldset>
				</form:form>
			</div>
		</body>
</html>