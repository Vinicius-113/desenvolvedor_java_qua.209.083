package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // instancia a Scanner
        Scanner leia = new Scanner(System.in);


        // declaração de variável
        int n;



        //entrada de dados 
        System.out.println("Informe um numero inteiro:");
        n = leia.nextInt();

        // loop (laço de repetição)

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
            
        



        // fecha o objeto leia 
        leia.close();


    }
}
