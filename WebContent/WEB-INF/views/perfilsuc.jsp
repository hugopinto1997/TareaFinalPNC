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
<title>Sucursales</title>
</head>
<body style="background-color:#f6f6f6f6;">

<div class="container" style="width: 100%; background-size: 100% 100%; background-repeat: no-repeat; background-image: url('resources/vps.jpg');">
  <div class="jumbotron" style="background-color: #00000070;">
    <h1 style="background-color:#00000000; color:#ffffff90; font-weight:bold;">${ s.sucNombre }</h1>      
    <p style="background-color:#00000000; color:#ffffff90; font-size:24px; font-weight:bold;">Gerente: ${ s.sucGerente }</p>  
  </div>    
</div>
<div style="color:#fff; position:absolute; right:0; top:0; margin:40px;">
<p>Desea editar esta Sucursal?</p>
<form:form action="${pageContext.request.contextPath}/editperfil" method="POST">
  			<input type="hidden" name="ide"  value=${s.idSucursal}>		 				
		 	<button class="btn btn-lg btn-primary btn-block btn-signin" 
		 	style="width: 100%;" id="nuevaSuc" type="submit">Editar ${ s.sucNombre }</button>
		 	
		 	</form:form>
		 	<br>
		 	<p>Regresar a todas las sucursales</p>
<form:form action="${pageContext.request.contextPath}/backhome" method="POST">
  			<input type="hidden" name="flag"  value=${s.idSucursal}>		 				
		 	<button class="btn btn-lg btn-danger btn-block btn-signin" 
		 	style="width: 100%;" id="nuevaSuc" type="submit">Lista de Sucursales</button>
		 	
		 	</form:form>
</div>
   <div class="main" style="display: flex; border-radius:25px; background-color: #19386b; margin-top:25px; margin-left:150px; margin-right:150px;">
   
   <div style="flex: 50%;  text-align:center;">
	 <p style="padding-left:25px; background-color:#00000050; padding-top:10px; color:#fff; font-size:36px; font-weight:bold;">Ubicación</p>
	 	 <p style="padding-left:25px; padding-top:10px; color:#fff; font-size:24px; font-weight:bold;">${ s.sucUbicacion }</p>
	
	 <p style="padding-left:25px; padding-top:10px; background-color:#00000050; color:#fff; font-size:36px; font-weight:bold;"># Mesas</p>
		 <p style="padding-left:25px; padding-top:10px; color:#fff; font-size:24px; font-weight:bold;">${ s.nMesas }</p>
	
	</div>
   
	<div style="flex: 50%; norder-radius:25px;">
		<p style="text-align:center; background-color:#00000050; padding-left:25px; padding-top:10px; color:#fff; font-size:36px; font-weight:bold;">Horarios</p>
		<div style="display: flex;">
			<div style="flex: 50%; text-align:center;">
			 <p style=" padding-left:25px; padding-top:10px; color:#fff; font-size:36px; font-weight:bold;">Entrada</p>
	<p style="padding-left:25px; padding-bottom:10px; color:#fff; font-size:20px;">${ s.hEntrada }</p>
			</div>
				<div style="flex: 50%; text-align:center;">
			 <p style="padding-left:25px; padding-top:10px; color:#fff; font-size:36px; font-weight:bold;">Salida</p>
	<p style="padding-left:25px; padding-bottom:10px; color:#fff; font-size:20px;">${ s.hSalida }</p>
			</div>
			
		</div>		
	</div>
   </div>
  <div style="text-align:center; margin-left:150px; margin-right:150px; margin-top:25px; margin-bottom:50px;">
   	<h1 style="font-weight:bold;">Lista de Empleados</h1>
   	<br>
   	<div style="text-align: center; display:flex;">
   		<div style="flex:50%; margin-left:250px;">
   		<h3>Desea agregar un nuevo empleado?</h3>
   		</div>
   		<div style="margin-right:250px; flex:50%;">
   		 <form:form action="${pageContext.request.contextPath}/editperfil" method="POST" modelAttribute="usuario">
            
		 	<button class="btn btn-lg btn-success btn-signin" 
		 	style="width: 40%; margin-top:5px;" id="nuevaSuc" type="submit">Agregar Empleado</button>
		 	
		 	</form:form>
   		</div>
   	
   	</div>
   	<br>
   	<table style="text-align:center; font-size:24px; margin-top:10px;" class="main container" border="0">
       <tr style="background-color:#19386b; text-align:center; color:#fff;">
           <center><th>Nombre</th></center>
           <th>Edad</th>
           <th>Género</th>
           <th>Estado</th>
            <th>Editar</th>
           
          
           
       </tr>
       
    
       <c:forEach items="${e}" var="e">
         <tr style="text-align:center;">
           <th>${e.eNombre}</th>
           <th>${e.eEdad}</th>
           <th>${e.generoString}</th>
           <th>${e.estadoString}</th>
            <th>
           <div style="display: flex;">
           		<div style="flex: 50%;">
           		 <form:form action="${pageContext.request.contextPath}/editperfil" method="POST" modelAttribute="usuario">
            
		 	<button class="btn btn-sm btn-primary btn-signin" 
		 	style="width: 100%;" id="nuevaSuc" type="submit">Editar</button>
		 	
		 	</form:form>
           		</div>
           		<div style="flex: 50%;">
           		 <form:form action="${pageContext.request.contextPath}/editperfil" method="POST" modelAttribute="usuario">
            
		 	<button class="btn btn-sm btn-danger btn-signin" 
		 	style="width: 100%;" id="nuevaSuc" type="submit">Eliminar</button>
		 	
		 	</form:form>
           		</div>
           </div>
            </th>
          
           
       </tr>
       </c:forEach>
       
  </table>
  
  </div>
   
		 
</body>
</html>