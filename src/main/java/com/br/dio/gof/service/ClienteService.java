package com.br.dio.gof.service;

import com.br.dio.gof.model.Cliente;
import feign.Client;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de Cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 */


public interface ClienteService {

    Iterable<Client> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);


}
