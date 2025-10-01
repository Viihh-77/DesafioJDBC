package org.example.Model;

public class RequisicaoItem {

    private int idRequiItem;
    private int idRequisicao;
    private int idMaterial;
    private double quantidade;

    public RequisicaoItem(int idRequiItem, int idRequisicao, int idMaterial, double quantidade) {
        this.idRequiItem = idRequiItem;
        this.idRequisicao = idRequisicao;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public RequisicaoItem(int idRequisicao, int idMaterial, double quantidade) {
        this.idRequisicao = idRequisicao;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdRequiItem() {
        return idRequiItem;
    }

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setIdRequiItem(int idRequiItem) {
        this.idRequiItem = idRequiItem;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}

