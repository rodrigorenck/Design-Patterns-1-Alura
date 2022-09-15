package br.com.alura.loja;

import br.com.alura.loja.model.ItemOrcamento;
import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.service.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestandoDescontos {

    public static void main(String[] args) {
        ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("100"), 6);
        ItemOrcamento item2 = new ItemOrcamento(new BigDecimal("1000"), 1);
        ItemOrcamento item3 = new ItemOrcamento(new BigDecimal("100"), 1);

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item1);
        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(item2);
        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(item3);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
        System.out.println(calculadoraDeDescontos.calcular(orcamento3));

    }
}
