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

<div class="container" style="width: 100%; background-size: 100% 100%; background-repeat: no-repeat;  background-image: url('resources/resto.jpg');">
  <div class="jumbotron" style="background-color: #00000070;">
    <h1 style="background-color:#00000000; color:#ffffff80; font-weight:bold;">Sucursales</h1>      
    <p style="background-color:#00000000; color:#ffffff80; font-weight:bold;">A continuación se encuentran todas las sucursales de Restaurante Rústico</p>
  </div>    
</div>
<div style="color:#fff; position:absolute; right:0; top:0; margin:40px;">
<p>Desea agregar una Sucursal?</p>
<form:form action="${pageContext.request.contextPath}/home" method="POST" modelAttribute="usuario">
		 	<button class="btn btn-lg btn-primary btn-block btn-signin" 
		 	style="width: 100%;" id="nuevaSuc" type="submit">Nueva Sucursal</button>
		 	
		 	</form:form>
</div>
<div class="main container">
	  <c:forEach items="${s}" var="s">
	<div style="display: flex; background-color:#203b68; border-radius:10px; padding-top:2px; padding-left:25px; margin-left:200px; margin-right:200px; margin-top:10px;
	 height:170px;">
		<div style="flex: 50%;">
		<h1 style="color:#fff;">${ s.sucNombre	 }</h1>
		<p style="font-size:16px; color:#fff;">Para más acciones con la sucursal "${s.sucNombre }", utilice los botones del panel derecho</p>		
		</div>
		<div style="flex: 50%; padding-top:10px; padding-right:10px;">
		
		<form action="${pageContext.request.contextPath}/verperfil" method="POST">
  			<input type="hidden" name="identi"  value= ${s.idSucursal} >		 	
		 	<button class="btn btn-primary btn-md" 
		 	style="z-index:500; position:relative; top:0; right:0; width: 100%;" id="nuevaSuc" type="submit">Ver Perfil</button>
		 	</form>
		 	<br>
		 	<form:form action="${pageContext.request.contextPath}/editperfil" method="POST" modelAttribute="usuario">
		 	  			<input type="hidden" name="ide"  value=${s.idSucursal}>		 				
		 <button class="btn btn-success btn-md" 
		 	style="z-index:500; position:relative; top:0; right:0; width: 100%;" id="nuevaSuc" type="submit">Editar Sucursal</button>
		 	</form:form>
		 	<br>
		 	<form:form action="${pageContext.request.contextPath}/home" method="POST" modelAttribute="usuario">
		 <button class="btn btn-danger btn-md" 
		 	style="width:100%;" id="nuevaSuc" type="submit">Eliminar Sucursal</button>
		 	</form:form>
		</div>
	</div>
	
	</c:forEach>

</div>
		 
<h1>${ p.uCorreo }</h1>
</body>
</html>