package br.paduan.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
    
}