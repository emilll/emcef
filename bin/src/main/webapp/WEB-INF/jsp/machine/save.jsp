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
                }, 1000);

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
                                <li class="breadcrumb-item text-danger">Enregistrer machine</li>
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
                                <div class="col-sm-12 mb-3">
                                    <div class="table-responsive">
                                        <div class="offset-2 col-sm-8 offset-2 my-auto">
                                            <form class="mb-2" @submit.prevent="saveMachine">
                                                <h2 class="text-dark mb-3">Enregistrement</h2>
                                                <div class="row">
                                                    <div class="col-sm-6 form-group">
                                                        <label class="text-muted"><small>eNIM</small></label>
                                                        <input type="text" class="form-control style_form_control" v-model="nim" name="" disabled="disabled">
                                                    </div>
                                                    <div class="col-sm-6 form-group">
                                                        <label class="text-muted"><small>Nom Propriétaire</small></label>
                                                        <input type="text" class="form-control style_form_control" v-model="nom_proprietaire" name="" disabled="disabled">
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-sm-6 form-group">
                                                        <input type="number" class="form-control style_form_control" name="" v-model="numero_sim" placeholder="Numéro SIM">
                                                    </div>
                                                    <div class="col-sm-6 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" v-model="operateur" placeholder="Opérateur">
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-sm-6 form-group">
                                                        <label class="text-muted"><small>IFU</small></label>
                                                        <input type="text" class="form-control style_form_control" name="" v-model="ifu" disabled="disabled">
                                                    </div>
                                                    <div class="col-sm-6 form-group">
                                                        <label class="text-muted"><small>Version</small></label>
                                                        <input type="text" class="form-control style_form_control" name="" v-model="derniere_version">
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <label class="text-muted"><small>Point de Vente</small></label>
                                                        <select class="form-control style_form_control" v-model="vente" @change="modify">
                                                            <option v-for="p in installations" v-bind:value="p">{{ p.nom_commercial }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="offset-3 col-sm-6 offset-3 form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer la machine</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="${contextPath}/assets/js/jquery-1.12.4.min.js"></script>
        <script src="${contextPath}/assets/js/specific/machine.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>
