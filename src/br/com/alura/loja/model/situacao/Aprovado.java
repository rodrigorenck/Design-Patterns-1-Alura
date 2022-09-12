package br.com.alura.loja.model.situacao;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Situacao {

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    /**
     * Sobreescrevemos os metodos que sao validos para esse estado
     * Nesse caso, se um orcamento esta aprovado o unico estado que ele pode passar eh para o Finalizado
     * Como nao reescrevemos o resto, estamos herdando os metodos que jogam exception
     */
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
