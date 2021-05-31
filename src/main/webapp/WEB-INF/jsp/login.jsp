<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Connexion</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <link rel="stylesheet" href="assets/css/all.min.css">

        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/animate.css" rel="stylesheet">
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/new_style.css" rel="stylesheet">
        <link href="assets/css/all.min.css" rel="stylesheet">
        <link href="assets/css/aos.css" rel="stylesheet">
        <link href="assets/css/slick.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="assets/css/cal-heatmap.css" />
        <link href="assets/css/Chart.min.css" rel="stylesheet" type="text/css">


        <script src = "assets/js/angular.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/js/angular-countUp.js"></script>
        <script type="text/javascript" src="assets/js/angular-countUp.min.js"></script>
        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="assets/js/dynamique.js"></script>
        <script type="text/javascript" src="assets/js/aos.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/Chart.min.js"></script>
    </head>
    <body class="hold-transition login-page offset-3 col-6 offset-3">
        <div class="login-box">
            <!-- /.login-logo -->
            <div class="card card-outline card-primary">
                <div class="card-header text-center">
                    <a href="/" class="h1"><b>Admin</b>istrateur</a>
                </div>
                <div class="card-body">
                    <p class="login-box-msg">Connectez-vous</p>

                    <form action="/login" method="post">
                        <div class="input-group mb-3">
                            <input id="username" name="username" type="text" class="form-control" placeholder="Username" required>
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-user"></span>
                                </div>
                            </div>
                        </div>
                        <div class="input-group mb-3">
                            <input id="password" name="password" type="password" class="form-control" placeholder="Password" required>
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-lock"></span>
                                </div>
                            </div>
                        </div>
                        
                        <div class="row">
                            <!-- /.col -->
                            <div class="offset-8 col-4">
                                <button type="submit" class="btn btn-primary btn-block">Connexion</button>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>

                    <p class="mb-1">
                        <a href="#">Mot de Passe oublié</a>
                    </p>
                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>
    </body>
</html>

