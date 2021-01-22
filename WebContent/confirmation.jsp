<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>liste Employes</title>
<link rel="stylesheet"  href="css/bootstrap.min.css" />

</head>
<body>
<p></p>
<div class="container col-md-8 col-md-offset-2">
	<div class="panel panel-info">
		<div class="panel panel-heading"> Confirmation </div>
		<div class="panel-body">
					<div class="form-group">
					        <label>${employe.id }</label>
					  </div>
					<div class="form-group">
					    <label>${employe.nom }</label>
					     </div>
					 	
					 	<div class="form-group">
					        <label>${employe.prenom }</label>
					        </div>
					        <div class="form-group">
					        
					        <label>${employe.telephone }</label>
					        </div>
					        <div class="form-group">
					        
					        <label>${employe.email}</label>
					        </div>
					        <div class="form-group">
					        
					        <label>${employe.service }</label>
					        </div>
					        <div class="form-group">
					        
					        <label>${employe.dateEntre }</label>
			</div>
		</div>
	</div>
 </div>
</body>
</html>