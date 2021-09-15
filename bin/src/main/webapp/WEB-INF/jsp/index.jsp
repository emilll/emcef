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


        <script type="text/javascript" src="${contextPath}/assets/js/vue.js"></script>
        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
        <script>
            $(document).ready(function () {

                setTimeout(function () {
                    $('body').addClass('loaded');
                    $('h1').css('color', '#222222')
                }, 100);

            });
        </script>
    </head>

    <body>
        <header id="header_top">
            <div id="loader-wrapper">
                <div id="loader"></div>
                <div class="loader-section section-left"></div>
                <div class="loader-section section-right"></div>
            </div>
            <%@include  file="views/menu.jsp" %>
            <div class="mt-5 bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <h5 class="flex-fill"><a href="#">Tableau</a> de <span class="text-success">Bord</span></h5>
                    </div>
                </div>
                <nav class="navbar navbar-expand-lg navbar-light p-0">
                    <div class="container-fluid position-relative">
                        <div class="d-flex justify-content-between align-items-center flex-wrap">
                            <ul class="nav nav-tabs">
                                <li><button class="btn btn-sm btn-outline-success mr-1 active" data-toggle="pill" href="#home">Données</button></li>
                                <li><button class="btn btn-sm btn-outline-success mr-1"data-toggle="pill" href="#graphes">Graphes</button></li>
                                <li><button class="btn btn-sm btn-outline-success mr-1" data-toggle="pill" href="#calendrier">Calendrier</button></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </header>
        <main class="bg-light" id="app">
            <div>
                <div class="">
                    <div class="tab-content">
                        <div id="home" class=" active tab-pane fade in show">
                            <div class="container-fluid py-3">
                                <div class="p-2">
                                    <div class="row">
                                        <div class="col-sm-6 col-lg-3">
                                            <div class="media bg-white p-3 m-2">
                                                <h1 class="pr-3">
                                                    <div href="#"><i class="fa fa-file-invoice"></i></div>
                                                </h1>
                                                <div class="media-body">
                                                    <h6 class="my-0">
                                                        <div href="#">Factures Traitées</div>
                                                    </h6>
                                                    <h4 class="font-weight-bolder">{{ banniere.traités }}</h4>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-lg-3">
                                            <div class="media bg-white text-muted p-3 m-2">
                                                <h1 class="pr-3">
                                                    <div href="#"><i class="fa fa-file-invoice"></i></div>
                                                </h1>
                                                <div class="media-body">
                                                    <h6 class="my-0">
                                                        <div href="#">Factures en attente</div>
                                                    </h6>
                                                    <h4 class="font-weight-bolder">{{ banniere.attente }}</h4>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-lg-3">
                                            <div class="media bg-white p-3 m-2">
                                                <h1 class="pr-3">
                                                    <div href=""><i class="fa fa-clock"></i></div>
                                                </h1>
                                                <div class="media-body">
                                                    <h6 class="my-0">
                                                        <div href="">Machines Virtuelles Connectées</div>
                                                    </h6>
                                                    <h4 class="font-weight-bolder">{{ banniere.connected }}</h4>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-lg-3">
                                            <div class="media bg-white text-muted p-3 m-2">
                                                <h1 class="pr-3">
                                                    <div href=""><i class="fa fa-file-alt"></i></div>
                                                </h1>
                                                <div class="media-body">
                                                    <h6 class="my-0">
                                                        <div href="">Rapports Traités</div>
                                                    </h6>
                                                    <h4 class="font-weight-bolder">{{ banniere.rapports }}</h4>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="py-3">
                                <div class="container-fluid">
                                    <div class="bg-white p-2">
                                        <div class="table-responsive">
                                            <table class="table table-bordered style_table">
                                                <thead class="bg-success text-white">
                                                    <tr>
                                                        <th scope="col" class="border-0 bg-white"></th>
                                                        <th scope="col">Facture</th>
                                                        <th scope="col">Rapports</th>
                                                        <th scope="col">Montant TTC</th>
                                                        <th scope="col">Montant HT</th>
                                                        <th scope="col">Montant de la TVA</th>
                                                    </tr>
                                                </thead>
                                                <tbody class="">
                                                    <tr>
                                                        <th class="bg-success text-white">Totaux Globaux</th>
                                                        <td><h5 class="counter">{{ verification(valeur1.nbre) }}</h5></td>
                                                        <td><h5 class="counter">{{ verification(valeur1.rapport) }}</h5></td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur1.totalTTC) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur1.totalHT) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur1.totalTVA) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <th class="bg-success text-white">Totaux Mensuel</th>
                                                        <td><h5 class="counter">{{ verification(valeur2.nbre) }}</h5></td>
                                                        <td><h5 class="counter">{{ verification(valeur2.rapport) }}</h5></td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur2.totalTTC) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur2.totalHT) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur2.totalTVA) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <th class="bg-success text-white">Totaux Journalier</th>
                                                        <td><h5 class="counter">{{ verification(valeur3.nbre) }}</h5></td>
                                                        <td><h5 class="counter">{{ verification(valeur3.rapport) }}</h5></td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur3.totalTTC) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur3.totalHT) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                        <td style="min-width:210px">
                                                            <h5 class="counter">{{ verification(valeur3.totalTVA) }}</h5>
                                                            <h5 class="badge badge-dark">FCFA</h5>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="graphes"  class="container-fluid tab-pane fade">
                            <div class="bg-white container-fluid">
                                <div class="bg-white p-2 navbar navbar-expand-lg p-0">
                                    <div class="container-fluid">
                                        <div class="d-flex justify-content-between align-items-center mb-1 float-right flex-fill">
                                            <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContentDetail" aria-controls="navbarSupportedContentDetail" aria-expanded="false" aria-label="Toggle navigation">
                                                <i class="fa fa-ellipsis-h"></i>
                                            </button>
                                            <div class="collapse navbar-collapse justify-content-between align-items-center" id="navbarSupportedContentDetail">
                                                <ul class="ml-auto align-items-sm-center">
                                                    <div class="d-flex align-items-center flex-wrap nav nav-tabs">
                                                        <button class="btn btn-sm btn-outline-secondary mr-1 active" data-toggle="pill" href="#tab1"><i class="fa fa-chart-line"></i></button>
                                                        <button class="btn btn-sm btn-outline-secondary mr-1" data-toggle="pill" href="#tab2"><i class="fa fa-circle"></i></button>
                                                        <button class="btn btn-sm btn-outline-secondary mr-1" data-toggle="pill" href="#tab3"><i class="fa fa-chart-area"></i></button
                                                    </div>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="container-fluid tab-content">
                                    <!--Sous-menu 1-->
                                    <div class="bg-white tab-pane fade in active show" id="tab1">
                                        <div class="row">
                                            <div class="col-md-6 mb-3">
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
                                    <!--Sous-menu 2-->
                                    <div class="tab-pane fade" id="tab2">
                                        <div class="row">
                                            <div class="col-md-6 mb-3">
                                                <div class=" bg-white border p-3">
                                                    <h4 class="text-dark">Total TTC</h4>
                                                    <div class="table-responsive">
                                                        <canvas id="myPie" class="w-100" height="100"></canvas>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-6 mb-3">
                                                <div class=" bg-white border p-3">
                                                    <h4 class="text-dark">Total HT</h4>
                                                    <div class="table-responsive">
                                                        <canvas id="polarArea" class="w-100" height="100"></canvas>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!--Sous-menu 3-->
                                    <div class="tab-pane fade" id="tab3">
                                        <div class="row">
                                            <div class="col-md-12 mb-3">
                                                <div class=" bg-white border p-3">
                                                    <h4 class="text-dark">Total TVA</h4>
                                                    <div class="table-responsive">
                                                        <canvas id="radar" class="w-100" height="70"></canvas>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="calendrier" class="container-fluid tab-pane fade">
                            <div>
                                <div class="table-responsive bg-white">
                                    <div class="col-md-auto" style="margin-left: auto; margin-right:  auto; margin-top: 50px">
                                        <div id="pilier1" class="chart" style="margin-top: 50px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="assets/js/jquery-1.12.4.min.js"></script>
        <script src="assets/js/jquery.counterup.js" type="application/javascript"></script>
        <script src="assets/js/counter/waypoints.min.js" type="application/javascript"></script>
        <script src="assets/js/jquery.counterup.min.js" type="application/javascript"></script>
        <script src="assets/js/d3.v3.min.js" type="application/javascript"></script>
        <script src="assets/js/cal-heatmap.js" type="application/javascript"></script>
        <script src="assets/js/reglo.js" type="application/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <script>
            var tester = function () {
                jQuery(document).ready(function ($) {
                    $('.counter').counterUp({
                        delay: 10,
                        time: 3000
                    });
                });
            }
            setTimeout(tester, 1500);

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
                data: '/api/countfacturebydate',
                highlight: ["now", dt],
                domainMargin: 5,
                legendVerticalPosition: "center",
                legendOrientation: "vertical",
                legendMargin: [0, 10, 0, 0],
                tooltip: true,
                onClick: function (date, nb) {
                    function convertirFrench(vet) {
                        var today = new Date(vet);
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
                        return the_date;
                    }
                    function convert(str) {
                        var date = new Date(str),
                                mnth = ("0" + (date.getMonth() + 1)).slice(-2),
                                day = ("0" + date.getDate()).slice(-2);
                        return [date.getFullYear(), mnth, day].join("-");
                    }


                    async function afficher(a, b, c, d, e) {
                        Swal.fire({
                            icon: 'info',
                            title: 'Pour le ' + convertirFrench(convert(date)) + ' on a:',
                            html:
                                    '<b>' + e + '</b> Rapports<br> ' +
                                    '<b>' + d + '</b> Factures<br> ' +
                                    '<b>' + b + '</b> FCFA TTC<br>' +
                                    '<b>' + a + '</b> FCFA TVA<br>' +
                                    '<b>' + c + '</b> FCFA HT<br>',
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


                    fetch("/api/day/" + convert(date), {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                        if (response.ok) {
                            return response.json()
                        }
                    }).then(response => {
                        afficher(
                                new Intl.NumberFormat('en-US', {style: 'decimal'}).format(response.tva),
                                new Intl.NumberFormat('en-US', {style: 'decimal'}).format(response.ttc),
                                new Intl.NumberFormat('en-US', {style: 'decimal'}).format(response.ht),
                                new Intl.NumberFormat('en-US', {style: 'decimal'}).format(response.factures),
                                new Intl.NumberFormat('en-US', {style: 'decimal'}).format(response.rapports)
                                )
                    }).catch(error => {
                        console.log("ERREUR. PAS DE RETOUR!!!")
                    });

                }
            });
        </script>
        <%@include  file="views/footer.jsp" %>
    </body>
</html>