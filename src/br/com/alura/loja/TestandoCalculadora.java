package br.com.alura.loja;

import br.com.alura.loja.model.ICMS;
import br.com.alura.loja.model.ISS;
import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.service.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestandoCalculadora {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal val = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}
