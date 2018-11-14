package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Servico;

public interface ServicoService {
	void salvar(Servico servico);

    void editar(Servico servico);

    void excluir(Long id);

    Servico buscarPorId(Long id);

    List<Servico> buscarTodos();
}
