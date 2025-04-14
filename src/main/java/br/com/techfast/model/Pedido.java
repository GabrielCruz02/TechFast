package br.com.techfast.model;

import java.sql.Date;

public class Pedido {

    private int Id;
    private String OrdemServico;
    private String NomePeca;
    private float ValorReparo;
    private String Status;
    private Date DataCriacao;
    private int FuncionarioId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOrdemServico() {
        return OrdemServico;
    }

    public void setOrdemServico(String ordemServico) {
        OrdemServico = ordemServico;
    }

    public String getNomePeca() {
        return NomePeca;
    }

    public void setNomePeca(String nomePeca) {
        NomePeca = nomePeca;
    }

    public float getValorReparo() {
        return ValorReparo;
    }

    public void setValorReparo(float valorReparo) {
        ValorReparo = valorReparo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        DataCriacao = dataCriacao;
    }

    public int getFuncionarioId() {
        return FuncionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        FuncionarioId = funcionarioId;
    }
}
