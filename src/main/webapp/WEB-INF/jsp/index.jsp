<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="assets/img/favicon.png" rel="shortcut icon" >
        <title>Reglo</title>

        <!--Pour la date-->
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.css"/>
        <link rel="stylesheet" type="text/css" href="css/evo-calendar.midnight-blue.css"/>
        <!--Fin Pour la date-->

        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/animate.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/all.min.css" rel="stylesheet">
        <link href="assets/css/aos.css" rel="stylesheet">
        <link href="assets/css/slick.css" rel="stylesheet" type="text/css">
        <link href="assets/css/Chart.min.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/Chart.min.js"></script>



    </head>

    <body>
        <div class="d-flex bg-light" id="wrapper">
            <!-- Sidebar -->
            <div class="border-right resto" id="sidebar-wrapper">
                <div class="sidebar-wrapper-bloc">
                    <nav>
                        <div class="sidebar-heading py-4 position-relative">
                            <div class="media style_sousmenu_toggle pl-4 py-3">
                                <div class="mr-3">
                                    <a class="" href="#">
                                        <img src="assets/img/profilMan.jpg" width="50" height="50" class="img-fluid rounded-lg border" alt="...">
                                    </a>
                                </div>
                                <div class="media-body my-0">
                                    <p class="my-0 text-white">Nom de la société</p>
                                    <small class="">Profil</small>
                                </div>
                            </div>
                        </div>
                        <ul class="pl-0">
                            <li class="active">
                                <a href="/" class="pl-4">Accueil</a>
                            </li>
                            <li class="style_dropdown">
                                <a href="#" class="style_dropdown_toggle pl-4"><i class="fa fa-home fa-sm mr-2"></i>  Enregistrer<i class="fa fa-caret-down float-right px-2"></i></a>
                                <ul class="pl-0">
                                    <li class="">
                                        <a href="/showfabricants" class="pl-4">Fabricants</a>
                                    </li>
                                    <li class="">
                                        <a href="/showmachines" class="pl-4">Machines</a>
                                    </li>
                                    <li class="">
                                        <a href="/showmodeles" class="pl-4">Modèles</a>
                                    </li>
                                    <li class="">
                                        <a href="/showcertificat" class="pl-4">Certificat</a>
                                    </li>
                                    <li class="">
                                        <a href="/showcontribuable" class="pl-4">Contribuables</a>
                                    </li>
                                    <li class="">
                                        <a href="/showcentre" class="pl-4">Centres</a>
                                    </li>
                                    <li class="">
                                        <a href="/showemplacementmachines" class="pl-4">Emplacement des Machines</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="">
                                <a href="compte.html" class="pl-4"><i class="fa fa-chart-line fa-sm mr-2"></i> Statistiques</a>
                            </li>
                            <li>
                                <a href="transactions.html" class="pl-4"><i class="fa fa-receipt fa-sm mr-2"></i> Mes Factures</a>
                            </li>
                            <li>
                                <a href="reference.html" class="pl-4"><i class="fa fa-table fa-sm mr-2"></i> Enregistrements</a>
                            </li>
                        </ul>
                        <hr>
                        <ul class="pl-0">
                            <li>
                                <a href="reference.html" class="pl-4"><i class="fa fa-user fa-sm mr-2"></i> Autres actions</a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <nav class="navbar navbar-expand-lg navbar-light bg-light py-1 border-bottom style_navbar_sticky">
                    <div class="container-fluid position-relative">
                        <div class="d-flex align-items-center">
                            <button class="text-success bg-light border-0 mr-sm-3" type="button" id="menu-toggle">
                                <i class="fa fa-align-justify"></i>
                            </button>
                            <a class="" href="index.html">
                                <img src="assets/img/logo.png" width="100" class="img-fluid" alt="logo">
                            </a>
                        </div>

                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-ellipsis-h"></i>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto align-items-sm-center p-2 p-sm-0">
                                <li class="nav-item style_sousmenu">
                                    <a class="nav-link style_sousmenu_toggle" href="#">
                                        <i class="fa fa-bell"></i>
                                        <small class="px-1 rounded-lg style_notif_badge">01</small>
                                    </a>
                                    <div class="style_sousmenu_bloc bg-white border">
                                        <div class="p-3 bg-light">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                    </div>
                                </li>
                                <li class="nav-item style_sousmenu">
                                    <a class="nav-link style_sousmenu_toggle" href="#">
                                        <i class="fa fa-envelope"></i>
                                        <small class="px-1 rounded-lg style_notif_badge">02</small>
                                    </a>
                                    <div class="style_sousmenu_bloc bg-white border">
                                        <div class="p-3">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                        <div class="p-3 bg-light">
                                            <a href="#">
                                                <p class="mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do</p>
                                            </a>
                                            <small class="text-muted">15h45</small>
                                        </div>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link position-relative" href="#">
                                        <i class="fa fa-power-off"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <div class=" py-3">

                    <div class="container-fluid">
                        <div class="row">
                            <div class=" col-sm-8 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Line</h4>
                                    <div>
                                        <canvas id="myLine" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-sm-4 mb-3">
                                <div class="mb-3">
                                    <div class=" bg-white border p-3">
                                        <h4 class="text-dark">Point</h4>
                                        <div>
                                            <canvas id="myPoint" class="w-100"></canvas>
                                        </div>
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <div class=" bg-white border p-3">
                                        <h4 class="text-dark">Pie</h4>
                                        <div>
                                            <canvas id="myPie" class="w-100"></canvas>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Bar</h4>
                                    <div>
                                        <canvas id="myChart" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Horizontal Bar</h4>
                                    <div>
                                        <canvas id="horizontalBar" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">Radar</h4>
                                    <div>
                                        <canvas id="radar" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <div class=" bg-white border p-3">
                                    <h4 class="text-dark">polarArea</h4>
                                    <div>
                                        <canvas id="polarArea" class="w-100"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="calendar" class="col-sm-6" style=" width: 550px; float: left"></div>
                    </div>
                </div>
            </div>
            <script>
                $("#menu-toggle").click(function (e) {
                    e.preventDefault();
                    $("#wrapper").toggleClass("toggled");
                });

                $(".style_dropdown_toggle, .style_sousmenu_toggle").click(function (e) {
                    e.preventDefault();
                    $(this).parent().toggleClass("style_toggled");
                });



                var ctx = document.getElementById('myLine').getContext('2d');
                var myLine = new Chart(ctx, {
                    type: 'line',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of 1',
                                data: [12, 19, 3, 5, 2, 3],
                                fill: false,
                                borderColor: 'rgba(75, 192, 192, 1)',
                                borderWidth: 1
                            },
                            {
                                label: '# of 2',
                                data: [15, 15, 5, 3, 16, 10],
                                fill: false,
                                borderDash: [5, 5],
                                borderColor: 'rgba(255, 159, 64, 1)',
                                borderWidth: 1
                            },
                            {
                                label: '# of 2',
                                data: [3, 8, 5, 10, 2, 7],
                                backgroundColor: 'rgba(153, 102, 255, 1)',
                                borderColor: 'rgba(153, 102, 255, 1)',
                                borderWidth: 1
                            }
                        ],
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var ctx = document.getElementById('myPoint').getContext('2d');
                var myPoint = new Chart(ctx, {
                    type: 'line',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of 1',
                                data: [{
                                        x: 1,
                                        y: -1.711e-2,
                                    }, {
                                        x: 1.26,
                                        y: -2.708e-2,
                                    }, {
                                        x: 1.58,
                                        y: -4.285e-2,
                                    }, {
                                        x: 2.0,
                                        y: -6.772e-2,
                                    }, {
                                        x: 2.51,
                                        y: -1.068e-1,
                                    }, {
                                        x: 3.16,
                                        y: -1.681e-1,
                                    }, {
                                        x: 3.98,
                                        y: -2.635e-1,
                                    }, {
                                        x: 5.01,
                                        y: -4.106e-1,
                                    }, {
                                        x: 6.31,
                                        y: -6.339e-1,
                                    }, {
                                        x: 7.94,
                                        y: -9.659e-1,
                                    }, {
                                        x: 10.00,
                                        y: -1.445,
                                    }, {
                                        x: 12.6,
                                        y: -2.110,
                                    }, {
                                        x: 15.8,
                                        y: -2.992,
                                    }, {
                                        x: 20.0,
                                        y: -4.102,
                                    }, {
                                        x: 25.1,
                                        y: -5.429,
                                    }, {
                                        x: 31.6,
                                        y: -6.944,
                                    }, {
                                        x: 39.8,
                                        y: -8.607,
                                    }, {
                                        x: 50.1,
                                        y: -1.038e1,
                                    }, {
                                        x: 63.1,
                                        y: -1.223e1,
                                    }, {
                                        x: 79.4,
                                        y: -1.413e1,
                                    }, {
                                        x: 100.00,
                                        y: -1.607e1,
                                    }, {
                                        x: 126,
                                        y: -1.803e1,
                                    }, {
                                        x: 158,
                                        y: -2e1,
                                    }, {
                                        x: 200,
                                        y: -2.199e1,
                                    }, {
                                        x: 251,
                                        y: -2.398e1,
                                    }, {
                                        x: 316,
                                        y: -2.597e1,
                                    }, {
                                        x: 398,
                                        y: -2.797e1,
                                    }, {
                                        x: 501,
                                        y: -2.996e1,
                                    }, {
                                        x: 631,
                                        y: -3.196e1,
                                    }, {
                                        x: 794,
                                        y: -3.396e1,
                                    }, {
                                        x: 1000,
                                        y: -3.596e1,
                                    }],
                                fill: false,
                                borderColor: 'rgba(75, 192, 192, 1)',
                                borderWidth: 1
                            }
                        ],
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    type: 'linear',
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }],
                            xAxes: [{
                                    type: 'logarithmic',
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var ctx = document.getElementById('myPie').getContext('2d');
                var myLine = new Chart(ctx, {
                    type: 'pie',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of Votes',
                                data: [12, 19, 3, 5, 2, 3],
                                backgroundColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderWidth: 1
                            }]
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var ctx = document.getElementById('myChart').getContext('2d');
                var myChart = new Chart(ctx, {
                    type: 'bar',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange', 'Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of Votes',
                                data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
                                backgroundColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderWidth: 1
                            }]
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var horizontalBar = document.getElementById('horizontalBar');
                var myChart = new Chart(horizontalBar, {
                    type: 'horizontalBar',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of Votes',
                                data: [12, 19, 3, 5, 2, 3],
                                backgroundColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderWidth: 1
                            }]
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var radar = document.getElementById('radar');
                var myChart = new Chart(radar, {
                    type: 'radar',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of Votes',
                                data: [12, 19, 3, 5, 2, 3],
                                backgroundColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderWidth: 1
                            }]
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });

                var polarArea = document.getElementById('polarArea');
                var myChart = new Chart(polarArea, {
                    type: 'polarArea',
                    data: {
                        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                        datasets: [{
                                label: '# of Votes',
                                data: [12, 19, 3, 5, 2, 3],
                                backgroundColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderColor: [
                                    'rgba(255, 99, 132, 1)',
                                    'rgba(54, 162, 235, 1)',
                                    'rgba(255, 206, 86, 1)',
                                    'rgba(75, 192, 192, 1)',
                                    'rgba(153, 102, 255, 1)',
                                    'rgba(255, 159, 64, 1)'
                                ],
                                borderWidth: 1
                            }]
                    },
                    options: {
                        scales: {
                            yAxes: [{
                                    ticks: {
                                        beginAtZero: true
                                    }
                                }]
                        }
                    }
                });




                $(document).ready(function () {
                    $('#calendar').evoCalendar({
                        theme: 'Midnight Blue',
                        'language': 'fr',
                        todayHighlight: true,
                        'eventListToggler': false
                    });
                    var terre = [
                        {
                            id: 'kNybja6',
                            name: 'Bien',
                            date: 'March 27, 2021',
                            type: 'birthday',
                            everyYear: true // optional
                        },
                        {
                            id: 'kNybja6',
                            name: 'Ok',
                            date: 'March 27, 2021',
                            type: 'birthday',
                            everyYear: true // optional
                        },
                        {
                            id: 'asDf87L',
                            name: 'Graduation Day!',
                            date: 'March 21, 2021',
                            type: 'event'
                        }
                    ];
                    $('#calendar').evoCalendar('addCalendarEvent', terre);
                    $('#calendar').evoCalendar('toggleEventList', false);
                    $('#calendar').on('selectDate', function (event, newDate, oldDate) {
                        var active_date = $('#calendar').evoCalendar('getActiveDate');
                        alert(active_date);
                    });
                });


            </script>
            <script src="js/evo-calendar.js"></script>
    </body>
</html>