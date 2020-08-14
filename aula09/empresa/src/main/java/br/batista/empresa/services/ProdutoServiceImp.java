package br.batista.empresa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.batista.empresa.dao.ProdutoDAO;
import br.batista.empresa.model.Produto;

@Component
public class ProdutoServiceImp implements IProdutoService {
    
    @Autowired
    private ProdutoDAO repositorio;

    @Override
    public Produto buscarProdutoPorCod(int cod){
       Produto p = repositorio.findById(cod).orElse(null);

       return p;


        }
    }
