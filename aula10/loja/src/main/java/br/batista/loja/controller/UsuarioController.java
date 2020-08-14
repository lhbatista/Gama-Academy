package br.batista.loja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.batista.loja.DAO.UsuarioDAO;
import br.batista.loja.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioDAO dao;


    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id){
        Usuario usuario = dao.findById(id).orElse(null);

        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{

            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/usuarios")
    public ResponseEntity<ArrayList<Usuario>> buscarTodos(){

        ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();

        return ResponseEntity.ok(lista);    
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userDoFront){
        Usuario userLogado = dao.findByEmailAndSenha(userDoFront.getEmail(), userDoFront.getSenha());

        if (userLogado != null){
            userLogado.setSenha("******"); //mascara por segurança
            return ResponseEntity.ok(userLogado);
        }else{
            return ResponseEntity.status(403).build();
        }
    }
    
}
