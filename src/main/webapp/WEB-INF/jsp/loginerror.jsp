<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="<%= request.getContextPath() %>/assets/img/favicon.png" rel="shortcut icon" >
        <title>Connexion</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <link rel="stylesheet" href="<%= request.getContextPath() %>/assets/css/all.min.css">

        <link href="<%= request.getContextPath() %>/assets/css/bootstrap.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/animate.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/style.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/new_style.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/all.min.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/aos.css" rel="stylesheet">
        <link href="<%= request.getContextPath() %>/assets/css/slick.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/cal-heatmap.css" />
        <link href="<%= request.getContextPath() %>/assets/css/Chart.min.css" rel="stylesheet" type="text/css">


        <script src = "<%= request.getContextPath() %>/assets/js/angular.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/dynamique.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/aos.js"></script>
        <script src="<%= request.getContextPath() %>/assets/js/slick.min.js"></script>
        <script src="<%= request.getContextPath() %>/assets/js/Chart.min.js"></script>
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="py-5 mt-5" style="background-image: url('<%= request.getContextPath() %>/assets/img/regloplan.png');">
                <div class="container">
                    <div class="row aos-init aos-animate" data-aos="fade-down" data-aos-easing="linear" data-aos-duration="700" data-aos-delay="100">
                        <div class="col-sm-6 my-auto">
                            <form class="mb-2" action="<%= request.getContextPath() %>/login" method="post">
                                <h2 class="text-dark mb-3">Connexion</h2>
                                <div class="alert alert-danger">
                                    <span class="container">
                                        Le nom d'utilisateur ou le mot de passe est incorrect. Veuillez réessayer !!!
                                    </span>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12 form-group">
                                        <input type="text" name="username" class="form-control style_form_control" name="" placeholder="Nom d'utilisateur">
                                    </div>
                                    <div class="col-sm-12 form-group">
                                        <input type="password" name="password" class="form-control style_form_control" name="" placeholder="Mot de Passe">
                                    </div>
                                    <div class="col-sm-12 form-group">
                                        <button class="btn btn-block btn-danger mt-3">Connexion</button>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="d-flex justify-content-between mb-4">
                                            <div class="form-check form-check-inline">
                                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option3">
                                                <label class="form-check-label" for="inlineCheckbox3">Se souvenir de moi</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="col-sm-6 my-auto">
                            <img src="<%= request.getContextPath() %>/assets/img/facture_print.png" loading="lazy" class="img-fluid" alt="Facture">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>