package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.model.ItemOrcamento;
import br.com.alura.loja.model.Orcamento;
import br.com.alura.loja.service.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        ItemOrcamento item = new ItemOrcamento(new BigDecimal("10"), 1);
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(item);
        orcamento.aprovar();
        orcamento.finalizar();

        //vai jogar exception pois estamos usando uma URL que nao existe
        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
