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
        <link href="assets/css/new_style.css" rel="stylesheet">
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
                                <a class="nav-link" href="/">Acceuil</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Aujourd'hui
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Factures d'aujourd'hui</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Machines signalées aujourd'hui</a>
                                    <a class="dropdown-item" href="/ajouterdépartement">Machines non signalées aujourd'hui</a>
                                    <a class="dropdown-item" href="/ajoutercommune">Journal d'audit</a>
                                    <a class="dropdown-item" href="/ajouterville">Données du jour</a>
                                    <a class="dropdown-item" href="/ajouterinstallation">Statut d'aujourd'hui</a>
                                    <a class="dropdown-item" href="/ajouterinstallation">Statistiques quotidiennes</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Enregistrement
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Contribuable</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Machines</a>
                                    <a class="dropdown-item" href="/ajouterdépartement">Point de Vente</a>
                                    <a class="dropdown-item" href="/ajoutercommune">Emplacement des machines</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Données
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Factures</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Totaux quotidiennes</a>
                                    <a class="dropdown-item" href="/ajouterdépartement">Statuts</a>
                                    <a class="dropdown-item" href="/ajoutercommune">Rapport quotidiennes</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Audits
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Journal d'audits</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Totaux des audits quotidiennes</a>
                                    <a class="dropdown-item" href="/ajouterdépartement">Dates des rapports des machines</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">Vérifier</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">Rapports</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Recherche
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="javascript:void(0);" onclick="recherche1()">Contribuable</a>
                                    <a class="dropdown-item" href="javascript:void(0);" onclick="recherche2()">Machines</a>
                                    <a class="dropdown-item" href="javascript:void(0);" onclick="recherche3()">Point de Vente</a>
                                </div>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto align-items-sm-center">
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fa fa-bell"></i></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><i class="fa fa-user-clock"></i></a>
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
            
        </header>
        <div class="bg-light">
            <div>
                <div class="row">
            <!-- Info Boxes Style 2 -->
            <div class="info-box bg-warning col-md marge">
              <span class="info-box-icon"><i class="fas fa-file-invoice"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Factures Traités</span>
                <span class="info-box-number">5,200</span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
            <div class="info-box bg-success col-md marge">
              <span class="info-box-icon"><i class="fas fa-file-invoice"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Factures en attente</span>
                <span class="info-box-number">92,050</span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
            <div class="info-box bg-danger col-md marge">
              <span class="info-box-icon"><i class="fas fa-receipt"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Rapports Traités</span>
                <span class="info-box-number">114,381</span>
              </div>
              <!-- /.info-box-content -->
            </div>
            <!-- /.info-box -->
            <div class="info-box bg-info col-md marge">
              <span class="info-box-icon"><i class="fas fa-receipt"></i></span>

              <div class="info-box-content">
                <span class="info-box-text">Rapports en attente</span>
                <span class="info-box-number">163,921</span>
              </div>
              <!-- /.info-box-content -->
            </div>
            </div>
        </div>

<ul class="nav nav-tabs justify-content-center" id="myTab" role="tablist">
  <li class="nav-item">
    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Données</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Graphes</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Calendrier</a>
  </li>
