// declarar constante
const form = document.querySelector('form');

const calcular = () =>{
    let x = document.querySelector('#x').value;
    let y = document.querySelector('#y').value;
    let operador = document.querySelector('#operador').value;
    let result = 0;
    // verificar a operação selecionada
    switch(operador){
        case 'somar':
            result = x+y;
            document.querySelector('#result').innerHTML = result;
            break;

    switch(operador){
        case 'subtrair':
            result = x-y;
            document.querySelector('#result').innerHTML = result;
            break;

    switch(operador){
        case 'multiplicar':
            result = x*y;
            document.querySelector('#result').innerHTML = result;
            break;
            
    switch(operador){
        case 'dividir':
            result = x/y;
            document.querySelector('#result').innerHTML = result;
            break;
    // TODO: fazer função calcular
}

form.addEventListener('ubmit', function(event) {
    event.preventDefault();
    calcular();     
}); '}'