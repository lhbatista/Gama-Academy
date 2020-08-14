
    function login(){
        let campoNome = document.getElementById("txtnome");

        console.log("Nome do usuário" + campoNome.value);
        
        let resposta = "Luis";

        if(resposta == campoNome.value){
            alert('Login com sucesso');
        }else{
            alert('Falha no login');
        }

    let divBloco = document.getElementById("bloco");

    divBloco.innerHTML = "<input type='text' id='blocoInner' value = 'Luis'>";
        
    }

    // function outra(){

    //     alert(a);
    // }
