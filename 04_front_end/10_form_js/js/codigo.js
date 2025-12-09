// declarar as variaveis globais
const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
// desativa o submit
event.preventDefault();

// declarar de variaveis locais
 let texto = document.querySelector('#texto').value;

 // exibe o texto em forma de caixa de dialogo

 alert(texto);

});