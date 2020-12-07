<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>

<!-- $(document).ready(function(){
	$("#email").blur(function(){
		$("errMsg").text("");
		 $.ajax({
			 type:"GET",
		     url: "/uniqueMail?email="+$("#email").val(),
		     success:function(data)
		     if(data=="DUPLICATE"){
        $("#errMsg").text("Duplicate email");
			     }
		  });
				
	})
}) -->



</head>
<body>

<div class="container">
<div class="card">
<div class="card-header bg-primary text-white">
<h1>AccountRegistration </h1>
</div>
<div class="card-body">
<div class="row">
<div class="col-6">
<font color="green">${succMsg }</font>
<font color="red">${errMsg }</font>
</div>
</div>
<form:form action="save" method="POST" modelAttribute="accReg">
<div class="row">
<div class="col-4">
<label>FIRST NAME</label>
</div>
<div class="col-4">
<form:hidden path="id" class="form-control"/>
<form:input path="firstName"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>LAST NAME</label>
</div>
<div class="col-4">
<form:hidden path="id"/>
<form:input path="lastName"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>EMAIL</label>
</div>
<div class="col-4">
<form:hidden path="id" />
<form:input path="email"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>PASSWORD</label>
</div>
<div class="col-4">
<form:input path="password"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>GENDER</label>
</div>
<div class="col-4">
 <form:radiobutton path="gender" value="Male"/>Male<form:radiobutton path="gender" value="Female"/>Female
</div>
</div>

<div class="row">
<div class="col-4">
<label>SSN NUMBER</label>
</div>
<div class="col-4">
<form:input path="ssnNo"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>PHONE NUMBER</label>
</div>
<div class="col-4">
<form:input path="phoneNo"  class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-4">
<label>ROLE</label>
</div>
<div class="col-4">
<form:select path="Role"  class="form-control">
<form:option value="">-Select-</form:option>
<form:option value="Admin">Admin</form:option>
<form:option value="Case-Worker">Case-Worker</form:option>
</form:select>
</div>
</div>
 <input type="submit" id="register" value="Register" class="btn btn-success">
<a href="getAll" class="btn btn-primary">View Account Registration</a>
</form:form>
</div>
</div>
</div>
<br>
 
<br>
<a href="load" class="btn btn-primary">Create Plan</a>
<br>
<br>
<a href="loadApp" class="btn btn-primary">Application Registration</a>
<br>
<a href="searchbar" class="btn btn-primary">Create Case</a>
<br>

</body>

</html>