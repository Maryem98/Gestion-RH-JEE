<!DOCTYPE html>
<html >
<head>
 
  <title>Managenceau</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
  body {
    font: 400 15px Lato, sans-serif;
    line-height: 1.8;
    color: #818181;
  }
  h2 {
    font-size: 24px;
    text-transform: uppercase;
    color: #303030;
    font-weight: 600;
    margin-bottom: 30px;
  }
  h4 {
    font-size: 19px;
    line-height: 1.375em;
    color: #303030;
    font-weight: 400;
    margin-bottom: 30px;
  }  
  
  .jumbotron {
    background-color: #3366ff;
    color: #fff;
    padding: 100px 25px;
    font-family: Montserrat, sans-serif;
  }
  .container-fluid {
    padding: 60px 50px;
  }
  .bg-grey {
    background-color: #f6f6f6;
  }
  .logo-small {
    color: #3366ff;
    font-size: 50px;
  }
  .logo {
    color:#3366ff ;
    font-size: 200px;
  }
  .thumbnail {
    padding: 0 0 15px 0;
    border: none;
    border-radius: 0;
  }
  .thumbnail img {
    width: 100%;
    height: 100%;
    margin-bottom: 10px;
  }
  .carousel-control.right, .carousel-control.left {
    background-image: none;
    color: #f4511e;
  }
  .carousel-indicators li {
    border-color: #f4511e;
  }
  .carousel-indicators li.active {
    background-color: #f4511e;
  }
  .item h4 {
    font-size: 19px;
    line-height: 1.375em;
    font-weight: 400;
    font-style: italic;
    margin: 70px 0;
  }
  .item span {
    font-style: normal;
  }
  .panel {
    border: 1px solid  #3366ff; 
    border-radius:0 !important;
    transition: box-shadow 0.5s;
  }
  .panel:hover {
    box-shadow: 5px 0px 40px rgba(0,0,0, .2);
  }
  .panel-footer .btn:hover {
    border: 1px solid  #3366ff ;
    background-color: #fff !important;
    color:  #3366ff;
  }
  .panel-heading {
    color: #fff !important;
    background-color: #f4511e !important;
    padding: 25px;
    border-bottom: 1px solid transparent;
    border-top-left-radius: 0px;
    border-top-right-radius: 0px;
    border-bottom-left-radius: 0px;
    border-bottom-right-radius: 0px;
  }
  .panel-footer {
    background-color: white !important;
  }
  .panel-footer h3 {
    font-size: 32px;
  }
  .panel-footer h4 {
    color: #aaa;
    font-size: 14px;
  }
  .panel-footer .btn {
    margin: 15px 0;
    background-color:#3366ff;
    color: #fff;
  }
  .navbar {
    margin-bottom: 0;
    background-color:  #f2f2f2;
    z-index: 9999;
    border: 0;
    font-size: 12px !important;
    line-height: 1.42857143 !important;
    letter-spacing: 4px;
    border-radius: 0;
    font-family: Montserrat, sans-serif;
  }
  .navbar li a, .navbar .navbar-brand {
    color: #3366ff !important;
  }
  .navbar-nav li a:hover, .navbar-nav li.active a {
    color:  #fff !important;
    background-color: #3366ff !important;
  }
  .navbar-default .navbar-toggle {
    border-color: transparent;
    color: #fff !important;
  }
  footer .glyphicon {
    font-size: 20px;
    margin-bottom: 20px;
    color:  #3366ff;
  }
  .slideanim {visibility:hidden;}
  .slide {
    animation-name: slide;
    -webkit-animation-name: slide;
    animation-duration: 1s;
    -webkit-animation-duration: 1s;
    visibility: visible;
  }
  @keyframes slide {
    0% {
      opacity: 0;
      transform: translateY(70%);
    } 
    100% {
      opacity: 1;
      transform: translateY(0%);
    }
  }
  @-webkit-keyframes slide {
    0% {
      opacity: 0;
      -webkit-transform: translateY(70%);
    } 
    100% {
      opacity: 1;
      -webkit-transform: translateY(0%);
    }
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
    .btn-lg {
      width: 100%;
      margin-bottom: 35px;
    }
  }
  @media screen and (max-width: 480px) {
    .logo {
      font-size: 150px;
    }
  }
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>  
        <span  class="navbar-brand"></span>                
      </button>
     <!-- <a class="navbar-brand" href="/gestionRH/login/homejsp.jsp">Mangenceau</a> -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="/gestionRH/chercher.php">HOME
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/gestionRH/chercher.php">Gestion des employes</a></li>
          <li><a href="/gestionRH/acceuilabs.php">Gestion des absences</a></li>
          <li><a href="/gestionRH/acceuilconge.php">Gestion des conges</a></li>
        </ul>
      </li>
