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
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
