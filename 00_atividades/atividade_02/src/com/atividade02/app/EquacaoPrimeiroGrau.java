package com.atividade02.app;

import java.util.Scanner;



public class EquacaoPrimeiroGrau {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, x;

        System.out.print("Digite o valor de a: ");
        a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = input.nextDouble();

        if(a == 0){
            System.out.println("Não é equação do 1° grau (a não pode ser 0).");
        } else {
            x = -b / a;
            System.out.println("A raiz (x) é: " + x);
        }

        input.close();
    }


    }

