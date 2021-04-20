<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        //Pour la date
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.css"/>
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.midnight-blue.css"/>
        //Fin Pour la date

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/css/adminlte.min.css">
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/animate.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/all.min.css" rel="stylesheet">
        <link href="assets/css/aos.css" rel="stylesheet">
        <link href="assets/css/slick.css" rel="stylesheet" type="text/css">
        <link href="assets/css/Chart.min.css" rel="stylesheet" type="text/css">

        <script src="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/js/adminlte.min.js"></script>
        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/Chart.min.js"></script>



    </head>

    <body onload="getLineData()">
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
                                    <p class="my-0 text-white">Général</p>
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
                                    <li class="">
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

                <div class=" py-3">

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-3 col-6">
                                //small box
                                <div class="small-box bg-info">
                                    <div class="inner">
                                        <h3 id="factures">0</h3>

                                        <p>Totaux de ce jour</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-android-list"></i>
                                    </div>
                                    <p class="small-box-footer">Factures <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            //col
                            <div class="col-lg-3 col-6">
                                small box
                                <div class="small-box bg-success">
                                    <div class="inner">
                                        <h3 id="rapports">0</h3>

                                        <p>Totaux d'aujourd'hui</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-stats-bars"></i>
                                    </div>
                                    <p class="small-box-footer">Rapports <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            ./col
                            <div class="col-lg-3 col-6">
                                small box
                                <div class="small-box bg-warning">
                                    <div class="inner">
                                        <h3 id="montant1">0</h3>

                                        <p>Totaux d'aujourd'hui</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-pricetag"></i>
                                    </div>
                                    <p class="small-box-footer">Montant <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            //col
                            <div class="col-lg-3 col-6">
                                small box
                                <div class="small-box bg-danger">
                                    <div class="inner">
                                        <h3 id="montant2">0</h3>

                                        <p>Totaux TVA</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-pie-graph"></i>
                                    </div>
                                    <p class="small-box-footer">Montant <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            ./col
                        </div>
                        <hr/>
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Total TTC et TVA</h4>
                                    <div>
                                        <canvas id="myLine" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Totaux Globaux</h4>
                                    <div>
                                        <canvas id="myChart" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <br><br>
                        <div class="card bg-gradient-success col-sm-12">
                            <div class="card-header border-0">

                                <h3 class="card-title">
                                    <i class="far fa-calendar-alt"></i>
                                    Récapitulatif Quotidienne
                                </h3>
                                tools card
                                <div class="card-tools">
                                    button with a dropdown
                                    <div class="btn-group">
                                        <a id="eventspace" class="btn btn-success btn-sm" onclick="GetRange()">
                                            <i class="fas fa-bars"></i> Sélectionner un intervalle
                                        </a>
                                    </div>
                                </div>
                                tools
                            </div>
                            //.card-header
                            <div class="card-body pt-0">
                                The calendar
                                <div id="calendar" style="width: 100%"></div>
                            </div>
                            /.card-body
                        </div>
                    </div>
                </div>

                <h3 id="1" hidden="hidden"></h3>
                <h3 id="2" hidden="hidden"></h3>
                <h3 id="3" hidden="hidden"></h3>
                <h3 id="4" hidden="hidden"></h3>
                <h3 id="5" hidden="hidden"></h3>
                <h3 id="6" hidden="hidden"></h3>
                <h3 id="7" hidden="hidden"></h3>
                <h3 id="8" hidden="hidden"></h3>
                <h3 id="9" hidden="hidden"></h3>
                <h3 id="10" hidden="hidden"></h3>
                <h3 id="11" hidden="hidden"></h3>
                <h3 id="12" hidden="hidden"></h3>


                <h3 id="n1" hidden="hidden"></h3>
                <h3 id="n2" hidden="hidden"></h3>
                <h3 id="n3" hidden="hidden"></h3>
                <h3 id="n4" hidden="hidden"></h3>
                <h3 id="n5" hidden="hidden"></h3>
                <h3 id="n6" hidden="hidden"></h3>
                <h3 id="n7" hidden="hidden"></h3>
                <h3 id="n8" hidden="hidden"></h3>
                <h3 id="n9" hidden="hidden"></h3>
                <h3 id="n10" hidden="hidden"></h3>
                <h3 id="n11" hidden="hidden"></h3>
                <h3 id="n12" hidden="hidden"></h3>


                <h3 id="t1" hidden="hidden"></h3>
                <h3 id="t2" hidden="hidden"></h3>
                <h3 id="t3" hidden="hidden"></h3>
                <h3 id="t4" hidden="hidden"></h3>
                <h3 id="t5" hidden="hidden"></h3>
                <h3 id="t6" hidden="hidden"></h3>
                <h3 id="t7" hidden="hidden"></h3>
                <h3 id="t8" hidden="hidden"></h3>
                <h3 id="t9" hidden="hidden"></h3>
                <h3 id="t10" hidden="hidden"></h3>
                <h3 id="t11" hidden="hidden"></h3>
                <h3 id="t12" hidden="hidden"></h3>
            </div>
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>
            <script src="assets/js/reglo.js"></script>
            <script>
        $("#menu-toggle").click(function (e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });

        $(".style_dropdown_toggle, .style_sousmenu_toggle").click(function (e) {
            e.preventDefault();
            $(this).parent().toggleClass("style_toggled");
        });


        $(document).ready(function () {
            $('#calendar').evoCalendar({
                theme: 'Midnight Blue',
                'language': 'fr',
                todayHighlight: true,
                'eventListToggler': false
            });
            var terre = [
                {
                    id: 'kNybja6',
                    name: 'Bien',
                    date: 'March 27, 2021',
                    type: 'birthday',
                    everyYear: true // optional
                },
                {
                    id: 'kNybja6',
                    name: 'Ok',
                    date: 'March 27, 2021',
                    type: 'birthday',
                    everyYear: true // optional
                },
                {
                    id: 'asDf87L',
                    name: 'Graduation Day!',
                    date: 'March 21, 2021',
                    type: 'event'
                }
            ];
            $('#calendar').evoCalendar('addCalendarEvent', terre);
            $('#calendar').evoCalendar('toggleEventList', false);
            $('#calendar').on('selectDate', function (event, newDate, oldDate) {
                var today = new Date($('#calendar').evoCalendar('getActiveDate'));
                var options = {year: 'numeric', month: 'long', day: 'numeric'};
                var opt_weekday = {weekday: 'long'};
                function toTitleCase(str) {
                    return str.replace(
                            /\w\S*/g,
                            function (txt) {
                                return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase();
                            }
                    );
                }

                var weekday = toTitleCase(today.toLocaleDateString("fr-FR", opt_weekday));
                var the_date = weekday + ", " + today.toLocaleDateString("fr-FR", options);

                async function getDayResult() {
                    var dt = new Date($('#calendar').evoCalendar('getActiveDate'));
                    var DD = ("0" + dt.getDate()).slice(-2);
                    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
                    var YYYY = dt.getFullYear();

                    var ttc, rapports, factures;

                    const facture1 = await fetch('/api/ttc/' + YYYY + '/' + MM + '/' + DD);
                    ttc = await facture1.json();
                    if (typeof ttc !== 'number') {
                        ttc = 0;
                    }

                    const facture2 = await fetch('/api/rapports/' + YYYY + '/' + MM + '/' + DD);
                    rapports = await facture2.json();
                    if (typeof rapports !== 'number') {
                        rapports = 0;
                    }

                    const facture3 = await fetch('/api/factures/' + YYYY + '/' + MM + '/' + DD);
                    factures = await facture3.json();
                    if (typeof factures !== 'number') {
                        factures = 0;
                    }

                    Swal.fire({
                        icon: 'info',
                        title: the_date,
                        html:
                                '<b>' + rapports + '</b> Rapports<br> ' +
                                '<b>' + factures + '</b> Factures<br> ' +
                                '<b>' + ttc + '</b> FCFA TTC<br>',
                        allowOutsideClick: false,
                        showConfirmButton: false,
                        showCloseButton: true,
                        hideClass: {
                            popup: 'swal2-hide',
                            backdrop: 'swal2-backdrop-hide',
                            icon: 'swal2-icon-hide'
                        }
                    })
                }
                getDayResult();

            });
        });

            </script>
            <script src="js/evo-calendar.js"></script>
    </body>
