package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao.Funcionario1Dao;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;

@Service
@Transactional(readOnly = true)
public class Funcionario1ServiceImpl implements Funcionario1Service {
	
	@Autowired
	private Funcionario1Dao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario1 funcionario) {
		dao.save(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario1 funcionario) {
		dao.update(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Funcionario1 buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Funcionario1> buscarTodos() {
		
		return dao.findAll();
	}
}