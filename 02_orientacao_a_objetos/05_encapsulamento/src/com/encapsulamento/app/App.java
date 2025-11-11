package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
      // instancia as classes
      Scanner leia = new Scanner(System.in);

      Pessoa usuario = new Pessoa();

      // entrada de dados
      System.out.println("Informe seu Nome:");
      usuario.setNome(leia.nextLine());
      System.out.println("Informe o CPF:");
      usuario.setCpf(leia.nextLine());
      System.out.println("Informe o E-mail:");
      usuario.setEmail(leia.nextLine());
      System.out.println("Informe sua Idade:");
      usuario.setIdade(leia.nextInt());

      // saída de dados
      System.out.println("\nDados do Usuário:\n");
      System.out.println("Nome:" + usuario.getNome());
      System.out.println("CPF:" + usuario.getCpf());
      System.out.println("E-mail:" + usuario.getEmail());
      System.out.println("Idade:" + usuario.getIdade());
      




      // fecha o objeto Leiia
      leia.close();




      
    }
}
