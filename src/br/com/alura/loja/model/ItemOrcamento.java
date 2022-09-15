package br.com.alura.loja.model;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {
    private BigDecimal valor;
    private int quantidade;

    public ItemOrcamento(BigDecimal valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
        this.quantidade = 1;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
