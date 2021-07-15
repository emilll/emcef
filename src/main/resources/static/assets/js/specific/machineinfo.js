new Vue({
    el: '#appinfo',
    data: {
        valeur: window.location.pathname.split("/", 3),
        factures: [],
        machines: [],
        facturesInfo: {},
        client: {},
        uid: '',
        info: [],
        vide: true,
        search: ''
    },
    methods: {
        ifu: function () {
        },
    },
    computed: {
        filtre: function () {
            return this.factures.filter((facture) => {
                return facture.uid.match(this.search)
            })
        }
    },
    methods: {
        show: function (uid) {
            axios.get("/api/information/" + uid).then(response => {
                return response;
            }).then(response => {
                axios.post("/api/generateQRCode", response.data.qrCode).then(response => {
                    return response;
                }).then(response => {
                    document.getElementById("code").src = "data:image/png;base64," + response.data;
                }).catch(error => {
                    this.showMessage('info', "Erreur de lecture!!!")
                })
                this.facturesInfo = response.data
                this.client = response.data.client
            }).catch(error => {
                this.showMessage('info', "Une application a capturé le téléchargement ou une erreur est survenue lors de la génération du fichier!")
            });
        }
    },
    mounted() {
        fetch('/api/factures/' + this.valeur[2], {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if (response.length !== 0) {
                this.vide = false
                this.factures = response
            }
        }).catch(error => {
            console.log(error)
        }),
                fetch('/api/machineinfo/' + this.valeur[2], {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            this.machines = response
        }).catch(error => {
            console.log(error)
        }),
                fetch('/api/moreinfo/' + this.valeur[2], {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            this.info = response
        }).catch(error => {
            console.log(error)
        })
    }
})
