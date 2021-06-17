//Informations sur un contribuable donné
new Vue({
    el: '#appinfo',
    data: {
        valeur: window.location.pathname.split("/", 3),
        contribuables: [],
        machines: [],
        vide: true
    },
    methods:{},
    mounted() {
        fetch('/api/contribuableall/' + this.valeur[2], {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            this.contribuables = response
        }).catch(error => {
            console.log(error)
        }),
        fetch('/api/toutesmachines/' + this.valeur[2], {
                    "method": "GET",
                    "headers": {}
                }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if(response.length!==0){
                this.vide = false
            }
            this.machines = response
        }).catch(error => {
            console.log(error)
        })
    }
})
