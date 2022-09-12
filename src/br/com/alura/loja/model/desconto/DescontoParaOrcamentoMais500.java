package br.com.alura.loja.model.desconto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMais500 extends Desconto {


    public DescontoParaOrcamentoMais500(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