<!--          <li><a href="/gestionRH/chercher.php">HOME</a></li>
 -->     
 		 <li><a href="#about">ABOUT</a></li>
        <li><a href="#services">SERVICES</a></li>
        <li><a href="#contact">CONTACT</a></li>
        <li><a href="/gestionRH/login/index.html">LOGOUT</a></li>
        
      </ul>
      <ul class="nav navbar-nav navbar-left">
         <li><a href="/gestionRH/login/homejsp.jsp"><strong>MANAGENCEAU</strong></a></li>
     
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron text-center">
  <h1>MANAGENCEAU </h1> <br>
  <p>Cette plateforme est dediee pour la gesion du personnel de l'Agence du Bassin Hydraulique Draa Oued Noun</p> 
</div>

<!-- Container (About Section) -->
<div id="about" class="container-fluid">
  <div class="row">
    <div class="col-sm-8">
      <h2>A propos de l'agence </h2><br>
      <h4>L'agence hydraulique de Draa Oued Noun a ete creee en vertu du decret numero 2.16 .363 promulgue en le 19 Dhil Hija 1437 qui correspond au 21 septembre 2016 , ainsi  son directeur est designe le 28 juin 2018 .</h4>
    </div>
  
    <div class ="col-sm-4">
    <img src="admin.png" class="w3-image w3-greyscale-min" style="width:100%">
    
    </div>
  </div>
</div>

<div class="container-fluid bg-grey">
  <div class="row">
    <div class="col-sm-4">
         <img src="logo.PNG"  class="img-thumbnail" alt="Cinque Terre">
    </div>
    <div class="col-sm-8">
      <h2>Pourquoi ce site web?</h2><br>
      <h4>le site web a pour but de gerer les ressources humaines de l'agence et il va en particulier garantir les services suivants:</h4>
       <p><strong>-Organiser le travail de chef de service</strong>.</p>
       <p><strong>-Permettre au chef de service de rechercher l'information en un temps reduit.</strong> </p>
       <p><strong>-Assurer l'utilisation d'une facon plus securisee.</strong> </p> <br>
 
  </div>
</div>
</div>
<!-- Container (Services Section) -->
<div id="services" class="container-fluid text-center">
  <h2>SERVICES</h2>
  <h4>What we offer</h4>
  <br>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-user logo-small"></span>
      <br><br>
      <h4>Gestion des employes</h4>
      
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-calendar logo-small"></span>
      <br><br>
      <h4>Gestion des conges</h4>
      
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-pencil logo-small"></span>
      <br><br>
      <h4 style="color:#303030;">Gestion des absences</h4>
      
    </div>
  </div>
</div>


<!-- Container (Contact Section) -->
<div id ="contact" class="container-fluid bg-grey">
  <h2 class="text-center">CONTACT</h2>
  
    <div class="row">
    <div class="col-sm-5">
    <br> <br>
     <p><span class="glyphicon glyphicon-map-marker"></span> Rue Mohamed 6,Guelmim,Maroc</p>
     
    </div>
    <div class="col-sm-5">
    <br><br>
      <p><span class="glyphicon glyphicon-phone"></span> +2125265424515</p>
    </div>
     <div class="col-sm-2">
     <br><br>
           <p><span class="glyphicon glyphicon-envelope"></span> agenceeau@something.com</p>
     
    </div>
  </div>
  </div>
        
     





<!-- Image of location/map -->
<img src="wakala.PNG" class="w3-image w3-greyscale-min" style="width:100%">

<footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
  <p>Web site Made By <strong>OUABOU Maryem</strong></p>
</footer>

<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {
    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {
      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
  
  $(window).scroll(function() {
    $(".slideanim").each(function(){
      var pos = $(this).offset().top;

      var winTop = $(window).scrollTop();
        if (pos < winTop + 600) {
          $(this).addClass("slide");
        }
    });
  });
})
</script>

</body>
</html>
