package br.gama.projagenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gama.projagenda.dao.AgendamentoDAO;
import br.gama.projagenda.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {

    @Autowired
    private AgendamentoDAO dao;

    @GetMapping("/agendamentos")
    public List<Agendamento> getAgendamentos() {
        List<Agendamento> lista = (List<Agendamento>)dao.findAll();
        return  lista;
    }

    @GetMapping("/agendamentos/{id}")
    public Agendamento getAgendamentos(@PathVariable int id){
        Agendamento agendamento = dao.findById(id).orElse(null);
        return  agendamento;
    } 

    @GetMapping("/agendamentos/cliente/{nomeCliente}")
    public List<Agendamento> getAgendamentos(@PathVariable String nomeCliente){
        List<Agendamento> agendamento = (List<Agendamento>)dao.findAllByNome(nomeCliente);
        return agendamento;
    }


    @PostMapping("/novoagendamento")
	public ResponseEntity<Agendamento> novoAgendamento(@RequestBody Agendamento Agendamento) {
        Agendamento novo = dao.save(Agendamento);
        
        return ResponseEntity.status(200).build();
	}

        

}