<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
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
                        <h5 class="flex-fill">Nouveau <span class="text-success">Contribuable</span></h5>
                    </div>
                </div>
            </div>
        </header>

       
        <div class="row">
            <div class="container-fluid">
                <div class="mx-sm-1 py-3">
                    <div class="row"><h4 class="text-dark"></h4></div>
                        <s:form class="mb-2" action="/savecontribuable" modelAttribute="contribuable" method="post">
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <div class="p-3 style_shadow rounded-lg bg-white mb-2 h-100">
                                        <div class="row">
                                            <div>
                                                <s:input id="heure" path="date_heure" type="hidden" />
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="ifu" placeholder="Numéro IFU"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="rccm" placeholder="RCCM"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="adresse" placeholder="Adresse"/>
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="adresse2" placeholder="Adresse 2"/>
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="adresse3" placeholder="Adresse 3"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="adresse4" placeholder="Adresse 4"/>
                                            </div>
                                            <div >
                                                <s:input id="date" class="form-control style_form_control" path="date_enregistrement"  type="hidden"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="id_activite" placeholder="Id Activité"/>
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <s:textarea class="form-control style_form_control" path="commentaire" placeholder="Commentaire"></s:textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class=" col-sm-6 mb-3">
                                    <div class=" bg-white border p-3">
                                        <div class="p-3 style_shadow rounded-lg bg-white mb-2 h-100">
                                            <div class="row">
                                                <div class="col-sm-12 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="nom" placeholder="Nom et prénom"/>
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="contact_personnel" placeholder="Numéro Personnel"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="description_location" placeholder="Domicile"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="telephone" placeholder="N° Téléphone"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="zip" placeholder="Code Zip"/>
                                            </div>
                                            <div class="col-sm-6 form-group">
                                                <s:input type="text" class="form-control style_form_control" path="email" placeholder="E-Mail"/>
                                            </div>
                                            <div class="col-sm-12 form-group">
                                                <label class="text-muted"><small>Ville</small></label>
                                                <s:select class="form-control style_form_control" path="ville">
                                                    <option>Cotonou</option>
                                                    <option>Bohicon</option>
                                                    <option>Abomey-Calavi</option>
                                                </s:select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-12 form-group">
                            <button class="btn btn-block btn-danger mt-3" type="submit" onclick="setThen()">Enregistrer le Contribuable</button>
                        </div>
                    </s:form>
                </div>
            </div>
        </div>
        <br><br>

        <main class="bg-light">
            <div class="py-3">
                <div class="container-fluid">
                    <div class="bg-white p-2">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered">
                                <thead class="border-bottom">
                                    <tr>
                                        <th scope="col">IFU</th>
                                        <th scope="col">Nom</th>
                                        <th scope="col">Telephone</th>
                                        <th scope="col">E-mail</th>
                                        <th scope="col">Ville</th>
                                        <th scope="col">Code Zip</th>
                                        <th scope="col">RCCM</th>
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
        <script src="assets/js/jquery-1.12.4.min.js"></script>
        <script src="assets/js/d3.v3.min.js" type="application/javascript"></script>
        <script src="assets/js/cal-heatmap.js" type="application/javascript"></script>

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

                                var tr = Date.parse(new Date());
                                function convertir(ladate) {
                                    var currentTimeStamp = Date.parse(new Date(ladate));
                                    return currentTimeStamp / 1000;
                                }
                                function setThen() {
                                    var today = new Date();
                                    var h = today.getHours();
                                    var m = today.getMinutes();
                                    var s = today.getSeconds();
                                    m = checkTime(m);
                                    s = checkTime(s);
                                    document.getElementById('heure').value = h + ":" + m + ":" + s;

                                    var ladate = new Date();
                                    var d = ladate.getDay();
                                    var mm = ladate.getMonth();
                                    var y = ladate.getFullYear();
                                    document.getElementById('date').value = d + "/" + mm + "/" + y;
                                }

                                function checkTime(i) {
                                    if (i < 10) {
                                        i = "0" + i
                                    }
                                    ;  // add zero in front of numbers < 10
                                    return i;
                                }

                                $("#menu-toggle").click(function (e) {
                                    e.preventDefault();
                                    $("#wrapper").toggleClass("toggled");
                                });

                                $(".style_dropdown_toggle, .style_sousmenu_toggle").click(function (e) {
                                    e.preventDefault();
                                    $(this).parent().toggleClass("style_toggled");
                                });

        </script>
    </body>
</html>
