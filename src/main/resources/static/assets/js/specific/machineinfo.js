new Vue({
    el: '#appinfo',
    data: {
        valeur: window.location.pathname.split("/", 4),
        factures: [],
        machines: [],
        facturesInfo: {},
        client: {},
        uid: '',
        info: [],
        vide: true,
        search: '',
        name: ''
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
        imprimer: function () {
            const config = {responseType: 'blob', method: 'post', headers: {
                    'Content-Type': 'text/plain'
                }};
            axios.post("api/export/", this.uid, config).then(response => {
                this.showMessage('info', "En cours de téléchargement . . . ")
                this.name = response.headers.name;
                return response;
            }).then(response => {
                const url = window.URL.createObjectURL(new Blob([response.data]));
                const link = document.createElement('a');
                link.href = url;
                link.setAttribute('download', this.name); //or any other extension
                document.body.appendChild(link);
                link.click();
                this.uid = ''
                this.showMessage('success', "Fichier téléchargé!")
            }).catch(error => {
                this.showMessage('info', "Une application a capturé le téléchargement ou une erreur est survenue lors de la génération du fichier!")
            });
        },
        show: function (uid) {
            axios.get("api/information/" + uid).then(response => {
                return response;
            }).then(response => {
                axios.post("api/generateQRCode", response.data.qrCode).then(response => {
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
        fetch('api/factures/' + this.valeur[3], {
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
                fetch('api/machineinfo/' + this.valeur[3], {
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
                fetch('api/moreinfo/' + this.valeur[3], {
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


//console.log(window.location.pathname.split("/", 3))