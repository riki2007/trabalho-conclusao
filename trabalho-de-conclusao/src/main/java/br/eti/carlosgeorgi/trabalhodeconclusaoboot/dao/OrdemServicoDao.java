package br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.OrdemServico;

public interface OrdemServicoDao {
	void save(OrdemServico ordem);

    void update(OrdemServico ordem);

    void delete(Long id);
    OrdemServico findById(Long id);

    List<OrdemServico> findAll();
}
