package br.com.alura.loja.service;

import br.com.alura.loja.model.*;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento) {
        //encadeado - um desconto chama o proximo caso ele nao seja aplicado
        Desconto desconto = new DescontoParaOrcamentoMaisCincoItens(
                new DescontoParaOrcamentoMais500(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
