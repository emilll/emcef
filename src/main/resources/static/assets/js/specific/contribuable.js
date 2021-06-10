//Tout les contribuables
new Vue({
    el: '#app',
    data: {
        test: 'bien',
        contribuables: [],
        vide: true,
        filter: '',
        more: []
    },
    computed: {
        filteredRows() {
            const name = contribuables.nom.toLowerCase();
            const searchTerm = this.filter.toLowerCase();
            return (name.includes(searchTerm));
        }
    },
    mounted() {
        fetch("/api/contribuableall", {
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

