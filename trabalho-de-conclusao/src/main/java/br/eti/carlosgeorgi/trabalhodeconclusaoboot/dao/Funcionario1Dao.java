package br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;

public interface Funcionario1Dao {
	
	void save(Funcionario1 funcionario);

    void update(Funcionario1 funcionario);

    void delete(Long id);

    Funcionario1 findById(Long id);

    List<Funcionario1> findAll();
}
