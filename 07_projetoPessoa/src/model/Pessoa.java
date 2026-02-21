package model;

public abstract class Pessoa {

    private Long idPessoa;
    private String email;
    private String telefone;

    public Pessoa(Long idPessoa, String email, String telefone) {
        this.idPessoa = idPessoa;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}