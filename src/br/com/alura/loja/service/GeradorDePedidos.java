package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Dados
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
