package br.com.alura.loja.service;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.model.DomainException;
import br.com.alura.loja.model.Orcamento;

import java.util.Map;

/**
 * Simula um registo de orcamento para uma API externa
 */
public class RegistroDeOrcamento {
    /**
     * Boa pratica -> depender sempre de interfaces e nao implementacoes!
     * Geramos baixo acoplamento pois nao estamos presos a um adaptador especifico
     */
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        //so posso registrar um orcamento se ele estiver finalizado, entao vamos fazer uma checagem no inicio
        if(!orcamento.isFinalizado()){
            throw new DomainException("Nao eh possivel registrar orcamento que nao esta finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidade()
        );
        //detalhes de infra nao ficam nessa classe - isso eh bom!
        http.post(url, dados);
    }
}
