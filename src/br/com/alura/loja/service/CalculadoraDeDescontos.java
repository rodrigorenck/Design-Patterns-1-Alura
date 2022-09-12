package br.com.alura.loja.service;

import br.com.alura.loja.model.*;
import br.com.alura.loja.model.desconto.Desconto;
import br.com.alura.loja.model.desconto.DescontoParaOrcamentoMais500;
import br.com.alura.loja.model.desconto.DescontoParaOrcamentoMaisCincoItens;
import br.com.alura.loja.model.desconto.SemDesconto;

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
