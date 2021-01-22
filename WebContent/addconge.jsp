<%@include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>saisie</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="css/nunito-font.css">
	<!-- Main Style Css -->
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body class="form-v9">
	<div class="page-content">
		<div class="form-v9-content" style="background-image: url('images/form-v9.jpg')">
			<form class="form-detail" action="addcongetoo.php" method="post">
				<h2> Ajouter un congé</h2>
				<div class="form-row-total">
				<label for="id">ID de l'employé</label>
					 <input type="text" name="id" id="id" class="input-text" value="${employe.id }" placeholder="ID Employé" required>
					</div>
				
				<div class="form-row-total">
				
					<label for="dateDebut">Date debut</label>
						<input type="date" name="dateDebut" id="dateDebut" class="input-text" value="${employe.dateDebut}" placeholder="Date debut" required>
				</div>
				<div class ="form-row-total">
					<label for="dateFin">Date fin</label>
						<input type="date" name="dateFin" id="dateFin" class="input-text" value="${employe.dateFin}" placeholder="Date fin" required>
				</div>
	        
					
				
				<div class="form-row-total">
					   <label for="typeConge">Type du congé</label>
						<select  name="typeConge" id="typeConge" class="form-control" >
					     <option>maladie</option>
					     <option>mariage</option>
					      <option>conge annuel</option>
					    
					     
					     </select>
				</div>
				
				<div class="form-row-last">
					<button type="submit" name="register" class="register" > Affecter </button>
				</div>
				
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>