package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;	
	
	//############GETTS AND SETTERs#########

	
	public String getLogin() {
		return login;
	}
	public List<OrdemServico> getOrdensdeservico() {
		return ordensdeservico;
	}
	public void setOrdensdeservico(List<OrdemServico> ordensdeservico) {
		this.ordensdeservico = ordensdeservico;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
