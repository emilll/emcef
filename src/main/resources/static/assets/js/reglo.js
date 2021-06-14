var dt = new Date();
var DD = ("0" + dt.getDate()).slice(-2);
var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
var YYYY = dt.getFullYear();
new Vue({
    el: '#app',
    data: {
        valeur1: [],
        valeur2: [],
        valeur3: [],
        banniere: [],
        url1: "/api/totauxglobaux",
        url2: "/api/totauxmonth/" + YYYY + "/" + MM,
        url3: "/api/totauxday/" + YYYY + "/" + MM + "/" + DD
    },
    mounted() {
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
    methods: {
        verification: function (valeur) {
            if (typeof valeur !== 'number') {
                return 0;
            } else {
                return new Intl.NumberFormat('en-US', {style: 'decimal'}).format(valeur);
            }
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

async function getLineData() {
    var dt = new Date();
    var date = dt.getFullYear();
//Diagramme 1
    async function valeur1(dr, n) {
        var tr = fetch('/api/total/' + dr + '/' + n)
                .then(response => response.json())
                .then(function (response) {
                    $("#" + n).text(JSON.stringify(response));
                })
                .catch(function (error) {
                    $("#" + n).text(0);
                });
    }

    for (let pas = 1; pas <= 12; pas++) {
        valeur1(date, pas);
    }
//Janvier
    var total1 = $("#1").text();
    //Fevrier
    var total2 = $("#2").text();
    //Mars
    var total3 = $("#3").text();
    //Avril
    var total4 = $("#4").text();
    //Mai
    var total5 = $("#5").text();
    //Juin
    var total6 = $("#6").text();
    //Juillet
    var total7 = $("#7").text();
    //Août
    var total8 = $("#8").text();
    //Septembre
    var total9 = $("#9").text();
    //Octobre
    var total10 = $("#10").text();
    //Novembre
    var total11 = $("#11").text();
    //Decembre
    var total12 = $("#12").text();
    var ctx = document.getElementById('myLine').getContext('2d');
    var myLine = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
            datasets: [{
                    label: 'Total TTC',
                    data: [total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12],
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
                    data: [total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, total11, total12],
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
//Diagramme 2
    async function valeur3(dr, n) {
        var tr = fetch('/api/json/' + dr + '/' + n)
                .then(response => response.json())
                .then(function (response) {
                    $("#t" + n).text(JSON.stringify(response));
                })
                .catch(function (error) {
                    $("#t" + n).text(0);
                });
    }

    for (let pas = 1; pas <= 12; pas++) {
        valeur3(date, pas);
    }
//Janvier
    var try1 = $("#t1").text();
    //Fevrier
    var try2 = $("#t2").text();
    //Mars
    var try3 = $("#t3").text();
    //Avril
    var try4 = $("#t4").text();
    //Mai
    var try5 = $("#t5").text();
    //Juin
    var try6 = $("#t6").text();
    //Juillet
    var try7 = $("#t7").text();
    //Août
    var try8 = $("#t8").text();
    //Septembre
    var try9 = $("#t9").text();
    //Octobre
    var try10 = $("#t10").text();
    //Novembre
    var try11 = $("#t11").text();
    //Decembre
    var try12 = $("#t12").text();
    var ctx2 = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx2, {
        type: 'bar',
        data: {
            labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
            datasets: [{
                    data: [try1, try2, try3, try4, try5, try6, try7, try8, try9, try10, try11, try12],
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
                    label: 'Total TVA',
                    data: [try1, try2, try3, try4, try5, try6, try7, try8, try9, try10, try11, try12],
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
                    data: [try1, try2, try3, try4, try5, try6, try7, try8, try9, try10, try11, try12],
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

getLineData();
var test = setInterval(getLineData, 5000);
//var test1 = setInterval(getTotauxGlobaux, 1000);
//var test2 = setInterval(getTotauxMonth, 1000);
//var test3 = setInterval(getTotauxDay, 1000);
 