new Vue({
    el: '#app',
    data: {
        sellers: [],
        vide: true,
        filter: '',
        more: []
    },
    mounted() {
        fetch("/api/installationall", {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                this.vide = false
                return response.json()
            }
        }).then(response => {
            this.sellers = response
        }).catch(error => {
            console.log(error)
        })
    },
    methods: {}
})

