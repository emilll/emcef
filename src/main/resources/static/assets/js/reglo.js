var test = setInterval(getLineData, 5000);
var test1 = setInterval(getTotalFactures, 1000);
var test2 = setInterval(getTotalRapports, 1000);
var test3 = setInterval(getTotalTTC, 1000);
var test4 = setInterval(getTotalTVA, 1000);

async function getTotalFactures() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var facture_date = YYYY + "-" + MM + "-" + DD;
    const facture = await fetch('/api/nbrfacture/' + facture_date);
    var total_facture = await facture.json();
    document.getElementById("factures").innerHTML = total_facture;
}

async function getTotalRapports() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var rapport_date = YYYY + "-" + MM + "-" + DD;
    const rapport = await fetch('/api/nbrrapport/' + rapport_date);
    var total_rapport = await rapport.json();
    document.getElementById("rapports").innerHTML = total_rapport;
}

async function getTotalTTC() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var ttc_date = YYYY + "-" + MM + "-" + DD;
    const ttc = await fetch('/api/totalttc/' + ttc_date);
    var total_ttc = await ttc.json();
    document.getElementById("montant1").innerHTML = total_ttc;
}

async function getTotalTVA() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var global_date = YYYY + "-" + MM + "-" + DD;
    const global = await fetch('/api/totaltva/' + global_date);
    var total_global = await global.json();
    document.getElementById("montant2").innerHTML = total_global;
}

async function Ttc(month) {
    var dt = new Date();
    var date = dt.getFullYear();
    const ttc = await fetch('/api/json/' + date + '/' + month);
    var total = await ttc.json();
    return total;
}


async function getLineData() {
    //const response = await fetch('/api/json');
    //var donne = await response.json();
    //liste = [donne.janvier, donne.fevrier, donne.mars, donne.avril, donne.mai, donne.juin, donne.juillet, donne.aout, donne.septembre, donne.octobre, donne.novembre, donne.decembre];
    //console.log(liste);
    var dt = new Date();
    var date = dt.getFullYear();
    //Janvier
    const ttc = await fetch('/api/json/' + date + '/1');
    var total1 = await ttc.json();
    //Fevrier
    const ttc = await fetch('/api/json/' + date + '/2');
    var total2 = await ttc.json();
    //Mars
    const ttc = await fetch('/api/json/' + date + '/3');
    var total3 = await ttc.json();
    //Avril
    const ttc = await fetch('/api/json/' + date + '/4');
    var total4 = await ttc.json();
    //Mai
    const ttc = await fetch('/api/json/' + date + '/5');
    var total5 = await ttc.json();
    //Juin
    const ttc = await fetch('/api/json/' + date + '/6');
    var total6 = await ttc.json();
    //Juillet
    const ttc = await fetch('/api/json/' + date + '/7');
    var total7 = await ttc.json();
    //Août
    const ttc = await fetch('/api/json/' + date + '/8');
    var total8 = await ttc.json();
    //Septembre
    const ttc = await fetch('/api/json/' + date + '/9');
    var total9 = await ttc.json();
    //Octobre
    const ttc = await fetch('/api/json/' + date + '/10');
    var total10 = await ttc.json();
    //Novembre
    const ttc = await fetch('/api/json/' + date + '/11');
    var total11 = await ttc.json();
    //Decembre
    const ttc = await fetch('/api/json/' + date + '/12');
    var total12 = await ttc.json();

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
