// declarar constante
const form = document.querySelector('form');

// funcao para calcular a maioridade
const maioridade = () => {
    // declarar variaveis
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;

    const result = (idade >= 18) ? 'é maior de idade' : 'é menor de idade';

    // saida de dados
    document.querySelector('#result').innerHTML = `${nome} ${result}.`;

    // limpar valores
    document.querySelector('#nome').value = '';
    document.querySelector('#idade').value = '';
}

// evento
form.addEventListener('submit', function(event) {
    event.preventDefault();
    maioridade();
});