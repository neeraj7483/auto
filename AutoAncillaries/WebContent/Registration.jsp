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
  html,body
  {
	background-color:#dcedc8;
	height: 100%;
  }
  h2
  {
  text-align:center;
  text-shadow: 2px 2px grey;
  }
  form
  {
  width:50%;
  margin-left:25%;
  }
  .login-button
  {
  width:140px;
  margin-left:40%;
  }
  </style>
</head>
<script>
function validateForm()
{
	
}
</script>
<body>

<div  class="container-fluid login-container" >
<div class="container">
  
  <form name="rgForm" action="UserRegistration.jsp" method="post" onsubmit="return validateForm()">
  <h2>Register</h2>
<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
{%>
<div style="color: red;font-size: 15px;"><%=msg %></div>
<%}
%>
    <div class="form-group">

      <input type="text" class="form-control"  placeholder="Enter Name" name="name" required>
    </div>
	<div class="form-group">

      <input type="email" class="form-control"  placeholder="Enter Email" name="email" required>
    </div>
	<div class="form-group">

      <input type="text" class="form-control"  placeholder="Enter User ID" name="customerId" required>
    </div>
	<div class="form-group">

      <input type="password" class="form-control"  placeholder="Enter Password" name="password" required>
    </div>
    <div class="form-group">

      <input type="password" class="form-control" placeholder="Re-Enter password" name="confirmPassword" required>
    </div>
	<div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Contact Number" name="contactNo" required>
    </div>
	<div class="form-group">

      <input type="text" class="form-control" placeholder="Enter City" name="location" required>
    </div>
	<div class="form-group">
      <input type="text" class="form-control" placeholder="Enter Pincode" name="pincode" required>
    </div>
	<div class="form-group">
      <input type="text" class="form-control" placeholder="Enter State" name="state" title="Enter State" required>
    </div>
	<div class="form-group">
      <input type="text" class="form-control" placeholder="Enter Street Address" name="streetAddress" title="Enter Street Address">
    </div>
	<div class="form-group">
       <select class="form-control" name="role" title="Select role" required>
	   <option value="" disabled selected> Select Role</option>
		<option value="Customer" >Customer</option>
		<option value="Dealer" >Dealer</option>
		</select>
	</div>
    <input type="submit" class="btn btn-default login-button"  value="Register">
  </form>
  
</div>
</div>
</body>
</html>