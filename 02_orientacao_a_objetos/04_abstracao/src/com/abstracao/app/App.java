package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        // intancia objeto de entrada de dados

        Scanner leia = new Scanner(System.in);

        // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();


        // declaração de variaveis
        String combustivel;



        // entrada de dados
        System.out.println("Informe os Dados do Carro:\n");
        System.out.println("Informe o fabricante:");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe o Modelo:");
        carro.modelo = leia.nextLine();
        System.out.println("Informe a Cor:");
        carro.cor = leia.nextLine();
        System.out.println("Informe o Ano:");
        carro.ano = leia.nextLine();
        System.out.println("Informe a Placa:");
        carro.placa = leia.nextLine();

        // padrao de combustivel
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario informa o tipo de combustivel 
        System.out.println("\nInforme o tipo de combustivel:\n");
        System.out.println("1 - Gasolina:");
        System.out.println("2 - Etanol:");
        System.out.println("3 - Tanto Gasolina como Etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Eletrico");
        combustivel = leia.nextLine();

        switch (combustivel) {
            case "1":
            carro.motorGasolina = true;
            case "2":
            carro.motorEtanol= true;

               break;
            case "3":
            carro.motorFlex = true;
               break;
            case "4":
            carro.motorDiesel = true;
               break;
            case "5":
            carro.motorEletrico = true;
               break;
            default:
               System.out.println("Motor Inexistente.");
        }

        // entrada de dados da moto
        System.out.println("\nInforme os Dados da Moto:\n");
        System.out.println("Informe o fabricante:");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe o Modelo:");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a cor:");
        moto.cor = leia.nextLine();
        System.out.println("Informe o Ano:");
        moto.ano = leia.nextLine();
        System.out.println("Informe a placa:");
        moto.placa = leia.nextLine();
        

        // saida de dados
        System.out.println("\nDados do Carro:\n");
        carro.exibirDados();
        System.out.println("\nDados da Moto:\n");
        moto.exibirDados();

        


        // fecha objeto leia
        leia.close();;
          



    }
}
