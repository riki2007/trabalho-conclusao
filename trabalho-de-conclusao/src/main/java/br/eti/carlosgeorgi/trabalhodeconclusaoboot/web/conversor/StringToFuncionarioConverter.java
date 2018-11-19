package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Funcionario1;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.Funcionario1Service;

@Component
public class StringToFuncionarioConverter implements Converter<String, Funcionario1>{

	@Autowired
	private Funcionario1Service service;
	
	@Override
	public Funcionario1 convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
