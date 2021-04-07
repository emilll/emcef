var liste = [0];
var test = setInterval(getLineData, 5000);
var test1 = setInterval(getTotalFactures, 1000);
var test2 = setInterval(getTotalRapports, 1000);
var test3 = setInterval(getTotalTTC, 1000);
var test4 = setInterval(getTotalGlobal, 1000);

async function getTotalFactures() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var facture_date = YYYY + "-" + MM + "-" + DD
    console.log(facture_date);
    const facture = await fetch('/factures/' + facture_date);
    var total_facture = await facture.json();
    document.getElementById("factures").innerHTML = total_facture;
}

async function getTotalRapports() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var rapport_date = YYYY + "-" + MM + "-" + DD;
    const rapport = await fetch('/rapports/' + rapport_date);
    var total_rapport = await rapport.json();
    document.getElementById("rapports").innerHTML = total_rapport;
}

async function getTotalTTC() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var ttc_date = YYYY + "-" + MM + "-" + DD;
    const ttc = await fetch('/rapports/' + ttc_date);
    var total_ttc = await ttc.json();
    document.getElementById("montant1").innerHTML = total_ttc;
}

async function getTotalGlobal() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var global_date = YYYY + "-" + MM + "-" + DD;
    const global = await fetch('/rapports/' + global_date);
    var total_global = await global.json();
    document.getElementById("montant2").innerHTML = total_global;
}



async function getLineData() {
    const response = await fetch('/json');
    var donne = await response.json();
    liste = [donne.janvier, donne.fevrier, donne.mars, donne.avril, donne.mai, donne.juin, donne.juillet, donne.aout, donne.septembre, donne.octobre, donne.novembre, donne.decembre];
    console.log(liste);

    var ctx = document.getElementById('myLine').getContext('2d');
    var myLine = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
            datasets: [{
                    label: 'Total TTC',
                    data: [liste[0], liste[1], liste[2], liste[3], liste[4], liste[5], liste[6], liste[7], liste[8], liste[9], liste[10], liste[11]],
                    fill: false,
                    borderColor: 'rgba(75, 192, 192, 1)',
                    borderWidth: 2
                },
                {
                    label: 'Total TVA',
                    data: [3, 8, 5, 10, 2, 7, 3, 8, 5, 10, 2, 7],
                    backgroundColor: 'rgba(153, 102, 255, 1)',
                    borderColor: 'red',
                    borderWidth: 1
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

    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
            datasets: [{
                    data: [12, 19, 3, 5, 2, 3, 12, 19, 3, 5, 2, 3],
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
}
