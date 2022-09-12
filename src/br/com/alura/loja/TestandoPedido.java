package br.com.alura.loja;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestandoPedido {

    public static void main(String[] args) {
        /**
         * Esses dadao vao variar pois cada interface - API, aplicacao web, etc - vai puxar essas info de um jeito
         * Codigo de apresentacao
         */
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 10);
        String cliente = "Rodrigo";
        LocalDate data = LocalDate.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        /**
         * Depois de criar o pedido, executaremos algumas acoes - estamos simulando apenas
         * Independente de por onde eu crie o pedido - aplicacao web, API, etc - eu sempre vou executar essas acoes
         * Para evitar que a gente precise duplicar esse codigo utilizaremos o padrao Command
         * Devemos extrair esse cara para que ele possa ser usado independente de por qual applicacao o pedido foi criado
         * Codigo do comando
         */
        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email para cliente do novo pedido");
    }
}
