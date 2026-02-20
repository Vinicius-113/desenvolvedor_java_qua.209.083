package model;

import java.util.Date;

public class Usuario {

    private long idUsuario;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String senha;

    public Usuario(long idUsuario, String nome, Date dataNascimento, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String fazerLogin(String login, String senha) {
        if (this.email.equals(login) && this.senha.equals(senha)) {
            return "Login realizado com sucesso!";
        } else {
            return "Login ou senha inválidos.";
        }
    }

    public void fazerLogoff() {
        System.out.println("Usuário deslogado com sucesso!");
    }
}