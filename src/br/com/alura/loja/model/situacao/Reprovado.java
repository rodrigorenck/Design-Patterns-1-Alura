package br.com.alura.loja.model.situacao;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends Situacao {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
