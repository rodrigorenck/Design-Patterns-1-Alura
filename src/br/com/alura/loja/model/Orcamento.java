package br.com.alura.loja.model;

import br.com.alura.loja.model.situacao.EmAnalise;
import br.com.alura.loja.model.situacao.Finalizado;
import br.com.alura.loja.model.situacao.Situacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements  Orcavel{

    private BigDecimal valor;
    //possiveis situacoes (estados) que um orcamento pode estar
    private Situacao situacao;
    //estrutura de arvore, orcamento pode ser composto por outro orcamento ou por itens
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
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

    public void adicionarItem(Orcavel item){
        valor = valor.add(item.getValor());
        itens.add(item);
    }
}
