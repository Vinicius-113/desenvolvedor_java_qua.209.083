package com.atividade03;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        // instancia o Scanner
        Scanner leia = new Scanner (System.in);




        //declaração de variaveis 
        
        String nome;
        String resultado;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe o peso em kg:");
        peso = leia.nextDouble();
        System.out.println(" Informe altura em metros:");
        altura = leia.nextDouble();

        // calcular o imc
        imc = peso/Math.pow(altura, 2);

        // Exibe o imc na tela 
        System.out.println(nome + ", seu IMC é " + String.format("%.2f" , imc) + ".");


        // exibe o diagnóstico 

        resultado =  (imc < 18.5)?" está abaixo do peso " : 
         (imc < 25) ? " está no peso ideal " :
         (imc < 30) ? " está acima do peso" :
         (imc < 35) ? " está obeso" :
         (imc < 40) ? " está com obesidade nivel 2" :
         "está com obesidade mórbida";

         // exibe o resultado 
         System.out.println(nome + resultado + ".");
        


    





        // fecha objetos Leia 
        leia.close();
    }
}
