package br.com.alura.loja;

import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.model.imposto.ICMS;
import br.com.alura.loja.model.imposto.ISS;
import br.com.alura.loja.service.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestandoDescontosSomados {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS())));
    }
}
