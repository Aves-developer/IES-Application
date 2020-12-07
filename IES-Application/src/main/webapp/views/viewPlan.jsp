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
<h1>View Plans</h1>
</div>
<div layout:fragment="content" class="container myspace">
<div class="card">
<div class="card card-body">
<table class="table table-hover">
<tr>
<th>SrNo</th>
<th>PLAN NAME</th>
<th>PLAN DESCRIPTION</th>
<th>PLAN_START_DAT</th>
<th>PLAN_END_DATE</th>
<th colspan="2">ACTION</th>
</tr>
<c:forEach items="${listplan }" var="ob">
<tr>
<td>${ob.pid}</td>
<td>${ob.pname }</td>
<td>${ob.pdesc }</td>
<td>${ob.psdate}</td>
<td>${ob.pedate }</td>
<td>
<a href="editPlan?pid=${ob.pid }" class="btn btn-primary">Edit</a>
<a href="deletePlan?pid=${ob.pid }" class="btn btn-danger">Delete</a>
</td>
</tr>
</c:forEach>

</table>
<a href="load" class="btn btn-dark">Back</a>
</div>
</div>
</div>
</body>
</html>