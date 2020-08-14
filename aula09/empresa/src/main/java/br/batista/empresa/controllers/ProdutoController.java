package br.batista.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.batista.empresa.model.Produto;
import br.batista.empresa.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private IProdutoService servico;

    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCodigo(@PathVariable int cod){
        Produto produto = servico.buscarProdutoPorCod(cod);
        if(produto != null){
            return ResponseEntity.ok(produto);
        }else{
            return ResponseEntity.notFound().build();

        }        
    }


    
}