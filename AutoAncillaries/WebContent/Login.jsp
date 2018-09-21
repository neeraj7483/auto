<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body
  {
	background-color:#dcedc8;
  }
  h2
  {
  text-align:center;
  text-shadow: 2px 2px grey;
  }
  form
  {
  padding:2%;
  width:50%;
  margin-left:25%;
  top:20%;
  border-style: solid;
  border-width: 2px;
  border-color: lightgrey; 
  }
  .login-button
  {
  width:140px;
  margin-left:36%;
  }
  .reg-info
  {
  color: grey;
  font-size: 15px;
  }
  </style>
</head>
<% 
String msg1=(String)request.getAttribute("msg");
if(msg1!=null)
{
%>
<script>
var=<%=msg1%>;
alert(msg1);
</script>
<%} %>
<body>
<div  class="container-fluid login-container" >
<div class="container">
  
  <form action="Login" method="post">
  <div class="reg-info">
  Not have a Account?<br>
  <a href="Registration.jsp">Register Here</a>
  </div>
  <h2>Login</h2>
    <div class="form-group">
      <label >User ID : </label>
      <input type="text" class="form-control"  placeholder="Enter User ID" name="userId">
    </div>
    <div class="form-group">
      <label >Password : </label>
      <input type="password" class="form-control"  placeholder="Enter password" name="password">
    </div>
    <input type="submit" class="btn btn-default login-button"  value="Login">
  </form>
</div>
</div>
</body>
</html>