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
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1 flex-wrap">
                        <nav aria-label="breadcrumb m-0 flex-fill">
                            <ol class="breadcrumb m-0 py-1">
                                <li class="breadcrumb-item text-info">Accueil</li>
                                <li class="breadcrumb-item text-danger">Enregistrer Emplacement</li>
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
                        <nav class="navbar navbar-expand-lg navbar-light p-0">
                            <div class="container-fluid position-relative">
                                <div class="d-flex justify-content-between align-items-center flex-wrap">
                                    <ul class="nav nav-tabs">
                                        <li><button class="btn btn-sm btn-outline-success mr-1 active" data-toggle="pill" href="#pays">Pays</button></li>
                                        <li><button class="btn btn-sm btn-outline-success mr-1"data-toggle="pill" href="#departement">Département</button></li>
                                        <li><button class="btn btn-sm btn-outline-success mr-1" data-toggle="pill" href="#commune">Commune</button></li>
                                        <li><button class="btn btn-sm btn-outline-success mr-1"data-toggle="pill" href="#ville">Ville</button></li>
                                        <li><button class="btn btn-sm btn-outline-success mr-1" data-toggle="pill" href="#quartier">Quartier</button></li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                        <div>
                            <div class="gutters-sm tab-content">
                                <div class="col-sm-12 mb-3 active tab-pane fade in show" id="pays">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="savePays">
                                                <h2 class="text-dark mb-3">Pays</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom" v-model="pays.nom">
                                                    </div>
                                                    <div class="offset-3 col-sm-6 offset-3 form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer Pays</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12 mb-3 tab-pane fade" id="departement">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="saveDepartement">
                                                <h2 class="text-dark mb-3">Département</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom" v-model="departement.nom">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <label>Pays</label>
                                                        <select v-model="departement.idpays" class="form-control style_form_control">
                                                            <option v-for="p in dataPays" v-bind:value="p.id">{{ p.nom }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="offset-2 col-sm-8 offset-2form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer le Département</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12 mb-3 tab-pane fade" id="commune">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="saveCommune">
                                                <h2 class="text-dark mb-3">Commune</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom" v-model="commune.nom">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <label>Département</label>
                                                        <select v-model="commune.iddepartement" class="form-control style_form_control">
                                                            <option v-for="p in dataDepartements" v-bind:value="p.id">{{ p.nom }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="offset-2 col-sm-8 offset-2 form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer la commune</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12 mb-3 tab-pane fade" id="ville">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="saveVille">
                                                <h2 class="text-dark mb-3">Ville</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom" v-model="ville.nom">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <label>Commune</label>
                                                        <select v-model="ville.idcommune" class="form-control style_form_control">
                                                            <option v-for="p in dataCommunes" v-bind:value="p.id">{{ p.nom }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="offset-3 col-sm-6 offset-3 form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer la Ville</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12 mb-3 tab-pane fade" id="quartier">
                                    <div class="table-responsive">
                                        <div class="col-sm-12 my-auto">
                                            <form class="mb-2" @submit.prevent="saveQuartier">
                                                <h2 class="text-dark mb-3">Quartier</h2>
                                                <div class="row">
                                                    <div class="col-sm-12 form-group">
                                                        <input type="text" class="form-control style_form_control" name="" placeholder="Nom" v-model="quartier.nom">
                                                    </div>
                                                    <div class="col-sm-12 form-group">
                                                        <label>Ville</label>
                                                        <select v-model="quartier.idville" class="form-control style_form_control">
                                                            <option v-for="p in dataVilles" v-bind:value="p.id">{{ p.nom }}</option>
                                                        </select>
                                                    </div>
                                                    <div class="offset-2 col-sm-8 offset-2form-group">
                                                        <button class="btn btn-block btn-outline-success mt-3" type="submit">Enregistrer le Quartier</button>
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
        <script src="${contextPath}/assets/js/specific/emplacement.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>


