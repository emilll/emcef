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
                        
                    </div>
                </nav>
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1 flex-wrap">
                        <nav aria-label="breadcrumb m-0 flex-fill">
                            <ol class="breadcrumb m-0 py-1">
                                <li class="breadcrumb-item text-info">Accueil</li>
                                <li class="breadcrumb-item text-danger">Contribuables</li>
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
                                    <div class="container-fluid">
                                        <div class="d-flex justify-content-between align-items-center mb-1 float-right">
                                            <div class="flex-fill p-3">
                                                <input type="search" class="form-control form-control-sm style_form_control" v-model="search" placeholder="Nom et Prénoms">
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
                                                    <th scope="col">Date Enregistrement</th>
                                                    <th scope="col">IFU</th>
                                                    <th scope="col">Nom et Prénom(s)</th>
                                                    <th scope="col">Ville</th>
                                                    <th scope="col">Contact Personnel</th>
                                                    <th scope="col">E-Mail</th>
                                                    <th scope="col">Adresse</th>
                                                    <th scope="col">Commentaire</th>
                                                    <th scope="col">Nombres de machines</th>
                                                    <th scope="col">Nombre de Factures</th>
                                                    <th scope="col"></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <tr v-if="vide, filtre.length == 0">
                                                <td colspan="12"><span class="text-dark">Aucune donnée</span></td>
                                            </tr>
                                                <tr v-for="(contribuable, index) in filtre" v-else>
                                                    <td>{{ index + 1 }}</td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.date_enregistrement }}</span>
                                                        <small class="text-muted">{{ contribuable.date_heure }}</small>
                                                    </td>
                                                    <td>
                                                        <span class="text-success">{{ contribuable.ifu }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.nom }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.ville }}</span>
                                                    </td>
                                                    <td>
                                                        <span>{{ contribuable.contact_personnel }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.email }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.adresse }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.commentaire }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.nbrMach }}</span>
                                                    </td>
                                                    <td>
                                                        <span class="text-dark">{{ contribuable.nbrFact }}</span>
                                                    </td>
                                                    <td>
                                                        <div class="d-flex">
                                                            <a :href="${contextPath}'/contribuable/' + contribuable.ifu" title="Détail" class="text-info mr-2"><i class="fa fa-eye"></i></a>
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
        <script src="${contextPath}/assets/js/specific/contribuable.js" type="text/javascript"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>

        <%@include  file="../views/footer.jsp" %>
    </body>
</html>
