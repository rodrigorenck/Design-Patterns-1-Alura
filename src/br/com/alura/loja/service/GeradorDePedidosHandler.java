package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.service.acoesPedido.EnviarEmailPedido;
import br.com.alura.loja.service.acoesPedido.SalvarPedidoNoBanco;

import java.time.LocalDate;

/**
 * Dependencias e execucao
 */
public class GeradorDePedidosHandler {

    //construtor que recebe as dependencias(repository, service, etc)


    /**
     * Metodo vai crescer infinitamente, para cada nova acao que eu precise executar depois de gerar um pedido
     * Para deixar o codigo mais coeso podemos criar uma classe para cada acao - vai diminuir o tamanho do metodo
     */
    public void executa(GeradorDePedidos dados){
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        SalvarPedidoNoBanco salvarPedidoNoBanco = new SalvarPedidoNoBanco();
        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();

        //logica de salvar no banco e enviar email nao estao mais dentro desse metodo - melhorou
        salvarPedidoNoBanco.executa(pedido);
        enviarEmailPedido.executa(pedido);
    }
}
