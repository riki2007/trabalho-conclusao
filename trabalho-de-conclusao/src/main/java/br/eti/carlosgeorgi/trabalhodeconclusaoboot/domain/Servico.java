package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "SERVICOS")
public class Servico extends AbstractEntity<Long>{
	
	//############ATRIBUTOS#########
	
	private String nome;
	private String descricao;
	private BigDecimal valor;
	

	//############RELACIONAMENTOS#########
	@ManyToMany
	private List<OrdemServico> ordens;
	
	//############GETTS AND SETTERs#########
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
