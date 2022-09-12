package br.com.alura.loja.service;

import java.math.BigDecimal;

/**
 * Dados - como se fosse um DTO
 */
public class GeradorDePedidos {
    private String cliente;
    private BigDecimal valor;
    private int quantidade;

    public GeradorDePedidos(String cliente, BigDecimal valor, int quantidade) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
