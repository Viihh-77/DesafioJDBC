package org.example.Model;

public class Fornecedores {

    private int idFornecedor;
    private String nome;
    private String cnpj;

    public Fornecedores(int idFornecedor, String nome, String cnpj) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Fornecedores(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
