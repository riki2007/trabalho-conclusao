package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.OrdemServico;


public interface OrdemServicoService {
	void salvar(OrdemServico ordem);

    void editar(OrdemServico ordem);

    void excluir(Long id);

    OrdemServico buscarPorId(Long id);

    List<OrdemServico> buscarTodos();
}
