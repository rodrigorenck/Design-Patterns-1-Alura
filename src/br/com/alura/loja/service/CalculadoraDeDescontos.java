package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento){
        //problema dessa abordagem -> meu metodo vai crescer para cada nova regra de desconto que eu adicionar
        //parecido com o strategy porem diferente -> no strategy eu ja sei no parametro qual regra eu vou usar, aqui eu nao sei
        if(orcamento.getQuantidade() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }
}
