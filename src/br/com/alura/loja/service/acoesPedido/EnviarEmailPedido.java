package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

public class EnviarEmailPedido {

    public void executa(Pedido pedido){
        System.out.println("Enviando email com dados do pedido - " + pedido.getCliente());
    }
}
