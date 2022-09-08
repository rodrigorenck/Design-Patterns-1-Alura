package br.com.alura.loja.service;

import br.com.alura.loja.model.Imposto;
import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    /**
     * Utilizamos o padrao strategy o nosso metodo calcular fica muito mais enxuto,
     * alem de que ele nao sofrera alteracoes caso novos impostos sejam adicionados na aplicacao
     * THE CONTEXT!
     */
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
