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
        ifuseller: '',
        status: '',
        vente: '',
        date_heure: '',
        derniere_version: '',
        machine: {},
        machineEnregistre: {},
        vide: true,
        filter: '',
        search: '',
        apikey: ''
    },
    computed: {
        filtre: function () {
            return this.machines.filter((machine) => {
                return machine.nim.match(this.search)
            })
        }
    },
    mounted() {
        this.sync(),
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
        randomString: function () {
            var result = '';
            var characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
            var charactersLength = characters.length;
            for (var i = 0; i < 30; i++) {
                result += characters.charAt(Math.floor(Math.random() * charactersLength));
            }
            this.apikey = result;
        },
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
            if (calc < 10) {
                this.nim = 'VD-000000' + (calc + 1)
            }
            if (calc < 100 && calc > 10) {
                this.nim = 'VD-00000' + (calc + 1)
            }
            if (calc < 1000 && calc > 100) {
                this.nim = 'VD-0000' + (calc + 1)
            }
            if (calc < 10000 && calc > 1000) {
                this.nim = 'VD-000' + (calc + 1)
            }
            if (calc < 100000 && calc > 10000) {
                this.nim = 'VD-00' + (calc + 1)
            }
            if (calc < 1000000 && calc > 100000) {
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

            if (var1 === "info") {
                Swal.fire({
                    icon: 'info',
                    title: 'Clé API de la machine',
                    text: var2
                })
            }

        },
        modify: function () {
            if (this.vente) {
                if (this.vente.contribuable) {
                    if (this.vente.contribuable.nom !== null) {
                        this.nom_proprietaire = this.vente.contribuable.nom
                        this.ifu = this.vente.contribuable.ifu
                        this.ifuseller = this.vente.ifuseller
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
                        if (this.ifu.length !== 13) {
                            this.showMessage("false", "L'IFU ne doit pas être moins ou plus de 13 chiffres.")
                        } else {
                            if (this.vente.id === '') {
                                this.showMessage("false", "Aucun point de vente choisi.")
                            } else {
                                if (this.status === '') {
                                    this.showMessage("false", "Erreur de manipulation. Veuillez recharger la page!!!")
                                } else {
                                    this.machine = {
                                        date_enregistement: new Date(),
                                        nim: this.nim,
                                        nom_proprietaire: this.nom_proprietaire,
                                        numero_sim: this.numero_sim,
                                        operateur: this.operateur,
                                        ifu: this.ifuseller,
                                        status: this.status,
                                        id_installation: this.vente,
                                    }

                                    this.machineEnregistre = {
                                        date_heure: new Date(),
                                        derniere_version: this.derniere_version,
                                        identification: this.ifu,
                                        machinesinstalles: this.machine,
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
                                            return response.json()
                                        }
                                    }).then(response => {
                                        if (response.status) {
                                            this.showMessage("true", "En attente d'activation!!!")
                                            this.nim = ''
                                            this.sync()
                                            this.vente = ''
                                            this.nom_proprietaire = ''
                                            this.numero_sim = ''
                                            this.operateur = ''
                                            this.ifu = ''
                                            this.derniere_version = ''
                                            this.apikey = response.key
                                            this.showMessage("info", "Clé: " + this.apikey)
                                        } else {
                                            this.showMessage("false", "Données non enregistrées!!!")
                                        }
                                    }).catch(error => {
                                        console.log(error)
                                    })

                                }
                            }
                        }
                    }
                }
            }
        },
    }
})
