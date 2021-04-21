<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/animate.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/all.min.css" rel="stylesheet">
        <link href="assets/css/aos.css" rel="stylesheet">
        <link href="assets/css/slick.css" rel="stylesheet" type="text/css">
        <link href="assets/css/Chart.min.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/Chart.min.js"></script>
    </head>

    <body>
        <div class="d-flex bg-light" id="wrapper">
            //Sidebar
            <div class="border-right resto" id="sidebar-wrapper">
                <div class="sidebar-wrapper-bloc">
                    <nav>
                        <div class="sidebar-heading py-4 position-relative">
                            <div class="media style_sousmenu_toggle pl-4 py-3">
                                <div class="mr-3">
                                    <a class="" href="#">
                                        <img src="assets/img/profilMan.jpg" width="50" height="50" class="img-fluid rounded-lg border" alt="...">
                                    </a>
                                </div>
                                <div class="media-body my-0">
                                    <p class="my-0 text-white">Nom de la société</p>
                                    <small class="">Profil</small>
                                </div>
                            </div>
                        </div>
                        <ul class="pl-0">
                            <li class="">
                                <a href="/" class="pl-4">Accueil</a>
                            </li>
                            <li class="style_dropdown style_toggled active">
                                <a href="#" class="style_dropdown_toggle pl-4"><i class="fa fa-home fa-sm mr-2"></i>  Enregistrer<i class="fa fa-caret-down float-right px-2"></i></a>
                                <ul class="pl-0">
                                    <li class="">
                                        <a href="/showfabricants" class="pl-4">Fabricants</a>
                                    </li>
                                    <li class="">
                                        <a href="/showmachines" class="pl-4">Machines</a>
                                    </li>
                                    <li class="">
                                        <a href="/showmodeles" class="pl-4">Modèles</a>
                                    </li>
                                    <li class="">
                                        <a href="/showcertificat" class="pl-4">Certificat</a>
                                    </li>
                                    <li class="active">
                                        <a href="/showcontribuable" class="pl-4">Contribuables</a>
                                    </li>
                                    <li class="">
                                        <a href="/showcentre" class="pl-4">Centres</a>
                                    </li>
                                    <li class="">
                                        <a href="/showemplacementmachines" class="pl-4">Emplacement des Machines</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="">
                                <a href="compte.html" class="pl-4"><i class="fa fa-chart-line fa-sm mr-2"></i> Statistiques</a>
                            </li>
                            <li>
                                <a href="transactions.html" class="pl-4"><i class="fa fa-receipt fa-sm mr-2"></i> Mes Factures</a>
                            </li>
                            <li>
                                <a href="reference.html" class="pl-4"><i class="fa fa-table fa-sm mr-2"></i> Enregistrements</a>
                            </li>
                        </ul>
                        <hr>
                        <ul class="pl-0">
                            <li>
                                <a href="reference.html" class="pl-4"><i class="fa fa-user fa-sm mr-2"></i> Autres actions</a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
            //#sidebar-wrapper

            //Page Content
            <div id="page-content-wrapper">
                <nav class="navbar navbar-expand-lg navbar-light bg-light py-1 border-bottom style_navbar_sticky">
                    <div class="container-fluid position-relative">
                        <div class="d-flex align-items-center">
                            <button class="text-success bg-light border-0 mr-sm-3" type="button" id="menu-toggle">
                                <i class="fa fa-align-justify"></i>
                            </button>
                            <a class="" href="index.html">
                                <img src="assets/img/logo.png" width="100" class="img-fluid" alt="logo">
                            </a>
                        </div>

                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-ellipsis-h"></i>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto align-items-sm-center p-2 p-sm-0">
                                <li class="nav-item style_sousmenu">
                                    <a class="nav-link style_sousmenu_toggle" href="#">
                                        <i class="fa fa-bell"></i>
                                        <small class="px-1 rounded-lg style_notif_badge">01</small>
                                    </a>
                                    <div class="style_sousmenu_bloc bg-white border">
                                        <div class="p-3 bg-light">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                    </div>
                                </li>
                                <li class="nav-item style_sousmenu">
                                    <a class="nav-link style_sousmenu_toggle" href="#">
                                        <i class="fa fa-envelope"></i>
                                        <small class="px-1 rounded-lg style_notif_badge">02</small>
                                    </a>
                                    <div class="style_sousmenu_bloc bg-white border">
                                        <div class="p-3">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                        <div class="p-3 bg-light">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link position-relative" href="#">
                                        <i class="fa fa-power-off"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <div class="container-fluid">
                    <div class=" py-3">
                        <div class="row mt">
                            <div class="col-md-12">
                                <div class="content-panel">
                                    <table class="table table-striped table-advance table-hover">
                                        <h4><i class="fa fa-angle-right"></i>Contribuables</h4>
                                        <hr>
                                        <a class="btn btn-primary btn-xs" style="margin-left: 20px" href="/savecontribuable">Ajouter un contribuable</a><hr>
                                        <thead>
                                            <tr>
                                                <th class="hidden-phone"><i class="fa fa-bullhorn"></i> Nom & Prénom(s)</th>
                                                <th><i class="fa fa-bookmark"></i> Email </th>
                                                <th><i class=" fa fa-edit"></i> IFU</th>
                                                <th><i class=" fa fa-edit"></i> Ville</th>
                                                <th><i class=" fa fa-edit"></i> Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <//c:forEach var="contribuable" items="">
                                                <tr>
                                                    <td><//c:out value=""/></td>
                                                    <td><//c:out value=""/></td>
                                                    <td><//c:out value=""/></td>
                                                    <td><//c:out value=""/></td>
                                                    <td>
                                                        <a class="btn btn-primary btn-xs" href="/modifiercontribuable/<//c:out value=''/>"><i class="fa fa-pencil"></i>Modifier</a>
                                                        <br><code>  </code><br>
                                                        <a class="btn btn-danger btn-xs" href="/deletecontribuable/<//c:out value=''/>"><i class="fa fa-trash-o "></i>Supprimer</a>
                                                    </td>
                                                </tr>
                                            <//c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                                
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>

            $("#menu-toggle").click(function (e) {
                e.preventDefault();
                $("#wrapper").toggleClass("toggled");
            });

            $(".style_dropdown_toggle, .style_sousmenu_toggle").click(function (e) {
                e.preventDefault();
                $(this).parent().toggleClass("style_toggled");
            });

            var ctx = document.getElementById('myChart');
            var myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: '# of Votes',
                            data: [12, 19, 3, 5, 2, 3],
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });

            var horizontalBar = document.getElementById('horizontalBar');
            var myChart = new Chart(horizontalBar, {
                type: 'horizontalBar',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: '# of Votes',
                            data: [12, 19, 3, 5, 2, 3],
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });

            var radar = document.getElementById('radar');
            var myChart = new Chart(radar, {
                type: 'radar',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: '# of Votes',
                            data: [12, 19, 3, 5, 2, 3],
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });

            var polarArea = document.getElementById('polarArea');
            var myChart = new Chart(polarArea, {
                type: 'polarArea',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: '# of Votes',
                            data: [12, 19, 3, 5, 2, 3],
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });

        </script>
    </script>
