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
  <h3>Ici vous pouvez marquer les absences de vos employés </h3> 
 
</div>
<div class="row">
    
    <div class="col-md-2">
      <ul class="nav nav-pills nav-stacked">
        <li ><a href="/gestionRH/acceuilabs.php">Acceuil</a></li>
        <li><a href="/gestionRH/absence.php">Marquer les absences</a></li>
        <li><a href="/gestionRH/chercherAbs.php">Consulter les absences</a></li>
   
      </ul>
    </div>
<div class="col-md-10"> 
 <div class="container ">
 
	<div class="panel panel-primary">
		<div class="panel-body">

			<table class="table table-condensed">
					    <thead>
					      <tr>
					   		<th>ID</th>
					        <th>Nom</th>

					        <th>Prenom</th>
					        <th>Email</th>
					        <th>Telephone</th>
					       
					        <th>Action</th>
					       
					        
					      </tr>
					    </thead>
					    <tbody>
					    		<c:forEach items="${employes }"  var ="e"> <!-- //chercher dans request l'atribut model la liste employes et pour chaque employe e qui est dans la liste -->
					      <tr>
					        <td><c:out value ="${e.id }"/></td>
					        <td><c:out value ="${e.nom }"/></td>
					        <td><c:out value ="${e.prenom }"/></td>
					        <td><c:out value="${e.telephone }"/></td>
					        <td><c:out value= "${e.email }" /></td>
					        
					    	
					        <td><a href="addabsence.php?id=${e.id }">Marquer l'absence</a></td>
					       
					        
					      </tr> 
					      </c:forEach>
					    </tbody>			    
		</table>
	</div>	
		</div>
	</div>
 </div> 
 </div>
</body>
</html>