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
                                    <li class="breadcrumb-item text-danger">Vérification de la facture</li>
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
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row gutters-sm">
                                    <div class="col-sm-12 mb-3">
                                        <div class="table-responsive">
                                            <div class="alert alert-danger" role="alert" v-if="show == '2'">
                                                <h4 class="alert-heading">Erreur !!!</h4>
                                                <span class="container">
                                                    Le Code MECeF fourni ne correspond à aucune facture.
                                                </span>
                                            </div>
                                            <div class="alert alert-success" v-if="show == '1'">
                                                <h4 class="alert-heading">Réussi !!!</h4>
                                                <span class="container">
                                                    Facture trouvée. Voyez les informations ci-dessous!!!
                                                </span>
                                            </div>
                                            <div class="offset-2 col-sm-8 offset-2 my-auto">
                                                <div class="mb-2">
                                                    <div class="row">
                                                        <div class="col-sm-12 form-group">
                                                            <input type="text" class="form-control style_form_control" name="" placeholder="Code MECeF . . ." v-model="uid">
                                                        </div>
                                                        <div class="offset-3 col-sm-6 offset-3 form-group">
                                                            <button class="btn btn-block btn-outline-success mt-3" type="submit" @click="chercher(uid)">Vérifier</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="bg-light" v-if="vide">
                                                <div class="py-5">
                                                    <div class="container">
                                                        <div class="col-sm-12 mx-auto">
                                                            <div class="bg-white border p-5">
                                                                <div class="d-flex justify-content-between mb-4">
                                                                    <div class="text-left">
                                                                        <h5 class="mb-1">{{ facturesInfo.nom }}</h5>
                                                                        <h6 class="mb-1"></h6>
                                                                        <h6 class="mb-1">IFU : {{ facturesInfo.ifu }}</h6>
                                                                    </div>
                                                                    <div class="text-right">
                                                                        <h5 v-if="facturesInfo.type == 'FV'" class="mb-1 text-uppercase font-weight-bold">Facture de vente</h5>
                                                                        <h5 v-if="facturesInfo.type == 'FA'" class="mb-1 text-uppercase font-weight-bold">Facture d'avoir</h5>
                                                                        <h6 class="mb-1">Facture # {{ facturesInfo.numero }}</h6>
                                                                        <h6 class="mb-1">Date : {{ facturesInfo.dateTime }}</h6>
                                                                    </div>
                                                                </div>
                                                                <div class="d-flex justify-content-between mb-4">
                                                                    <div class="text-left border px-3 align-self-start">
                                                                        <div class="media mb-2">
                                                                            <h6 class="mr-3">
                                                                                <i class="fa fa-home"></i>
                                                                                <small>Adresse</small>
                                                                            </h6>
                                                                            <div class="media-body">
                                                                                <small>{{ facturesInfo.adresse }}</small>
                                                                            </div>
                                                                        </div>
                                                                        <div class="media mb-2">
                                                                            <h6 class="mr-3">
                                                                                <i class="fa fa-phone"></i>
                                                                                <small>Contact</small>
                                                                            </h6>
                                                                            <div class="media-body">
                                                                                <small>{{ facturesInfo.contact }}</small>
                                                                            </div>
                                                                        </div>
                                                                        <div class="media mb-2">
                                                                            <h6 class="mr-3">
                                                                                <i class="fa fa-envelope"></i>
                                                                                <small>Mail</small>
                                                                            </h6>
                                                                            <div class="media-body">
                                                                                <small>{{ facturesInfo.mail }}</small>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <div class="text-left border flex-fill align-self-start ml-5">
                                                                        <div class="bg-dark p-1 text-white">
                                                                            <h6 class="text-center m-0">CLIENT</h6>
                                                                        </div>
                                                                        <div class="px-3">
                                                                            <div class="">
                                                                                <small class="mr-3">NOM:</small>
                                                                                <small class="font-weight-bold">{{ client.name }}</small>
                                                                            </div>
                                                                            <div class="">
                                                                                <small class="mr-3">IFU:</small>
                                                                                <small class="font-weight-bold">{{ client.ifu }}</small>
                                                                            </div>
                                                                            <div class="">
                                                                                <small class="mr-3">Addresse:</small>
                                                                                <small class="font-weight-bold">{{ client.address }}</small>
                                                                            </div>
                                                                            <div class="">
                                                                                <small class="mr-3">Contact:</small>
                                                                                <small class="font-weight-bold">{{ client.contact }}</small>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="mb-4">
                                                                    <table class="table table-sm table-bordered">
                                                                        <thead class="thead-dark">
                                                                            <tr>
                                                                                <th class="py-0">#</th>
                                                                                <th class="py-0">Nom</th>
                                                                                <th class="py-0">Prix Unitaire</th>
                                                                                <th class="py-0">Quantité</th>
                                                                                <th class="py-0">%Remise</th>
                                                                                <th class="py-0">%TVA</th>
                                                                                <th class="py-0">T. S.</th>
                                                                                <th class="py-0">Montant TTC</th>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr v-for="(a, index) in facturesInfo.items">
                                                                                <th class="py-0">{{ index + 1 }}</th>
                                                                                <td class="py-0">{{ a.name }}</td>
                                                                                <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(a.originalPrice) }}</td>
                                                                                <td class="py-0">{{ a.quantity }}</td>
                                                                                <td class="py-0">{{ a.remise }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'A'">{{ facturesInfo.ta }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'B'">{{ facturesInfo.tb }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'C'">{{ facturesInfo.tc }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'D'">{{ facturesInfo.td }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'E'">{{ facturesInfo.te }}</td>
                                                                                <td class="py-0" v-if="a.taxGroup == 'F'">{{ facturesInfo.tf }}</td>
                                                                                <td class="py-0">{{ a.taxSpecific }}</td>
                                                                                <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(a.price * a.quantity) }}</td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                                <div class="mb-4">
                                                                    <div class="mb-4">
                                                                        <h6 class="text-uppercase">... Ventilation des impôts ...</h6>
                                                                    </div>
                                                                    <div class="row">
                                                                        <div class="col-sm-9">
                                                                            <table class="table table-sm table-bordered">
                                                                                <thead class="thead-dark">
                                                                                    <tr>
                                                                                        <th class="py-0">Groupe</th>
                                                                                        <th class="py-0">Montant HT</th>
                                                                                        <th class="py-0">Mntant TVA</th>
                                                                                        <th class="py-0">Montant TTC</th>
                                                                                    </tr>
                                                                                </thead>
                                                                                <tbody>
                                                                                    <tr v-if="facturesInfo.taa != 0">
                                                                                        <th class="py-0">A</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.haa) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vaa) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.taa) }}</td>
                                                                                    </tr>
                                                                                    <tr v-if="facturesInfo.tab != 0">
                                                                                        <th class="py-0">B</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.hab) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vab) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.tab) }}</td>
                                                                                    </tr>
                                                                                    <tr v-if="facturesInfo.tac != 0">
                                                                                        <th class="py-0">C</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.hac) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vac) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.tac) }}</td>
                                                                                    </tr>
                                                                                    <tr v-if="facturesInfo.tad != 0">
                                                                                        <th class="py-0">D</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.had) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vad) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.tad) }}</td>
                                                                                    </tr>
                                                                                    <tr v-if="facturesInfo.tae != 0">
                                                                                        <th class="py-0">E</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.hae) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vae) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.tae) }}</td>
                                                                                    </tr>
                                                                                    <tr v-if="facturesInfo.taf != 0">
                                                                                        <th class="py-0">F</th>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.haf) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.vaf) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.taf) }}</td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                        <div class="col-sm-3">
                                                                            <h6 class="text-uppercase py-2 border-top border-bottom font-weight-bold">Total: {{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.total) }}</h6>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="mb-4">
                                                                    <div class="mb-4">
                                                                        <h6 class="text-uppercase">.............................................................</h6>
                                                                    </div>
                                                                    <div class="row">
                                                                        <div class="col-sm-9">
                                                                            <table class="table table-sm table-bordered">
                                                                                <thead class="thead-dark">
                                                                                    <tr>
                                                                                        <th class="py-0">Total HT</th>
                                                                                        <th class="py-0">Total TVA</th>
                                                                                        <th class="py-0">Remise</th>
                                                                                        <th class="py-0">TS</th>
                                                                                        <th class="py-0">AIB</th>
                                                                                    </tr>
                                                                                </thead>
                                                                                <tbody>
                                                                                    <tr>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.ht) }}</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.tva) }}</td>
                                                                                        <td class="py-0">0</td>
                                                                                        <td class="py-0">0</td>
                                                                                        <td class="py-0">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facturesInfo.montantAib) }}</td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="mb-4">
                                                                    <div class="mb-4">
                                                                        <h6 class="text-uppercase">... élément de sécurité de la facture normalisée ...</h6>
                                                                    </div>
                                                                    <div class="border px-4 py-1">
                                                                        <div class="row">
                                                                            <div class="col-sm-4">
                                                                                <img src="assets/img/téléchargement.png" width="150">
                                                                            </div>
                                                                            <div class="col-sm-8">
                                                                                <h6 class="text-center mb-0">Code MECeF/DGI</h6>
                                                                                <h6 class="text-center font-weight-bold">{{ facturesInfo.codeMECeFDGI }}</h6>
                                                                                <div class="d-flex justify-content-between">
                                                                                    <span class="mb-0">MECeF NIM: </span>
                                                                                    <span class="font-weight-bold">{{ facturesInfo.nim }}</span>
                                                                                </div>
                                                                                <div class="d-flex justify-content-between">
                                                                                    <span class="mb-0">MECeF Compteurs </span>
                                                                                    <span class="font-weight-bold">{{ facturesInfo.counters }}</span>
                                                                                </div>
                                                                                <div class="d-flex justify-content-between">
                                                                                    <span class="mb-0">MECeF Heure </span>
                                                                                    <span class="font-weight-bold">{{ facturesInfo.dateTime }}</span>
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
        <script src="${contextPath}/assets/js/specific/check.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>

