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
<style>
.jumbotron {
    background-color: #3366ff;
    color: #fff;
    padding: 30px 25px;
    font-family: Montserrat, sans-serif;
  }
</style>

</head>
<body>
<div class="jumbotron text-center">
  <p>                                                      </p><br>
  <h3>Ici vous pouvez ajouter , supprimer, modifier, ou  lister vos employés </h3> 
 
</div>

 <div class="container ">
 
	<div class="panel panel-primary">
		<div class="panel-body">
			<div class="row">
			<div class="col-sm-9">
			<form action="chercher.php" method="get">			
			<div class="input-group">
            <input type="text" class="form-control" placeholder="Veuillez taper ici le nom que vous cherchez...." name="motCle">
              <div class="input-group-btn">
             <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
             </div>
			</div>
			
			<!-- 
			<button type="submit"class="btn btn-info"  >Chercher</button> -->
			</form></div>
			<div class="col-sm-3">
			  <a href="/gestionRH/saisie.php" class="btn btn-info " role="button">Ajouter un nouveau employé</a>
			
			</div>
			</div>
		    <br><br><br>
			
			<table class="table table-condensed">
					    <thead>
					      <tr>
					   		<th>ID</th>
					        <th>Nom</th>

					        <th>Prenom</th>
					        <th>Email</th>
					        <th>Telephone</th>
					        <th>Service</th>
					        <th>Date d'entrée</th>
					        <th>Action</th>
					        <th>Action</th>
					        
					      </tr>
					    </thead>
					    <tbody>
					    	<c:forEach items="${model.employes }"  var ="e"> <!-- //chercher dans request l'atribut model la liste employes et pour chaque employe e qui est dans la liste -->
					      <tr>
					        <td>${e.id }</td>
					        <td>${e.nom }</td>
					        <td>${e.prenom }</td>
					        <td>${e.telephone }</td>
					        <td>${e.email}</td>
					        <td>${e.service }</td>
					        <td>${e.dateEntre }</td>
					        <td><a onclick="return confirm('Etes vous sure de vouloir supprimer cet employé')" href="supprimer.php?id=${e.id }">Supprimer</a></td>
					       <td><a href="modifier.php?id=${e.id }">Modifier</a></td>
					        
					      </tr> 
					      </c:forEach>
					    </tbody>			    
		</table>
		
		</div>
	</div>
 </div> 
</body>
</html>