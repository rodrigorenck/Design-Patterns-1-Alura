package br.com.alura.loja.model;

import br.com.alura.loja.model.situacao.EmAnalise;
import br.com.alura.loja.model.situacao.Finalizado;
import br.com.alura.loja.model.situacao.Situacao;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidade;
    //possiveis situacoes (estados) que um orcamento pode estar
    private Situacao situacao;

    public Orcamento(BigDecimal valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
        //situacao inicia EmAnalise - primeiro estado
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        valor = valor.subtract(valorDescontoExtra);
    }

    /**
     * Transicao de estado
     */
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
