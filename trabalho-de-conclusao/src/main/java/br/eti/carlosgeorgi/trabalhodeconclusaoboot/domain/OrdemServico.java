package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.io.Serializable;

public class OrdemServico extends AbstractEntity<Serializable>{

	private String equipamento;
	private String problema;
	private Status status;
	
}
