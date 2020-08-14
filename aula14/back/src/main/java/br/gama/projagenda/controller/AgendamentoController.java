package br.gama.projagenda.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/agendamentos/data")
    public List<Agendamento> filtroPorData(@RequestParam(name="dataagendamento") String dataAgendamento){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dataAgendamento, fmt);
        System.out.println(dataAgendamento);
        return dao.findAllByDataAgendamento(data);
    
    }

    @PostMapping("/agendamentos/novo")
	public ResponseEntity<Agendamento> novoAgendamento(@RequestBody Agendamento agendamento) {
        try {
            Agendamento novo =  dao.save(agendamento);
            //se teve sucesso, esconda a senha e retorne o usuário inserido
            return ResponseEntity.ok(novo);
        } catch (Exception e) { //se der errado, retorne o erro
            return ResponseEntity.status(400).build(); //bad request
        }
	}

        

}