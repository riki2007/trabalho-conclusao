package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CLIENTES")
public class Cliente extends Pessoa{
	
	
	 @OneToMany(mappedBy = "cliente")
	 private List<OrdemServico> ordensdeservico;
	
}
