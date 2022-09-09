package br.com.alura.loja.model;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMais500 extends Desconto{


    public DescontoParaOrcamentoMais500(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }
}
