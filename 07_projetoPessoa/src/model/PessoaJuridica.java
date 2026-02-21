package model;

public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(Long idPessoa, String email, String telefone,
                          String razaoSocial, String nomeFantasia, String cnpj) {
        super(idPessoa, email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }
}