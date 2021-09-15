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
        <div id="app">
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
                                    <li class="breadcrumb-item text-danger">Rapport des factures</li>
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
                                    <div class="col-sm-12 mb-3">
                                        <div class="container-fluid">
                                            <div class="d-flex justify-content-between align-items-center mb-1 float-right">
                                                <div class="flex-fill">
                                                    <input type="date" v-model="search" class="form-control form-control-sm style_form_control" placeholder="Date">
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
                                                        <th scope="col">IFU</th>
                                                        <th scope="col">Nom et Prénoms</th>
                                                        <th scope="col">Factures Traitées</th>
                                                        <th scope="col">Factures en attente</th>
                                                        <th scope="col">Machines Connectées</th>
                                                        <th scope="col">Montant TVA</th>
                                                        <th scope="col">Montant HT</th>
                                                        <th scope="col">Montant TTC</th>
                                                        <th scope="col"></th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr v-if="vide, filtre.length == 0">
                                                        <td colspan="12"><span class="text-dark">Aucune donnée</span></td>
                                                    </tr>
                                                    <tr  v-for="(facture, index) in filtre" v-else>
                                                        <td>{{ index + 1 }}</td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.uid }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.uid }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.ifuseller }}</span>
                                                        </td>
                                                        <td>
                                                            <span>{{ facture.ifu_client }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.dateTime }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facture.payed) }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facture.total_tax) }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facture.total_taxable) }}</span>
                                                        </td>
                                                        <td>
                                                            <div class="d-flex">
                                                                <a @click="sendUid(facture.uid); show(facture.uid)" title="Imprimer" class="text-info mr-2"><i class="fa fa-file-invoice"></i></a>
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
        </div>
        <script src="${contextPath}/assets/js/jquery-1.12.4.min.js"></script>
        <script src="${contextPath}/assets/js/axios.min.js"></script>
        <!--<script src="https://unpkg.com/axios/dist/axios.min.js"></script>-->
        <script src="${contextPath}/assets/js/specific/facture.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>

