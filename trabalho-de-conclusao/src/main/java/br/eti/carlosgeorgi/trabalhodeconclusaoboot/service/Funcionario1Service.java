package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;

public interface Funcionario1Service {
	void salvar(Funcionario1 funcionario);

    void editar(Funcionario1 funcionario);

    void excluir(Long id);

    Funcionario1 buscarPorId(Long id);

    List<Funcionario1> buscarTodos();
}
