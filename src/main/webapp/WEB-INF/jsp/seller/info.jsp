<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="${contextPath}/assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        <link href="${contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/animate.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/style.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/new_style.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/all.min.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/aos.css" rel="stylesheet">
        <link href="${contextPath}/assets/css/slick.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="${contextPath}/assets/css/cal-heatmap.css" />
        <link href="${contextPath}/assets/css/Chart.min.css" rel="stylesheet" type="text/css">


        <script src = "${contextPath}/assets/js/angular.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/angular-countUp.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/angular-countUp.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/dynamique.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/aos.js"></script>
        <script src="${contextPath}/assets/js/slick.min.js"></script>
        <script src="${contextPath}/assets/js/Chart.min.js"></script>
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
                            <ul class="nav nav-tabs d-none">
                                <li><button class="btn btn-sm btn-outline-success mr-1 active" data-toggle="pill" href="#home">Données</button></li>
                            </ul>
                        </div>
                        <div class="collapse navbar-collapse">

                            <ul class="navbar-nav mx-auto">
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-filter mr-1"></i>Filtre</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">NIM</a>
                                        <a class="dropdown-item" href="#">Date d'Activation</a>
                                        <a class="dropdown-item" href="#">Date d'enregistrement</a>
                                        <a class="dropdown-item" href="#">Facture (Croissant)</a>
                                        <a class="dropdown-item" href="#">Facture (Décroissant)</a>
                                    </div>
                                </li>
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
                                <li class="breadcrumb-item text-info">Accueil</li>
                                <li class="breadcrumb-item text-danger">Informations sur un point de vente</li>
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
                        <div>
                            <div class="row gutters-sm">
                                <div class="col-md-4 mb-3">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="d-flex flex-column align-items-center text-center">
                                                <img src="${contextPath}/assets/img/facture_print.png" alt="Admin" class="rounded-circle" width="150">
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
                                        <div class="row card-body">
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
                            <div class="row gutters-sm">
                                <div class="col-sm-12 mb-3">
                                    <div class="container-fluid">
                                        <div class="d-flex justify-content-between align-items-center mb-1 float-right">
                                            <form class="flex-fill">
                                                <input type="search" class="form-control form-control-sm style_form_control" name="" placeholder="NIM">
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row gutters-sm">
                                <div class="col-sm-12 mb-3">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered">
                                            <thead class="border-bottom">
                                                <tr>
                                                    <th scope="col">N°</th>
                                                    <th scope="col">NIM</th>
                                                    <th scope="col">Date d'Activation</th>
                                                    <th scope="col">Date d'enregistrement</th>
                                                    <th scope="col">Nombre de Factures</th>
                                                    <th scope="col"></th>
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
                                                            <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>2</td>
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
                                                            <a href="#" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="${contextPath}/assets/js/jquery-1.12.4.min.js"></script>
        <script src="${contextPath}/assets/js/jquery.counterup.js" type="application/javascript"></script>
        <script src="${contextPath}/assets/js/counter/waypoints.min.js" type="application/javascript"></script>
        <script src="${contextPath}/assets/js/jquery.counterup.min.js" type="application/javascript"></script>
        <script src="${contextPath}/assets/js/d3.v3.min.js" type="application/javascript"></script>
        <script src="${contextPath}/assets/js/cal-heatmap.js" type="application/javascript"></script>
        <script src="${contextPath}/assets/js/reglo.js" type="application/javascript"></script>
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
