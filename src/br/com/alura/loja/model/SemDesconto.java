package br.com.alura.loja.model;

import java.math.BigDecimal;

/**
 * Representa o fim da nossa cadeia de descontos
 */
public class SemDesconto extends Desconto{


    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
