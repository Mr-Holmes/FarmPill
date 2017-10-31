package com.example.alunoifpe.farmpill.model;

/**
 * Created by Gabriel on 30/10/2017.
 */

public class Farmacia {

    String descricao;
    String um;
    int qtdDeCaixas;
    String embalagem;
    Dimensoes dimensoes;
    float preçoPorCaixa;
    double demandaAnual;
    Lote lote;

    public Farmacia(String descricao, String um, int qtdDeCaixas, String embalagem, Dimensoes dimensoes, float preçoPorCaixa, double demandaAnual, Lote lote) {
        this.descricao = descricao;
        this.um = um;
        this.qtdDeCaixas = qtdDeCaixas;
        this.embalagem = embalagem;
        this.dimensoes = dimensoes;
        this.preçoPorCaixa = preçoPorCaixa;
        this.demandaAnual = demandaAnual;
        this.lote = lote;
    }

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

    public int getQtdDeCaixas() {
        return qtdDeCaixas;
    }

    public void setQtdDeCaixas(int qtdDeCaixas) {
        this.qtdDeCaixas = qtdDeCaixas;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public Dimensoes getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
    }

    public float getPreçoPorCaixa() {
        return preçoPorCaixa;
    }

    public void setPreçoPorCaixa(float preçoPorCaixa) {
        this.preçoPorCaixa = preçoPorCaixa;
    }

    public double getDemandaAnual() {
        return demandaAnual;
    }

    public void setDemandaAnual(double demandaAnual) {
        this.demandaAnual = demandaAnual;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }




}
