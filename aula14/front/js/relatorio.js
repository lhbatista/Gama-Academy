function validaLogin() {

    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);

    document.getElementById("user").innerHTML = `${jsonUser.nome} ( ${jsonUser.racf} )`;
    document.getElementById("imgUser").innerHTML = `<img src ="${jsonUser.linkFoto}">`;

    obterAgencias();
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function obterAgencias() {
    fetch("http://localhost:8080/agencias")
        .then(res => res.json())
        .then(result => preencheAgencias(result));
}

function preencheAgencias(resposta) {
    let agencias = '';

    for (let index = 0; index < resposta.length; index++) {
        agencias = agencias + `<option value = ${resposta[index].id}> ${resposta[index].nome} </option>`;
    }

    document.getElementById("sel_agencias").innerHTML = agencias;
}

function buscar() {
    let agencia = document.getElementById("sel_agencias");
    let agenciaId = agencia[agencia.selectedIndex].value; //obtem id da agencia selecionada 

    fetch("http://localhost:8080/agencia/" + agenciaId)
        .then(res => res.json())
        .then(result => preencheResposta(result));
}



function preencheResposta(resposta) {
    let agendas = '<table class = "table"> <tr> <th>cliente</th> <th>data</th> <th>hora</th> </tr>';

    for (let index = 0; index < resposta.agendamentos.length; index++) {
        agendas = agendas + `<tr> <td> ${resposta.agendamentos[index].nome} </td> 
                                  <td> ${resposta.agendamentos[index].dataAgendamento} </td>
                                  <td> ${resposta.agendamentos[index].horaAgendamento} </td> </tr>`;
    }

    agendas = agendas + '</table>';

    document.getElementById("tableResposta").innerHTML = agendas;
}

function buscarPorData() {
    let data = document.getElementById("dataAgendamento").value;

    fetch("http://localhost:8080/agendamentos/data?dataagendamento=" + data)
        .then(res => res.json())
        .then(result => preencheRespostaAgendamento(result));
}

function preencheRespostaAgendamento(resposta) {
    console.log(resposta);
    let agendas = '<table class = "table"> <tr> <th>agencia</th> <th>cliente</th> <th>data</th> <th>hora</th> </tr>';

    for (let index = 0; index < resposta.length; index++) {
        agendas = agendas + `<tr> <td> ${resposta[index].agencia.nome} </td> 
                                  <td> ${resposta[index].nome} </td> 
                                  <td> ${resposta[index].dataAgendamento} </td>
                                  <td> ${resposta[index].horaAgendamento} </td> </tr>`;
    }

    agendas = agendas + '</table>';

    document.getElementById("tableResposta").innerHTML = agendas;
}

function nomeClient() {
    let cliente = document.getElementById("txtUsuario");
    let nome = cliente.value;

    fetch("http://localhost:8080/agendamentos/cliente/" + nome)
        .then(res => res.json())
        .then(result => preencheRespostaAgendamento(result));
}

function obterAgendamentos() {
    fetch("http://localhost:8080/agendamentos/")
        .then(res => res.json())
        .then(result => preencheRespostaAgendamento(result));

}

function verificaCheck() {

    let verifica1 = document.getElementById("check_cliente").checked;
    let verifica2 = document.getElementById("check_data").checked;
    let verifica3 = document.getElementById("check_ag").checked;

    if (verifica1 == true) {
        nomeClient();
    }
    if (verifica2 == true) {
        buscarPorData();
    }
    if (verifica3 == true) {
        buscar();
    } else {
         obterAgendamentos(); }
}