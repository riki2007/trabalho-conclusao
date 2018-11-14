package br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Produto;

public interface ProdutoDao {
	void save(Produto produto);

    void update(Produto produto);

    void delete(Long id);

    Produto findById(Long id);

    List<Produto> findAll();
}
