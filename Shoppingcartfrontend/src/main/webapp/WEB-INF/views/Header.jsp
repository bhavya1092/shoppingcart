<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=windows-1256">
<title>Home page</title>
<!-- adding predefined links of bootstrap -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<style>

 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 60%;
      margin: auto;
      
}
  
body

<h2 style="background-color:green">
</h2>

{
	background-color: powderblue;
}


p 
{
	color: blue;
}

body{
background-image:url("resources/images/b3.jpg");
background-repeat:no-repeat;
background-size:cover;
}

</style>

</head>

<body>
<img src="resources/images/footer_logo.png">
<h4>welcome ${loggedInUser}</h4>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index"></a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
			
			<a class="navbar-brand" href="GAME BOX">GAME BOX</a>
				<li class="active"><a href="Home">Home</a></li>
				
				<li><a href="AboutUs">About Us</a></li>
				<li class="active"><a href="ContactUs">Contact Us</a><li>
				<li><a href="Product">Products</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
				
				<button type="button" class="btn btn-info">
    <span class="glyphicon glyphicon-search"></span> Search
  </button>
					
					<c:when test="${empty loggedInUser}">
						<li><a href="memberShip.obj"><span
								class="glyphicon glyphicon-user"></span> Sign-up</a></li>

						<li><a href="login1"><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
								
					</c:when>
					<c:when test="${not empty loggedInUser}">
						<li><a href="perform_logout"><span
								class="glyphicon glyphicon-log-out"></span>Logout</a></li>
					</c:when>
				</c:choose>
			
			</ul>
		</div>
	</div>
	</nav>
