package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@MappedSuperclass
public class Pessoa extends AbstractEntity<Long>{ 
	
	//############ATRIBUTOS#########
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cpf;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String telefone;
	
	//############RELACIONAMENTOS#########
	
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "endereco_id_fk")
		private Endereco endereco;	
		
	
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
