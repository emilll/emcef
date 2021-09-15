<nav class="navbar navbar-expand-lg navbar-dark style_bg p-0 fixed-top">
    <div class="container-fluid position-relative">
        <div class="navbar-brand">
            <h4><a href="${contextPath}/" class="mr-3"><i class="fa fa-th-large"></i></a>R�glo</h4>
        </div>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/">Acceuil</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Enregistrement
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="${contextPath}/savemachine">Machine</a>
                        <a class="dropdown-item" href="${contextPath}/saveseller">Point de Vente</a>
                        <a class="dropdown-item" href="${contextPath}/saveplace">Emplacement</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Donn�es
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="${contextPath}/contribuables">Contribuables</a>
                        <a class="dropdown-item" href="${contextPath}/machines">Machines</a>
                        <a class="dropdown-item" href="${contextPath}/installations">Points de Vente</a>
                        <a class="dropdown-item" href="${contextPath}/factures">Factures</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/check">V�rifier</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/rapports">Rapports</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Recherche
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="javascript:void(0);" onclick="recherche1()">Contribuable</a>
                        <a class="dropdown-item" href="javascript:void(0);" onclick="recherche2()">Machine</a>
                        <a class="dropdown-item" href="javascript:void(0);" onclick="recherche3()">Point de Vente</a>
                    </div>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto align-items-sm-center">
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa fa-bell"></i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa fa-user-clock"></i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa fa-cog"></i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fa fa-comments"></i></a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <img src="${contextPath}/assets/img/profilMan.jpg" width="35" height="35" class="rounded-circle border" alt="..."> Administrateur
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="${contextPath}/logout">D�connexion</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>
