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
<div class=layout:fragment="content" class="container myspace">
<div class="card">
<div class="card card-body">
<div class="card-header bg-primary text-white">
<h1>Create Case</h1>
</div>
 <table class="table table-hover"> 
 <h1><font color="red">${msg }</font></h1>
<tr> <th>APPLICATION ID</th> <td> ${ar.appNo } </td> </tr>
<tr> <th>NAME</th><td>${ar.fname } ${ar.lname } </td></tr>
<tr> <th>DATE OF BIRTH</th> <td>${ar.dob }</td> </tr>
<tr> <th>GENDER</th><td>${ar.gender }</td></tr>
<tr> <th>SSN NO</th><td>${ar.ssnNo }</td></tr>
<tr> <th>PHONE NO</th><td>${ar.phNo }</td></tr>
<tr> <th>EMAIL</th><td>${ar.email }</td> </tr>

</table>
<a href="searchbar" class="btn btn-primary">back</a>
</div>
</div>
</div>

</body>


</html>