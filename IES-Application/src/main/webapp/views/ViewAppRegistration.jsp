<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
<body>
<div class="card-header bg-primary text-white">
<h1>View Applicant Registration</h1>
</div>
<div layout:fragment="content" class="container myspace">
<div class="card">
<div class="card card-body">
<table class="table table-hover">
<thead>
<tr>
<th>APPLICATION NO</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>DATE OF BIRTH</th>
<th>SSN NO</th>
<th colspan="2">ACTION</th>
</tr>
</thead>
<c:forEach items= "${listapp}" var="ob">
<tr>
<td>${ob.appNo }</td>
<td>${ob.fname }</td>
<td>${ob.lname }</td>
<td>${ob.dob }</td>
<td>${ob.ssnNo }</td>
<td>
<a href="editapp?aid=${ob.appNo }" class="btn btn-warning">edit</a>
<a href="searchApp?appNo=${ob.appNo }" class="btn btn-primary">View</a>
<a href="deleteApp?aid=${ob.appNo}" class="btn btn-danger">Delete</a>
</td>

</tr>
</c:forEach>

</table>
<a href="loadApp" class="btn btn-dark">Back</a>
</div>
</div>
</div>
</body>
</html>