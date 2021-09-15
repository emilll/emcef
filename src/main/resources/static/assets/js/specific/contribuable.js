//Tout les contribuables
new Vue({
    el: '#app',
    data: {
        test: 'bien',
        contribuables: [],
        vide: true,
        filter: '',
        more: [],
        search:''
    },
    computed: {
        filtre: function () {
            return this.contribuables.filter((contribuable) => {
                return contribuable.nom.match(this.search)
            })
        }
    },
    mounted() {
        fetch("api/contribuableall", {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                this.vide = false
                return response.json()
            }
        }).then(response => {
            this.contribuables = response
        }).catch(error => {
            console.log(error)
        })
    },
    methods: {}
})

