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
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
    </head>

    <body>
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
                                    <img src="assets/img/profilMan.jpg" width="35" height="35" class="rounded-circle border" alt="..."> Nom pr�nom
                                </a>
                                <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">Profil</a>
                                    <div class="dropdown-divider my-0"></div>
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
                            <ul class="navbar-nav mx-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="#"><small><i class="fa fa-circle mr-1"></i>Autre</small></a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-filter mr-1"></i>Filtre</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Filtre 1</a>
                                        <a class="dropdown-item" href="#">Filtre 2</a>
                                        <a class="dropdown-item" href="#">Filtre 3</a>
                                        <a class="dropdown-item" href="#">Filtre 4</a>
                                        <a class="dropdown-item" href="#">Filtre 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-th-list mr-1"></i>Regrouper</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Regroupement 1</a>
                                        <a class="dropdown-item" href="#">Regroupement 2</a>
                                        <a class="dropdown-item" href="#">Regroupement 3</a>
                                        <a class="dropdown-item" href="#">Regroupement 4</a>
                                        <a class="dropdown-item" href="#">Regroupement 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <small><i class="fa fa-star mr-1"></i>Favoris</small>
                                    </a>
                                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Filtre 1</a>
                                        <a class="dropdown-item" href="#">Filtre 2</a>
                                        <a class="dropdown-item" href="#">Filtre 3</a>
                                        <a class="dropdown-item" href="#">Filtre 4</a>
                                        <a class="dropdown-item" href="#">Filtre 5</a>
                                        <div class="dropdown-divider my-0"></div>
                                        <a class="dropdown-item" href="#">Autres option</a>
                                    </div>
                                </li>
                            </ul>
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
                            <div class="col-sm-6 my-auto">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class=" bg-white border p-3">
                                            <h4 class="text-dark">Total TTC</h4>
                                            <div>
                                                <canvas id="myLine" class="w-100"></canvas>
                                            </div>
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
                </div>
            </div>
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
                                <th scope="col">N�</th>
                                <th scope="col">Date</th>
                                <th scope="col">Libell�</th>
                                <th scope="col">Badge</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Action</th>
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
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
                                    <div class="d-flex">
                                        <a href="#" title="Modifier" class="text-secondary mr-2"><i class="fa fa-edit"></i></a>
                                        <a href="#" title="Supprimer" class="text-danger mr-2"><i class="fa fa-trash-alt"></i></a>
                                        <a href="#" title="D�tail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                    </div>
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
<script src="assets/js/reglo.js" type="application/javascript"></script>
</body>
</html>
