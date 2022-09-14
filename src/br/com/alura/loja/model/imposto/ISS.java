package br.com.alura.loja.model.imposto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{

    public ISS(Imposto imposto){
        super(imposto);
    }

    public ISS(){}

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
