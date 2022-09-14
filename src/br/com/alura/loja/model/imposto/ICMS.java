package br.com.alura.loja.model.imposto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto{

    public ICMS(Imposto imposto){
        super(imposto);
    }

    public ICMS(){}

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
