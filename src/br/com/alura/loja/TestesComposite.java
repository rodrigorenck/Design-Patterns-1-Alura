package br.com.alura.loja;

import br.com.alura.loja.model.ItemOrcamento;
import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposite {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);


        //imagine que para pegarmos o valor nos temos que ir em uma API externa que eh muito lenta
        //para a primeira chamada teremos que ir na API, porem para as proximas poderiamos armazenar o valor e pegar como se fosse um cache
        //padrao Proxy - ele vai interceptar essa chamada do getValor e verificar se ele ja nao foi chamado antes - para entao devolver o valor que ja esta em cache
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
