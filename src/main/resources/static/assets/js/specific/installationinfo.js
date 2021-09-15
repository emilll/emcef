new Vue({
    el: '#appinfo',
    data: {
        valeur: window.location.pathname.split("/", 4),
        machines: [],
        montant: [],
        info: [],
        vide: true,
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
        fetch('api/installationinfo/' + this.valeur[3], {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            this.info = response
        }).catch(error => {
            console.log(error)
        }),
                fetch('api/installationmontant/' + this.valeur[3], {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            this.montant = response
        }).catch(error => {
            console.log(error)
        }),
                fetch('api/onemachine/' + this.valeur[3], {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if (response.length !== 0) {
                this.vide = false
                this.machines = response
            }
        }).catch(error => {
            console.log(error)
        })
    }
})

