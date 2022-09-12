package br.com.alura.loja.model.situacao;

import br.com.alura.loja.model.DomainException;
import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public abstract class Situacao {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    /**
     * Metodo de transicao de estado
     * Os que nao forem invalidos nos reescrevemos nas classes filhas
     */
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado");
    }
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado");
    }
}
