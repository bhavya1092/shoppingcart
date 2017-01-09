<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
<body>

{margin:0px:padding:0px;}
body

{
margin:0px auto;
background-image:url(DSC02776-S.jpg)
background-repeat:no repeat;
background size:100%;


.container {
width:500px;
height:400px;
background-color:#000;
margin:0px auto;
text align-centre;
margin-top:150px;
border-radius:5px;
opacity:.7;

}

input[input="username"][input="password"]{
  width:300px;
  height:45px;
  front-size:17px;
  margin-bottom:20px;padding-left:30px;
  background:#fff;
  border:none;
  
  }
  
  .login{ border:none;
  padding:15px 30px;
  background:#2ecc71;
  border-radius:5px;
  coursor-pointer;
  border-bottom:5px solid #27AE6O;
  margin-bottom:20px;
  
  
  }
  a{color:#fff;}
  
 
 .cancelbtn 
{
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer 
{
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar
{
    width: 40%;
    border-radius: 50%;
}


</style>
<form action="action_page.php">
  <div class="imgcontainer">
    <img src="download.jpg" alt="Avatar" class="avatar">
  </div>
  <div class="container">
    <label><b>Username</b></label>
    <input type="username" placeholder="Enter username" name="uname"requred>
     <label><b>Password</b></label>
    <input type="password" placeholder="Enter password" name="psw"required>
        <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</html>