</ul>
<div class="tab-content" id="myTabContent">
  <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
      <div class="row table-responsive container-fluid" style="margin-left: auto; margin-right: auto; padding-top: 20px; padding-bottom: 20px;">
            <table class="offset-md-1 col-md-10 offset-md-1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td></td>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Factures</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-title col-md">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Rapports</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Montant TTC</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Montant HT</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Totaux Globaux</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="global1">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="global2">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="global3">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="global4">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Totaux de ce mois</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="month1">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="month2">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="month3">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="month4">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Totaux d'aujourd'hui</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="day1">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="day2">00000000</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="day3">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number counter" id="day4">00000000</span><span class="badge style_bg text-white"> FCFA</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="info-box bg-title col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text"></span>
                <span class="info-box-number">Machines</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text">Connectés depuis 7 jours</span>
                <span class="info-box-number">10/60/514</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text">Déconnectés</span>
                <span class="info-box-number">246</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text">Connectés</span>
                <span class="info-box-number">315</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                        <td>
                            <div class="info-box bg-content col-md ">
              <span class="info-box-icon"></span>

              <div class="info-box-content">
                <span class="info-box-text">Nombres Total</span>
                <span class="info-box-number">0</span>
              </div>
              <!-- /.info-box-content -->
            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
  </div>
  <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
      <div class="row" style="margin-top: 20px;">
            <div class="col-md-6">
                <div class=" bg-white border p-3">
                    <h4 class="text-dark">Total TTC</h4>
                    <div>
                        <canvas id="myLine" class="w-100" height="100"></canvas>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-3">
                <div class=" bg-white border p-3">
                    <h4 class="text-dark">Total HT</h4>
                    <div class="table-responsive">
                        <canvas id="myChart" class="w-100" height="100"></canvas>
                    </div>
                </div>
            </div>
        </div>
  </div>
  <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
      <div class="row" style="margin-top: 20px;">
            <div class="col-md-auto" style="margin: auto;">
                <div id="pilier" class="chart align-content-center"></div>
            </div>
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
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <script>
                                        function compter() {
                                            $('.counter').counterUp({
                                                delay: 10,
                                                time: 3000
                                            });
                                        }
                                        setTimeout(compter, 1500);

                                        var tr = Date.parse(new Date('2021-04-12'));
                                        function convertir(ladate) {
                                            var currentTimeStamp = Date.parse(new Date(ladate));
                                            return currentTimeStamp / 1000;
                                        }

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
                                            data: 'http://localhost:8080/api/countfacturebydate',
                                            highlight: ["now", dt],
                                            onClick: function (date, nb) {
                                                function convert(str) {
                                                    var date = new Date(str),
                                                            mnth = ("0" + (date.getMonth() + 1)).slice(-2),
                                                            day = ("0" + date.getDate()).slice(-2);
                                                    return [date.getFullYear(), mnth, day].join("-");
                                                }
                                                window.location.replace('/showdayinfo/' + convert(date));
                                            }
                                        });



                                        async function recherche1() {
                                            const man = Swal.mixin({
                                                customClass: {
                                                    confirmButton: 'btn btn-success col-sm-12 ',
                                                    cancelButton: 'btn btn-danger col-sm-12'
                                                },
                                                buttonsStyling: false
                                            })
                                            man.fire({
                                                html:
                                                        '<div class="col-sm-12 my-auto">' +
                                                        '<div class="mb-2">' +
                                                        '<h2 class="text-dark mb-3">Recherche Contribuable</h2>' +
                                                        '<div class="row">' +
                                                        '<div class="col-sm-12 form-group">' +
                                                        '<input type="text" class="form-control style_form_control" id="val1" name="" placeholder="IFU">' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>',
                                                showCancelButton: true,
                                                cancelButtonText: 'Annuler',
                                                confirmButtonText: 'Rechercher',
                                                showLoaderOnConfirm: true,
                                                preConfirm: (login) => {
                                                    var variable;
                                                    if (document.getElementById('val1').value !== "") {
                                                        variable = "http://localhost:8080/api/ent/findcontribuablebyifu/" + document.getElementById('val1').value;
                                                    } else {
                                                        Swal.showValidationMessage(
                                                                'Le champ IFU est vide!'
                                                                )
                                                    }
                                                    return fetch(variable)
                                                            .then(response => {
                                                                if (!response.ok) {
                                                                    throw new Error(response.statusText)
                                                                }
                                                                return response.json()
                                                            })
                                                            .catch(error => {
                                                                Swal.showValidationMessage(
                                                                        `La requête a échoué: ${error}`
                                                                        )
                                                            })
                                                },
                                                allowOutsideClick: () => !Swal.isLoading()
                                            }).then((result) => {
                                                if (result.value !== 0) {
                                                    const Toast = Swal.mixin({
                                                        toast: true,
                                                        position: 'top-end',
                                                        showConfirmButton: false,
                                                        timer: 3000,
                                                        timerProgressBar: true,
                                                        didOpen: (toast) => {
                                                            toast.addEventListener('mouseenter', Swal.stopTimer)
                                                            toast.addEventListener('mouseleave', Swal.resumeTimer)
                                                        }
                                                    })

                                                    Toast.fire({
                                                        icon: 'success',
                                                        title: 'Trouvé. Redirection en cours . . .'
                                                    })
                                                    window.location.href = "/InfoContribuable/" + result.value
                                                } else {
                                                    Swal.fire({
                                                        icon: 'error',
                                                        title: 'Erreur...',
                                                        text: 'Ce contribuable n\'existe pas!'
                                                    })
                                                }
                                            })
                                        }

                                        async function recherche2() {
                                            const man = Swal.mixin({
                                                customClass: {
                                                    confirmButton: 'btn btn-success col-sm-12 ',
                                                    cancelButton: 'btn btn-danger col-sm-12'
                                                },
                                                buttonsStyling: false
                                            })
                                            man.fire({
                                                html:
                                                        '<div class="col-sm-12 my-auto">' +
                                                        '<div class="mb-2">' +
                                                        '<h2 class="text-dark mb-3">Recherche Machine</h2>' +
                                                        '<div class="row">' +
                                                        '<div class="col-sm-12 form-group">' +
                                                        '<input type="text" class="form-control style_form_control" id="nim" name="" placeholder="NIM">' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>',
                                                showCancelButton: true,
                                                cancelButtonText: 'Annuler',
                                                confirmButtonText: 'Rechercher',
                                                showLoaderOnConfirm: true,
                                                preConfirm: (login) => {
                                                    var variable;
                                                    if (document.getElementById('nim').value !== "") {
                                                        variable = "http://localhost:8080/api/ent/findcontribuablebyifu/" + document.getElementById('val1').value;
                                                    } else {
                                                        Swal.showValidationMessage(
                                                                'Le champ NIM est vide!'
                                                                )
                                                    }
                                                    return fetch(variable)
                                                            .then(response => {
                                                                if (!response.ok) {
                                                                    throw new Error(response.statusText)
                                                                }
                                                                return response.json()
                                                            })
                                                            .catch(error => {
                                                                Swal.showValidationMessage(
                                                                        `La requête a échoué: ${error}`
                                                                        )
                                                            })
                                                },
                                                allowOutsideClick: () => !Swal.isLoading()
                                            }).then((result) => {
                                                if (result.value !== 0) {
                                                    const Toast = Swal.mixin({
                                                        toast: true,
                                                        position: 'top-end',
                                                        showConfirmButton: false,
                                                        timer: 3000,
                                                        timerProgressBar: true,
                                                        didOpen: (toast) => {
                                                            toast.addEventListener('mouseenter', Swal.stopTimer)
                                                            toast.addEventListener('mouseleave', Swal.resumeTimer)
                                                        }
                                                    })

                                                    Toast.fire({
                                                        icon: 'success',
                                                        title: 'Trouvé. Redirection en cours . . .'
                                                    })
                                                    window.location.href = "/InfoMachine/" + result.value
                                                } else {
                                                    Swal.fire({
                                                        icon: 'error',
                                                        title: 'Erreur...',
                                                        text: 'Cette machine n\'existe pas!'
                                                    })
                                                }
                                            })
                                        }

                                        async function recherche3() {
                                            const man = Swal.mixin({
                                                customClass: {
                                                    confirmButton: 'btn btn-success col-sm-12 ',
                                                    cancelButton: 'btn btn-danger col-sm-12'
                                                },
                                                buttonsStyling: false
                                            })
                                            man.fire({
                                                html:
                                                        '<div class="col-sm-12 my-auto">' +
                                                        '<div class="mb-2">' +
                                                        '<h2 class="text-dark mb-3">Recherche Point de Vente</h2>' +
                                                        '<div class="row">' +
                                                        '<div class="col-sm-12 form-group">' +
                                                        '<input type="text" class="form-control style_form_control" name="" placeholder="Nom">' +
                                                        '</div>' +
                                                        '<div class="col-sm-6 form-group">' +
                                                        '<input type="text" class="form-control style_form_control" name="" placeholder="----">' +
                                                        '</div>' +
                                                        '<div class="col-sm-6 form-group">' +
                                                        '<input type="number" class="form-control style_form_control" name="" placeholder="----">' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>' +
                                                        '</div>',
                                                showCancelButton: true,
                                                cancelButtonText: 'Annuler',
                                                confirmButtonText: 'Rechercher',
                                                showLoaderOnConfirm: true,
                                                preConfirm: (login) => {
                                                    return fetch(`http://localhost:8080/api/countfacturebydate`)
                                                            .then(response => {
                                                                if (!response.ok) {
                                                                    throw new Error(response.statusText)
                                                                }
                                                                return response.json()
                                                            })
                                                            .catch(error => {
                                                                Swal.showValidationMessage(
                                                                        `La requête a échoué: ${error}`
                                                                        )
                                                            })
                                                },
                                                allowOutsideClick: () => !Swal.isLoading()
                                            }).then((result) => {
                                                if (result.isConfirmed) {
                                                    //window.location.href = "/showinfo"
                                                }
                                            })
                                        }
        </script>
    </body>
</html>