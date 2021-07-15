new Vue({
    el: '#app',
    data: {
        test: 0,
        machines: [],
        installations: [],
        date_enregistement: '',
        nim: '',
        nom_proprietaire: '',
        numero_sim: '',
        operateur: '',
        ifu: '',
        status: '',
        vente: '',
        date_heure: '',
        derniere_version: '',
        machinesinstalles: {
            id: "",
            nim: "",
            nom_proprietaire: "",
            numero_sim: "",
            ifu: "",
        },
        machine: {},
        machineEnregistre: {},
        vide: true,
        filter: '',
        search: ''
    },
    computed: {
        filtre: function () {
            return this.machines.filter((machine) => {
                return machine.nim.match(this.search)
            })
        }
    },
    mounted() {
        this.sync()
        fetch('/api/installationall/', {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if (response.length !== 0) {
                this.installations = response
            }
        }).catch(error => {
            console.log(error)
        })
    },
    methods: {
        sync: function () {
            fetch("/api/machineall", {
                "method": "GET",
                "headers": {}
            }).then(response => {
                if (response.ok) {
                    this.vide = false
                    return response.json()
                }
            }).then(response => {
                this.test = response.length
                this.nimAleatoire()
                this.status = "Enregistré"
                this.machines = response
            }).catch(error => {
                console.log(error)
            })
        },
        nimAleatoire: function () {
            var calc = this.test
            if (this.test < 10) {
                this.nim = 'VD-000000' + (calc + 1)
            }
            if (this.test < 100 && this.test > 10) {
                this.nim = 'VD-00000' + (calc + 1)
            }
            if (this.test < 1000 && this.test > 100) {
                this.nim = 'VD-0000' + (calc + 1)
            }
            if (this.test < 10000 && this.test > 1000) {
                this.nim = 'VD-000' + (calc + 1)
            }
            if (this.test < 100000 && this.test > 10000) {
                this.nim = 'VD-00' + (calc + 1)
            }
            if (this.test < 1000000 && this.test > 100000) {
                this.nim = 'VD-0' + (calc + 1)
            }
        },
        showMessage: function (var1, var2) {
            if (var1 === "false" || var1 === "exist") {
                Swal.fire({
                    icon: 'error',
                    title: 'Désolé!',
                    text: var2
                })
            }
            if (var1 === "true") {
                Swal.fire({
                    icon: 'success',
                    title: 'Réussi!',
                    text: var2
                })
            }

        },
        modify: function () {
            if (this.vente) {
                if (this.vente.ifuseller !== null) {
                    this.ifu = this.vente.ifuseller
                } else {
                    this.ifu = ''
                }
                if (this.vente.contribuable) {
                    if (this.vente.contribuable.nom !== null) {
                        this.nom_proprietaire = this.vente.contribuable.nom
                    } else {
                        this.nom_proprietaire = ''
                    }
                }
            }
        },
        saveMachine: function () {
            if (this.nom_proprietaire === '') {
                this.showMessage("false", "Nom du propriétaire vide.")
            } else {
                if (this.numero_sim === '') {
                    this.showMessage("false", "Aucun numéro de SIM fourni")
                } else {
                    if (this.ifu === '') {
                        this.showMessage("false", "L'IFU ne doit pas être nul.")
                    } else {
                        if (this.vente.id === '') {
                            this.showMessage("false", "Aucun point de vente choisi.")
                        } else {
                            if (this.status === '') {
                                this.showMessage("false", "Erreur de manipulation. Veuillez recharger la page!!!")
                            } else {

                                this.machinesinstalles.nim = this.nim
                                this.machinesinstalles.nom_proprietaire = this.nom_proprietaire
                                this.machinesinstalles.numero_sim = this.numero_sim
                                this.machinesinstalles.ifu = this.ifu
                                this.machine = {
                                    date_enregistement: new Date(),
                                    nim: this.nim,
                                    nom_proprietaire: this.nom_proprietaire,
                                    numero_sim: this.numero_sim,
                                    operateur: this.operateur,
                                    ifu: this.ifu,
                                    status: this.status,
                                    id_installation: this.vente,
                                }
                                fetch('/api/saveMachine', {
                                    method: 'POST',
                                    headers: {
                                        'Accept': 'application/json',
                                        'Content-Type': 'application/json'
                                    },
                                    body: JSON.stringify(this.machine)
                                }).then(response => {
                                    if (response.ok) {
                                        return response.json()
                                    }
                                }).then(response => {
                                    if (response.status) {
                                        this.showMessage("true", "Point de Vente enregistré!!!")
                                        this.machinesinstalles.id = response.id
                                    } else {
                                        this.showMessage("false", "Erreur lors de l'enregistrement!!!")
                                        this.machinesinstalles.id = response.id
                                    }
                                }).catch(error => {
                                    console.log(error)
                                })
                                if (this.machinesinstalles.id !== 0) {
                                    this.machineEnregistre = {
                                        date_heure: new Date(),
                                        derniere_version: this.derniere_version,
                                        identification: this.ifu,
                                        machinesinstalles: this.machinesinstalles,
                                        status: this.status,
                                    }

                                    fetch('/api/saveMachineEnregistre', {
                                        method: 'POST',
                                        headers: {
                                            'Accept': 'application/json',
                                            'Content-Type': 'application/json'
                                        },
                                        body: JSON.stringify(this.machineEnregistre)
                                    }).then(response => {
                                        if (response.ok) {
                                            if (response.status) {
                                                this.showMessage("true", "En attente d'activation!!!")
                                            } else {
                                                this.showMessage("false", "Données non enregistrées!!!")
                                            }
                                            return response.json()
                                        }
                                    }).then(response => {

                                    }).catch(error => {
                                        console.log(error)
                                    })
                                } else {
                                    this.showMessage("false", "Erreur dans la répartition des données!!!")
                                }
                                this.sync()
                                this.vente = ''
                                this.nom_proprietaire = ''
                                this.numero_sim = ''
                                this.operateur = ''
                                this.ifu = ''
                                this.derniere_version = ''
                            }
                        }
                    }
                }
            }
        },
    }
})
