package com.heranca.app;

import com.heranca.models.PessoaJuridica;
import com.heranca.models.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "Marcos Vinicius";
        usuario.cpf =  "123.345.789-12";
        usuario.email = "marcos@gmail.com";
        usuario.telefone = "(61) 99999-9999";
        usuario.idade = 25;

        empresa.razaoSocial = "Marcos LTDA";
        empresa.nomeFantasia = "Cyber System";
        empresa.cnpj = "55.789.123/0001-20";
        empresa.email = "cyber@gmail.com";
        empresa.telefone = " (61) 99999-9999";

        
        System.out.println("Nome do usuario: " + usuario.nome);
        System.out.println("Cpf do usuario: " + usuario.cpf);
    
        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Idade do usuario: " + usuario.idade + " anos.");
        

        System.out.println("\n-----------------------\n");
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);
        
      

    }
}
