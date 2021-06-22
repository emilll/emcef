var dt = new Date();
var DD = ("0" + dt.getDate()).slice(-2);
var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
var YYYY = dt.getFullYear();

new Vue({
    el: '#app',
    data: {
        timer1: '',
        timer2: '',
        valeur1: [],
        valeur2: [],
        valeur3: [],
        ttc: [],
        ht: [],
        tva: [],
        banniere: [],
        url1: "/api/totauxglobaux",
        url2: "/api/totauxmonth/" + YYYY + "/" + MM,
        url3: "/api/totauxday/" + YYYY + "/" + MM + "/" + DD
    },
    created() {
        this.timer1 = setInterval(this.fetchData, 1000);
        this.timer2 = setInterval(this.dash, 2000);
        this.timer3 = setInterval(this.chart, 5000);
    },
    mounted() {
        this.fetchData();
        this.dash();
        this.chart();
    },
    methods: {
        verification: function (valeur) {
            if (typeof valeur !== 'number') {
                return 0;
            } else {
                return new Intl.NumberFormat('en-US', {style: 'decimal'}).format(valeur);
            }
        },
        fetchData() {
            fetch(this.url1, {
                "method": "GET",
                "headers": {}
            }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.valeur1 = response
            }).catch(error => {
                console.log(error)
            }),
                    fetch(this.url2, {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.valeur2 = response
            }).catch(error => {
                console.log(error)
            }),
                    fetch(this.url3, {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.valeur3 = response
            }).catch(error => {
                console.log(error)
            }),
                    fetch("/api/banniere", {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.banniere = response
            }).catch(error => {
                console.log(error)
            })
        },
        dash() {
            fetch("/api/ttc", {
                "method": "GET",
                "headers": {}
            }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.ttc = response
            }).catch(error => {
                console.log(error)
            }),
                    fetch("/api/ht", {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.ht = response
            }).catch(error => {
                console.log(error)
            }),
                    fetch("/api/tva", {
                        "method": "GET",
                        "headers": {}
                    }).then(response => {
                if (response.ok) {
                    return response.json()
                }
            }).then(response => {
                this.tva = response
            }).catch(error => {
                console.log(error)
            })
        },
        chart() {
            var ctx = document.getElementById('myLine').getContext('2d');
            var myLine = new Chart(ctx, {
                type: 'line',
                data: {
                    labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
                    datasets: [{
                            label: 'Total TTC',
                            data: this.ttc,
                            fill: false,
                            borderColor: 'rgba(75, 192, 192, 1)',
                            borderWidth: 2
                        }
                    ],
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });
            var ctx1 = document.getElementById('myPie').getContext('2d');
            var myLine = new Chart(ctx1, {
                type: 'pie',
                data: {
                    labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
                    datasets: [{
                            label: 'Total TTC',
                            data: this.ttc,
                            backgroundColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });
            var ctx2 = document.getElementById('myChart').getContext('2d');
            var myChart = new Chart(ctx2, {
                type: 'bar',
                data: {
                    labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
                    datasets: [{
                            data: this.ht,
                            backgroundColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });
            var polarArea = document.getElementById('polarArea');
            var myChart = new Chart(polarArea, {
                type: 'polarArea',
                data: {
                    labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
                    datasets: [{
                            label: 'Total HT',
                            data: this.ht,
                            backgroundColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });
            var radar = document.getElementById('radar');
            var myChart = new Chart(radar, {
                type: 'radar',
                data: {
                    labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
                    datasets: [{
                            label: 'Total TVA',
                            data: this.tva,
                            backgroundColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)',
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1
                        }]
                },
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            });
        }
    }
})



async function GetRange() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var ladate = YYYY + "-" + MM + "-" + DD;
    function convert(vet) {
        var today = new Date(vet);
        var options = {year: 'numeric', month: 'long', day: 'numeric'};
        var opt_weekday = {weekday: 'long'};
        function toTitleCase(str) {
            return str.replace(
                    /\w\S*/g,
                    function (txt) {
                        return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase();
                    }
            );
        }

        var weekday = toTitleCase(today.toLocaleDateString("fr-FR", opt_weekday));
        var the_date = weekday + ", " + today.toLocaleDateString("fr-FR", options);
        return the_date;
    }
    const {value: formValues} = await Swal.fire({
        title: 'Sélectionnez la rangée de date',
        html:
                '<input id="swal-input1" class="swal2-input" type="date" value="' + ladate + '" min="2000-01-01" max="' + ladate + '">' +
                '<input id="swal-input2" class="swal2-input" type="date" value="' + ladate + '" min="2000-01-01" max="' + ladate + '">',
        focusConfirm: false,
        preConfirm: () => {
            return [
                document.getElementById('swal-input1').value,
                document.getElementById('swal-input2').value
            ]
        }
    })

    if (formValues) {
        var ttc, rapports, factures;
        const facture1 = await fetch('/api/betweenTtc/' + document.getElementById('swal-input1').value + '/' + document.getElementById('swal-input2').value);
        ttc = await facture1.json();
        if (typeof ttc !== 'number') {
            ttc = 0;
        }

        const facture2 = await fetch('/api/betweenRapports/' + document.getElementById('swal-input1').value + '/' + document.getElementById('swal-input2').value);
        rapports = await facture2.json();
        if (typeof rapports !== 'number') {
            rapports = 0;
        }

        const facture3 = await fetch('/api/betweenFactures/' + document.getElementById('swal-input1').value + '/' + document.getElementById('swal-input2').value);
        factures = await facture3.json();
        if (typeof factures !== 'number') {
            factures = 0;
        }

        Swal.fire({
            icon: 'info',
            title: 'Du ' + convert(JSON.stringify(formValues[0])) + ' au ' + convert(JSON.stringify(formValues[1])),
            html:
                    '<b>' + rapports + '</b> Rapports<br> ' +
                    '<b>' + factures + '</b> Factures<br> ' +
                    '<b>' + ttc + '</b> FCFA TTC<br>',
            allowOutsideClick: false,
            showConfirmButton: false,
            showCloseButton: true,
            hideClass: {
                popup: 'swal2-hide',
                backdrop: 'swal2-backdrop-hide',
                icon: 'swal2-icon-hide'
            }
        })
    }
}