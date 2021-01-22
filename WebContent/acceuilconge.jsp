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
    padding: 70px 25px;
    font-family: Montserrat, sans-serif;
  }
</style>

</head>
<body>
<div class="jumbotron text-center">
  <p>                                                      </p><br>
  <h2>Interface de gestion des congés de vos employés</h2> 
 
</div>
<div class="row">
    
    <div class="col-md-3">
      <ul class="nav nav-pills nav-stacked">
        <li ><a href="/gestionRH/acceuilabs.php">Acceuil</a></li>
        <li><a href="/gestionRH/conge.php">Ajouter un congé</a></li>
        <li><a href="/gestionRH/chercherConge.php">Consulter les congés</a></li>
   
      </ul>
    </div>
    <div class="col-md-4"> 
    <h1>Gerer les congé facilement !</h1>
      <p>En accedant à la page ajouter les congés, vous trouvez la liste de vous employés et vous pouver facilement leur affecter un congé....</p>
    </div>
        <div class="col-md-4"> 
        <h1>Consulter les congés  !</h1>
        <p>En accedant à la page consulter les congés , vous pouvez consulterles congés affectés à vos employés...</p>
    </div>
    <div class="clearfix visible-lg"></div>
  </div>