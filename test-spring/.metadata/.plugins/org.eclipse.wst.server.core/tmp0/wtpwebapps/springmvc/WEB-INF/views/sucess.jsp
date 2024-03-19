<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUCESS REGESTRATION</title>
</head>
<body>
<form>

  <h1 align="center">REGESTRATION SUBMIT</h1>

  <hr>
  <h2 align="center">${Header }</h2>
  <p align="center">${Desc }</p>
  
  <h1 style="color: green;">${msg }</h1>
  <hr>
  

<h1>My Name is ${user.username }</h1>
<h1>My Email is ${user.email }</h1>
<h1>My Password- ${user.password }</h1>
</form>
</body>
</html>