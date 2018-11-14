package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Produto;

public interface ProdutoService {

	void salvar(Produto produto);

    void editar(Produto produto);

    void excluir(Long id);

    Produto buscarPorId(Long id);

    List<Produto> buscarTodos();
}
