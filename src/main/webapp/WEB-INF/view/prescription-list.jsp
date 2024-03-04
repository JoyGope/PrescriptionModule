<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">CMED HEALTH</h1>
<div align="center">

<form action="addprescription">
<input type="submit" value="Create prescription">

</form>

<table border="2">
<thead>
<tr>
<td>name</td>
<td>age</td>
<td>gender</td>
<td>diagnosis</td>
<td>medicines</td>
</tr>
</thead>


<c:forEach var="prescription" items="${pres}">
<tr>
<td>${prescription.name}</td>
<td>${prescription.age}</td>
<td>${prescription.gender}</td>
<td>${prescription.diagnosis}</td>
<td>${prescription.medicines}</td>
</tr>

<br/>
</c:forEach>

</table>
</div>

</body>
</html>