new Vue({
    el: '#app',
    data: {
        factures: [],
        vide: true,
        search: ''
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
        },
        imprimer: function () {
            const xhttp=new XMLHttpRequest();
xhttp.onload = function() {
  var letter = this.getResponseHeader("Status");
  console.log(letter);
}
xhttp.open("GET", "/api/export");
xhttp.send();
           /*fetch("/api/export", {
                "method": "GET"
            }).then(response => {
                console.log(response)
                if(response.headers.Status==="success"){
                this.showMessage(response.headers.Status, "Fichier généré!")
            }
            if(response.headers.Status==="error"){
                this.showMessage(response.headers.Status, "Une erreur est survenue lors de l'impression!")
            }
            }).then(response => {
                console.log(response)
            }).catch(error => {
                console.log(error)
            })*/
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
