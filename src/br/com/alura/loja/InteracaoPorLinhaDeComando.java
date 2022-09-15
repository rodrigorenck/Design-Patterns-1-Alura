package br.com.alura.loja;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.service.GeradorDePedidos;
import br.com.alura.loja.service.GeradorDePedidosHandler;
import br.com.alura.loja.service.acoesPedido.AcaoPedido;
import br.com.alura.loja.service.acoesPedido.EnviarEmailPedido;
import br.com.alura.loja.service.acoesPedido.LogDoPedido;
import br.com.alura.loja.service.acoesPedido.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe que representa uma das formas de interacao com Usuario
 */
public class InteracaoPorLinhaDeComando {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valor = new BigDecimal("100");
        Integer quantidade = Integer.parseInt("10");

        GeradorDePedidos dados = new GeradorDePedidos(cliente, valor, quantidade);
        GeradorDePedidosHandler handler = new GeradorDePedidosHandler(dados);
        List<AcaoPedido> acoes = new ArrayList<>(
                Arrays.asList(
                        new EnviarEmailPedido(),
                        new SalvarPedidoNoBanco(),
                        new LogDoPedido()
                )
        );
        //cliente nao sabe o que acontece por baixo dos panos do metodo executar - facade
        handler.executa(acoes);
    }
}
