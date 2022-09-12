package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;

import java.time.LocalDate;

/**
 * Dependencias e execucao
 */
public class GeradorDePedidosHandler {

    //construtor que recebe as dependencias(repository, service, etc)

    public void executa(GeradorDePedidos dados){
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);
        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email para cliente do novo pedido");
    }
}
