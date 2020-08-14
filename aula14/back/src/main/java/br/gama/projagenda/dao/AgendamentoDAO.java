package br.gama.projagenda.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gama.projagenda.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
    public List<Agendamento> findAllByNome(String nomeCliente);
}