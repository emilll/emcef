<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            <!-- Sidebar -->
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
                            <li class="active">
                                <a href="/" class="pl-4">Accueil</a>
                            </li>
                            <li class="style_dropdown">
                                <a href="#" class="style_dropdown_toggle pl-4"><i class="fa fa-home fa-sm mr-2"></i>  Enregistrer<i class="fa fa-caret-down float-right px-2"></i></a>
                                <ul class="pl-0">
                                    <li class="">
                                        <a href="/enregistrer-fabricants" class="pl-4">Fabricants</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-machines" class="pl-4">Machines</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-modeles" class="pl-4">Modèles</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-certificat" class="pl-4">Certificat</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-contribuable" class="pl-4">Contribuables</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-centre" class="pl-4">Centres</a>
                                    </li>
                                    <li class="">
                                        <a href="/enregistrer-emplacement-machines" class="pl-4">Emplacement des Machines</a>
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
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
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
                                        <h4><i class="fa fa-angle-right"></i>Emplacement</h4>
                                        <hr>
                                        <thead>
                                            <tr>
                                                <th><i class="fa fa-bullhorn"></i> Prénom(s)</th>
                                                <th class="hidden-phone"><i class="fa fa-question-circle"></i> Nom</th>
                                                <th><i class="fa fa-bookmark"></i> Email de l'employé</th>
                                                <th><i class=" fa fa-edit"></i> Statut</th>
                                                <th><i class=" fa fa-edit"></i> Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="employe" items="${people}">
                                                <tr>
                                                    <td><c:out value="${employe.firstname}"/></td>
                                                    <td><c:out value="${employe.lastname}"/></td>
                                                    <td><c:out value="${employe.email}"/></td>
                                                    <td><span class="label label-info label-mini">Actif</span></td>
                                                    <td>
                                                        <a class="btn btn-primary btn-xs" href="/modifier/<c:out value='${employe.ID}'/>"><i class="fa fa-pencil"></i></a>
                                                        <br><code>  </code><br>
                                                        <a class="btn btn-danger btn-xs" href="/delete/<c:out value='${employe.ID}'/>"><i class="fa fa-trash-o "></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                                <!-- /content-panel -->
                            </div>
                            <!-- /col-md-12 -->
                        </div>
                    </div>
                    <div class=" py-3">
                        <div class="row mt">
                            <div class="col-md-12">
                                <div class="content-panel">
                                    <table class="table table-striped table-advance table-hover">
                                        <h4><i class="fa fa-angle-right"></i>Fabricant</h4>
                                        <hr>
                                        <thead>
                                            <tr>
                                                <th><i class="fa fa-bullhorn"></i> Prénom(s)</th>
                                                <th class="hidden-phone"><i class="fa fa-question-circle"></i> Nom</th>
                                                <th><i class="fa fa-bookmark"></i> Email de l'employé</th>
                                                <th><i class=" fa fa-edit"></i> Statut</th>
                                                <th><i class=" fa fa-edit"></i> Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="employe" items="${people}">
                                                <tr>
                                                    <td><c:out value="${employe.firstname}"/></td>
                                                    <td><c:out value="${employe.lastname}"/></td>
                                                    <td><c:out value="${employe.email}"/></td>
                                                    <td><span class="label label-info label-mini">Actif</span></td>
                                                    <td>
                                                        <a class="btn btn-primary btn-xs" href="/modifier/<c:out value='${employe.ID}'/>"><i class="fa fa-pencil"></i></a>
                                                        <br><code>  </code><br>
                                                        <a class="btn btn-danger btn-xs" href="/delete/<c:out value='${employe.ID}'/>"><i class="fa fa-trash-o "></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                                <!-- /content-panel -->
                            </div>
                            <!-- /col-md-12 -->
                        </div>
                    </div>
                    <div class=" py-3">
                        <div class="row mt">
                            <div class="col-md-12">
                                <div class="content-panel">
                                    <table class="table table-striped table-advance table-hover">
                                        <h4><i class="fa fa-angle-right"></i> Machines</h4>
                                        <hr>
                                        <thead>
                                            <tr>
                                                <th><i class="fa fa-bullhorn"></i> Prénom(s)</th>
                                                <th class="hidden-phone"><i class="fa fa-question-circle"></i> Nom</th>
                                                <th><i class="fa fa-bookmark"></i> Email de l'employé</th>
                                                <th><i class=" fa fa-edit"></i> Statut</th>
                                                <th><i class=" fa fa-edit"></i> Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="employe" items="${people}">
                                                <tr>
                                                    <td><c:out value="${employe.firstname}"/></td>
                                                    <td><c:out value="${employe.lastname}"/></td>
                                                    <td><c:out value="${employe.email}"/></td>
                                                    <td><span class="label label-info label-mini">Actif</span></td>
                                                    <td>
                                                        <a class="btn btn-primary btn-xs" href="/modifier/<c:out value='${employe.ID}'/>"><i class="fa fa-pencil"></i></a>
                                                        <br><code>  </code><br>
                                                        <a class="btn btn-danger btn-xs" href="/delete/<c:out value='${employe.ID}'/>"><i class="fa fa-trash-o "></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                                <!-- /content-panel -->
                            </div>
                            <!-- /col-md-12 -->
                        </div>
                    </div>
                    <div class=" py-3">
                        <div class="row mt">
                            <div class="col-md-12">
                                <div class="content-panel">
                                    <table class="table table-striped table-advance table-hover">
                                        <h4><i class="fa fa-angle-right"></i>Modèles</h4>
                                        <hr>
                                        <thead>
                                            <tr>
                                                <th><i class="fa fa-bullhorn"></i> Prénom(s)</th>
                                                <th class="hidden-phone"><i class="fa fa-question-circle"></i> Nom</th>
                                                <th><i class="fa fa-bookmark"></i> Email de l'employé</th>
                                                <th><i class=" fa fa-edit"></i> Statut</th>
                                                <th><i class=" fa fa-edit"></i> Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="employe" items="${people}">
                                                <tr>
                                                    <td><c:out value="${employe.firstname}"/></td>
                                                    <td><c:out value="${employe.lastname}"/></td>
                                                    <td><c:out value="${employe.email}"/></td>
                                                    <td><span class="label label-info label-mini">Actif</span></td>
                                                    <td>
                                                        <a class="btn btn-primary btn-xs" href="/modifier/<c:out value='${employe.ID}'/>"><i class="fa fa-pencil"></i></a>
                                                        <br><code>  </code><br>
                                                        <a class="btn btn-danger btn-xs" href="/delete/<c:out value='${employe.ID}'/>"><i class="fa fa-trash-o "></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>

                                </div>
                                <!-- /content-panel -->
                            </div>
                            <!-- /col-md-12 -->
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
</html>