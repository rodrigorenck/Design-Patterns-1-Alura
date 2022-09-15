package br.com.alura.loja.model;

import java.math.BigDecimal;

public class OrcamentoProxy extends  Orcamento{

    private Orcamento orcamento;
    private BigDecimal valor;

    public OrcamentoProxy(Orcamento orcamento){
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if(this.valor == null){
            valor = orcamento.getValor();
        }
        return valor;
    }
}
