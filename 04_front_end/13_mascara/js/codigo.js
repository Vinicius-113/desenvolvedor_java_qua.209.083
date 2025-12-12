const form = document.querySelector('form');

const exibirInfo = () => {
    // declaracao variaveis
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let endereco = document.querySelector('#endereco').value;

    // saida de dados
    document.querySelector('#nomeResult').innerHTML = `<b>Nome:</b> ${nome}
    `;
    document.querySelector('#emailResult').innerHTML = `<b>E-mail:</b> ${email}
    `;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Data de Nascimento:</b> ${nascimento}
    `;
    document.querySelector('#cpfResult').innerHTML = `<b>Cpf:</b> ${cpf}
    `;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}
    `;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}
    `;
    document.querySelector('#enderecoResult').innerHTML = `<b>Endereco:</b> ${endereco}
    `;

    // apagar 
    form.reset();
    
}

form.addEventListener('submit', function(event) {
    event.preventDefault();
    exibirInfo();
});