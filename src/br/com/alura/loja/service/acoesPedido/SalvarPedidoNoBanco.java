package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

/**
 * Observer
 */
public class SalvarPedidoNoBanco implements AcaoPedido{

    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco - " + pedido.getCliente());
    }
}
