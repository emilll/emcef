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
    if(typeof total_rapport  !== 'number'){
    document.getElementById("rapports").innerHTML = 0;
    }else{
        document.getElementById("rapports").innerHTML = total_rapport;
    }
}

async function getTotalTTC() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var ttc_date = YYYY + "-" + MM + "-" + DD;
    const ttc = await fetch('/api/totalttc/' + ttc_date);
    var total_ttc = await ttc.json();
    if(typeof total_ttc  !== 'number'){
    document.getElementById("montant1").innerHTML = 0;
    }else{
       document.getElementById("montant1").innerHTML = total_ttc;
    }
}

async function getTotalTVA() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var global_date = YYYY + "-" + MM + "-" + DD;
    const global = await fetch('/api/totaltva/' + global_date);
    var total_global = await global.json();
    if(typeof total_global  !== 'number'){
    document.getElementById("montant2").innerHTML = 0;
    }else{
       document.getElementById("montant2").innerHTML = total_global;
    }
}


async function getLineData() {
    //const response = await fetch('/api/json');
    //var donne = await response.json();
    //liste = [donne.janvier, donne.fevrier, donne.mars, donne.avril, donne.mai, donne.juin, donne.juillet, donne.aout, donne.septembre, donne.octobre, donne.novembre, donne.decembre];
    //console.log(liste);
    var dt = new Date();
    var date = dt.getFullYear();
    //Janvier
    const ttc1 = await fetch('/api/json/' + date + '/1');
    var test1 = await ttc1.json();
    var total1 = 0;
    if(typeof test1  === 'number'){
        total1 = test1;
    }
    //Fevrier
    const ttc2 = await fetch('/api/json/' + date + '/2');
    var test2 = await ttc2.json();
    var total2 = 0;
    if(typeof test2  === 'number'){
        total2 = test2;
    }
    //Mars
    const ttc3 = await fetch('/api/json/' + date + '/3');
    var test3 = await ttc3.json();
    var total3 = 0;
    if(typeof test3  === 'number'){
        total3 = test3;
    }
    //Avril
    const ttc4 = await fetch('/api/json/' + date + '/4');
    var test4 = await ttc4.json();
    var total4 = 0;
    if(typeof test4  === 'number'){
        total4 = test4;
    }
    //Mai
    const ttc5 = await fetch('/api/json/' + date + '/5');
    var test5 = await ttc5.json();
    var total5 = 0;
    if(typeof test5  === 'number'){
        total5 = test5;
    }
    //Juin
    const ttc6 = await fetch('/api/json/' + date + '/6');
    var test6 = await ttc6.json();
    var total6 = 0;
    if(typeof test6  === 'number'){
        total6 = test6;
    }
    //Juillet
    const ttc7 = await fetch('/api/json/' + date + '/7');
   var test7 = await ttc7.json();
    var total7 = 0;
    if(typeof test7  === 'number'){
        total7 = test7;
    }
    //Août
    const ttc8 = await fetch('/api/json/' + date + '/8');
    var test8 = await ttc8.json();
    var total8 = 0;
    if(typeof test8  === 'number'){
        total8 = test8;
    }
    //Septembre
    const ttc9 = await fetch('/api/json/' + date + '/9');
    var test9 = await ttc9.json();
    var total9 = 0;
    if(typeof test9  === 'number'){
        total9 = test9;
    }
    //Octobre
    const ttc10 = await fetch('/api/json/' + date + '/10');
   var test10 = await ttc10.json();
    var total10 = 0;
    if(typeof test10  === 'number'){
        total10 = test10;
    }
    //Novembre
    const ttc11 = await fetch('/api/json/' + date + '/11');
   var test11 = await ttc11.json();
    var total11 = 0;
    if(typeof test11  === 'number'){
        total11 = test11;
    }
    //Decembre
    const ttc12 = await fetch('/api/json/' + date + '/12');
    var test12 = await ttc12.json();
    var total12 = 0;
    if(typeof test12  === 'number'){
        total12 = test12;
    }

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
