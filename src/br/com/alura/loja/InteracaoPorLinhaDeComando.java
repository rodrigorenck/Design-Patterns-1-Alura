package br.com.alura.loja;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.service.GeradorDePedidos;
import br.com.alura.loja.service.GeradorDePedidosHandler;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Classe que representa uma das formas de interacao com Usuario
 */
public class InteracaoPorLinhaDeComando {

    public static void main(String[] args) {
        /**
         * Simula pegar os dados do pedido pelos argumentos
         */
        String cliente = args[0];
        BigDecimal valor = new BigDecimal(args[1]);
        Integer quantidade = Integer.parseInt(args[2]);

        /**
         * Independente de onde vier as informacoes esse codigo ficara sempre igual
         * Encapsulamos a logica de gerar pedido
         * Fica independente do mecanismo de apresentacao!
         * Pattern Command
         */
        GeradorDePedidos dados = new GeradorDePedidos(cliente, valor, quantidade);
        GeradorDePedidosHandler handler = new GeradorDePedidosHandler(/*dependencias*/);
        handler.executa(dados);
    }
}
