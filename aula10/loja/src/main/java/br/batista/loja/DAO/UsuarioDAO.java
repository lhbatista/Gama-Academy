package br.batista.loja.DAO;

import org.springframework.data.repository.CrudRepository;

import br.batista.loja.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> { 
    public Usuario findByEmailAndSenha(String email, String senha);

}