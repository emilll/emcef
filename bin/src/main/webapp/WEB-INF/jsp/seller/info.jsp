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
                }, 500);

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
                                <li class="breadcrumb-item text-danger">Tous les points de vente</li>
                                <li class="breadcrumb-item text-danger">Informations sur un point de vente</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <main class="bg-light" id="appinfo">
            <div class="py-3">
                <div class="container-fluid">
                    <div class="bg-white p-2 tab-content">
                        <div>
                            <div class="row gutters-sm">
                                <div class="col-md-4 mb-3">
                                    <div class="card h-55">
                                        <div>
                                            <div class="d-flex flex-column align-items-center text-center">
                                                <img src="${contextPath}/assets/img/facture_print.png" alt="Admin" class="rounded-circle" width="100">
                                                <div class="mt-3">
                                                    <h4>{{ info.nom_commercial }}</h4>
                                                    <p class="text-muted font-size-sm">IFU:  {{ info.ifuseller }}</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-8">
                                    <div class="card h-26 m-1">
                                        <div>
                                            <div class="row col-sm-12">
                                                <div class="col-sm-6 form-group">
                                                    <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                        <div class="">
                                                            <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ montant.factures }}</span>
                                                            <h5 class="card-title mt-3" style="font-size: 20px">Factures</h5>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 form-group">
                                                    <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                        <div class="">
                                                            <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ montant.rapports }}</span>
                                                            <h5 class="card-title mt-3" style="font-size: 20px">Rapports</h5>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row col-sm-12">
                                                <div class="col-sm-6 form-group">
                                                    <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                        <div class="">
                                                            <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(montant.totalTTC) }}</span>
                                                            <h5 class="card-title mt-3" style="font-size: 20px">Montant TTC</h5>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6">
                                                    <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                        <div class="">
                                                            <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(montant.totalHT) }}</span>
                                                            <h5 class="card-title mt-3" style="font-size: 20px">Montant HT</h5>
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
                                            <div class="flex-fill">
                                                <input type="search" v-model="search"  class="form-control form-control-sm style_form_control" name="" placeholder="NIM">
                                            </div>
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
                                                    <th scope="col">Statut</th>
                                                    <th scope="col"></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr v-if="vide, filtre.length == 0">
                                                    <td colspan="12"><span class="text-dark">Aucune donnée</span></td>
                                                </tr>
                                                <tr  v-for="(machine, index) in filtre" v-else>
                                                    <td>{{ index + 1 }}</td>
                                                    <td>
                                                        <span class="text-dark">{{ machine.nim }}</span>
                                                    </td>
                                                    <td>
                                                        <span>{{ machine.date_activation }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="badge style_bg text-white">{{ machine.date_enregistrement }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-success">{{ machine.nbrFact }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-success">{{ machine.status }}</span>
                                                    </td>
                                                    <td>
                                                        <div class="d-flex">
                                                            <a :href="${contextPath}'/machine/' + machine.nim" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
        <script src="${contextPath}/assets/js/specific/installationinfo.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>
