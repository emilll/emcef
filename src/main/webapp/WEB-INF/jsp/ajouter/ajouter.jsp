<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="utf-8"/>
        <title>Ajout d'un Employé</title>

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon"/>
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon"/>

        <!-- Bootstrap core CSS -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        <!--external css-->
        <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-datepicker/css/datepicker.css" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-daterangepicker/daterangepicker.css" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet"/>
        <link href="css/style-responsive.css" rel="stylesheet"/>

    </head>

    <body>
        <section id="container">
            <!--main content start-->
            <section id="">
                <section class="">
                    <h3><i class="fa fa-angle-right"></i> Ajout d'un employé</h3>
                    <!-- BASIC FORM ELELEMNTS -->
                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="col-md-offset-1 content-panel col-md-10 col-md-offset-1">
                                <h4 class="mb"><i class="fa fa-angle-right"></i> Informations</h4>
                                <s:form class="form-horizontal style-form" method="post" action="/save" modelAttribute="employee">
                                    <div class="form-group">
                                        <label class="col-sm-2 col-sm-2 control-label" name="firstname">Prénom (s)</label>
                                        <div class="col-sm-10">
                                            <s:input type="text" class="form-control round-form" path="firstname"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 col-sm-2 control-label" name="lastname">Nom</label>
                                        <div class="col-sm-10">
                                            <s:input type="text" class="form-control round-form" path="lastname"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 col-sm-2 control-label" name="email" >E-mail</label>
                                        <div class="col-sm-10">
                                            <s:input type="text" class="form-control round-form" path="email"/>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-theme">Ajouter</button>
                                </s:form>
                            </div>
                        </div>
                        <!-- col-lg-12-->
                    </div>
                    </div>
                    <!-- /row -->
                </section>
                <!-- /wrapper -->
            </section>
            <br><br><br><br>
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    <p>
                        &copy; Copyrights <strong>Emmanuel BOSSOU</strong>. All Rights Reserved
                    </p>
                    <a href="#" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>
        <!-- js placed at the end of the document so the pages load faster -->
        <script src="lib/jquery/jquery.min.js"></script>
        <script src="lib/bootstrap/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
        <script src="lib/jquery.scrollTo.min.js"></script>
        <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
        <!--common script for all pages-->
        <script src="lib/common-scripts.js"></script>
        <!--script for this page-->
        <script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
        <!--custom switch-->
        <script src="lib/bootstrap-switch.js"></script>
        <!--custom tagsinput-->
        <script src="lib/jquery.tagsinput.js"></script>
        <!--custom checkbox & radio-->
        <script type="text/javascript" src="lib/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="lib/bootstrap-daterangepicker/date.js"></script>
        <script type="text/javascript" src="lib/bootstrap-daterangepicker/daterangepicker.js"></script>
        <script type="text/javascript" src="lib/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
        <script src="lib/form-component.js"></script>

    </body>

</html>


