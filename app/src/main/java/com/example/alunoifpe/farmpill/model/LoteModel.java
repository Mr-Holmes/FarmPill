package com.example.alunoifpe.farmpill.model;

/**
 * Created by Gabriel on 30/10/2017.
 */

public class LoteModel {

    int Quantidade;
    String entrada;
    String validade;
    int venda;

    public LoteModel(int quantidade, String entrada, String validade, int venda) {
        Quantidade = quantidade;
        this.entrada = entrada;
        this.validade = validade;
        this.venda = venda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
}