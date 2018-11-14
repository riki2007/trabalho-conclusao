package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao.ServicoDao;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Servico;

@Service
@Transactional(readOnly = true)
public class ServicoServiceImpl implements ServicoService {
	@Autowired
	private ServicoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Servico servico) {
		dao.save(servico);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Servico servico) {
		dao.update(servico);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Servico buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Servico> buscarTodos() {
		
		return dao.findAll();
	}
}
