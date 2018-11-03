package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.util.List;

import javax.persistence.*;
@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	//############ATRIBUTOS#########
	@Column(name = "nome", nullable = false, unique = true, length = 50)
	private String nome;
	
	//############RELACIONAMENTOS#########
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	//############GETTS AND SETTERs#########

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
	
	
}
