//var getUrl = window.location;
//var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1] + "/";
new Vue({
    el: '#app',
    data: {
        infos: [],
        dataPays: [],
        dataContribuables: [],
        dataMachines: [],
        dataDepartements: [],
        dataCommunes: [],
        dataVilles: [],
        vide: false,
        ifuseller: "",
        taille: 0,
        nom_commercial: '',
        Pays: '',
        adresse1: '',
        adresse2: '',
        Ville: '',
        contact_personnel: '',
        telephone: '',
        email: '',
        contribuable: '',
        typesmachines: '1',
        response: [],
        departement: {
            nom: "",
            idpays: ""
        },
        pays: {
            nom: ""
        },
        place: {},
        commune: {
            nom: "",
            iddepartement: ""
        },
        ville: {
            nom: "",
            idcommune: ""
        },
        quartier: {
            nom: "",
            idville: ""
        }
    },
    created() {
        this.timer1 = setInterval(this.fetchData, 2000);
    },
    methods: {
        updateValue(event) {
            const value = event.target.value
            this.taille = String(value).length
            this.$forceUpdate()
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
        savePlace: function () {
            if (this.ifuseller === '') {
                this.showMessage("false", "L'IFU ne peut être nul.")
            } else {
                console.log(this.ifuseller.length)
                if (this.taille !== 13) {
                    this.showMessage("false", "L'IFU ne peut être moins ou plus de 13 chiffres.")
                } else {
                    if (this.Ville === '') {
                        this.showMessage("false", "Aucune ville choisi.")
                    } else {
                        if (this.nom_commercial === '') {
                            this.showMessage("false", "Le nom commercial du point de vente n'a pas été fourni.")
                        } else {
                            if (this.Pays === '') {
                                this.showMessage("false", "Aucun Pays choisi.")
                            } else {
                                if (this.contact_personnel === '') {
                                    this.showMessage("false", "Fournissez un contact personnel!!!")
                                } else {
                                    if (this.email === '') {
                                        this.showMessage("false", "Fournissez une adresse email!!!")
                                    } else {
                                        if (this.contribuable === '') {
                                            this.showMessage("false", "Aucun contribuable choisi!!!")
                                        } else {
                                            this.place = {
                                                date_heure: new Date(),
                                                ifuseller: this.ifuseller,
                                                nom_commercial: this.nom_commercial,
                                                ville: this.Ville,
                                                adresse: this.Pays,
                                                adresse1: this.adresse1,
                                                adresse2: this.adresse2,
                                                contact_personnel: this.contact_personnel,
                                                telephone: this.telephone,
                                                email: this.email,
                                                contribuable: this.contribuable,
                                            },
                                                    fetch('/save/place', {
                                                        method: 'POST',
                                                        headers: {
                                                            'Accept': 'application/json',
                                                            'Content-Type': 'application/json'
                                                        },
                                                        body: JSON.stringify(this.place)
                                                    }).then(response => {
                                                if (response.ok) {
                                                    return response.json()
                                                }
                                            }).then(response => {
                                                if (response.status) {
                                                    this.showMessage("true", "Point de Vente enregistré!!!")
                                                } else {
                                                    this.showMessage("false", "Erreur lors de l'enregistrement!!!")
                                                }
                                            }).catch(error => {
                                                this.showMessage("false", "Erreur. Veuillez recharger la page!!!")
                                            })
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ,
        savePays: function () {
            if (this.pays.nom === '') {
                this.showMessage("false", "Le Nom du Pays est vide!")
            } else {
                fetch("/save/pays/" + this.pays.nom, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response = response
                    this.showMessage(this.response.status, this.response.message)
                    this.pays.nom = ""
                }).catch(error => {

                })
            }
        },
        saveDepartement: function () {
            if (this.departement.nom === '') {
                this.showMessage("false", "Le Nom du Département est vide!")
            } else {
                if (isNaN(this.departement.idpays)) {
                    this.showMessage("false", "Le Nom du Pays est vide!")
                } else {
                    fetch("/save/departement/" + this.departement.nom + "/" + this.departement.idpays, {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                        if (response.ok) {
                            return response.json()
                        }
                    }).then(response => {
                        this.response = response
                        this.showMessage(this.response.status, this.response.message)
                        this.departement.nom = ""
                    }).catch(error => {

                    })
                }
            }
        },
        fetchData: function () {
            //Récupérer les données nécessaires pour nourir la Select Box
            fetch('/save/allPays/', {
                "method": "GET",
                "headers": {}
            }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                if (response.length !== 0) {
                    this.dataPays = response
                }
            }).catch(error => {

            })

            fetch('/save/allVilles/', {
                "method": "GET",
                "headers": {}
            }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                if (response.length !== 0) {
                    this.dataVilles = response
                }
            }).catch(error => {

            })
        }
    },
    mounted() {
        this.fetchData();
        fetch('/api/contribuableall/', {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if (response.length !== 0) {
                this.dataContribuables = response
            }
        }).catch(error => {

        })
    }
}
)
