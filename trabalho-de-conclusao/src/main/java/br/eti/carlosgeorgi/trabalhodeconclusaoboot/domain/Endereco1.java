package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS1")
public class Endereco1 extends AbstractEntity<Long> {
	
	//######ATRIBUTOS######
	@Column(nullable = false)
	private String logradouro;
	@Column(nullable = false, length = 5)
	private Integer numero;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String bairro;
	@Column(nullable = true)
	private String complemento;
	@Column(nullable = false, length = 9)
	private String cep;
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	//############GETTS AND SETTERs#########
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
