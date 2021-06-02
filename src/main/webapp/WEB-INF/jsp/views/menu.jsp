<nav class="navbar navbar-expand-lg navbar-dark style_bg p-0 fixed-top">
    <div class="container-fluid position-relative">
        <div class="navbar-brand">
            <h4><a href="home.html" class="mr-3"><i class="fa fa-th-large"></i></a>Réglo</h4>
        </div>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Acceuil</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Aujourd'hui
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/facttoday">Factures d'aujourd'hui</a>
                        <a class="dropdown-item" href="/machinessignales">Machines signalées aujourd'hui</a>
                        <a class="dropdown-item" href="/machinesnonsignales">Machines non signalées aujourd'hui</a>
                        <a class="dropdown-item" href="/journalaudit">Journal d'audit</a>
                        <a class="dropdown-item" href="/donnees">Paquets des transactions</a>
                        <a class="dropdown-item" href="/daystate">Statut d'aujourd'hui</a>
                        <a class="dropdown-item" href="/daystats">Statistiques quotidiennes</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Enregistrement
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/ajoutercontribuable">Contribuable</a>
                        <a class="dropdown-item" href="/ajoutermachine">Machines</a>
                        <a class="dropdown-item" href="/ajouterinstallation">Point de Vente</a>
                        <a class="dropdown-item" href="/ajouteremplacement">Emplacement des machines</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Données
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/ajoutercontribuable">Factures</a>
                        <a class="dropdown-item" href="/ajoutermachine">Totaux quotidiennes</a>
                        <a class="dropdown-item" href="/ajouterdépartement">Statuts</a>
                        <a class="dropdown-item" href="/ajoutercommune">Rapport quotidiennes</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Audits
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/ajoutercontribuable">Journal d'audits</a>
                        <a class="dropdown-item" href="/ajoutermachine">Totaux des audits quotidiennes</a>
                        <a class="dropdown-item" href="/ajouterdépartement">Dates des rapports des machines</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Vérifier</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Rapports</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Recherche
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="javascript:void(0);" onclick="recherche1()">Contribuable</a>
                        <a class="dropdown-item" href="javascript:void(0);" onclick="recherche2()">Machines</a>
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
                        <img src="assets/img/profilMan.jpg" width="35" height="35" class="rounded-circle border" alt="..."> Nom prénom
                    </a>
                    <div class="dropdown-menu ropdown-menu-right py-0 shadow" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Déconnexion</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>
