package org.example.Model;

public class Materias {

    private int idMaterial;
    private String nome;
    private String unidade;
    private double estoque;

    public Materias(int idMaterial, String nome, String unidade, double estoque) {
        this.idMaterial = idMaterial;
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }

    public Materias(String nome, String unidade, double estoque) {
        this.nome = nome;
        this.unidade = unidade;
        this.estoque = estoque;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
}
