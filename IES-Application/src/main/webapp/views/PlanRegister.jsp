<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
<div class="card">
<div class="card-header bg-primary text-white">
<h1> Plan Registration</h1>
</div>
<font color="green">${succMsg }</font>
<font color="red">${errMsg }</font>
<form:form action="saveplan" method="POST" modelAttribute="planReg">
<div class="card-body">
<div class="row">
<div class="col-3">
<label>PLAN NAME</label>
</div>
<div class="col-3">
<form:hidden path="pid"/>
<form:input path="pname" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>PLAN DESCRIPTION</label>
</div>
<div class="col-4">
<form:input path="pdesc" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>PLAN START DATE</label>
</div>
<div class="col-4">
<form:input path="psdate" class="form-control"/>
</div>
</div>

<div class="row">
<div class="col-3">
<label>PLAN END DATE</label>
</div>
<div class="col-4">
<form:input path="pedate" class="form-control"/>
</div>
</div>
</div>
<center><input type="submit" id="register" value="Register" class="btn btn-success"></center>
<a href="getAllPlan" class="btn btn-info">View Plan</a>
</form:form>

</div>
</div>

</body>
</html>


