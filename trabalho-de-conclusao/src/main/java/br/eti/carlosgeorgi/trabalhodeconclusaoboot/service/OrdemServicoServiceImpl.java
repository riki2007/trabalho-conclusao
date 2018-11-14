package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao.OrdemServicoDao;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.OrdemServico;

@Service
@Transactional(readOnly = true)
public class OrdemServicoServiceImpl implements OrdemServicoService {
	@Autowired
	private OrdemServicoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(OrdemServico ordem) {
		dao.save(ordem);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(OrdemServico ordem) {
		dao.update(ordem);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public OrdemServico buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<OrdemServico> buscarTodos() {
		
		return dao.findAll();
	}
	
	
}
