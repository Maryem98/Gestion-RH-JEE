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
  <h3>Ici vous pouvez consulter les absences de vos employés </h3> 
 
</div>
<div class="row">
    
    <div class="col-md-2">
      <ul class="nav nav-pills nav-stacked">
        <li><a href="/gestionRH/acceuilabs.php">Acceuil</a></li>
        <li><a href="/gestionRH/absence.php">Affecter les absences</a></li>
        <li><a href="/gestionRH/chercherAbs.php">Consulter les absences</a></li>
   
      </ul>
    </div>
<div class="col-md-10"> 
 <div class="container ">

 <div class="container ">
 
	<div class="panel panel-primary">
	<!-- 	<div class="panel panel-heading">  Liste des employés </div> -->
		<div class="panel-body">
			
			<div></div><form action="chercherAbs.php" method="get">
			<div class="input-group">
            <input type="text" class="form-control" placeholder="Veuillez taper ici le nom que vous cherchez...." name="nom">
              <div class="input-group-btn">
             <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
             </div>
			</div>
			</form>
			<br><br><br>
			 
			
			<table class="table table-condensed">
					    <thead>
					      <tr>
					   		
					        <th>Id d'absence</th>
					        <th>DATE</th>
					        <th>COMMENT</th>
					       
					        
					      </tr>
					    </thead>
					    <tbody>
					    	<c:forEach items="${model.absences}"  var ="e"> <!-- //chercher dans request l'atribut model la liste employes et pour chaque employe e qui est dans la liste -->
					      <tr>
					        <td>${e.id }</td>
					       
					        <td>${e.date}</td>
					        <td>${e.comment }</td>
					       
					        
					      </tr> 
					      </c:forEach>
					    </tbody>			    
		</table>
		
		</div>
	</div>
	</div>
	</div>
	</div>
 </div> 
</body>
</html>