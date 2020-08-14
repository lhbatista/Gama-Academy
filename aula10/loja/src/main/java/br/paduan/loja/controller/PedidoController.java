package br.paduan.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.loja.dao.PedidoDAO;
import br.paduan.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {
    
    @Autowired
    private PedidoDAO dao;

    @GetMapping("/pedido/{numPedido}")
    public ResponseEntity<Pedido> obterPedidoPorNumero(@PathVariable int numPedido){
        Pedido pedido = dao.findById(numPedido).orElse(null);       

        if(pedido != null){
            pedido.getSolicitante().setSenha("*******");
            return ResponseEntity.ok(pedido);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}