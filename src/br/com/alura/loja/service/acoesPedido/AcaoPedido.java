package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

/**
 * Observer
 */
public interface AcaoPedido {

    void executarAcao(Pedido pedido);
}
