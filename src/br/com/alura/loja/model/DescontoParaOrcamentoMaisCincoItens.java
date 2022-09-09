package br.com.alura.loja.model;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaisCincoItens extends Desconto{


    public DescontoParaOrcamentoMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidade()>5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
