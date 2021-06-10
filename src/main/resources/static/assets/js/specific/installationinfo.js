new Vue({
    el: '#appinfo',
    data: {
        test: 'bien',
        valeur: window.location.pathname.split("/", 3),
        factures: [],
        machines: [],
        info: [],
        vide: true,
        filter: ''
    },
    methods:{
        ifu: function(){
        },
    },
    mounted() {
        fetch('/api/machines/' + this.valeur[2], {
            "method": "GET",
            "headers": {}
        }).then(response => {
            if (response.ok) {
                return response.json()
            }
        }).then(response => {
            console.log(response)
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
            this.machines = response
        }).catch(error => {
            console.log(error)
        })
    }
})

