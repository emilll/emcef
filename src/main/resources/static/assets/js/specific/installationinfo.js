new Vue({
    el: '#appinfo',
    data: {
        valeur: window.location.pathname.split("/", 3),
        factures: [],
        montant: [],
        info: [],
        vide: true,
    },
    methods:{
        ifu: function(){
        },
    },
    mounted() {
        fetch('/api/sellerfactures/' + this.valeur[2], {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            if(response.length!==0){
                this.vide = false
                this.factures = response
            }
        }).catch(error => {
            console.log(error)
        }),
        fetch('/api/installationinfo/' + this.valeur[2], {
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
        fetch('/api/installationmontant/' + this.valeur[2], {
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
        })
    }
})

