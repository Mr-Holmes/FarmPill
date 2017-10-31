package com.example.alunoifpe.farmpill.model;

/**
 * Created by Gabriel on 30/10/2017.
 */

public class FarmaciaModel {

    private String descricao;
    private String um;
    private double qtdPorCaixas;
    private String embalagem;
    private float precoPorCaixa;
    private double demandaAnual;

    public FarmaciaModel(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public double getQtdPorCaixas() {
        return qtdPorCaixas;
    }

    public void setQtdPorCaixas(double qtdDeCaixas) {
        this.qtdPorCaixas = qtdDeCaixas;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public float getPrecoPorCaixa() {
        return precoPorCaixa;
    }

    public void setPrecoPorCaixa(float precoPorCaixa) {
        this.precoPorCaixa = precoPorCaixa;
    }

    public double getDemandaAnual() {
        return demandaAnual;
    }

    public void setDemandaAnual(double demandaAnual) {
        this.demandaAnual = demandaAnual;
    }





}
