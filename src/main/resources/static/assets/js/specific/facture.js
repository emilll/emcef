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
    computed: {
        filtre: function () {
            return this.factures.filter((facture) => {
                return facture.uid.match(this.search)
            })
        }
    }
})
