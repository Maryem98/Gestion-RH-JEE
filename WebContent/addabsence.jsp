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
			<form class="form-detail" action="addabsencetoo.php" method="post">
				<h2> Affecter l'absence </h2>
				<div class="form-row-total">
				<label for="id">ID de l'employé</label>
					 <input type="text" name="id" id="id" class="input-text" value="${employe.id }" placeholder="ID Employé" required>
					</div>
				
				<div class="form-row-total">
					<label for="date">Date de l'absence</label>
						<input type="text" name="date" id="date" class="input-text" value="${employe.date}" placeholder="Date d'absence" required>
					</div>
					
				
				<div class="form-row-total">
					   <label for="comment">Commentaire</label>
						<input type="text" name="comment" id="comment" class="input-text"value="${employe.comment }"  placeholder="Commentaire" required>	
				</div>
				
				<div class="form-row-last">
					<button type="submit" name="register" class="register" > Affecter </button>
				</div>
				
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>