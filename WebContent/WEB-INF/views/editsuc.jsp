<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" href="resources/css/formas.css">
			<!-- vinculo a bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<title>Editar Sucursal</title>
</head>
<body style="background-color:#f6f6f6f6;">

<div class="container" style="width: 100%; background-size: 100% 100%; background-repeat: no-repeat; background-image: url('resources/vps.jpg');">
  <div class="jumbotron" style="background-color: #00000070;">
    <h1 style="background-color:#00000000; color:#ffffff90; font-weight:bold;">Editar Sucursal</h1>      
    <p style="background-color:#00000000; color:#ffffff90; font-size:24px; font-weight:bold;">Edite los campos siguientes</p>  
  </div>    
</div>

   <div class="main container" style="margin-top:25px;">
   <form:form action="${pageContext.request.contextPath}/guardareditsuc" method="POST" modelAttribute="nsuc1">
	<form:input type="hidden" name="IdSucursal"  path="idSucursal" value="${nsuc.idSucursal}" />	
		 		<div style="display:flex;">
		 			<div style="flex: 50%;">
		 			<div class="input-group input-group-lg">
		 			  <span class="input-group-addon" id="sizing-addon1">Nombre Sucursal</span>
		 		
		 			<form:input style="width: 100%; border-width:1px; border-color:#000;" type="text" class="form-control"
		 			 path="sucNombre" value="${nsuc.sucNombre}" name="SucNombre"
		 			 placeholder="Nombre" aria-describedby="sizing-addon1" />
					<form:errors path="sucNombre" cssStyle="color:#000;"></form:errors><br>
			
				</div>
				<br>
				<div class="input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Gerente Sucursal</span>
				 
				  <form:input style="border-width:1px; border-color:#000; width:100%;" 
				  value="${nsuc.sucGerente}" name="SucGerente"
				  type="text" class="form-control" path="sucGerente" placeholder="Gerente" aria-describedby="sizing-addon1" />
				<form:errors path="sucGerente" cssStyle="color:#000;"></form:errors><br>
			
				</div>
					<br>
				<div class="width:90%; input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Número de mesas</span>
				  
				  <form:input style="width: 100%; border-width:1px; border-color:#000;" 
				  value="${nsuc.nMesas}" name="SucNmeas"
				  type="number" class="form-control" path="nMesas" placeholder="Número de mesas" aria-describedby="sizing-addon1" />
				<form:errors path="nMesas" cssStyle="color:#000;"></form:errors><br>
			
				</div>
		 			</div>
		 			<div style="flex:50%;">
		 			
		 			
		 			<div style="width:100%;" class="input-group input-group-lg">
		 					 					 			  <span class="input-group-addon" id="sizing-addon1">Horario de Entrada</span>
		 			
		 			<form:input style="border-width:1px; border-color:#000;" type="time" class="form-control"
		 			 path="hEntrada" value="${nsuc.hEntrada}" name="HEntrada"
		 			 placeholder="Hora Entrada" aria-describedby="sizing-addon1" />
		 			<form:errors path="hEntrada" cssStyle="color:#000;"></form:errors><br>
		 	
				</div>
				<br>
				<div class="input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Hora de la Clausura</span>
				  
				  <form:input style="border-width:1px; border-color:#000;" 
				  value="${nsuc.hSalida}" name="HSalida"
				  type="time" class="form-control" path="hSalida" placeholder="Hora Salida" aria-describedby="sizing-addon1" />
				<form:errors path="hSalida" cssStyle="color:#000;"></form:errors><br>
			
				</div>
				<br>
				<div class="input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Ubicación</span>
				  
				  <form:input style="border-width:1px; border-color:#000;" 
				  value="${nsuc.sucUbicacion}" name="SucUbicacion"
				  type="text" class="form-control" path="sucUbicacion" placeholder="Ubicación" aria-describedby="sizing-addon1" />
				<form:errors path="sucUbicacion" cssStyle="color:#000;"></form:errors><br>
			
				</div>
		 			</div>
		 		
		 		
		 		</div>
		 		
				<br>
				<center><button style="width:50%;" class="btn btn-lg btn-primary btn-block btn-signin" id="IngresoLog" type="submit">Guardar</button>
		 		</center>
		 	</form:form>
   </div>
   
		 
</body>
</html>