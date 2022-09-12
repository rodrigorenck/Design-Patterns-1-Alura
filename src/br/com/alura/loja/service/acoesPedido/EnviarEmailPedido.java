package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

/**
 * Observer
 */
public class EnviarEmailPedido implements AcaoPedido {

    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido - " + pedido.getCliente());
    }
}
