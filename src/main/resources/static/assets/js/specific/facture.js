new Vue({
    el: '#app',
    data: {
        factures: [],
        vide: true
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
    methods: {}
})
