new Vue({
    el: '#app',
    data: {
        test: 'bien',
        machines: [],
        vide: true,
        filter: '',
        more: []
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
