package br.batista.loja.DAO;

import org.springframework.data.repository.CrudRepository;

import br.batista.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
    
}