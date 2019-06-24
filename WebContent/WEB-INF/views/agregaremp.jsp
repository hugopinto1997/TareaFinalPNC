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
<title>Agregar Sucursal</title>
</head>
<body style="background-color:#f6f6f6f6;">

<div class="container" style="width: 100%; background-size: 100% 100%; background-repeat: no-repeat; background-image: url('resources/vps.jpg');">
  <div class="jumbotron" style="background-color: #00000070;">
    <h1 style="background-color:#00000000; color:#ffffff90; font-weight:bold;">Agregar Empleado </h1>      
    <p style="background-color:#00000000; color:#ffffff90; font-size:24px; font-weight:bold;">Edite los campos siguientes</p>  
  </div>    
</div>

   <div class="main container" style="margin-top:25px;">
   <form:form action="${pageContext.request.contextPath}/saveemp" method="POST" modelAttribute="e">
	<form:input type="hidden" name="fdsasdf" value="${e.idSucursal }"  path="idSucursal" />	
		 		<div style="display:flex;">
		 			<div style="flex: 50%;">
		 			<div class="input-group input-group-lg">
		 			  <span class="input-group-addon" id="sizing-addon1">Nombre</span>
		 		
		 			<form:input style="width: 90%; border-width:1px; border-color:#000;" type="text" class="form-control"
		 			 path="eNombre"
		 			 placeholder="Nombre" aria-describedby="sizing-addon1" />
		 			 <br><br><br><form:errors path="eNombre" cssStyle="color:#000;"></form:errors><br>
		 			 
				</div>
				<br>
				<div class="input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Edad</span>
				 
				  <form:input style="border-width:1px; border-color:#000; width:90%;" 
				  type="number" class="form-control" path="eEdad" placeholder="Edad" aria-describedby="sizing-addon1" />
				  <br> <br> <br><form:errors path="eEdad" cssStyle="color:#000;"></form:errors><br>
				  
				</div>
					<br>
		 			</div>
		 			<div style="flex:50%;">
		 			
		 			
		 		<div style="width:100%;" class="input-group input-group-lg">
		 					 					 			  <span class="input-group-addon" id="sizing-addon1">Estado</span>
		 		
		 		 <form:select class="browser-default custom-select" name="seleccion" path="eEstado" style="width:90%; color: #fff; background: #424ABC; font-size: 20px; height: 50px; border-color: #000; border-width: 2px;">
                
                                <option selected value="Activo">Activo</option>
                                <option value="Inactivo">Inactivo</option>   
                             
                              </form:select>
				</div>
				<br>
				<div class="input-group input-group-lg">
				  		 			  <span class="input-group-addon" id="sizing-addon1">Género</span>
				  
				  <form:select class="browser-default custom-select" path="eGenero" name="seleccion" style="width:90%; color: #fff; background: #424ABC; font-size: 20px; height: 50px; border-color: #000; border-width: 2px;">
                                <option selected value="Masculino">Masculino</option>
                                <option value="Femenino">Femenino</option>
                              </form:select>
				</div>
				<br>
				
		 			</div>
		 		
		 		
		 		</div>
		 		
				<br>
				<center><button style="width:50%;" class="btn btn-lg btn-primary btn-block btn-signin" id="IngresoLog" type="submit">Guardar</button>
		 		</center>
		 	</form:form>
   </div>
   
		 
</body>
</html>