package org.example.Model;

import java.time.LocalDate;

public class Requisicao {

    private int idRequisicao;
    private String setor;
    private LocalDate dataSolicitacao;
    private String status;

    public Requisicao(int idRequisicao, String setor, LocalDate dataSolicitacao, String status) {
        this.idRequisicao = idRequisicao;
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public Requisicao(String setor, LocalDate dataSolicitacao, String status) {
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public String getSetor() {
        return setor;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
