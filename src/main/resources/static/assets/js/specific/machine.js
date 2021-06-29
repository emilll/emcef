new Vue({
    el: '#app',
    data: {
        test: 'bien',
        machines: [],
        vide: true,
        filter: '',
        search:''
    },
    computed: {
        filtre: function () {
            return this.machines.filter((machine) => {
                return machine.nim.match(this.search)
            })
        }
    },
    mounted() {
        fetch("/api/machineall", {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                this.vide = false
                return response.json()
            }
        }).then(response => {
            this.machines = response
        }).catch(error => {
            console.log(error)
        })
    },
    methods: {}
})
