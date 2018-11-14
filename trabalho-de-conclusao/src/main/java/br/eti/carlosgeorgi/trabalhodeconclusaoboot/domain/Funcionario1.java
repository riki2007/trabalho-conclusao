package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS1")
public class Funcionario1 extends Pessoa {
	
	//############ATRIBUTOS#########
	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String senha;
	
	//############RELACIONAMENTOS#########
	@OneToMany(mappedBy = "funcionario")
	private List<OrdemServico> ordensdeservico;
	
	//############GETTS AND SETTERs#########
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
