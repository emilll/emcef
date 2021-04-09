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

        <!--Pour la date-->
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.css"/>
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.midnight-blue.css"/>
        <!--Fin Pour la date-->

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

                <div class=" py-3">

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-3 col-6">
                                <!-- small box -->
                                <div class="small-box bg-info">
                                    <div class="inner">
                                        <h3 id="factures">1</h3>

                                        <p>Totaux de ce jour</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-android-list"></i>
                                    </div>
                                    <p class="small-box-footer">Factures <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            <!-- ./col -->
                            <div class="col-lg-3 col-6">
                                <!-- small box -->
                                <div class="small-box bg-success">
                                    <div class="inner">
                                        <h3 id="rapports">1</h3>

                                        <p>Totaux d'aujourd'hui</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-stats-bars"></i>
                                    </div>
                                    <p class="small-box-footer">Rapports <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            <!-- ./col -->
                            <div class="col-lg-3 col-6">
                                <!-- small box -->
                                <div class="small-box bg-warning">
                                    <div class="inner">
                                        <h3 id="montant1">1</h3>

                                        <p>Totaux d'aujourd'hui</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-pricetag"></i>
                                    </div>
                                    <p class="small-box-footer">Montant <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            <!-- ./col -->
                            <div class="col-lg-3 col-6">
                                <!-- small box -->
                                <div class="small-box bg-danger">
                                    <div class="inner">
                                        <h3 id="montant2">1</h3>

                                        <p>Totaux TVA</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-pie-graph"></i>
                                    </div>
                                    <p class="small-box-footer">Montant <i class="fas fa-arrow-circle-right"></i></p>
                                </div>
                            </div>
                            <!-- ./col -->
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
                                <!-- tools card -->
                                <!-- /. tools -->
                            </div>
                            <!-- /.card-header -->
                            <div class="card-body pt-0">
                                <!--The calendar -->
                                <div id="calendar" style="width: 100%"></div>
                            </div>
                            <!-- /.card-body -->
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
                Swal.fire({
                    icon: 'info',
                    title: the_date,
                    html:
                            '<b>53</b> Rapports<br> ' +
                            '<b>72</b> Factures<br> ' +
                            '<b>18000</b> FCFA TTC<br>',
                    allowOutsideClick: false,
                    showConfirmButton: false,
                    showCloseButton: true,
                    hideClass: {
                        popup: 'swal2-hide',
                        backdrop: 'swal2-backdrop-hide',
                        icon: 'swal2-icon-hide'
                    }
                })
            });
        });


            </script>
            <script src="js/evo-calendar.js"></script>
    </body>
</html>
