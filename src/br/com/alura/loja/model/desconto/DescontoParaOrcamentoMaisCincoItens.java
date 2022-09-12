package br.com.alura.loja.model.desconto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaisCincoItens extends Desconto {


    public DescontoParaOrcamentoMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidade() > 5;
    }
}
