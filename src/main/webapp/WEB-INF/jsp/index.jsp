<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
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


        <script src = "assets/js/angular.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/js/angular-countUp.js"></script>
        <script type="text/javascript" src="assets/js/angular-countUp.min.js"></script>
        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
    </head>

    <body ng-app="demo">
        <%@include  file="views/menu.jsp" %>

        <div class="mt-5 bg-white py-1 border-bottom">
            <div class="container-fluid">
                <div class="d-flex justify-content-between align-items-center mb-1">
                    <input type="text" ng-model="query"/>
                    <h5 class="flex-fill">Tableau de <span class="text-success">{{query}}Bord</span></h5>
                </div>
            </div>
        </div>
        <div class="bg-light">
            <div>
                <div class="row">
                    <!-- Info Boxes Style 2 -->
                    <div class="info-box bg-warning col-md marge">
                        <span class="info-box-icon"><i class="fas fa-file-invoice"></i></span>

                        <div class="info-box-content">
                            <span class="info-box-text">Factures Traités</span>
                            <span class="info-box-number counter">5200</span>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                    <div class="info-box bg-success col-md marge">
                        <span class="info-box-icon"><i class="fas fa-file-invoice"></i></span>

                        <div class="info-box-content">
                            <span class="info-box-text">Factures en attente</span>
                            <span class="info-box-number counter">92050</span>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                    <div class="info-box bg-danger col-md marge">
                        <span class="info-box-icon"><i class="fas fa-receipt"></i></span>

                        <div class="info-box-content">
                            <span class="info-box-text">Rapports Traités</span>
                            <span class="info-box-number counter">114381</span>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                    <div class="info-box bg-info col-md marge">
                        <span class="info-box-icon"><i class="fas fa-receipt"></i></span>

                        <div class="info-box-content">
                            <span class="info-box-text">Rapports en attente</span>
                            <span class="info-box-number counter">163921</span>
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
                        <table class="offset-md-1 col-md-10 offset-md-1" ng-controller="tableController">
                            <thead>
                                <tr>
                                    <th>{{global1}}</th>
                                    <th><h2 count-up end-val="873.4"></h2></th>
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
                                                <span class="info-box-number counter">{{global1}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{global2}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{global3}}</span><span class="badge style_bg text-white"> FCFA</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{global4}}</span><span class="badge style_bg text-white"> FCFA</span>
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
                                                <span class="info-box-number counter">{{month1}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{month2}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="counter info-box-number">{{month3}}</span><span class="badge style_bg text-white"> FCFA</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="counter info-box-number">{{month4}}</span><span class="badge style_bg text-white"> FCFA</span>
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
                                                <span class="info-box-number counter">{{day1}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{day2}}</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{day3}}</span><span class="badge style_bg text-white"> FCFA</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text"></span>
                                                <span class="info-box-number counter">{{day4}}</span><span class="badge style_bg text-white"> FCFA</span>
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
                                                <span class="info-box-text">Connectés Hier</span>
                                                <span class="info-box-number counter">514</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text">Déconnectés Hier</span>
                                                <span class="info-box-number counter">246</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text">Connectés</span>
                                                <span class="info-box-number counter">315</span>
                                            </div>
                                            <!-- /.info-box-content -->
                                        </div>
                                    </td>
                                    <td>
                                        <div class="info-box bg-content col-md ">
                                            <span class="info-box-icon"></span>

                                            <div class="info-box-content">
                                                <span class="info-box-text">Nombres Total</span>
                                                <span class="info-box-number counter">16</span>
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
                <div class="tab-pane fade " id="contact" role="tabpanel" aria-labelledby="contact-tab">
                    <div class="row table-responsive">
                        <div class="col-md-auto" style="margin-left: auto; margin-right:  auto; margin-top: 50px">
                            <div id="pilier1" class="chart" style="margin-top: 50px"></div>
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
            <script src="assets/js/jquery.counterup.js" type="application/javascript"></script>
            <script src="assets/js/counter/waypoints.min.js" type="application/javascript"></script>
            <script src="assets/js/jquery.counterup.min.js" type="application/javascript"></script>
            <script src="assets/js/d3.v3.min.js" type="application/javascript"></script>
            <script src="assets/js/cal-heatmap.js" type="application/javascript"></script>
            <script src="assets/js/reglo.js" type="application/javascript"></script>
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

            <script>

                                                    function countUp () {
                                                        jQuery(document).ready(function ($)
                                                        {
                                                            $('.counter').counterUp({
                                                                delay: 10,
                                                                time: 1000
                                                            });
                                                        });
                                                    }
                                                    $timeout(countUp, 1000);


                                                    function convertir(ladate) {
                                                        var currentTimeStamp = Date.parse(new Date(ladate));
                                                        return currentTimeStamp / 1000;
                                                    }

                                                    yearcal1 = new CalHeatMap();
                                                    var dt = new Date();
                                                    yearcal1.init({
                                                        subDomain: "day",
                                                        start: new Date(dt.getFullYear(), 0),
                                                        domain: "month",
                                                        displayLegend: true,
                                                        cellRadius: 10,
                                                        cellSize: 16,
                                                        legendColors: {"min": "#90EE90", "max": "#006400", "base": "#D3D3D3", "empty": "#FAEBD7"},
                                                        considerMissingDataAsZero: false,
                                                        itemSelector: "#pilier1",
                                                        subDomainTextFormat: "%d",
                                                        data: 'http://localhost:8080/api/countfacturebydate',
                                                        highlight: ["now", dt],
                                                        domainMargin: 5,
                                                        legendVerticalPosition: "center",
                                                        legendOrientation: "vertical",
                                                        legendMargin: [0, 10, 0, 0],
                                                        tooltip: true,
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