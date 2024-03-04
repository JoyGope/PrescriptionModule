<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Prescription</h1>

<form:form action="save-prescription" modelAttribute="prescription" method="GET">

<label>Name : </label> 
<form:input path="name"/>
<br/>

<label>Age : </label> 
<form:input path="age"/>
<br/>

<label>Diagnosis : </label> 
<form:input path="diagnosis"/>
<br/>

<label>Medicines : </label> 
<form:input path="medicines"/>
<br/>

<label for="gender">Gender:</label>
        <form:select path="gender">
            <form:option value="Male" label="Male" />
            <form:option value="Female" label="Female" />
            <form:option value="Other" label="Other" />
        </form:select>
 <br/>
 







<input type="submit" value="submit">


</form:form>
</div>


</body>
</html>