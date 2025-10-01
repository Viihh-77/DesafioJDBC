package org.example.Model;

import java.time.LocalDate;

public class NotaEntrada {

    private int idNotaEntrada;
    private int idFornecedor;
    private LocalDate dataEntrada;

    public NotaEntrada(int idNotaEntrada, int idFornecedor, LocalDate dataEntrada) {
        this.idNotaEntrada = idNotaEntrada;
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public NotaEntrada(int idFornecedor, LocalDate dataEntrada) {
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public int getIdNotaEntrada() {
        return idNotaEntrada;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setIdNotaEntrada(int idNotaEntrada) {
        this.idNotaEntrada = idNotaEntrada;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
