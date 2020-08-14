package br.paduan.loja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.loja.dao.UsuarioDAO;
import br.paduan.loja.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id){
        Usuario usuario = dao.findById(id).orElse(null);

        if(usuario != null){
            usuario.setSenha("********"); //mascara por segurança
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

        if(userLogado != null){
            userLogado.setSenha("********"); //mascara por segurança
            return ResponseEntity.ok(userLogado);
        }else{
            return ResponseEntity.status(403).build();
        }
    }

    /**
     * Este método, se for chamado sem ID, insere um novo usuário no BD
     * Se for chamado com o ID existente, atualiza os dados do usuário no BD
     * 
     */
  
     @PostMapping("/usuario/novo")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario user){
        
        //tente fazer a inserção/atualização
        try {
            Usuario novo =  dao.save(user);
            //se teve sucesso, esconda a senha e retorne o usuário inserido
            novo.setSenha("*******");
            return ResponseEntity.ok(novo);
        } catch (Exception e) { //se der errado, retorne o erro
            return ResponseEntity.status(400).build(); //bat request
        }
        

    }
}