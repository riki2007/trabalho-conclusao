package br.eti.carlosgeorgi.trabalhodeconclusaoboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.dao.ProdutoDao;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Produto;

@Service
@Transactional(readOnly = true)
public class ProdutoServicoImpl implements ProdutoService {
	@Autowired
	private ProdutoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Produto produto) {
		dao.save(produto);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Produto produto) {
		dao.update(produto);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Produto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Produto> buscarTodos() {
		
		return dao.findAll();
	}
}
