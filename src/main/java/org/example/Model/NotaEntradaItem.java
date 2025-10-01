package org.example.Model;

public class NotaEntradaItem {

    private int idEntradaItem;
    private int idNotaEntrada;
    private int idMaterial;
    private double quantidade;

    public NotaEntradaItem(int idEntradaItem, int idNotaEntrada, int idMaterial, double quantidade) {
        this.idEntradaItem = idEntradaItem;
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public NotaEntradaItem(int idNotaEntrada, int idMaterial, double quantidade) {
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getIdEntradaItem() {
        return idEntradaItem;
    }

    public int getIdNotaEntrada() {
        return idNotaEntrada;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setIdEntradaItem(int idEntradaItem) {
        this.idEntradaItem = idEntradaItem;
    }

    public void setIdNotaEntrada(int idNotaEntrada) {
        this.idNotaEntrada = idNotaEntrada;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
