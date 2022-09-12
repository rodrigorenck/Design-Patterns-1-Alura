package br.com.alura.loja.model.desconto;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    /**
     * Template method
     * Extraimos para a classe mae os trechos que sao comuns para todas as classes filhas
     * Elas faz uma parte da operacao e outra ela delega
     * Extraimos regras repetidas para a classe mae
     */
    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    /**
     * Responsabilidade das subclasses
     */
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
