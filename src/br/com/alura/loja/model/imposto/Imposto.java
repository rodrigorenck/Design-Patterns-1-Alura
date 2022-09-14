package br.com.alura.loja.model.imposto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

/**
 * Utilizando o padrao Decorator para possibilitar soma de impostos
 */
public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    public Imposto(){}

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = efetuarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if(outro != null){
            valorOutroImposto = outro.efetuarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }
}
