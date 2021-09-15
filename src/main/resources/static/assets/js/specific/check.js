new Vue({
    el: '#app',
    data: {
        facturesInfo: {},
        client: {},
        vide: false,
        show: '',
        code: '',
        hide: ''
    },
    methods: {
        showMessage: function (var1, var2) {
            if (var1 === "error") {
                Swal.fire({
                    icon: 'error',
                    title: 'Désolé!',
                    text: var2
                })
            }
            if (var1 === "success") {
                Swal.fire({
                    icon: 'success',
                    title: 'Réussi!',
                    text: var2
                })
            }
            if (var1 === "info") {
                Swal.fire({
                    icon: 'info',
                    title: 'Information',
                    text: var2
                })
            }
        },
        chercher: function (code) {
            if (code == '') {
                this.showMessage('info', "Le Code MECeF, ne peut être nul.")
            } else {
                axios.get("api/show/" + code).then(response => {
                    return response;
                }).then(response => {
                    if (response.data.found) {
                        if (response.data.statut) {
                            axios.post("api/generateQRCode", response.data.qrCode).then(response => {
                                return response;
                            }).then(response => {
                                document.getElementById("code").src = "data:image/png;base64," + response.data;

                            }).catch(error => {
                                this.showMessage('info', "Erreur de lecture!!!")
                            })
                            this.facturesInfo = response.data
                            this.client = response.data.client
                            this.show = '1'
                            this.vide = true
                            this.hide = false

                        } else {
                            this.facturesInfo = response.data
                            this.client = response.data.client
                            this.show = '1'
                            this.vide = true
                            this.hide = true
                        }
                    } else {
                        this.show = '2'
                        this.vide = false
                    }

                }).catch(error => {
                    this.show = '2'
                    this.vide = false
                });
            }
        }
    }
})

