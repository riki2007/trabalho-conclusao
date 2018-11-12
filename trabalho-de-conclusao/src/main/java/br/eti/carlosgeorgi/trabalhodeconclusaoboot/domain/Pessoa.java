package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Pessoa extends AbstractEntity<Serializable>{ 
	//ATRIBUTOS
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	//############GETTS AND SETTERs#########

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
