<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
</head>
<body>

<form:form action="saveapp" method="POST" modelAttribute="loadform">
<div class="container">
<div class="card">
<div class="card-body">
<div class="card-header bg-primary text-white">
<h1>Application Register</h1>
</div>
<font color="green">${succMsg}</font>
<font color="red"> ${errMsg}</font>
<div class="row">
<div class="col-3">
<label>FIRST NAME</label>
</div>
<div class="col-4">
<form:hidden path="appNo"/>
<form:input path="fname" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>LAST NAME</label>
</div>
<div class="col-4">
<form:input path="lname" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>Date Of Birth</label>
</div>
<div class="col-4">
<form:input path="dob" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>GENDER</label>
</div>
<div class="col-4">
<form:radiobutton path="gender" value="Male"/> Male <form:radiobutton path="gender" value="Female"/>Female
</div>
</div>

<div class="row">
<div class="col-3">
<label>SSN Number</label>
</div>
<div class="col-4">
<form:input path="ssnNo" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>PHONE NO</label>
</div>
<div class="col-4">
<form:input path="phNo" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>EMAIL</label>
</div>
<div class="col-4">
<form:input path="email" class="form-control"/>
</div>
</div>
<input type="submit" id="register" value="Register" class="btn btn-success">
<a href="getapp" class="btn btn-info">ViewApplicationRegistration</a>
</div>
</div>
</div>

</form:form>
</body>
</html>