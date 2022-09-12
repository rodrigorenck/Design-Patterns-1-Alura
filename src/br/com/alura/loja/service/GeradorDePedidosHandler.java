package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.service.acoesPedido.AcaoPedido;

import java.time.LocalDate;
import java.util.List;

/**
 * Dependencias e execucao
 */
public class GeradorDePedidosHandler {

    private GeradorDePedidos dados;

    public GeradorDePedidosHandler(GeradorDePedidos geradorDePedidos) {
        this.dados = geradorDePedidos;
    }

    /**
     * Agora quem diz quais acoes sera usadas eh quem ta chamando o metodo - inversao de controle!
     */
    public void executa(List<AcaoPedido> acoes){
        Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        //invertemos o controle, eu nao preciso mais ficar dando new para cada nova acao
        //classe para de crescer indefinidamente
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
