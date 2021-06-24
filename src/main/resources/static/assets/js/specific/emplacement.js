new Vue({
    el: '#app',
    data: {
        infos: [],
        dataPays: [],
        dataDepartements: [],
        dataCommunes: [],
        dataVilles: [],
        vide: false,
        response: [],
        departement: {
            nom: "",
            idpays: ""
        },
        pays: {
            nom: ""
        },
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
        savePays: function () {
            if (this.pays.nom === '') {
                this.showMessage("false", "Le champ Nom est vide!")
            } else {
                fetch("/save/pays/" + this.pays.nom, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response=response
                    this.showMessage(this.response.status, this.response.message)
                    this.pays.nom = ""
                }).catch(error => {
                    console.log(error)
                })
            }
        },
        saveDepartement: function () {
            if (this.departement.nom === '') {
                this.showMessage("false", "Le champ Nom est vide!")
            } else {
                fetch("/save/departement/" + this.departement.nom + "/" + this.departement.idpays, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response=response
                    this.showMessage(this.response.status, this.response.message)
                    this.departement.nom = ""
                }).catch(error => {
                    console.log(error)
                })
            }
        },
        saveCommune: function () {
            if (this.commune.nom === '') {
                this.showMessage("false", "Le champ Nom est vide!")
            } else {
                fetch("/save/commune/" + this.commune.nom + "/" + this.commune.iddepartement, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response=response
                    this.showMessage(this.response.status, this.response.message)
                    this.commune.nom = ""
                }).catch(error => {
                    console.log(error)
                })
            }
        },
        saveVille: function () {
            if (this.ville.nom === '') {
                this.showMessage("false", "Le champ Nom est vide!")
            } else {
                fetch("/save/ville/" + this.ville.nom + "/" + this.ville.idcommune, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response=response
                    this.showMessage(this.response.status, this.response.message)
                    this.ville.nom = ""
                }).catch(error => {
                    console.log(error)
                })
            }
        },
        saveQuartier: function () {
            if (this.quartier.nom === '') {
                this.showMessage("false", "Le champ Nom est vide!")
            } else {
                fetch("/save/quartier/" + this.quartier.nom + "/" + this.quartier.idville, {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
                    if (response.ok) {
                        return response.json()
                    }
                }).then(response => {
                    this.response=response
                    this.showMessage(this.response.status, this.response.message)
                    this.quartier.nom = ""
                }).catch(error => {
                    console.log(error)
                })
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
                console.log(error)
            }),
                    fetch('/save/allDepartements/', {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                if (response.length !== 0) {
                    this.dataDepartements = response
                }
            }).catch(error => {
                console.log(error)
            }),
                    fetch('/save/allCommunes/', {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                if (response.length !== 0) {
                    this.dataCommunes = response
                }
            }).catch(error => {
                console.log(error)
            }), fetch('/save/allVilles/', {
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
                console.log(error)
            })
        }
    },
    mounted() {
        this.fetchData();
    }
}
)
