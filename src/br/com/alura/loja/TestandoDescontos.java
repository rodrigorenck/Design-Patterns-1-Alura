package br.com.alura.loja;

import br.com.alura.loja.model.ICMS;
import br.com.alura.loja.model.ISS;
import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.service.CalculadoraDeDescontos;
import br.com.alura.loja.service.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestandoDescontos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));

    }
}
