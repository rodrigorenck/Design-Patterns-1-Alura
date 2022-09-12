package br.com.alura.loja.model.imposto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
