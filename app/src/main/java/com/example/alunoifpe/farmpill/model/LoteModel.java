package com.example.alunoifpe.farmpill.model;

/**
 * Created by Gabriel on 30/10/2017.
 */

public class LoteModel {

    private double Quantidade;
    private String entrada;
    private String validade;
    private double venda;

    public LoteModel() {}

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
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

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
}
