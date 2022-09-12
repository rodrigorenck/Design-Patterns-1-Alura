package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

public class SalvarPedidoNoBanco {

    public void executa(Pedido pedido){
        System.out.println("Salvando pedido no banco - " + pedido.getCliente());
    }
}
