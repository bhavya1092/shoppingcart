<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 60%;
      margin: auto;
      
}
  
body
{
	background-color: powderblue;
}

h1
{
	color: red;
}

p 
{
	color: blue;
}

</style>
</head>
<body>
	<h1>Gaming zone!!!</h1>
	<p>Shop with a smile</p>
    <nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Gaming zone</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li class="active"><a href="AboutUs">About Us</a></li>
			<li class="active"><a href="ContactUs">Contact Us</a><li>
			</li>
			</ul>
			
			 <ul class="nav navbar-nav navbar-right">
      <li><a href="registration"><span class="glyphicon glyphicon-user"></span> registration</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> login</a></li>
    </ul>
		<form class="navbar-form navbar-right">
          <div class="input-group">
        <input type="text" class="form-control" placeholder = "Search">
        <div class="input-group-btn">
          <button class="btn btn-default" type= "submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
	 </form>
	</div>
	</nav>
	
 <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
     
     </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/Tulips.jpg" alt="Tulips" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/Chrysanthemum.jpg" alt="Chrysanthemum" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/Hydrangeas.jpg" alt="Hydrangeas" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/Jellyfish.jpg" alt="Jellyfish" width="460" height="345">
      </div>
      
      <div class="item">
      <img src="resources/images/Koala.jpg" alt="Koala" width="460" height="345">
      </div>
      
      <div class="item">
        <img src="resources/images/Lighthouse.jpg" alt="Lighthouse" width="460" height="345">
      </div>
      
      <div class="item">
        <img src="resources/images/Penguins.jpg" alt="Penguins" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</body>
</html>