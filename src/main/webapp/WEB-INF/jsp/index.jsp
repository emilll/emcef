<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="fr">

<head>
  <meta charset="utf-8">
  <title>Liste des Employés</title>

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Bootstrap core CSS -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!--external css-->
  <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/style-responsive.css" rel="stylesheet">
  
</head>

<body>
  <section id="container">
    <section id="">
      <section class="">
        <h3> Liste des Employés</h3>
        <!-- row -->
        <div class="row mt">
          <div class="col-md-offset-1 col-md-10 col-md-offset-1">
            <div class="content-panel">
              <table class="table table-striped table-advance table-hover">
                <h4><i class="fa fa-angle-right"></i> Employee List</h4>
                <a class="btn btn-theme" style="margin-left: 20px" href="/ajouter">Ajouter un employé</a>
                <hr>
                <thead>
                  <tr>
                    <th><i class="fa fa-bullhorn"></i> Prénom(s)</th>
                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> Nom</th>
                    <th><i class="fa fa-bookmark"></i> Email de l'employé</th>
                    <th><i class=" fa fa-edit"></i> Statut</th>
                    <th><i class=" fa fa-edit"></i> Actions</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="employe" items="${people}">
                  <tr>
                    <td><c:out value="${employe.firstname}"/></td>
                    <td><c:out value="${employe.lastname}"/></td>
                    <td><c:out value="${employe.email}"/></td>
                    <td><span class="label label-info label-mini">Actif</span></td>
                    <td>
                        <a class="btn btn-primary btn-xs" href="/modifier/<c:out value='${employe.ID}'/>"><i class="fa fa-pencil"></i></a>
                      <br><code>  </code><br>
                      <a class="btn btn-danger btn-xs" href="/delete/<c:out value='${employe.ID}'/>"><i class="fa fa-trash-o "></i></a>
                    </td>
                  </tr>
                  </c:forEach>
                </tbody>
              </table>

            </div>
            <!-- /content-panel -->
          </div>
          <!-- /col-md-12 -->
        </div>
        <!-- /row -->
      </section>
    </section>
      <br><br><br><br>
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
</body>
</html>