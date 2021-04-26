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
                        <h5 class="flex-fill"><a href="#">Informations</a> du <span class="text-success">Contribuable</span></h5>

                    </div>
                </div>
                <nav class="navbar navbar-expand-lg navbar-light p-0">
                    <div class="container-fluid position-relative">
                        <div class="d-flex justify-content-between align-items-center flex-wrap">
                            <button class="btn btn-sm btn-success mr-1">Ajouter une machine</button>
                        </div>
                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContentDetail" aria-controls="navbarSupportedContentDetail" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-ellipsis-h"></i>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContentDetail">
                            
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
                            <div class="col-sm-12 my-auto">
                                <div class="align-items-center border p-3">
                                    <div class="row mb-3 my-auto">
                                        <a href="#">
                                            <img src="assets/img/logo.png" loading='lazy' width="200" class="img-fluid" alt="logo">
                                        </a>
                                    </div><br>
                                    <div class="row mb-3 my-auto">
                                        <p class="mb-2 badge style_bg text-white">
                                            <a href="#">Dénomination: </a>
                                        </p>
                                        <p class="mb-2">
                                            &nbsp;&nbsp;ASSANA SERVICES
                                        </p>
                                    </div>
                                    <div class="row mb-3 my-auto">
                                        <p class="mb-2 badge style_bg text-white">
                                            IFU: 
                                        </p>
                                        <p class="mb-2">
                                            &nbsp;&nbsp;1234567891025
                                        </p>
                                    </div>
                                    <div class="row mb-3 my-auto">
                                        <p class="mb-2 badge style_bg text-white">
                                            <a href="#">E-Mail: </a>
                                        </p>
                                        <p class="mb-2">
                                            &nbsp;&nbsp;contact@contact.com
                                        </p>
                                    </div>
                                    <div class="row mb-3 my-auto">
                                        <p class="mb-2 badge style_bg text-white">
                                            <a href="#">Téléphone: </a>
                                        </p>
                                        <p class="mb-2">
                                            &nbsp;&nbsp;(+229) 66153347
                                        </p>
                                    </div>
                                </div>
                            </div>
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
            </div><br>
            <div class="row">
                <div class="col-md-auto" style="margin: auto;">
                    <div id="pilier" class="chart"></div>
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
                                        <th scope="col">Date d'Activation</th>
                                        <th scope="col">Propriétaire</th>
                                        <th scope="col">ID SIM</th>
                                        <th scope="col">Numéro SIM</th>
                                        <th scope="col">NIM</th>
                                        <th scope="col">Opérateur</th>
                                        <th scope="col">Date Dernier Rapport</th>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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
                                            <span class="badge style_bg text-white">Badge</span>
                                        </td>
                                        <td>
                                            <span class="text-success">90.000</span>
                                        </td>
                                        <td></td>
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

        <script src="assets/js/jquery-1.12.4.min.js"></script>
        <script src="assets/js/d3.v3.min.js" type="application/javascript"></script>
        <script src="assets/js/cal-heatmap.js" type="application/javascript"></script>
        <script src="assets/js/reglo.js" type="application/javascript"></script>
        <script>
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
        </script>
    </body>
</html>
