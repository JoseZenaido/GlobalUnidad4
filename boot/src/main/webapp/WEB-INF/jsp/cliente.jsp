<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Cliente</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="cliente">Cliente</a></li>
					<li><a href="new-cliente">New Cliente</a></li>
					<li><a href="all-clientes">All Clientes</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_CLIENTE'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Cliente Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_CLIENTES'}">
			<div class="container text-center" id="tasksDiv">
				<h3>My Clientes</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>rfc</th>
								<th>nombre</th>
								<th>calle</th>
								<th>colonia</th>
								<th>localidad</th>
								<th>telefono</th>
								<th>correo</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="cliente" items="${clientes}">
								<tr>
									<td>${cliente.id}</td>
									<td>${cliente.rfc}</td>
									<td>${cliente.nombre}</td>
									<td>${cliente.calle}</td>
									<td>${cliente.colonia}</td>
									<td>${cliente.localidad}</td>
									<td>${cliente.telefono}</td>
									<td>${cliente.correo}</td>
									
									
									
									<td><a href="update-cliente?id=${cliente.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-cliente?id=${cliente.id}"> <span
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
				<h3>Manage </h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-cliente">
					<input type="hidden" name="id" value="${cliente.id}" />
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">RFC:</label>
							<input type="text" class="form-control" name="rfc"
								value="${cliente.rfc}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Nombre:</label>
							<input type="text" class="form-control" name="nombre"
								value="${cliente.nombre}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">calle:</label>
							<input type="text" class="form-control" name="calle"
								value="${cliente.calle}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">colonia:</label>
							<input type="text" class="form-control" name="colonia"
								value="${cliente.colonia}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Localidad:</label>
							<input type="text" class="form-control" name="localidad"
								value="${cliente.localidad}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Telefono:</label>
							<input type="text" class="form-control" name="telefono"
								value="${cliente.telefono}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Correo:</label>
							<input type="text" class="form-control" name="correo"
								value="${cliente.correo}" />
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