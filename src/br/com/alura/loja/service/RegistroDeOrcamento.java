package br.com.alura.loja.service;

import br.com.alura.loja.model.Orcamento;

/**
 * Simula um registo de orcamento para uma API externa
 */
public class RegistroDeOrcamento {

    public void registrar(Orcamento orcamento){
        //Chamada HTTP para a API externa-> varias maneiras de fazer
        //*DETALHES DE INFRAESTRUTURA* - nao devem estar nessa classe!
        //queremos abstrair essa conexao para outra classe - que vai fazer a adaptacao entre o meu codigo e a API externa
        //URL Connection
        //HTTP Client
        //lib rest
    }
}
