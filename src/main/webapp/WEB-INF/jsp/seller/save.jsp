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
        <link href="${contextPath}/assets/css/Chart.min.css" rel="stylesheet" type="text/css">


        <script type="text/javascript" src="${contextPath}/assets/js/vue.js"></script>
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
                }, 5000);

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
                    </div>
                </nav>
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1 flex-wrap">
                        <nav aria-label="breadcrumb m-0 flex-fill">
                            <ol class="breadcrumb m-0 py-1">
                                <li class="breadcrumb-item text-info">Accueil</li>
                                <li class="breadcrumb-item text-danger">Enregistrer Point de Vente</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <main class="bg-light" id="app">
            <div class="py-3">
                <div class="container-fluid">
                    <div class="bg-white p-2 tab-content">
                        <div>
                            <div class="row gutters-sm">
                                <div class="col-sm-6 mb-3">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="saveSeller">
                                                <h2 class="text-dark mb-3">Enregistrement</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="UID" v-model="departement.nom">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <label>Pays</label>
                                                        <select v-model="departement.idpays" class="form-control style_form_control">
                                                            <option v-for="p in dataPays" v-bind:value="p.id">{{ p.nom }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom Commercial">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Ville">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Adresse1">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Adresse2">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Zip">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Description">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Contact Personnel">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Téléphone">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="E-mail">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Latitude">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" placeholder="Longitude">
                                                    </div>
                                                    <div class="offset-3 col-sm-6 offset-3 form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer le Point de Vente</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 mb-3">
                                    <iframe class="mx-auto px-2 mt-0 w-100 p-3 h-50" src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d15860.764275316606!2d2.4139587959381097!3d6.369314406844872!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sfr!2sbj!4v1624617765007!5m2!1sfr!2sbj" width="500" height="" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="${contextPath}/assets/js/jquery-1.12.4.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/js/specific/seller.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>