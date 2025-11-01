package com.atividade01.app;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber dados do usuário
        System.out.println("=== Cadastro de Usuário ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNasc = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        // Exibir dados informados
        System.out.println(" Dados informados");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);

        scanner.close();
    }
}
