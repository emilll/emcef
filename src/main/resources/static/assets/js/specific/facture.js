new Vue({
    el: '#app',
    data: {
        factures: [],
        vide: true,
        search: '',
        name: '',
        uid: ''
    },
    mounted() {
        fetch("/api/facturesall", {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                this.vide = false
                return response.json()
            }
        }).then(response => {
            this.factures = response
        }).catch(error => {
            console.log(error)
        })
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
        sendUid: function (uid) {
            this.uid = uid
        },
        imprimer: function () {
            const config = {responseType: 'blob', method: 'post', headers: {
                    'Content-Type': 'text/plain'
                }};
            axios.post("/api/export/", this.uid, config).then(response => {
                this.showMessage('info', "En cours de téléchargement . . . ")
                this.name = response.headers.name;
                console.log(response)
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
        }
    },
    computed: {
        filtre: function () {
            return this.factures.filter((facture) => {
                return facture.uid.match(this.search)
            })
        }
    }
})
