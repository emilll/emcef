<script>
    var getUrl = window.location;
    var baseUrl = getUrl .protocol + "//" + getUrl.host + "/" + getUrl.pathname.split('/')[1] + "/";
    async function recherche1() {
        const man = Swal.mixin({
            customClass: {
                confirmButton: 'btn btn-success col-sm-12 ',
                cancelButton: 'btn btn-danger col-sm-12'
            },
            buttonsStyling: false
        })
        man.fire({
            html:
                    '<div class="col-sm-12 my-auto">' +
                    '<div class="mb-2">' +
                    '<h2 class="text-dark mb-3">Recherche Contribuable</h2>' +
                    '<div class="row">' +
                    '<div class="col-sm-12 form-group">' +
                    '<input type="text" class="form-control style_form_control" id="val1" name="" placeholder="IFU">' +
                    '</div>' +
                    '</div>' +
                    '</div>' +
                    '</div>',
            showCancelButton: true,
            cancelButtonText: 'Annuler',
            confirmButtonText: 'Rechercher',
            showLoaderOnConfirm: true,
            preConfirm: (login) => {
                var variable;
                if (document.getElementById('val1').value !== "") {
                    variable = baseUrl+"api/findcontribuablebyifu/" + document.getElementById('val1').value;
                    return fetch(variable)
                            .then(response => {
                                if (!response.ok) {
                                    throw new Error(response.statusText)
                                }
                                return response.json()
                            })
                            .catch(error => {
                                Swal.showValidationMessage(
                                        'La requête a échoué: ${error}'
                                        )
                            })
                } else {
                    Swal.showValidationMessage(
                            'Le champ IFU est vide!'
                            )
                }
            },
            allowOutsideClick: () => !Swal.isLoading()
        }).then((result) => {
            if (result.isDismissed === false) {
                if (result.value.ifu !== null) {
                    window.location.href = baseUrl + "contribuable/" + result.value.ifu;
                }
                if (result.value.ifu === null) {
                    Swal.fire({
                        icon: 'error',
                        title: 'Erreur...',
                        text: 'Ce contribuable n\'existe pas!'
                    })
                }
            }
        })
    }

    async function recherche2() {
        const man = Swal.mixin({
            customClass: {
                confirmButton: 'btn btn-success col-sm-12 ',
                cancelButton: 'btn btn-danger col-sm-12'
            },
            buttonsStyling: false
        })
        man.fire({
            html:
                    '<div class="col-sm-12 my-auto">' +
                    '<div class="mb-2">' +
                    '<h2 class="text-dark mb-3">Recherche Machine</h2>' +
                    '<div class="row">' +
                    '<div class="col-sm-12 form-group">' +
                    '<input type="text" class="form-control style_form_control" id="val1" name="" placeholder="e-NIM">' +
                    '</div>' +
                    '</div>' +
                    '</div>' +
                    '</div>',
            showCancelButton: true,
            cancelButtonText: 'Annuler',
            confirmButtonText: 'Rechercher',
            showLoaderOnConfirm: true,
            preConfirm: (login) => {
                var variable;
                if (document.getElementById('val1').value !== "") {
                    variable = baseUrl+"api/findmachinebyenim/" + document.getElementById('val1').value;
                    return fetch(variable)
                            .then(response => {
                                if (!response.ok) {
                                    throw new Error(response.statusText)
                                }
                                return response.json()
                            })
                            .catch(error => {
                                Swal.showValidationMessage(
                                        'La requête a échoué: ${error}'
                                        )
                            })
                } else {
                    Swal.showValidationMessage(
                            'Le champ e-NIM est vide!'
                            )
                }
            },
            allowOutsideClick: () => !Swal.isLoading()
        }).then((result) => {
            if (result.isDismissed === false) {
                if (result.value.nim === null) {
                    Swal.fire({
                        icon: 'error',
                        title: 'Erreur...',
                        text: 'Cette machine n\'existe pas!'
                    })
                }
                if (result.value.nim !== null) {
                    window.location.href = baseUrl + "machine/" + result.value.nim;
                }
            }
        })
    }

    async function recherche3() {
        const man = Swal.mixin({
            customClass: {
                confirmButton: 'btn btn-success col-sm-12 ',
                cancelButton: 'btn btn-danger col-sm-12'
            },
            buttonsStyling: false
        })
        man.fire({
            html:
                    '<div class="col-sm-12 my-auto">' +
                    '<div class="mb-2">' +
                    '<h2 class="text-dark mb-3">Recherche Point de vente</h2>' +
                    '<div class="row">' +
                    '<div class="col-sm-12 form-group">' +
                    '<input type="text" class="form-control style_form_control" id="val1" name="" placeholder="IFU Point de Vente">' +
                    '</div>' +
                    '</div>' +
                    '</div>' +
                    '</div>',
            showCancelButton: true,
            cancelButtonText: 'Annuler',
            confirmButtonText: 'Rechercher',
            showLoaderOnConfirm: true,
            preConfirm: (login) => {
                var variable;
                if (document.getElementById('val1').value !== "") {
                    variable = baseUrl+"api/findsellerbyifu/" + document.getElementById('val1').value;
                    return fetch(variable)
                            .then(response => {
                                if (!response.ok) {
                                    throw new Error(response.statusText)
                                }
                                return response.json()
                            })
                            .catch(error => {
                                Swal.showValidationMessage(
                                        'La requête a échoué: ${error}'
                                        )
                            })
                } else {
                    Swal.showValidationMessage(
                            'Le champ IFU est vide!'
                            )
                }
            },
            allowOutsideClick: () => !Swal.isLoading()
        }).then((result) => {
            if (result.isDismissed === false) {
                if (result.value.ifuseller !== null) {
                    window.location.href = baseUrl + "installation/" + result.value.ifuseller;
                }
                if (result.value.ifuseller === null) {
                    Swal.fire({
                        icon: 'error',
                        title: 'Erreur...',
                        text: 'Ce Point de Vente n\'existe pas!'
                    })
                }
            }
        })
    }
</script>
