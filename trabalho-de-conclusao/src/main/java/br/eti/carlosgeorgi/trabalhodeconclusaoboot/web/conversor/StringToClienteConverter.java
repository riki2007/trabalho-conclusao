package br.eti.carlosgeorgi.trabalhodeconclusaoboot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain.Cliente;
import br.eti.carlosgeorgi.trabalhodeconclusaoboot.service.ClienteService;

@Component
public class StringToClienteConverter implements Converter<String, Cliente> {
	
	@Autowired
	private ClienteService service ;
	

	@Override
	public Cliente convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}}
