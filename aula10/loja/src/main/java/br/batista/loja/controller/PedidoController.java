package br.batista.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.batista.loja.DAO.PedidoDAO;
import br.batista.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoDAO dao;

    @GetMapping("/pedido/{numPedido}")
    public ResponseEntity<Pedido> obterPedidoPorNumero(@PathVariable int numPedido){
        Pedido pedido = dao.findById(numPedido).orElse(null);

        if (pedido != null){
            return ResponseEntity.ok(pedido);
        }else{
            return ResponseEntity.notFound().build();

        }


    }

    
}