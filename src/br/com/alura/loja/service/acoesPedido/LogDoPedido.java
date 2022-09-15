package br.com.alura.loja.service.acoesPedido;

import br.com.alura.loja.model.Pedido;

public class LogDoPedido implements AcaoPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedigo gerado: " + pedido);
    }
}
