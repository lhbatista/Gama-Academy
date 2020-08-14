package br.batista.empresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.batista.empresa.model.Produto;

//vai ler e grava no BD
public interface ProdutoDAO extends CrudRepository <Produto, Integer> {
    
    
    
}