package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GeradorDePedidos {
    private String cliente;
    private BigDecimal valor;
    private int quantidade;

    public GeradorDePedidos(String cliente, BigDecimal valor, int quantidade) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(valor, quantidade);
        Pedido pedido = new Pedido(cliente, LocalDate.now(), orcamento);
        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email para cliente do novo pedido");
    }
}
