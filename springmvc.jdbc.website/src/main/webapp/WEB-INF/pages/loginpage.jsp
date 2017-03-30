<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<div>
Login
<form:form action="${pageContext.request.contextPath}/login" method="post" modelAttribute ="user"><br>
UserName <input type = "text" title="Please enter User Name" placeholder="Enter Username" name="Username" /><br><br>
Password <input type = "password" title="Please enter Password" placeholder="Enter Your Password" name="Password" /><br><br>
<div>
<form:errors path="Username" cssStyle="color:red"/>
</div>
<button type="submit" class="btn">Login</button> 
</form:form>
</div>      
</body>
</html>
