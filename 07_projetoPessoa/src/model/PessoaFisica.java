package model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(Long idPessoa, String email, String telefone,
                        String nome, LocalDate dataNascimento, String cpf) {
        super(idPessoa, email, telefone);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}