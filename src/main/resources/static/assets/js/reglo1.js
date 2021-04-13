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
    if (typeof total_rapport !== 'number') {
        document.getElementById("rapports").innerHTML = 0;
    } else {
        document.getElementById("rapports").innerHTML = total_rapport;
    }
}

async function getTotalTTC() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var ttc_date = YYYY + "-" + MM + "-" + DD;
    fetch('/api/totalttc/' + ttc_date)
            .then(response => response.json())
            .then(function (response) {
                document.getElementById("montant1").innerHTML = JSON.stringify(response);
            })
            .catch(function (error) {
                document.getElementById("montant1").innerHTML = 0;
            });
}

async function getTotalTVA() {
    var dt = new Date();
    var DD = ("0" + dt.getDate()).slice(-2);
    var MM = ("0" + (dt.getMonth() + 1)).slice(-2);
    var YYYY = dt.getFullYear();
    var global_date = YYYY + "-" + MM + "-" + DD;
    var total_global = fetch('/api/totaltva/' + global_date)
            .then(response => response.json())
            .then(function (response) {
                document.getElementById("montant2").innerHTML = JSON.stringify(response);
            })
            .catch(function (error) {
                document.getElementById("montant2").innerHTML = 0;
            });
}


async function getLineData() {
    var dt = new Date();
    var date = dt.getFullYear();
//Diagramme 1
    async function valeur1(dr, n) {
        var tr = fetch('/api/json/' + dr + '/' + n)
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
    console.log(total1);
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
    
    //Diagramme 2

async function valeur2(dr, n) {
        var tr = fetch('/api/json/' + dr + '/'+n)
                .then(response => response.json())
                .then(function (response) {
                     $("#n"+n).text(JSON.stringify(response)) ;
                })
                .catch(function (error) {
                     $("#n"+n).text(0) ;
                });
    }
    
    for (let pas = 1; pas <= 12; pas++) {
  valeur2(date, pas);
}
    //Janvier
    var test1 = $("#n1").text();
    console.log(test1);
    //Fevrier
    var test2 = $("#n2").text();
    //Mars
    var test3 = $("#n3").text();
    //Avril
    var test4 = $("#n4").text();
    //Mai
    var test5 = $("#n5").text();
    //Juin
    var test6 = $("#n6").text();
    //Juillet
    var test7 = $("#n7").text();
    //Août
    var test8 = $("#n8").text();
    //Septembre
    var test9 = $("#n9").text();
    //Octobre
    var test10 = $("#n10").text();
    //Novembre
    var test11 = $("#n11").text();
    //Decembre
    var test12 = $("#n12").text();

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
                    data: [test1, test2, test3, test1, test2, test3, test1, test2, test3, test1, test2, test3],
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


//Diagramme 3
async function valeur3(dr, n) {
        var tr = fetch('/api/total/' + dr + '/'+n)
                .then(response => response.json())
                .then(function (response) {
                     $("#t"+n).text(JSON.stringify(response)) ;
                })
                .catch(function (error) {
                     $("#t"+n).text(0) ;
                });
    }
    
    for (let pas = 1; pas <= 12; pas++) {
  valeur3(date, pas);
}
    //Janvier
    var try1 = $("#t1").text();
    console.log(try1);
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
    
    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
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
}

getLineData();
var test = setInterval(getLineData, 5000);
var test1 = setInterval(getTotalFactures, 1000);
var test2 = setInterval(getTotalRapports, 1000);
var test3 = setInterval(getTotalTTC, 1000);
var test4 = setInterval(getTotalTVA, 1000);
