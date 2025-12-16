const form = document.querySelector('form');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const pesquisaCep = document.querySelector('#cep');

const limparFormulario = () => {
    document.querySelector('#estado').value = ("");
    document.querySelector('#cidade').value = ("");
    document.querySelector('#bairro').value = ("");
    document.querySelector('#logradouro').value = ("");
    document.querySelector('#complemento').value = ("");
}

const meuCallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value = (conteudo.uf);
        document.querySelector('#cidade').value = (conteudo.localidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
        document.querySelector('#complemento').value = (conteudo.complemento);
        
    }
    else {
        limparFormulariocep();
        alert("CEP não encontrado.");
    }
}

//TODO:

const exibirDados = () => {
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let telefone = document.querySelector('#telefone').value;
    let cpf = document.querySelector('#cpf').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;

    document.querySelector('#nomeResult').innerText = nome;
    document.querySelector('#emailResult').innerText = '<b>E-mail:</b> ${email}';
    document.querySelector('#nascimentoResult').innerText = '<b>Data de Nascimento:</b> ${nascimento}';
    document.querySelector('#telefoneResult').innerText = '<b>Telefone:</b> ${telefone}';
    document.querySelector('#cpfResult').innerText = '<b>CPF:</b> ${cpf}';
    document.querySelector('#cepResult').innerText = '<b>CEP:</b> ${cep}';
    document.querySelector('#estadoResult').innerText = '<b>Estado:</b> ${estado}';
    document.querySelector('#cidadeResult').innerText = '<b>Cidade:</b> ${cidade}';
    document.querySelector('#bairroResult').innerText = '<b>Bairro:</b> ${bairro}';
    document.querySelector('#logradouroResult').innerText = '<b>Logradouro:</b> ${logradouro}';
    document.querySelector('#complementoResult').innerText = '<b>Complemento:</b> ${complemento}';
    document.querySelector('#numeroResult').innerText = '<b>Número:</b> ${numero}';

    form.reset();
}

form.addEventListener('submit', function(event){
    event.preventDefault();
    exibirDados();  
}   );  