new Vue({
    el: '#app',
    data: {
        facturesInfo: {},
        client: {},
        vide: false,
        show: '',
        uid: ''
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
        chercher: function (uid) {
            if (uid == '') {
                this.showMessage('info', "Le Code MECeF, ne peut être nul.")
            } else {
                axios.get("/api/information/" + uid).then(response => {
                    return response;
                }).then(response => {
                    this.facturesInfo = response.data
                    this.client = response.data.client
                    this.show = '1'
                    this.vide = true
                }).catch(error => {
                    this.show = '2'
                    this.vide = false
                });
            }
        }
    }
})

