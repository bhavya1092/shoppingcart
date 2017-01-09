<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here</title>
<style>


<h2 style"background-color":rgb(226, 51, 252)">
Background  color set by using  rgb(226 ,51 ,252)
</h2>

input [type=username], [type=password] ,[type=confirm password], [type=email],[type=First name],[type=Last name]

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
</style>
</head>
<body>
<div class="container">
	<form class="form-centre" id="registration" method='post' action='register.php'>
		<fieldset>
			<legend>Registration Form</legend>
			<div class="control-group">
				<label class="control-label">Username</label>
				<div class="controls">
					<input type="text" id="user_name" name="user_name">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Password</label>
				<div class="controls">
					<input type="text" id="password" name="password1">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Confirm Password</label>
				<div class="controls">
					<input type="text" id="confirmpassword" name="password2">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Email</label>
				<div class="controls">
					<input type="text" id="email" name="email">
				</div>
				</div>
			<div class="control-group">
				<label class="control-label">First name</label>
				<div class="controls">
				<input type="text" id="Firstname" name="Firstname">
				</div>
			</div>
		   </div>
		   <div class="control-group">
		  <label class="control-label">Last name</label>
		  <div class="controls">
		  <input type="text" id="Lastname" name="Lastname">
		  </div>
		  <ul class="nav navbar-nav">
		  </ul>
		  
      <li class="active"><a href="#"></a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Gender">Gender<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Male">Male</a></li>
          <li><a href="Female">Female</a></li>
          </ul>
			<div class="control-group">
				<label class="control-label"></label>
				<div class="controls">
					<button type="submit" class="btn btn-success" >Submit</button>
				</div>
			</div>
		</fieldset>
	</form>
</div>
</body>
</html>