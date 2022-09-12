package br.com.alura.loja.model.imposto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
