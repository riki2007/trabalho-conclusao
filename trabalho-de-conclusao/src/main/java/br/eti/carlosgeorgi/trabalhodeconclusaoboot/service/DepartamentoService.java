package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Departamento;

public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);
    
    List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);
}
