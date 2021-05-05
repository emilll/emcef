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
        <script src = "assets/js/angular.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
    </head>

    <body ng-app="demo">
        <header id="header_top">
            <nav class="navbar navbar-expand-lg navbar-dark style_bg p-0 fixed-top">
                <div class="container-fluid position-relative">
                    <div class="navbar-brand">
                        <h4><a href="home.html" class="mr-3"><i class="fa fa-th-large"></i></a>R�glo</h4>
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
                                    <a class="dropdown-item" href="/facttoday">Factures d'aujourd'hui</a>
                                    <a class="dropdown-item" href="/machinessignales">Machines signal�es aujourd'hui</a>
                                    <a class="dropdown-item" href="/machinesnonsignales">Machines non signal�es aujourd'hui</a>
                                    <a class="dropdown-item" href="/journalaudit">Journal d'audit</a>
                                    <a class="dropdown-item" href="/donnees">Paquets des transactions</a>
                                    <a class="dropdown-item" href="/daystate">Statut d'aujourd'hui</a>
                                    <a class="dropdown-item" href="/daystats">Statistiques quotidiennes</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Enregistrement
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Contribuable</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Machines</a>
                                    <a class="dropdown-item" href="/ajouterinstallation">Point de Vente</a>
                                    <a class="dropdown-item" href="/ajouteremplacement">Emplacement des machines</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Donn�es
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/ajoutercontribuable">Factures</a>
                                    <a class="dropdown-item" href="/ajoutermachine">Totaux quotidiennes</a>
                                    <a class="dropdown-item" href="/ajouterd�partement">Statuts</a>
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
                                    <a class="dropdown-item" href="/ajouterd�partement">Dates des rapports des machines</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">V�rifier</a>
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
                                    <img src="assets/img/profilMan.jpg" width="35" height="35" class="rounded-circle border" alt="..."> Nom pr�nom
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">D�connexion</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="mt-5 bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <h5 class="flex-fill">Paquets <span class="text-success">des</span> transactions</h5>
                    </div>
                </div>
            </div>

        </header>
        <div class="bg-light">
            <div class="container-fluid">
                <div class="row align-items-center justify-content-center">
                    <!-- Info Boxes Style 2 -->
                    <div class="info-box bg-title col-md-5 marge">
                        <div class="info-box-content">
                            <div class="col-sm-12 form-group">
                                <label>D�but connexion</label>
                                <input id="b1" name="ifu" type="date" class="form-control style_form_control" autocomplete="off" value=""/>
                            </div>
                            <div class="col-sm-3 form-group">
                                <button class="btn btn-block btn-danger mt-3"><i class="fas fa-filter"></i>Filtrer</button>
                            </div>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                    <div class="info-box bg-content col-md-5 marge">
                        <div class="info-box-content">
                            <div class="col-sm-12 form-group">
                                <label>Fin connexion</label>
                                <input id="b2" name="ifu" type="date" class="form-control style_form_control" autocomplete="off" value=""/>
                            </div>
                            <div class="col-sm-3 form-group">
                                <button class="btn btn-block btn-danger mt-3"><i class="fas fa-filter"></i>Filtrer</button>
                            </div>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                </div>
                <div class="row">
                    <div class="bg-white p-2 col-md-12">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered">
                                <thead class="border-bottom">
                                    <tr>
                                        <th scope="col">N�</th>
                                        <th scope="col">D�but connexion</th>
                                        <th scope="col">Fin connexion</th>
                                        <th scope="col">Taille requ�te</th>
                                        <th scope="col">Taille r�ponse</th>
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
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                        <div class="d-flex justify-content-between align-items-center">
                            <p>2 �l�ments sur 6</p>
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



            <script src="assets/js/jquery-1.12.4.min.js"></script>
            <script src="assets/js/counter/jquery.counterup.min.js" type="application/javascript"></script>
            <script src="assets/js/counter/waypoints.min.js" type="application/javascript"></script>
            <script src="assets/js/counter/counterup-active.js" type="application/javascript"></script>
            <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

            <script>

                                        $('.counter').each(function () {
                                            $(this).prop('Counter', 0).animate({
                                                Counter: $(this).text()
                                            }, {
                                                duration: 5000,
                                                easing: 'swing',
                                                step: function (now) {
                                                    $(this).text(Math.ceil(now));
                                                }
                                            });
                                        });

                                        function compter() {
                                            $('.counter').counterUp({
                                                delay: 10,
                                                time: 3000
                                            });
                                        }
                                        //compter();
                                        //setTimeout(compter, 5000);
                                        var tr = Date.parse(new Date('2021-04-12'));
                                        function convertir(ladate) {
                                            var currentTimeStamp = Date.parse(new Date(ladate));
                                            return currentTimeStamp / 1000;
                                        }

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
                                                                        `La requ�te a �chou�: ${error}`
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
                                                        title: 'Trouv�. Redirection en cours . . .'
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
                                                                        `La requ�te a �chou�: ${error}`
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
                                                        title: 'Trouv�. Redirection en cours . . .'
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
                                                                        `La requ�te a �chou�: ${error}`
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

