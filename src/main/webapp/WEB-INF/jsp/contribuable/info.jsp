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
        <script>
            $(document).ready(function () {

                setTimeout(function () {
                    $('body').addClass('loaded');
                    $('h1').css('color', '#222222')
                }, 3000);

            });
        </script>
    </head>

    <body>
        <header id="header_top">
            <!-- <div id="loader-wrapper">
                 <div id="loader"></div>
                 <div class="loader-section section-left"></div>
                 <div class="loader-section section-right"></div>
             </div>!-->
            <%@include  file="../views/menu.jsp" %>
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
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1 flex-wrap">
                        <nav aria-label="breadcrumb m-0 flex-fill">
                            <ol class="breadcrumb m-0 py-1">
                                <li class="breadcrumb-item active text-danger">Accueil</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <main class="bg-light">
            <div class="py-3">
                <div class="container-fluid">
                    <div class="bg-white p-2 tab-content">
                        <div id="home" class="tab-pane fade in active show">
                            <div class="row gutters-sm">
                                <div class="col-md-4 mb-3">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="d-flex flex-column align-items-center text-center">
                                                <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150">
                                                <div class="mt-3">
                                                    <h4>John Doe</h4>
                                                    <p class="text-secondary mb-1">Full Stack Developer</p>
                                                    <p class="text-muted font-size-sm">Bay Area, San Francisco, CA</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card mt-3">
                                    </div>
                                </div>
                                <div class="col-md-8">
                                    <div class="card mb-3">
                                        <div class="card-body">
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Contribuable</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    Kenneth Valdez
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">IFU</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    0215479250130
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">NIM</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    ED0214058
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Contact</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    (229) 66 15 33 47
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Addresse</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    Cotonou, Jéricho, C/524
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-12">

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row gutters-sm">
                                        <div class="col-sm-12 mb-3">
                                            <form>
                                                <div class="inner-form">
                                                    <div class="basic-search">
                                                        <div class="input-field">
                                                            <input id="search" type="text" placeholder="Type Keywords" />
                                                            <div class="icon-wrap">
                                                                <svg class="svg-inline--fa fa-search fa-w-16" fill="#ccc" aria-hidden="true" data-prefix="fas" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                                                                <path d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path>
                                                                </svg>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="advance-search">
                                                        <span class="desc">ADVANCED SEARCH</span>
                                                        <div class="row">
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Accessories</option>
                                                                        <option>Subject b</option>
                                                                        <option>Subject c</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Color</option>
                                                                        <option>Subject b</option>
                                                                        <option>Subject c</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Size</option>
                                                                        <option>Subject b</option>
                                                                        <option>Subject c</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row second">
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Sale</option>
                                                                        <option>Subject b</option>
                                                                        <option>Subject c</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Time</option>
                                                                        <option>Last time</option>
                                                                        <option>Today</option>
                                                                        <option>This week</option>
                                                                        <option>This month</option>
                                                                        <option>This year</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="input-field">
                                                                <div class="input-select">
                                                                    <select data-trigger="" name="choices-single-defaul">
                                                                        <option placeholder="" value="">Type</option>
                                                                        <option>Subject b</option>
                                                                        <option>Subject c</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row third">
                                                            <div class="input-field">
                                                                <div class="result-count">
                                                                    <span>108 </span>results</div>
                                                                <div class="group-btn">
                                                                    <button class="btn-delete" id="delete">RESET</button>
                                                                    <button class="btn-search">SEARCH</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="graphes" class="tab-pane fade">
                            <div class="bg-white py-1 navbar navbar-expand-lg p-0">
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
                            <div class="tab-content">
                                <!--Sous-menu 1-->
                                <div class="tab-pane fade in active show" id="tab1">
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
                        <div id="calendrier" class="tab-pane fade">
                            <div class="row table-responsive">
                                <div class="col-md-auto" style="margin-left: auto; margin-right:  auto; margin-top: 50px">
                                    <div id="pilier1" class="chart" style="margin-top: 50px"></div>
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

            function countUp() {
                jQuery(document).ready(function ($)
                {
                    $('.counter').counterUp({
                        delay: 10,
                        time: 1000
                    });
                });
            }
            countUp();

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
                data: 'http://localhost:8082/api/countfacturebydate',
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
                            variable = "http://localhost:8082/api/ent/findcontribuablebyifu/" + document.getElementById('val1').value;
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
                        window.location.href = "/InfoContribuable/" + result.value;
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
                            variable = "http://localhost:8082/api/ent/findcontribuablebyifu/" + document.getElementById('val1').value;
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
                        return fetch(`http://localhost:8082/api/countfacturebydate`)
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
