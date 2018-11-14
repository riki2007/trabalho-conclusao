package br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Servico;

public interface ServicoDao {
	
	void save(Servico servico);

    void update(Servico servico);

    void delete(Long id);

    Servico findById(Long id);

    List<Servico> findAll();

}
