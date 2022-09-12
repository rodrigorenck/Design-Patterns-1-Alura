package br.com.alura.loja;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.service.GeradorDePedidos;
import br.com.alura.loja.service.GeradorDePedidosHandler;
import br.com.alura.loja.service.acoesPedido.EnviarEmailPedido;
import br.com.alura.loja.service.acoesPedido.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

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
        handler.executa(Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBanco()));
    }
}