</html>
-->

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
        <link rel="stylesheet" type="text/css" href="assets/css/cal-heatmap.css" />
        <link href="assets/css/Chart.min.css" rel="stylesheet" type="text/css">


        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
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
                                <a class="nav-link" href="index.html">Clients</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Fournisseurs
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">Option 1</a>
                                    <a class="dropdown-item" href="#">Option 2</a>
                                    <a class="dropdown-item" href="#">Option 3</a>
                                    <a class="dropdown-item" href="#">Option 4</a>
                                    <a class="dropdown-item" href="#">Option 5</a>
                                    <div class="dropdown-divider my-0"></div>
                                    <a class="dropdown-item" href="#">Autres option</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="apprendre.html">Analyse</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="prx.html">Configuration</a>
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
                        <h5 class="flex-fill">Tableau de <span class="text-success">Bord</span></h5>
                    </div>
                </div>
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">

                        <p aria-label="breadcrumb m-0 flex-fill">
                        <h4 class="breadcrumb m-0 py-1">
                            <li class="breadcrumb-item active text-dark">Statistiques</li>
                        </h4>
                        </p>
                    </div>
                </div>
            </div>
        </header>
        <div class="bg-light">
            <div class="table-responsive">
                <table class="table table-striped table-bordered">
                    <thead class="border-bottom">
                        <tr>
                            <th scope="col"></th>
                            <th scope="col">Factures</th>
                            <th scope="col">Rapports</th>
                            <th scope="col">Montant TTC</th>
                            <th scope="col">Montant HT</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class=""><b>Totaux Globaux</b></td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000000000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                        </tr>
                        <tr>
                            <td class=""><b>Totaux de ce mois</b></td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                        </tr>
                        <tr>
                            <td class=""><b>Totaux de ce jour</b></td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                        </tr>
                        <tr>
                            <td class=""><b>Machines</b></td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="counter">12</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                            <td>
                                <span class="text-danger counter">90000</span>
                                <span class="badge style_bg text-white">FCFA</span>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <br><br>
        <div class="row">
            <div class="col-md-6">
                <div class=" bg-white border p-3">
                    <h4 class="text-dark">Total TTC</h4>
                    <div>
                        <canvas id="myLine" class="w-100"></canvas>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-3">
                <div class=" bg-white border p-3">
                    <h4 class="text-dark">Total HT</h4>
                    <div>
                        <canvas id="myChart" class="w-100"></canvas>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
        <div class="row">
            <div class="col-md-auto" style="margin: auto;">
                <div id="pilier" class="chart"></div>
            </div>
        </div>

        <h3 id="1" hidden="hidden"></h3>
        <h3 id="2" hidden="hidden"></h3>
        <h3 id="3" hidden="hidden"></h3>
        <h3 id="4" hidden="hidden"></h3>
        <h3 id="5" hidden="hidden"></h3>
        <h3 id="6" hidden="hidden"></h3>
        <h3 id="7" hidden="hidden"></h3>
        <h3 id="8" hidden="hidden"></h3>
        <h3 id="9" hidden="hidden"></h3>
        <h3 id="10" hidden="hidden"></h3>
        <h3 id="11" hidden="hidden"></h3>
        <h3 id="12" hidden="hidden"></h3>

        <h3 id="t1" hidden="hidden"></h3>
        <h3 id="t2" hidden="hidden"></h3>
        <h3 id="t3" hidden="hidden"></h3>
        <h3 id="t4" hidden="hidden"></h3>
        <h3 id="t5" hidden="hidden"></h3>
        <h3 id="t6" hidden="hidden"></h3>
        <h3 id="t7" hidden="hidden"></h3>
        <h3 id="t8" hidden="hidden"></h3>
        <h3 id="t9" hidden="hidden"></h3>
        <h3 id="t10" hidden="hidden"></h3>
        <h3 id="t11" hidden="hidden"></h3>
        <h3 id="t12" hidden="hidden"></h3>
        <script src="assets/js/jquery-1.12.4.min.js"></script>
        <script src="assets/js/d3.v3.min.js" type="application/javascript"></script>
        <script src="assets/js/cal-heatmap.js" type="application/javascript"></script>
        <script src="assets/js/reglo.js" type="application/javascript"></script>

        <script src="assets/js/jquery.counterup.min.js" type="application/javascript"></script>
        <script src="assets/js/waypoints.min.js" type="application/javascript"></script>


        <script>
            $('.counter').counterUp({
                delay: 10,
                time: 3000
            });

            var tr = Date.parse(new Date('2021-04-12'));
            function convertir(ladate) {
                var currentTimeStamp = Date.parse(new Date(ladate));
                return currentTimeStamp / 1000;
            }
            var data = {
                "1618185600": 1000
            };


            yearcal = new CalHeatMap();
            var dt = new Date();
            yearcal.init({
                subDomain: "day",
                domain: "month",
                displayLegend: true,
                cellRadius: 10,
                cellSize: 16,
                legendColors: {"min": "#90EE90", "max": "#006400", "base": "#D3D3D3", "empty": "#FAEBD7"},
                considerMissingDataAsZero: false,
                itemSelector: "#pilier",
                start: new Date(),
                subDomainTextFormat: "%d",
                data: data,
                highlight: ["now", dt]
            });

        </script>
    </body>
</html>