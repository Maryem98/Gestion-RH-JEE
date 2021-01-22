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
			<form class="form-detail" action="save.php" method="post">
				<h2>Ajouter un nouvel employ�</h2>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="nom" id="nom" class="input-text" placeholder="Nom" required>
					</div>
					<div class="form-row">
						<input type="text" name="prenom" id="prenom" class="input-text" placeholder="Prenom" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="email" id="email" class="input-text" placeholder="Email" required>
					</div>
					<div class="form-row">
						<input type="text" name="telephone" id="telephone" class="input-text" placeholder="Telephone" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="service" id="service" class="input-text" placeholder="Service" required>
					</div>
					<div class="form-row">
						<input type="text" name="dateEntre" id="dateEntre" class="input-text" placeholder="Date d'entr�e" required>
					</div>
				</div>
		<div class="form-row-last">
				
					<button type="submit" name="register" class="register" >Ajouter</button>
				
		</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>