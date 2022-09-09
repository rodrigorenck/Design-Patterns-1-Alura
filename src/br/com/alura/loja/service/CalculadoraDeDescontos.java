package br.com.alura.loja.service;

import br.com.alura.loja.model.*;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    /**
     * Chain of Responsability
     */
    public BigDecimal calcular(Orcamento orcamento) {
        //encadeado - um desconto chama o proximo caso ele nao seja aplicado
        Desconto cadeiaDeDescontos =
                new DescontoParaOrcamentoMaisCincoItens(
                        new DescontoParaOrcamentoMais500(
                                new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
