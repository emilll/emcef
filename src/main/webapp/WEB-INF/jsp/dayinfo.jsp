<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="../assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <link href="../assets/css/animate.css" rel="stylesheet">
        <link href="../assets/css/style.css" rel="stylesheet">
        <link href="../assets/css/all.min.css" rel="stylesheet">
        <link href="../assets/css/aos.css" rel="stylesheet">
        <link href="../assets/css/slick.css" rel="stylesheet" type="text/css">
        <link href="../assets/css/Chart.min.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="../assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="../assets/js/dynamique.js"></script>
        <script type="text/javascript" src="../assets/js/aos.js"></script>
        <script src="../assets/js/slick.min.js"></script>
        <script src="../assets/js/Chart.min.js"></script>
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
            <%@include  file="views/menu.jsp" %>
            <div class="mt-5 bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <h5 class="flex-fill text-success" id="date"></h5>
                    </div>
                </div>
                
            </div>
            <div class="bg-white py-1 border-bottom">
                <div class="container-fluid">
                    <div class="d-flex justify-content-between align-items-center mb-1">
                        <div class="d-flex justify-content-between align-items-center flex-wrap">
                            <div class="col-sm-6 my-auto">
                                <div class="row">
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Factures</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Rapports</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Montant TTC</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Montant HT</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 my-auto">
                                <div class="row">
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Machines enregistrées</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Machines installées</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row col-sm-12">
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Facture en attente</h5>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <div class="card style_shadow border-0 rounded-lg" data-aos="zoom-out" data-aos-easing="linear" data-aos-easing="linear" data-aos-duration="2000">
                                                <div class="card-body">
                                                    <span class="display font-weight-bold border-bottom text-success">0</span>
                                                    <h5 class="card-title mt-3">Factures traités</h5>
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
</header>

<h3 id="1" hidden="hidden"></h3>
<h3 id="2" hidden="hidden"></h3>
<h3 id="3" hidden="hidden"></h3>
<h3 id="4" hidden="hidden"></h3>
<h3 id="5" hidden="hidden"></h3>
<h3 id="6" hidden="hidden"></h3>
<h3 id="7" hidden="hidden"></h3>
<h3 id="8" hidden="hidden"></h3>
<h3 id="9" hidden="hidden"></h3>
<h3 id="10" hidden="hidden"></h3>
<h3 id="11" hidden="hidden"></h3>
<h3 id="12" hidden="hidden"></h3>

<%@include  file="views/footer.jsp" %>
<script>
    function convert(vet) {
        var today = new Date(vet);
        var options = {year: 'numeric', month: 'long', day: 'numeric'};
        var opt_weekday = {weekday: 'long'};
        function toTitleCase(str) {
            return str.replace(
                    /\w\S*/g,
                    function (txt) {
                        return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase();
                    }
            );
        }

        var weekday = toTitleCase(today.toLocaleDateString("fr-FR", opt_weekday));
        var the_date = weekday + ", " + today.toLocaleDateString("fr-FR", options);
        return the_date;
    }
    var chemin = window.location.pathname;
    var splits = chemin.split("/", 3);
    document.getElementById("date").innerHTML = convert(splits[2]);
</script>
</body>
</html>

