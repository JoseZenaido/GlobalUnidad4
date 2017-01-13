<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Salary</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="salary">Salary</a></li>
					<li><a href="new-salary">New Salary</a></li>
					<li><a href="all-salaries">All Salaries</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_SALARY'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Salary Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_SALARIES'}">
			<div class="container text-center" id="salariesDiv">
				<h3>My Salaries</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>N° Employee</th>
								<th>Salary</th>
								<th>From Date</th>
								<th>To Date</th>
								<td></td>
								<td></td>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="salarys" items="${salaries}">
								<tr>
									<td>${salarys.emNo}</td>
									<td>${salarys.salary}</td>
									<td>${salarys.fromDate}</td>
									<td>${salarys.toDate}</td>
									<!--  <td><fmt:formatDate pattern="dd-MM-yyyy"
											value="${salary.fromDate}" /></td>
											
								    <td><fmt:formatDate pattern="dd-MM-yyyy"
											value="${salary.toDate}" /></td>-->
											

									 <td><a href="update-salary?emNo=${salary.emNo}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-salary?emNo=${salary.emNo}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Salary</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-salary">
					<input type="hidden" name="emNo" value="${salary.emNo}" />
					<div class="form-group">
					
						<div class="col-sm-7">
							 <label class="control-label col-sm-3">EM NO:</label> 
							<input type="text" class="form-control" name="emNo"
								value="${salary.emNo}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Salary:</label>
							<input type="text" class="form-control" name="salary"
								value="${salary.salary}" />
						</div>
					</div>
						
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">FromDate:</label>
							<input type="text" class="form-control" name="fromDate"
								value="${salary.fromDate}" />
						</div>
					</div>
						
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">To Date:</label>
							<input type="text" class="form-control" name="toDate"
								value="${salary.toDate}" />
						</div>
					</div>
			
					
					<div class="form-group">
						<input type="submit" class="btn btn-prymary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>

</body>
</html>