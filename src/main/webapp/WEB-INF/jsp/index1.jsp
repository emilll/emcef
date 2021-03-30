<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="fr" xmlns:th="http://www.thymeleaf.org">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="Dashboard">
  <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
  <title>Employee List</title>

  <!-- Favicons -->
  <link href="../templates/img/favicon.png" th:href="@{/../templates/img/favicon.png}" rel="icon">
  <link th:href="@{/img/apple-touch-icon.png}" rel="apple-touch-icon">

  <!-- Bootstrap core CSS -->
  <link th:href="@{/lib/bootstrap/css/bootstrap.min.css}" rel="stylesheet">
  <!--external css-->
  <link th:href="@{/lib/font-awesome/css/font-awesome.css}" rel="stylesheet" />
  <!-- Custom styles for this template -->
  <link th:href="@{/css/style.css}" rel="stylesheet">
  <link th:href="@{/css/style-responsive.css}" rel="stylesheet">
  
</head>

<body>
  <section id="container">
    <section id="main-content">
      <section class="wrapper">
        <h3><i class="fa fa-angle-right"></i> Liste des Employés</h3>
        <!-- row -->
        <div class="row mt">
          <div class="col-md-12">
            <div class="content-panel">
              <table class="table table-striped table-advance table-hover">
                <h4><i class="fa fa-angle-right"></i> Employee List</h4>
                <hr>
                <thead>
                  <tr>
                    <th><i class="fa fa-bullhorn"></i> Employee First Name</th>
                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> Employee Last Name</th>
                    <th><i class="fa fa-bookmark"></i> Employee Email</th>
                    <th><i class=" fa fa-edit"></i> Status</th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
                  <%--<c:forEach var="employe" items="${liste}">--%>
                  <tr th:each="employee : ${liste}">
                    <td><c:out value="${employe.firstname}"/></td>
                    <td><c:out value="${employe.lastname}"/></td>
                    <td><c:out value="${employe.email}"/></td>
                    <td><span class="label label-info label-mini">Due</span></td>
                    <td>
                      <button class="btn btn-success btn-xs"><i class="fa fa-check"></i></button>
                      <button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>
                      <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                    </td>
                  </tr>
                  <%--</c:forEach>--%>
                </tbody>
              </table>

              ${employee}
            </div>
            <!-- /content-panel -->
          </div>
          <!-- /col-md-12 -->
        </div>
        <!-- /row -->
      </section>
    </section>
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