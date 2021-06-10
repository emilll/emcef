//Informations sur un contribuable donné
new Vue({
    el: '#appinfo',
    data: {
        test: 'bien',
        valeur: window.location.pathname.split("/", 3),
        contribuables: [],
        machines: [],
        vide: true,
        filter: ''
    },
    methods:{
        ifu: function(){
        },
    },
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
        fetch('/api/machineall/' + this.valeur[2], {
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
    }
})
