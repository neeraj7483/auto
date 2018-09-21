<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="address" class="com.service.model.Address" />
	<jsp:setProperty property="streetAddress" name="address" />
	<jsp:setProperty property="state" name="address" />
	<jsp:setProperty property="pincode" name="address" />

	<%
String role=request.getParameter("role");
if(role.equals("Customer"))
{%>
	<jsp:useBean id="customer" class="com.service.model.Customer" />
	<jsp:setProperty property="customerId" name="customer"/>
	<jsp:setProperty property="name" name="customer"/>
	<jsp:setProperty property="email" name="customer"/>
	<jsp:setProperty property="password" name="customer"/>
	<jsp:setProperty property="location" name="customer"/>
	<jsp:setProperty property="contactNo" name="customer"/>
<%
customer.setAddress(address);
request.setAttribute("customer",customer);
System.out.println(customer);
request.getRequestDispatcher("Registration").forward(request,response);
}
else
{System.out.println("dealer");
	
%>
	<jsp:useBean id="dealer" class="com.service.model.Dealer"/>
	<jsp:setProperty property="dealerId" value='<%=request.getParameter("customerId")%>' name="dealer"/>
	<jsp:setProperty property="name" name="dealer"/>
	<jsp:setProperty property="email" name="dealer"/>
	<jsp:setProperty property="password" name="dealer"/>
	<jsp:setProperty property="location" name="dealer"/>
	<jsp:setProperty property="contactNo" name="dealer"/>
<%
dealer.setAddress(address);
request.setAttribute("dealer",dealer);
request.getRequestDispatcher("Registration").forward(request,response);
}
%>


</body>
</html>