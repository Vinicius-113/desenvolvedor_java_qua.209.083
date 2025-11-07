package com.heranca.app;
// classe java importada
import java.util.Scanner;

// classe importada por mim

import com.heranca.models.PessoaJuridica;
import com.heranca.models.PessoaFisica;


public class App {
    public static void main(String[] args) throws Exception {

    // instancias
    Scanner leia = new Scanner(System.in);

    PessoaFisica usuario = new PessoaFisica(
        null,    
        null,
        0,
        null,
        null

    );

    PessoaJuridica corp = new PessoaJuridica(
        null,
        null,
        null,
        null,
        null

    );
     
     // entrada de dados
     System.out.println("Informe os dados do Usuário:\n");
     System.out.println("Informe o nome:");
     usuario.nome = leia.nextLine();
     System.out.println("Informe o CPF:");
     usuario.cpf = leia.nextLine();
     System.out.println("Informe o email:");
     usuario.email = leia.nextLine();
     System.out.println("Informe o telefone:");
     usuario.telefone = leia.nextLine();
     System.out.println("Informe a Idade:");
     usuario.idade = leia.nextInt();

     // limpeza de buffer
     leia.nextLine();

     // entrada de dados da empresa

     System.out.println("\nInforme o dados da empresa:\n");
     System.out.println("Informe o nome da Empresa:");
     corp.nomeFantasia = leia.nextLine();
     System.out.println("Informe a razao social:");
     corp.razaoSocial = leia.nextLine();
     System.out.println("Informe o CNPJ:");
     corp.cnpj = leia.nextLine();
     System.out.println("Informe o email:");
     corp.email = leia.nextLine();
     System.out.println("Informe o telefone:");
     corp.telefone = leia.nextLine();


     // saida de dados
     System.out.println("\n Dados do Usuário:\n");
     usuario.exibirDados();
     System.out.println("\n DAdos da Empresa:\n");
     corp.exibirDados();



    



    // fecha objeto leia 
    leia.close();
        
        
        
      

    }
}
