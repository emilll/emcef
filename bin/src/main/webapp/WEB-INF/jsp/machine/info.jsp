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
        <div  id="appinfo">
            <div class="modal fade animated bounceInDown" id="ModalExemple" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="ModalExempleTitle" aria-hidden="true">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content px-3 col-md-12">
                        <div class="modal-body">
                            <header id="header_top modal-header">
                                <nav class="navbar navbar-expand-lg navbar-dark style_bg py-1 fixed-top">
                                    <div class="container position-relative" id="ModalExempleTitle">
                                        <button class="btn btn-success btn-sm mr-2"><div @click="imprimer">Imprimer</div></button>
                                        <form>
                                            <select type="select" class="form-control form-control-sm" name="">
                                                <option>A4</option>
                                            </select>
                                        </form>
                                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                            <span class="navbar-toggler-icon"></span>
                                        </button>
                                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                            <ul class="navbar-nav ml-auto align-items-sm-center">
                                                <li class="nav-item dropdown">
                                                    <button class="btn btn-danger btn-sm" type="button" data-dismiss="modal" aria-label="Close"><i class="fa fa-times mr-2" aria-hidden="true"> Fermer</i></button>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </nav>
                                <div class="mt-5 bg-white py-1 border-bottom">
                                    <nav class="navbar navbar-expand-lg navbar-light p-0">
                                        <div class="container position-relative">
                                            <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContentDetail" aria-controls="navbarSupportedContentDetail" aria-expanded="false" aria-label="Toggle navigation">
                                                <i class="fa fa-ellipsis-h"></i>
                                            </button>
                                            <div class="collapse navbar-collapse" id="navbarSupportedContentDetail">
                                                <ul class="navbar-nav mx-auto">

                                                </ul>
                                            </div>
                                        </div>
                                    </nav>
                                </div>
                            </header>
                            <main class="bg-light">
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
                                                                <img src="" id="code" width="150">
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
                            </main>
                        </div>
                    </div>
                </div>
            </div>
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
                                    <li class="breadcrumb-item text-info">Toutes les machines</li>
                                    <li class="breadcrumb-item text-danger">Informations sur une machine</li>
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
                                    <div class="col-md-4 mb-3">
                                        <div class="card h-55">
                                            <div>
                                                <div class="d-flex flex-column align-items-center text-center">
                                                    <img src="${contextPath}/assets/img/facture_print.png" alt="Admin" class="rounded-circle" width="100">
                                                    <div class="mt-3">
                                                        <h4>{{ machines.nim }}</h4>
                                                        <p class="text-muted font-size-sm">Statut: {{ machines.status }}</p>
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
                                                                <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ info.factures }}</span>
                                                                <h5 class="card-title mt-3" style="font-size: 20px">Factures</h5>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6 form-group">
                                                        <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                            <div class="">
                                                                <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ info.rapports }}</span>
                                                                <h5 class="card-title mt-3" style="font-size: 20px">Rapports</h5>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row col-sm-12">
                                                    <div class="col-sm-6 form-group">
                                                        <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                            <div class="">
                                                                <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(info.totalTTC) }}</span>
                                                                <h5 class="card-title mt-3" style="font-size: 20px">Montant TTC</h5>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                            <div class="">
                                                                <span class="display font-weight-bold border-bottom text-success" style="font-size: 18px">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(info.totalHT) }}</span>
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
                                                    <input type="search" v-model="search" class="form-control form-control-sm style_form_control" placeholder="UID">
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
                                                        <th scope="col">UID</th>
                                                        <th scope="col">IFU Client</th>
                                                        <th scope="col">Nom et Prénom(s) Client</th>
                                                        <th scope="col">Date d'enregistrement</th>
                                                        <th scope="col">Montant Total</th>
                                                        <th scope="col">Montant remis</th>
                                                        <th scope="col">Statut</th>
                                                        <th scope="col"></th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr v-if="vide, filtre.length == 0">
                                                        <td colspan="12"><span class="text-dark">Aucune donnée</span></td>
                                                    </tr>
                                                    <tr v-for="(facture, index) in filtre" v-else>
                                                        <td>{{ index + 1 }}</td>
                                                        <td>
                                                            <span class="text-success">{{ facture.uid }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.ifu_client }}</span>
                                                        </td>
                                                        <td>
                                                            <span>{{ facture.nom_client }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ facture.dateheure }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facture.total) }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-dark">{{ new Intl.NumberFormat('en-US', {style: 'decimal'}).format(facture.payed) }}</span>
                                                        </td>
                                                        <td>
                                                            <span class="text-success" v-if="facture.status">Validé</span>
                                                            <span class="text-danger" v-else>Invalidée</span>
                                                        </td>
                                                        <td>
                                                            <div class="d-flex">
                                                                <a v-if="facture.status" @click="show(facture.uid)" data-toggle="modal" data-target="#ModalExemple" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
                                                                <div v-else><i class="fa fa-eye badge-danger"></i></div>
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
        <script src="${contextPath}/assets/js/specific/machineinfo.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>