</body>
</html>-->


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/animate.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/all.min.css" rel="stylesheet">
        <link href="assets/css/aos.css" rel="stylesheet">
        <link href="assets/css/slick.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
    </head>

    <body>
        <header id="header_top">
            <nav class="navbar navbar-expand-lg navbar-dark style_bg p-0 fixed-top">
                <div class="container-fluid position-relative">
                    <div class="navbar-brand">
                        <h4><a href="home.html" class="mr-3"><i class="fa fa-th-large"></i></a>Réglo</h4>
                    </div>
                    <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="/">Acceuil</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Recherche
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/showcontribuable">Contribuable</a>
                                    <a class="dropdown-item" href="#">Machines</a>
                                </div>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto align-items-sm-center">
                            <li class="nav-item">
                                <a class="nav-link" href="apprendre.html"><i class="fa fa-bell"></i></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="apprendre.html"><i class="fa fa-user-clock"></i></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fa fa-cog"></i></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fa fa-comments"></i></a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src="assets/img/profilMan.jpg" width="35" height="35" class="rounded-circle border" alt="..."> Nom prénom
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">Profil</a>
                                    <div class="dropdown-divider my-0"></div>
                                    <a class="dropdown-item" href="#">Déconnexion</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="mt-5 bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <h5 class="flex-fill"><a href="#">Liste</a> des <span class="text-success">Contribuables</span></h5>

                    </div>
                </div>
                <nav class="navbar navbar-expand-lg navbar-light p-0">
                    <div class="container-fluid position-relative">
                        <div class="d-flex justify-content-between align-items-center flex-wrap">
                            <button class="btn btn-sm btn-success mr-1">Créer Contribuable</button>
                        </div>
                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContentDetail" aria-controls="navbarSupportedContentDetail" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-ellipsis-h"></i>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContentDetail">
                            <ul class="navbar-nav mx-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="#"><small><i class="fa fa-circle mr-1"></i>Autre</small></a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-filter mr-1"></i>Filtre</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Filtre 1</a>
                                        <a class="dropdown-item" href="#">Filtre 2</a>
                                        <a class="dropdown-item" href="#">Filtre 3</a>
                                        <a class="dropdown-item" href="#">Filtre 4</a>
                                        <a class="dropdown-item" href="#">Filtre 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-th-list mr-1"></i>Regrouper</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Regroupement 1</a>
                                        <a class="dropdown-item" href="#">Regroupement 2</a>
                                        <a class="dropdown-item" href="#">Regroupement 3</a>
                                        <a class="dropdown-item" href="#">Regroupement 4</a>
                                        <a class="dropdown-item" href="#">Regroupement 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-star mr-1"></i>Favoris</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Filtre 1</a>
                                        <a class="dropdown-item" href="#">Filtre 2</a>
                                        <a class="dropdown-item" href="#">Filtre 3</a>
                                        <a class="dropdown-item" href="#">Filtre 4</a>
                                        <a class="dropdown-item" href="#">Filtre 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                            </ul>
                            <ul class="navbar-nav ml-auto align-items-sm-center">
                                <div class="d-flex align-items-center flex-wrap">
                                    <button class="btn btn-sm btn-secondary mr-1"><i class="fa fa-list-ol"></i></button>
                                    <button class="btn btn-sm btn-outline-secondary mr-1"><i class="fa fa-calendar-alt"></i></button>
                                    <button class="btn btn-sm btn-outline-secondary mr-1"><i class="fa fa-chart-area"></i></button>
                                    <button class="btn btn-sm btn-outline-secondary mr-1"><i class="fa fa-clock"></i></button>
                                </div>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <div class="d-flex justify-content-between align-items-center flex-wrap">
                            <div class="col-sm-6 my-auto">
                                <form class="mb-2">
                                    <h2 class="text-dark mb-3">Recherche</h2>
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <input type="text" class="form-control style_form_control" name="" placeholder="Nom">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <input type="text" class="form-control style_form_control" name="" placeholder="IFU">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <input type="number" class="form-control style_form_control" name="" placeholder="RCCM">
                                        </div>
                                        <div class="col-sm-12 form-group">
                                            <button class="btn btn-block btn-success mt-3">Rechercher</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="col-sm-6 my-auto">
                                <div class="row">
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">068746968517161</span>
                                                    <h5 class="card-title mt-3">Factures</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0876187686871</span>
                                                    <h5 class="card-title mt-3">Rapports</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">015446874446</span>
                                                    <h5 class="card-title mt-3">Montant TTC</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">06846874681</span>
                                                    <h5 class="card-title mt-3">Montant HT</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<main class="bg-light">
    <div class="py-3">
        <div class="container-fluid">
            <div class="bg-white p-2">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered">
                        <thead class="border-bottom">
                            <tr>
                                <th scope="col">N°</th>
                                <th scope="col">Date</th>
                                <th scope="col">Libellé</th>
                                <th scope="col">Badge</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>
                                    <span class="text-dark">11/05/20</span>
                                    <small class="text-muted">15:58</small>
                                </td>
                                <td>
                                    <span>Lorem ipsum dolor sit amet...</span>
                                </td>
                                <td>
                                    <span class="badge style_bg text-white">Badge</span>
                                </td>
                                <td>
                                    <span class="text-success">90.000</span>
                                </td>
                                <td>
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
                                </td>
                            </tr>

                        </tbody>
                    </table>
                </div>
                <div class="d-flex justify-content-between align-items-center">
                    <p>2 éléments sur 6</p>
                    <nav class=''>
                        <ul class="pagination justify-content-end">
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
</html>